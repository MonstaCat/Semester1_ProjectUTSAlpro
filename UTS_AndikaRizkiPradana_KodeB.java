package uts_andikarizkipradana;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import javax.swing.JOptionPane;

public class UTS_AndikaRizkiPradana_KodeB {
    public static void main(String[] args) {
        
        int jmlBuku, konfirKeranjang, konfirPembelian, konfirMember, totalBuku = 0, diskonToko = 0;
        double harga = 0, totalHarga = 0, estimasiDiskon, totalBelanjaMember, totalBelanja;
        String kodeBuku, inforBuku, checkout = "";
        
        jmlBuku = Integer.parseInt(JOptionPane.showInputDialog("Berapa jumlah buku yang ingin anda cari infonya?"));
        
        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');

        kursIndonesia.setDecimalFormatSymbols(formatRp);
        
        for (int i = 1; i <= jmlBuku; i++) {
            kodeBuku = JOptionPane.showInputDialog("Masukkan kode buku ke-" +i);
            
            switch(kodeBuku){
                case "181818A":
                    inforBuku = "Kode Buku: 181818A\nJudul Buku: Dhirga\nNama Pengarang: Natalia Tan";
                    harga = 68000; 
                    break;
                    
                case "191919B":
                    inforBuku = "Kode Buku: 191919B\nJudul Buku: Summer Sky\nNama Pengarang: Stephanie Zen";
                    harga = 124000;
                    break; 
                    
                case "202020C":
                    inforBuku = "Kode Buku: 202020C\nJudul Buku: Noversation\nNama Pengarang: Valerie Patkar";
                    harga = 115000;
                    break; 
                    
                case "171717D":
                    inforBuku = "Kode Buku: 171717D\nJudul Buku: Si Anak Badai\nNama Pengarang: Tere Liye";
                    harga = 75000;
                    break; 
                    
                case "161616E":
                    inforBuku = "Kode Buku: 161616E\nJudul Buku: Komet Minor\nNama Pengarang: Tere Liye";
                    harga = 71500;
                    break; 
                    
                case "101010F":
                    inforBuku = "Kode Buku: 101010F\nJudul Buku: Me and My Broken Heart\nNama Pengarang: Wulafandi";
                    harga = 69500;
                    break; 
                    
                case "090909G":
                    inforBuku = "Kode Buku: 090909G\nJudul Buku: Dilan\nNama Pengarang: Pidi Baiq";
                    harga = 59000;
                    break; 
                
                default:
                    inforBuku = "Tidak terdapat buku pada kode tersebut";
                    break;
            }
            
            konfirKeranjang = Integer.parseInt(JOptionPane.showInputDialog("Informasi Buku, \n\n" +inforBuku+ "\n\nHarga: " +kursIndonesia.format(harga)+ "\n\nApakah ingin menambahkan buku ke keranjang belanja? (1.Ya / 2.Tidak)"));
           
            if(konfirKeranjang == 1){
                totalBuku++;
                totalHarga += harga;
                checkout += inforBuku+"\n\n ";
            }
            
        } //End for
        
        //Informasi Keranjang
        konfirPembelian = Integer.parseInt(JOptionPane.showInputDialog(null, "Informasi Keranjang, \n\n\n" +checkout+ "\nTotal Harga: " +kursIndonesia.format(totalHarga)+ "\n\nApakah anda ingin membeli? (1.Ya / 2.Tidak)"));
        if (konfirPembelian == 1) {
            
            if (totalBuku > 3) {
                diskonToko = 7000;
                konfirMember = Integer.parseInt(JOptionPane.showInputDialog(null, "Apakah anda mempunyai kartu member? (1.Ya / 2.Tidak)"));
                if(konfirMember == 1){
                    estimasiDiskon = (float) (totalHarga * 0.15);
                    totalBelanjaMember = totalHarga - estimasiDiskon - diskonToko;
                    JOptionPane.showMessageDialog(null, "Informasi Pembelian, \n\n\n" +checkout+ "\nTotal Harga: " +kursIndonesia.format(totalHarga)+ "\n\nDiskon Member: 15%\nDiskon Toko: " +kursIndonesia.format(diskonToko)+ "\n\nTotal Belanja: " +kursIndonesia.format(totalBelanjaMember));
                    JOptionPane.showMessageDialog(null, "Terima Kasih Telah Mengunjungi Toko Kami");

                } else {    
                    totalBelanja = totalHarga - diskonToko;
                    JOptionPane.showMessageDialog(null, "Informasi Pembelian, \n\n\n" +checkout+ "\nTotal Harga: " +kursIndonesia.format(totalHarga)+ "\n\nDiskon Toko: " +kursIndonesia.format(diskonToko)+ "\n\nTotal Belanja: " +kursIndonesia.format(totalBelanja));
                    JOptionPane.showMessageDialog(null, "Terima Kasih Telah Mengunjungi Toko Kami");
                }
            } else {
                diskonToko = 0;
                konfirMember = Integer.parseInt(JOptionPane.showInputDialog(null, "Apakah anda mempunyai kartu member? (1.Ya / 2.Tidak)"));
                if(konfirMember == 1){
                    estimasiDiskon = (float) (totalHarga * 0.15);
                    totalBelanjaMember = totalHarga - estimasiDiskon - diskonToko;
                    JOptionPane.showMessageDialog(null, "Informasi Pembelian, \n\n\n" +checkout+ "\nTotal Harga: " +kursIndonesia.format(totalHarga)+ "\n\nDiskon Member: 15%\nDiskon Toko: " +kursIndonesia.format(diskonToko)+ "\n\nTotal Belanja: " +kursIndonesia.format(totalBelanjaMember));
                    JOptionPane.showMessageDialog(null, "Terima Kasih Telah Mengunjungi Toko Kami");

                } else {    
                    totalBelanja = totalHarga - diskonToko;
                    JOptionPane.showMessageDialog(null, "Informasi Pembelian, \n\n\n" +checkout+ "\nTotal Harga: " +kursIndonesia.format(totalHarga)+ "\n\nDiskon Toko: " +kursIndonesia.format(diskonToko)+ "\n\nTotal Belanja: " +kursIndonesia.format(totalBelanja));
                    JOptionPane.showMessageDialog(null, "Terima Kasih Telah Mengunjungi Toko Kami");
                }
            }
            
        } else {
            JOptionPane.showMessageDialog(null, "Terima Kasih Telah Mengunjungi Toko Kami");
        }
        
    }
}
