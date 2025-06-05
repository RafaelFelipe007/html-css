 public static void main(String[] args) {
        // TODO code application logic here
        int numero=10;
        int resultado= numero%2;
        //System.out.println((resultado==0)?"È Par!" : "È Impar!");
        
        switch(resultado){
            case 1:
                System.out.println("È Impar!");
                break;
                        
            case 0:
                System.out.println("È Par!");
                break;
                                
        }
    }
    
}