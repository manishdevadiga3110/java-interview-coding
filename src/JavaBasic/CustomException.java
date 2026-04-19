package JavaBasic;

class OrderNotFoundException extends Exception{
    public OrderNotFoundException(String message){
        super(message);
    }
}

public class CustomException{
    public void getOrder(int id) throws OrderNotFoundException {
        if(id == 0){
            throw new OrderNotFoundException("Order Not found for Order Id "+id);
        }else{
            System.out.println("Hey");
        }
    }

    public static void main(String[] args) {
        CustomException e = new CustomException();
        try {
            e.getOrder(0);
        }
        catch (OrderNotFoundException ex) {
            throw new RuntimeException(ex);
        }
    }
}
