public class example_02_75_SuperClass {
    private String Str1;
    example_02_75_SuperClass(String Str1){
        System.out.println(Str1);
    }

    public example_02_75_SuperClass() {
    }

    public String toString (){
        String superClassNameAndFieldValue;
        superClassNameAndFieldValue = "super" + "\n" +
                " Class name: " + this.getClass().getSimpleName() + "\n" ;
        return superClassNameAndFieldValue ;
    }
}
