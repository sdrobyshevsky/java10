package examples.calculator;

public interface Calculable {
    Calculable sum(int arg);
    Calculable multi(int arg);
    Calculable divide(int arg); 
    int getResult();
}
