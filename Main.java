import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<Data> list = Arrays.asList(new Data(1,"anurodh@gmail.com","Anurodh",23), new Data(2,"aviral@gmail.com","Aviral Singh",33),new Data(3,"yug@gmail.com","Yug",12), new Data(4,"pritam@gmail.com","Pritam",31));
        Optional<Data> customer = list.stream().min(Comparator.comparing(Data::getAge));
        customer.ifPresent(e-> System.out.println(e.getName()));
    }
}
