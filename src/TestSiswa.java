
public class TestSiswa {

    public static void main(String[] args) {
        
        EncapSiswa siswa = new EncapSiswa();
        siswa.setName("Nayang");
        siswa.setAbsen(24);
        siswa.setAddress("Jombang");
        
        System.out.println("Name : "+ siswa.getName()
        + " Absen : "+ siswa.getAbsen() + 
        " Address : "+ siswa.getAddress());
    }
    
}
