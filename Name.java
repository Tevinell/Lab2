public class Name {
    private String FName;
    private String Patron;
    private String LName;


    public Name(String FName, String LName, String Patron){
        if (!FName.isEmpty()){
            this.FName = FName;
        }
        if (!Patron.isEmpty()){
            this.Patron = Patron;
        }
        if (!LName.isEmpty()){
            this.LName = LName;
        }
    }

    public String toString(){
        String FullName = "";
        if (this.FName != null){
            FullName += FName + " ";
        }
        if (this.Patron != null){
            FullName += Patron + " ";
        }
        if (this.LName != null){
            FullName += LName + " ";
        }
        return (FullName);
    }
}
