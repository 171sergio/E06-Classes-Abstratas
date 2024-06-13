public class WithdrawOperation extends Operation {
    public WithdrawOperation(float amount){
        super('s', amount);
    }

    public String toString(){
        String wdopStr;

        wdopStr = "Data : " + getDate() + "Tipo : " + getType() + "Valor : " + getAmount();

        return wdopStr;
    }

}