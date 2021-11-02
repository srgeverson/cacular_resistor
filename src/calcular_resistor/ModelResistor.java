package calcular_resistor;

public class ModelResistor {

    private Integer primeiroAnel;
    private Integer segundoAnel;
    private Integer terceiroAnel;
    private Integer quartoAnel;

    public ModelResistor() {
    }

    public Integer getPrimeiroAnel() {
        return primeiroAnel;
    }

    public void setPrimeiroAnel(Integer primeiroAnel) {
        this.primeiroAnel = primeiroAnel;
    }

    public Integer getSegundoAnel() {
        return segundoAnel;
    }

    public void setSegundoAnel(Integer segunroAnel) {
        this.segundoAnel = segunroAnel;
    }

    public Double getTerceiroAnel() {
        String terceiroAnelTemp = "1";
        if (terceiroAnel > -1) {
            for (int i = 0; i < terceiroAnel; i++) {
                terceiroAnelTemp += String.valueOf(0);
            }
            return 1 * Double.valueOf(terceiroAnelTemp);
        } else {
            for (int i = 0; i > terceiroAnel; i--) {
                terceiroAnelTemp += String.valueOf(0);
            }
            return 1 / Double.valueOf(terceiroAnelTemp);
        }
    }

    public void setTerceiroAnel(Integer terceiroAnel) {
        this.terceiroAnel = terceiroAnel;
    }

    public Integer getQuartoAnel() {
        switch (quartoAnel) {
            case -2:
                quartoAnel = 10;
                break;
            case -1:
                quartoAnel = 5;
                break;
            case 1:
                quartoAnel = 1;
                break;
            case 2:
                quartoAnel = 2;
                break;
            case 3:
                quartoAnel = 3;
                break;
            case 4:
                quartoAnel = 4;
                break;
        }
        return quartoAnel;
    }

    public void setQuartoAnel(Integer quartoAnel) {
        this.quartoAnel = quartoAnel;
    }
}
