import java.util.ArrayList;
public class DemArrayList {
    int hasil;


    ArrayList<Integer> arrListHp = new ArrayList<>();
    ArrayList<Integer> arrListTV = new ArrayList<>();
    

   
}

class Mat extends DemArrayList{
    void Hp(){
        arrListHp.add(1);
        arrListHp.add(2);
        arrListHp.add(3);
        System.out.println("List Jumlah Hp Sebelum Di edit: " + arrListHp);
        arrListHp.set(1,4);
        System.out.println("List Jumlah Hp Sesudah Di edit: " + arrListHp);
        
    }

    void Tv(){
        arrListTV.add(4);
        arrListTV.add(5);
        System.out.println("List Jumlah TV Sebelum Di edit: " + arrListTV);
        arrListTV.set(1,3);
        System.out.println("List Jumlah Hp Sesudah Di edit: " + arrListTV);
    }

    void pertambah(int arrListHp, int arrListTV){
        hasil = arrListHp + arrListTV;
        System.out.println("Hasil Dari Pertambahan : " + arrListHp + " + " + arrListTV + " = " + hasil);
    }

    void perkurang(int arrListHp, int arrListTV){
        hasil = arrListHp - arrListTV;
        System.out.println("Hasil Dari Pertambahan : " + arrListHp + " - " + arrListTV + " = " + hasil);
    }
    void run(){
        Hp();
        Tv();
    }

}

class Test {
    public static void main(String[] args){
        Mat Demo = new Mat();
        Demo.pertambah(3,4);
        Demo.perkurang(4,2);
        Demo.run();

    }
}
