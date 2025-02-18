public class Araba {

    String marka;
    String model;
    int anlikhiz;
    int sonhiz;

    public Araba(String marka, String model, int sonhiz) {
        this.marka = marka;
        this.model = model;
        this.sonhiz = sonhiz;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSonhiz() {
        return sonhiz;
    }

    public void setSonhiz(int sonhiz) {
        this.sonhiz = sonhiz;
    }

}
