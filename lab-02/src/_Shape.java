public abstract class _Shape implements _Area {

    private String name;

    public _Shape(String name){ this.name = name; }

    public void setName(String name) { this.name = name; }

    public String getName(){ return name; }

    public String toString(){
        return String.format("Class name is %s\n" +
                "Area = ", this.name);
    }

}
