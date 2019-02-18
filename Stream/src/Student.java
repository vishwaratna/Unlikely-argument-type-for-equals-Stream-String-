class Student {
  private String name;
  private String age;
  private String id;
  Student(String id,String name,String age){
    this.id = id;
    this.name = name;
    this.age = age;
  }
  public String getName() {
      return name;
  }
  public void setName(String name) {
      this.name = name;
  }
  public String getAge() {
      return age;
  }
  public void setAge(String age) {
      this.age = age;
  }
  public String getId() {
      return id;
  }
  public void setId(String id) {
      this.id = id;
  }
  @Override
  public String toString() {
    return String.format("Student: id = %s, name = %s, age = %s", this.id, this.name, this.age);
  }
}