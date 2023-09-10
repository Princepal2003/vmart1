import java.util.ArrayList;
import java.util.Scanner;

class Product {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

class ShoppingCart {
    ArrayList<Product> items = new ArrayList<>();

    public void addToCart(Product product) {
        items.add(product);
    }

    public void displayCart() {
        System.out.println("\nShopping Cart:");


        double total = 0;
        for (Product item : items) {
            System.out.println(item.name + " - $" + item.price);
            total += item.price;
        }
        System.out.println("Total: $" + total);
    }
}

public class store1 {
    public static void Store() {
        Scanner scanner = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();
        ArrayList<Product> products = new ArrayList<>();

        // Adding example products
        products.add(new Product("Jeans", 1099.00));
        products.add(new Product("Shirt", 699.00));
        products.add(new Product("Shoes", 2599.00));
        products.add(new Product("Sherwani", 5999.00));
        products.add(new Product("Koat-Paint", 7999.00));
        products.add(new Product("T-shirt", 599.0));
        products.add(new Product("T-shirt", 499.00));
        products.add(new Product("Paint", 999.00));
        products.add(new Product("Kurti", 899.00));
        products.add(new Product("Lahnga", 5999.00));
        products.add(new Product("Shirt", 599.00));
        products.add(new Product("T-shirt", 299.00));
        products.add(new Product("Paint", 499.00));
        products.add(new Product("Shoes", 999.00));
        products.add(new Product("Koat-Paint", 899.00));
        products.add(new Product("Frak", 499.00));
        products.add(new Product("Sherwani", 1599.00));
        products.add(new Product("Top", 699.00));
        products.add(new Product("Lahnga", 1599.00));

        while (true) {
            System.out.println("\nPrince Mart");
            System.out.println("1. Available Products");
            System.out.println("2. Buy Products");
            System.out.println("3. View Cart");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\nAvailable Products:");
                    System.out.println("\n***********\tMens\t**************");
                    for (int i = 0; i < products.size()-13; i++) {
                        System.out.println((i+1) +". " + products.get(i).name + " - $" + products.get(i).price);
                        if(i==6){
                            break;
                        }
                    }
                    System.out.println("\n***********\tWoMens\t**************");
                    for (int i = products.size()-13; i < products.size()-8; i++){
                    System.out.println((i+1)+ ". " + products.get(i).name + " - $" + products.get(i).price);
                        if(i == 11){
                            break;
                        }
                    }
                    System.out.println("\n***********\tKids\t**************");
                    for (int i= products.size()-8; i < products.size(); i++){
                    System.out.println((i+1)+ ". " + products.get(i).name + " - $" + products.get(i).price);
                        if(i == 19){
                            break;
                        }
                
                    }
                    break;

                case 2:
                    System.out.print("\nEnter the product number to buy: ");
                    int productNumber = scanner.nextInt();
                    if (productNumber >= 1 && productNumber <= products.size()) {
                        Product selectedProduct = products.get(productNumber-1);
                        cart.addToCart(selectedProduct);
                        System.out.println(selectedProduct.name + " added to cart.");
                    } else {
                        System.out.println("Invalid product number.");
                    }
                    break;

                case 3:
                    cart.displayCart();
                    System.out.println("!!!!!\nProcessing Payment!!!!");
                System.out.println("\n Payment Mode: \n1.Card or Online \n2.Cash  \n3.Exit");
                int ch=scanner.nextInt();
                if(ch==1){
                        System.out.println("Enter Your Card No.");
                        String cardno=scanner.next();
                        System.out.println("Enter Your OTP:");
                        String otp=scanner.next();
                        System.out.println("card no "+cardno);
                        System.out.println("!!!!!!Payent Sucessfull!!!!!!");
                        System.out.println("\n Thanks For Visiting  Prince Mart!!!!!!");
                        System.exit(0);
                    }
                    else if(ch==2)
                    {
                    System.out.println("!!!!!Payment sucessfull!!!!!!");
                    System.out.println("\n Thanks For Visiting Prince Mart !!!!!!");
                    System.exit(0);
                    }
                    else if(ch==3)
                    {
                    System.out.println("Payment Unsucessfull!!!!!!");
                    }
                    else
                    {
                    System.out.println("Invaild Option !!!!!!");
                    }

                    break;

                case 4:
                    System.out.println("Thanks For Visiting Prince Mart");

                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}
///code written By: Prince
