package pbo;
public class praktikum_3 {
    public static void main(String[] args) 
    {
        praktikum_3 biodata = new praktikum_3 ();
        biodata.setNama("");
        biodata.setNIS("");
        biodata.setTempatlahir("");
        biodata.setTanggallahir("");
        biodata.setJeniskelamin("");
        biodata.setAlamatmalang("");
        biodata.setMotto("");
    }
    
    private void setNama(String nama){
        nama = "Viko Achmat Vernanda";
        System.out.println("Nama                : "+nama);
    }
    
    private void setNIS(String nis){
        nis = "6343";
        System.out.println("NIS                 : "+nis);
    }
    
    private void setTempatlahir(String tl){
        tl = "Probolinggo";
        System.out.println("Tempat lahir        : "+tl);
    }
   
    private void setTanggallahir(String tgl){
        tgl = "12 MEI 2003";
        System.out.println("Tanggal lahir       : "+tgl);
    }
    
    private void setJeniskelamin(String jkel){
        jkel = "PRIA";
        System.out.println("Jenis kelamin       : "+jkel);
    }
    
    private void setAlamatmalang(String alamat){
        alamat = "Jalan Danau Laut Tawar 1 G4 H17";
        System.out.println("Alamat di Malang    : "+alamat);
    }
    
    private void setMotto(String motto){
        motto = "Kehidupan lebih nyata daripada pendapat siapapun tentang kehidupan";
        System.out.println("Motto Hidup         : "+motto);
    }
}
