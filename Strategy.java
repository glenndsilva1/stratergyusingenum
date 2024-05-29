package stratergy;

public enum Strategy {
	ADD {  
        @Override  
        public int execute(int a, int b) {  
            return a + b;  
        }  
    },  
    SUBTRACT {  
        @Override  
        public int execute(int a, int b) {  
            return a - b;  
        }  
    };  
  
    public abstract int execute(int a, int b);  
}
