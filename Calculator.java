package stratergy;

public class Calculator {  
    private Strategy strategy;  
  
    public int calculate(int a, int b) {  
        return strategy.execute(a, b);  
    }  
  
    public void setStrategy(Strategy strategy) {  
        this.strategy = strategy;  
    }  
    
    public static void main(String args[]) {
    	Calculator d = new Calculator();
    	System.out.println(Strategy.ADD.name());
    	d.setStrategy(Strategy.ADD);
    	System.out.println(d.calculate(2, 2));
    }
}  
