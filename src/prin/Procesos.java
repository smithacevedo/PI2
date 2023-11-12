package prin;
class Procesos {
    int rpt1, rpt2, rpt3, rpt4, rpt5, rpt6, rpt7, prom;
    
    public void Ingreso (int r1, int r2, int r3, int r4, int r5, int r6, int r7){
        this.rpt1=r1;
        this.rpt2=r2;
        this.rpt3=r3;
        this.rpt4=r4;
        this.rpt5=r5;
        this.rpt6=r6;
        this.rpt7=r7;
    }
    
    public int Calculo (){
        prom=(rpt1 + rpt2 + rpt3 + rpt4 + rpt5 + rpt6 + rpt7)/7;
        return prom;
    }
}
