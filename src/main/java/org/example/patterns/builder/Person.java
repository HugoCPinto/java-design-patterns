package org.example.patterns.builder;

/**
 * Builder Pattern
 * instead using constructor with multiple parameters SHOULD create a
 * builder to build Person
 */
public class Person {

    private final String name;
    private final int age;
    private final String email;

    private Person(PersonBuilder builder){
        this.name = builder.name;
        this.age = builder.age;
        this.email = builder.email;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }


    public static class PersonBuilder {

        private String name;
        private int age;
        private String email;

        private PersonBuilder(){
        }

        public PersonBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public PersonBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public PersonBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Person build(){
            return new Person(this);
        }
    }

    @Override
    public String toString() {
        return "name: " + this.name + " age: " + this.age + " email: " + this.email;
    }

    public static void main(String[] args){
        Person person = new PersonBuilder()
                .setName("Hugo")
                .setAge(32)
                .setEmail("test@test.com")
                .build();

        System.out.println(person.toString());
    }
}
