package abstrakdaninterface;

public class KartuElektronik implements Kartu {
    private String kodeBank;
    private String pin;

    public KartuElektronik(String kodeBank, String pin){
        this.kodeBank = kodeBank;
        this.pin = pin;
    }
    @Override
    public boolean otentikasi(String pinInput) {
        return pin.equals(pinInput);
    }
    @Override
    public String encode(String pin) {
        return new StringBuilder(pin).reverse().toString();
    }
    // Getter dan Setter (opsional)
    public String getKodeBank() {
        return kodeBank;
    }
    public void setKodeBank(String kodeBank) {
        this.kodeBank = kodeBank;
    }
    public String getPin() {
        return pin;
    }
    public void setPin(String pin) {
        this.pin = pin;
    }
}

