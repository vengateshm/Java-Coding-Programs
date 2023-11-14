package annotationSample;

import java.lang.reflect.Field;

public class Tester {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1, "Dev", 160790.37);
        try {
            System.out.println(getXMLString(account));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String getXMLString(Object object) throws Exception {
        Class<?> aClass = object.getClass();
        if (!aClass.isAnnotationPresent(XMLSerializable.class)) {
            throw new RuntimeException("XMLSerializable annotation not present");
        }
        StringBuilder strBuilder = new StringBuilder();

        for (Field field : aClass.getDeclaredFields()) {
            field.setAccessible(true);
            if (field.isAnnotationPresent(XMLElement.class)) {
                String fieldTag = getTagFor(field);
                strBuilder.append("\t<").append(fieldTag).append(">")
                        .append(field.get(object).toString())
                        .append("</").append(fieldTag).append(">\n");
            }
        }

        String classTag = getTagFor(aClass);

        return "<" + classTag + ">\n" + strBuilder + "</" + classTag + ">";
    }

    public static String getTagFor(Class<?> aClass) {
        String tag = aClass.getAnnotation(XMLSerializable.class).tag();
        return tag.isEmpty() ? aClass.getSimpleName() : tag;
    }

    public static String getTagFor(Field field) {
        String tag = field.getAnnotation(XMLElement.class).tag();
        return tag.isEmpty() ? field.getName() : tag;
    }
}
