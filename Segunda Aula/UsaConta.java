class UsaConta{
    public static void main(String[] args){
        Conta c = new Conta();
        c.titular = "Zé";
        c.numero = 1234;
        c.agencia = "12";
        c.saldo = 3000;
        System.out.println(c.titular + " - "+ c.saldo);
        System.out.println(c);
    }

}