package generics;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NumberGame<T extends Number> {
    private List<T> numbers;
    public List<T> getNumbers() {
        return numbers;
    }
    public NumberGame(){
        this.numbers = new ArrayList<>();
    }
    public void addNumber(T number){
        this.numbers.add(number);
    }
}
