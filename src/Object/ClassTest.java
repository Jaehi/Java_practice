package Object;

public class ClassTest {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Person person = new Person();
        Class pClass = person.getClass();
        System.out.println(pClass.getName());
        Class pClass2 = Person.class;
        System.out.println(pClass2.getName());
        Class pClass3 = Class.forName("Object.Person");
        System.out.println(pClass3.getName());
        Person person1 = (Person) pClass.newInstance();
        System.out.println(person1);
    }
}
