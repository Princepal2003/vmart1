import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class store{
    static void Store()
    {
        Scanner sc=new Scanner(System.in);
        int choice=0;
        while (choice !=4)
        {
        System.out.println(" 1.Mens\n 2.Womens \n 3.Kids \n 4.Checkout");
        System.out.println(" Select Your Gender :");
        choice =sc.nextInt();
        
            if(choice==1){
            MensStore();
        }
        else if(choice==2)
        {
            WomensStore();
        }
        else if(choice==3)
        {
            KidsStore();
        }
        else{
            Checkout();
        }
    }
}
    public static void MensStore ()
    {
            class Product {
                private String name;
                private double price;
            
                public Product(String name, double price) {
                    this.name = name;
                    this.price = price;
                }
            
                public String getName() {
                    return name;
                }
            
                public double getPrice() {
                    return price;
                }
            }
            
            class ShoppingCart {
                private List<Product> items;
            
                public ShoppingCart() {
                    items = new ArrayList<>();
                }
            
                public void addItem(Product product) {
                    items.add(product);
                }
            
                public List<Product> getItems() {
                    return items;
                }
            
                public double calculateTotal() {
                    double total = 0;
                    for (Product item : items) {
                        System.out.println(item.getName() + "\t" + item.getPrice());
                        total += item.getPrice();
                    }
                    return total;
                }
            }
            Scanner scanner = new Scanner(System.in);
            Product product1 = new Product("Jeans", 999.0);
            Product product2 = new Product("Shirts", 799.0);
            Product product3 = new Product("T-Shirts", 599.0);
            Product product4 = new Product("Shoes", 1099.0);
    
            ShoppingCart cart = new ShoppingCart();
    
            while (true) {
                System.out.println("Available products:");
                System.out.println("1. " + product1.getName() + " - $" + product1.getPrice());
                System.out.println("2. " + product2.getName() + " - $" + product2.getPrice());
                System.out.println("3. " + product3.getName() + " - $" + product3.getPrice());
                System.out.println("4. " + product4.getName() + " - $" + product4.getPrice());
                System.out.println("5. Checkout");
                System.out.print("Select an option: ");
    
                int choice = scanner.nextInt();
                if (choice == 1) {
                    cart.addItem(product1);
                } else if (choice == 2) {
                    cart.addItem(product2);
                }
                else if (choice == 3) {
                    cart.addItem(product3);
                }
                else if (choice == 4) {
                    cart.addItem(product4);
                } else if (choice == 5) {
                    break;
                }
            }
    
            double total = cart.calculateTotal();
            System.out.println("Total: $" + total);
    
            // Simulate payment processing (not implemented in this example)
            System.out.println("Payment processed. Thank you for shopping!");
        }

        public static void WomensStore ()
        {    class Product {
                private String name;
                private double price;
            
                public Product(String name, double price) {
                    this.name = name;
                    this.price = price;
                }
            
                public String getName() {
                    return name;
                }
            
                public double getPrice() {
                    return price;
                }
            }
            
            class ShoppingCart {
                private List<Product> items;
            
                public ShoppingCart() {
                    items = new ArrayList<>();
                }
            
                public void addItem(Product product) {
                    items.add(product);
                }
            
                public List<Product> getItems() {
                    return items;
                }
            
                public double calculateTotal() {
                    double total = 0;
                    for (Product item : items) {
                        System.out.println(item.getName() + "\t" +item.getPrice());
                        total += item.getPrice();
                    }
                    return total;
                }
            }
            Scanner scanner = new Scanner(System.in);
            Product product1 = new Product("Lahnga", 2999.0);
            Product product2 = new Product("Kurti", 799.0);
            Product product3 = new Product("T-Shirts", 599.0);
            Product product4 = new Product("Paint", 1099.0);
    
            ShoppingCart cart = new ShoppingCart();
    
            while (true) {
                System.out.println("Available products:");
                System.out.println("1. " + product1.getName() + " - $" + product1.getPrice());
                System.out.println("2. " + product2.getName() + " - $" + product2.getPrice());
                System.out.println("3. " + product3.getName() + " - $" + product3.getPrice());
                System.out.println("4. " + product4.getName() + " - $" + product4.getPrice());
                System.out.println("5. Checkout");
                System.out.print("Select an option: ");
    
                int choice = scanner.nextInt();
                if (choice == 1) {
                    cart.addItem(product1);
                } else if (choice == 2) {
                    cart.addItem(product2);
                }
                else if (choice == 3) {
                    cart.addItem(product3);
                }
                else if (choice == 4) {
                    cart.addItem(product4);
                } else if (choice == 5) {
                    break;
                }
            }
            double total = cart.calculateTotal();
            System.out.println("Total: $" + total);
    
            // Simulate payment processing (not implemented in this example)
            System.out.println("Payment processed. Thank you for shopping!");

        }
        public static void KidsStore (){
            class Product {
                private String name;
                private double price;
            
                public Product(String name, double price) {
                    this.name = name;
                    this.price = price;
                }
            
                public String getName() {
                    return name;
                }
            
                public double getPrice() {
                    return price;
                }
            }
            
            class ShoppingCart {
                private List<Product> items;
            
                public ShoppingCart() {
                    items = new ArrayList<>();
                }
            
                public void addItem(Product product) {
                    items.add(product);
                }
            
                public List<Product> getItems() {
                    return items;
                }
            
                public double calculateTotal() {
                    double total = 0;
                    for (Product item : items) {
                        System.out.println(item.getName() + "\t" +item.getPrice());
                        total += item.getPrice();
                    }
                    return total;
                }
            }
            Scanner scanner = new Scanner(System.in);
            Product product1 = new Product("Jeans", 799.0);
            Product product2 = new Product("Shirts", 499.0);
            Product product3 = new Product("T-Shirts", 299.0);
            Product product4 = new Product("Shoes", 899.0);
    
            ShoppingCart cart = new ShoppingCart();
    
            while (true) {
                System.out.println("Available products:");
                System.out.println("1. " + product1.getName() + " - $" + product1.getPrice());
                System.out.println("2. " + product2.getName() + " - $" + product2.getPrice());
                System.out.println("3. " + product3.getName() + " - $" + product3.getPrice());
                System.out.println("4. " + product4.getName() + " - $" + product4.getPrice());
                System.out.println("5. Checkout");
                System.out.print("Select an option: ");
    
                int choice = scanner.nextInt();
                if (choice == 1) {
                    cart.addItem(product1);
                } else if (choice == 2) {
                    cart.addItem(product2);
                }
                else if (choice == 3) {
                    cart.addItem(product3);
                }
                else if (choice == 4) {
                    cart.addItem(product4);
                } else if (choice == 5) {
                    break;
                }
            }
            double total = cart.calculateTotal();
            System.out.println("Total: $" + total);
    
            // Simulate payment processing (not implemented in this example)
            System.out.println("Payment processed. Thank you for shopping!");
        }
        public static void Checkout()
        {
        
            System.out.println("Mens :##");
            store.KidsStore().ShoppingCart.calculateTotal();
            
            
            System.out.println("Womens:##");
            System.out.println("Kids :##");

        }
    }
