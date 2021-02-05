    public class example_02_75_SubOneClass extends example_02_75_SuperClass{
        private int Int1;
        example_02_75_SubOneClass(String Str1) {
            super(Str1);
        }
        example_02_75_SubOneClass (int Int1){
            super();
            this.Int1 = Int1;
        }
        public String toString (){
            String superClassNameAndFieldValue;
            superClassNameAndFieldValue = "sub" + "\n" +
                    " Class name: " + this.getClass().getSimpleName() + "\n" ;
            return superClassNameAndFieldValue ;
        }
    }
