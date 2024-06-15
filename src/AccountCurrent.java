public class AccountCurrent extends Account{

    public AccountCurrent(Client owner, double balance, int ID, float limit, String agency) {
        super(owner, balance, ID, limit, agency);
    }

    public void setLimit(float newlimit){

        if(newlimit<-100){
            System.out.println("ERRO!  O limite minimo é de R$ -100,00");
        }
        else {
            limit = newlimit;
        }

    }

}

