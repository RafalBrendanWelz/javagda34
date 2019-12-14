package dzien11.wyjatki;



public class KontoBankowe {
    protected long stanKonta;

    public KontoBankowe(long stanKonta) {
        this.stanKonta = stanKonta;
    }

    public long getStanKonta() {
        return stanKonta;
    }

    public long wyplacSrodki(long kwotaDoWyplaty)throws Exception {
        if (kwotaDoWyplaty < stanKonta) {
            stanKonta -= kwotaDoWyplaty;
            return kwotaDoWyplaty;
        } else {
            throw new Exception("Nie masz tyle kasy na koncie");
        }

    }

    public void test() {
        try {
            System.out.println("Jestem w bloku try");
            return;
        } catch (Exception e) {
            System.out.println("Jestem w bloku catch");
        } finally {
            System.out.println("Jestem w bloku finally");
        }
    }
}
