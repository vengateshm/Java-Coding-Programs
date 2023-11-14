package utils;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.function.IntFunction;

public class ReflectionUtils {

    public static Map<String, String> objectToFieldsMap(Object obj) {
        Map params = new HashMap();
        Class objCls = obj.getClass();

        try {
            Collection<Field> fields = getFields(objCls);

            for (Field field : fields) {
                if (!Modifier.isStatic(field.getModifiers())) {
                    String name = field.getName();
                    /*if(field.isAnnotationPresent(RequestParam.class)){
                        name = field.getAnnotation(RequestParam.class).getName();
                    }*/
                    field.setAccessible(true);
                    Object value = null;
                    value = getValue(obj, field, value);
                    params.put(name, value == null ? "" : value.toString());
                }
            }
            return params;
        } catch (Exception e) {
            return params;
        }
    }

    public static String getObjectString(Object obj) {
        Class<?> objCls = obj.getClass();
        Field[] employeeFields = objCls.getDeclaredFields();
        Field[] cEmployeeFields = objCls.getSuperclass().getDeclaredFields();
        Field[] allFields = new Field[employeeFields.length + cEmployeeFields.length];
        Arrays.setAll(allFields, new IntFunction<Field>() {
            @Override
            public Field apply(int value) {
                return value < employeeFields.length ? employeeFields[value] : cEmployeeFields[value - employeeFields.length];
            }
        });
        StringBuilder sb = new StringBuilder();

        sb.append("param begins\n");
        for (Field field : allFields) {
            if (!Modifier.isStatic(field.getModifiers())) {
                String name = field.getName();
                field.setAccessible(true);
                Object value = null;
                value = getValue(obj, field, value);
                sb.append(name);
                sb.append(" :: ");
                sb.append(value == null ? "" : value.toString());
                sb.append("\n");
            }
        }
        sb.append("param ends\n");
        return sb.toString();
    }

    private static Object getValue(Object obj, Field field, Object value) {
        try {
            value = field.get(obj);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return value;
    }

    private static Collection<Field> getFields(Class<?> objCls) {
        HashMap fields;
        for (fields = new HashMap(); objCls != null; objCls = objCls.getSuperclass()) {
            Field[] declaredFields = objCls.getDeclaredFields();
            int length = declaredFields.length;

            for (Field field : declaredFields) {
                if (!fields.containsKey(field.getName())) {
                    fields.put(field.getName(), field);
                }
            }
        }
        return fields.values();
    }
}
