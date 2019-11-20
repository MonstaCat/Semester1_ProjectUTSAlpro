package uts_andikarizkipradana;

import javax.swing.JOptionPane;

public class UTS_AndikaRizkiPradana_KodeB {
    public static void main(String[] args) {
        
        int jmlBuku, konfirKeranjang, konfirPembelian, konfirMember;
        float harga = 0, totalHarga = 0, estimasiDiskon, totalBelanjaMember;
        String kodeBuku, inforBuku, checkout = "";
        
        jmlBuku = Integer.parseInt(JOptionPane.showInputDialog("Berapa jumlah buku yang ingin anda cari infonya?"));
        
        for (int i = 1; i <= jmlBuku; i++) {
            kodeBuku = JOptionPane.showInputDialog("Masukkan kode buku ke-" +i);
            
            switch(kodeBuku){
                case "181818A":
                    inforBuku = "Judul Buku: Dhirga\nNama Pengarang: Natalia Tan";
                    harga = 68000; 
                    break;
                    
                case "191919B":
                    inforBuku = "Judul Buku: Summer Sky\nNama Pengarang: Stephanie Zen";
                    harga = 124000;
                    break; 
                    
                case "202020C":
                    inforBuku = "Judul Buku: Noversation\nNama Pengarang: Valerie Patkar";
                    harga = 115000;
                    break; 
                    
                case "171717D":
                    inforBuku = "Judul Buku: Si Anak Badai\nNama Pengarang: Tere Liye";
                    harga = 75000;
                    break; 
                    
                case "161616E":
                    inforBuku = "Judul Buku: Komet Minor\nNama Pengarang: Tere Liye";
                    harga = 71500;
                    break; 
                    
                case "101010F":
                    inforBuku = "Judul Buku: Me and My Broken Heart\nNama Pengarang: Wulafandi";
                    harga = 69500;
                    break; 
                    
                case "090909G":
                    inforBuku = "Judul Buku: Dilan\nNama Pengarang: Pidi Baiq";
                    harga = 59000;
                    break; 
                
                default:
                    inforBuku = "Tidak terdapat buku pada kode tersebut";
                    break;
            }
            
            konfirKeranjang = Integer.parseInt(JOptionPane.showInputDialog("Informasi Buku, \n\n" +inforBuku+ "\nHarga: " +harga+ "\n\nApakah ingin menambahkan buku ke keranjang belanja? (1.Ya / 2.Tidak)"));
           
            if(konfirKeranjang == 1){
                totalHarga += harga;
                checkout += inforBuku+"\n\n ";
            } else {
                JOptionPane.showMessageDialog(null, "Terima Kasih Telah Mengunjungi Toko Kami");
            }
            
        } //End for
        
        //Informasi Keranjang
        konfirPembelian = Integer.parseInt(JOptionPane.showInputDialog(null, "Informasi Keranjang, \n\n\n" +checkout+ "\nTotal Harga: " +totalHarga+ "\n\nApakah anda ingin membeli? (1.Ya / 2.Tidak)"));
        if (konfirPembelian == 1) {
            
            konfirMember = Integer.parseInt(JOptionPane.showInputDialog(null, "Apakah anda mempunyai kartu member? (1.Ya / 2.Tidak)"));
            if(konfirMember == 1){
                estimasiDiskon = (float) (totalHarga * 0.15);
                totalBelanjaMember = totalHarga - estimasiDiskon;
                JOptionPane.showMessageDialog(null, "Informasi Pembelian, \n\n\n" +checkout+ "\nTotal Harga: " +totalHarga+ "\n\nDiskon Member: 15%\nDiskon Toko: " +estimasiDiskon+ "\n\nTotal Belanja: " +totalBelanjaMember);
                JOptionPane.showMessageDialog(null, "Terima Kasih Telah Mengunjungi Toko Kami");
                
            } else {
                JOptionPane.showMessageDialog(null, "Informasi Pembelian, \n\n\n" +checkout+ "Total Belanja: " +totalHarga);
                JOptionPane.showMessageDialog(null, "Terima Kasih Telah Mengunjungi Toko Kami");
            }
            
        } else {
            JOptionPane.showMessageDialog(null, "Terima Kasih Telah Mengunjungi Toko Kami");
        }
        
        
    }
}
