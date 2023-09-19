public class Televisi {
    private String merek;
    private String harga;
    private boolean hidup;
    private int channel;

    public Televisi(String merek, String harga) {
        this.merek = merek;
        this.harga = harga;
    }

    public void informasiTv() {
        System.out.println("Televisi " + merek + " harga " + harga);
    }

    public void hidupkanTv() {
        hidup = true;
        System.out.println("Televisi hidup");
    }

    public void matikanTv() {
        hidup = false;
        System.out.println("Televisi mati");
    }

    public void setChannel(int channel) {
        if (hidup) {
            this.channel = channel;
        } else {
            System.out.println("Televisi belum dinyalakan");
        }
    }

    public int getChannel() {
        return channel;
    }
}
