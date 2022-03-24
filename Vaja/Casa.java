public class Casa {
    
        String rua;
        float tamanhomuro;
        float area;


        Casa(String rua){ 
            this.rua = rua;
        }
        Casa(String rua, float tamanhomuro){ 
            this.rua = rua;
            this.tamanhomuro = tamanhomuro;
        }
        Casa(String rua, float tamanhomuro, float area){ 
            this.rua = rua;
            this.tamanhomuro = tamanhomuro;
            this.area = area;
        }
        
        void escreverrua(){
            System.out.println(rua);
        }
        void tamanhomuro(){
            System.out.println(tamanhomuro);
        }
        void area(){
            System.out.println(area);
        }
        String funcaorua(String txtprevio){
            return txtprevio + rua;
        }
        String funcaomuro(String txtprevio){
            return txtprevio + tamanhomuro;
        }
        String funcaoarea(String txtprevio){
            return txtprevio + area;
        }
        
}
