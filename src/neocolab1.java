

    class neocolab1 {
        static {
            System.out.println("Static Block");
        }
    
        {
            System.out.println("Instance Block");
        }
    
        neocolab1() {
            System.out.println("Constructor");
        }
    
        public static void main(String[] args) {
            neocolab1 t = new neocolab1();
        }
    }

