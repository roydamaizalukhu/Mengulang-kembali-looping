public class Segitiga {
    private double alas;
    private double tinggi;

    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public double getAlas() {
        return alas;
    }

    public double getTinggi() {
        return tinggi;
    }

    public double hitungLuas() {
        return (alas * tinggi) / 2;
    }

    public static class SegitigaSamaSisi extends Segitiga {
        public SegitigaSamaSisi(double alas, double tinggi) {
            super(alas, tinggi);
        }

        public double getLuas() {
            return (alas * tinggi) / 2;
        }
    }

    public static class SegitigaSikuSiku extends Segitiga {
        public SegitigaSikuSiku(double alas, double tinggi) {
            super(alas, tinggi);
        }

        public double getLuas() {
            double sikuSiku = Math.sqrt((alas * alas) + (tinggi * tinggi));
            return (sikuSiku * alas) / 2;
        }
    }

    public static class SegitigaSembarang extends Segitiga {
        public SegitigaSembarang(double alas, double tinggi) {
            super(alas, tinggi);
        }

        public double getLuas() {
            return (alas * tinggi) / 2;
        }
    }
}