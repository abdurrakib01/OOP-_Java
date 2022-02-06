class publisher{
    private String name;
    private int cell_no;
    public publisher(String name, int cell_no){
        this.name = name;
        this.cell_no = cell_no;
    }
    public void display(){
        System.out.println(name + "\n" + cell_no);
    }
}
class book{
    private int page_no;
    private String tittle;
    public publisher new_pub;
    public book(int page, String tittle, publisher new_pub){
        this.page_no = page;
        this.tittle = tittle;
        this.new_pub = new_pub;
    }
    void display(){
        System.out.println(page_no + "\n" + tittle);
        new_pub.display();
    }
}
public class assosiation {
    public static void main(String[] args){
        publisher p1 = new publisher("my book", 012345454);
        book b1 = new book(456, "first page", p1);
        b1.display();
    }
}
