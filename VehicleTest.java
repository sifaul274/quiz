class Vehicle{
    private String maker;
    private double kmPerGallons;
    Vehicle(String nama, double bahanBakar){
        this.maker = nama;
        this.kmPerGallons = bahanBakar;
    }
    void setMaker(String nama){
        this.maker = nama;
    }
    void setKmPerGallons(double bahanBakar){
        this.kmPerGallons = bahanBakar;
    }
    String getMaker(){
        return this.maker;
    }
    double getKmPerGallons(){
        return this.kmPerGallons;
    }
    void showMaker(){
        System.out.println("Nama Kendaraan: "+this.getMaker());
    }
    void showKmPerGallons(){
        System.out.println("Konsumsi bahan bakar: "+this.getKmPerGallons()+" km per gallons");
    }
    int bandingkan(Vehicle obj){
        int nilai;
        if (this.kmPerGallons > obj.kmPerGallons){
            nilai = 1;
        } else if (this.kmPerGallons < obj.kmPerGallons){
            nilai = -1;
        } else {
            nilai = 0;
        }
        return nilai;
    }
    double liter(){
        double liter = this.getKmPerGallons()/3785;
        return liter;
    }
    void showLiter(){
        System.out.println("Konsumsi bahan bakar: "+this.liter()+" km per liter");
    }
}
public class VehicleTest {
    public static void main(String[] args){
        Vehicle vehicle1 = new Vehicle("Lamborghini",5000d);
        Vehicle vehicle2 = new Vehicle("Ford",6000d);
        
        vehicle1.showMaker();
        vehicle1.showKmPerGallons();
        System.out.println("");
        vehicle2.showMaker();
        vehicle2.showKmPerGallons();
        System.out.println("");

        vehicle1.setKmPerGallons(5500d);
        vehicle2.setKmPerGallons(5900d);
        
        vehicle1.showMaker();
        vehicle1.showKmPerGallons();
        System.out.println("");
        vehicle2.showMaker();
        vehicle2.showKmPerGallons();
        
        int a = vehicle1.bandingkan(vehicle2);
        System.out.println("\n"+a+"\n");
        
        vehicle1.showMaker();
        vehicle1.showLiter();
        System.out.println("");
        vehicle2.showMaker();
        vehicle2.showLiter();
    }
}
