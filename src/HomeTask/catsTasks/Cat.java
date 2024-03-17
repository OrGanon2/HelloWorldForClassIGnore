package HomeTask.catsTasks;

public class Cat {

    //Values that stores the  cat names,colors and age.
    private String name;
    private String color;
    private int age;


    //public functions Setter/Getter functions that allow us to u se the private values.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
//ToString override netanel i don't understand why we need this,can you please tell me?
    @Override
    public String toString(){
        return "Cat{" + "name = '" + name + '\'' + ", color =" + color + ",age =" + age + '}';}
    }

