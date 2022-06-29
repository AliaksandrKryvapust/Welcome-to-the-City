public class Source {
    public static void main(String[] args) {
        String [] name = {"John", "Smith"};
        String city = "Phoenix";
        String state = "Arizona";
        System.out.println(sayHello(name,city,state).equals("Hello, John Smith! Welcome to Phoenix, Arizona!"));
    }
        public static String sayHello(String[] name, String city, String state){
            return String.format("Hello, %s! Welcome to %s, %s!", String.join(" ", name),city,state);
        }
}
