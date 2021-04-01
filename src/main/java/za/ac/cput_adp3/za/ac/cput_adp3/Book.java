package za.ac.cput_adp3.za.ac.cput_adp3;
public class Book {

    private String title;
    private double price;
    private int copiesInStock;
    private double discount;

    public Book()
    {

    }

    public Book(String title, double price, int copiesInStock, double discount)
    {

        this.title = title;
        this.price = price;
        this.copiesInStock = copiesInStock;
    }

    //Getters
    public String getTitle()
    {
        return title;
    }

    public double getPrice()
    {
        return price;
    }

    public int getCopiesInStock()
    {
        return copiesInStock;
    }

    //Setters
    public void setTitle(String title)
    {
        this.title = title;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public void setCopiesInStock(int copiesInStock)
    {
        this.copiesInStock = copiesInStock;
    }

    @Override
    public String toString()
    {
        return title;
    }

    private double discount(int numberOfBooks)
    {
        if(numberOfBooks >= 10)
        {
            discount = price * 0.10;
        }


        if(numberOfBooks >= 5 && numberOfBooks < 10)
        {
            discount = price * 0.5;
        }
        return discount;
    }


    public double sell(int numberOfBooks)
    {
        return numberOfBooks;
    }
}
