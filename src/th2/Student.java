package th2;

public class Student {
    private String nane;
    private int age;
    private String address;

    public Student(){

    }

    public Student(String nane, int age, String address) {
        this.nane = nane;
        this.age = age;
        this.address = address;
    }

    public String getNane() {
        return nane;
    }

    public void setNane(String nane) {
        this.nane = nane;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString(){
        return "Tên học sinh: " +nane+ ", tuổi: "+age+ ", địa chỉ: "+address;
    }
}
