package goit_java_hw_02_3_;

public class ExonNames {
    // проверяем одинаковые ли имена
    public boolean areNamesEqual(String name1, String name2){
        return (name1.equals(name2));
    }

    // преобразование имени в малый регистр и конкатынация с фамилией в большом регистре
    public String makeFullName(String firstName, String lastName){
        String result = firstName.toLowerCase().concat(" ").concat(lastName.toUpperCase());
        return  result;
    }
    // проверить есть ли большие или маленькие буквы в слове
    public boolean isNameLucky(String name){
       int index_A = name.indexOf('A' );
       int index_a = name.indexOf('a');
       int index_O = name.indexOf('O');
       int index_o = name.indexOf('o');


       if(index_A == -1 & index_O == -1 & index_o == -1 & index_a == -1){
        return false;
       }else{
           return true;
       }
    }
    // взять первую и последнюю букву и соеденить  при етом сделать их большими
    public String getNameCode(String name){
        return name.substring(0,1).toUpperCase().concat(name.substring(name.length()-1).toUpperCase());
    }

    // есть ли цифра вначале строки
    public boolean isMoneyName(String name){
        char isDigit = name.charAt(0);
        if( '0' < isDigit & isDigit <= '9'){
        return true;
        }else {
            return false;
        }
    }

    //это имя состоит лишь из невидимых символов?
    public boolean isInvisibleName(String name){
        if (name.trim().length() > 0){return false;}
        else {return true;}
    }

    //сделать имя позитивным
    public String makeNamePositive(String name){
        String result = name.toLowerCase().replace("no","yes");
        return result;
    }

    //из начала и конца имени удаляются все невидимые символы, и вначале и в конце имени добавляется слово "CLEAN".
    public String makeNameClean(String name){
        name = "CLEAN".concat(name.trim()).concat("CLEAN");
        return  name;
    }

    //Test output
    public static void main(String[] args) {
        ExonNames names = new ExonNames();

        //Should be true
        System.out.println("Are Names Equal");
        boolean namesEqual = names.areNamesEqual("nm", "nm");
        System.out.println("names.areNamesEqual(\"nm\", \"nm\") = " + namesEqual);

        System.out.println("Make Full Name");
        String fullName = names.makeFullName("exor", "bigo");
        System.out.println("names.makeFullName(\"exor\", \"bigo\") = " + fullName);

        System.out.println("is Name Lucky");
        System.out.println(names.isNameLucky("Andry"));
        System.out.println(names.isNameLucky("Ondry"));
        System.out.println(names.isNameLucky("andry"));
        System.out.println(names.isNameLucky("ondry"));
        System.out.println(names.isNameLucky("dry"));
        System.out.println(names.isNameLucky("ndry"));

        System.out.println("NameCode");
        System.out.println(names.getNameCode("Darmanir"));

        System.out.println("Is money name?");
        System.out.println(names.isMoneyName("3Grinch45"));
        System.out.println(names.isMoneyName("Grinch45"));

        System.out.println("is Invisible Name");
        System.out.println(names.isInvisibleName(""));
        System.out.println(names.isInvisibleName("\n"));
        System.out.println(names.isInvisibleName("\nMiag"));

        System.out.println("Should be YesMont");
        String positive = names.makeNamePositive("NoMont");
        System.out.println("\"NoMont\" --> " + positive);

        System.out.println("Make name clean");
        String awesomName = names.makeNameClean("  ytucki");
        System.out.println(awesomName);

    }
}
