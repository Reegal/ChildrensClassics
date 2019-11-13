
package searchexcercisegit;


public class Book {
    private int num;
    private String name;
    
    public Book(int newNum, String newName){
        name = newName;
        num = newNum;
    }
    
    public int getNum(){
        return num;
    }
    
    public String getName(){
        return name;
    }
}
