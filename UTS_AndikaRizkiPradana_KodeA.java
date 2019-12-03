package uts_andikarizkipradana;

import javax.swing.JOptionPane;

public class UTS_AndikaRizkiPradana_KodeA {
    public static void main(String[] args) {
        
        int jenisPaket, jmlPaket, hargaPaket = 0, hargaPaketAnak = 0, hargaPaketDewasa = 0, totalHarga = 0, totalHargaAnak = 0, statusAnak, jmlAnak, usiaAnak;
        String namaPaket, fasilitasPaket = "";
        
        jenisPaket = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Pilihan Paket Tour: \n"
                                                                + "1. Amazing Turki Tour \n"
                                                                + "2. Bangkok Pattaya Tour \n"
                                                                + "3. Paket Wisata Derawan \n"
                                                                + "4. Exotic Bali Package \n"
                                                                + "5. Raja Ampat \n"
                                                                + "6. South Korea Winter \n"
                                                                + "7. Paket Tour 3 Negara"));
        
        switch(jenisPaket) {
            case 1:
                    namaPaket      =   "Amazing Turki Tour";
                    fasilitasPaket =   "Fasilitas: \n"
                                     + "    4D/3N \n"
                                     + "    SDF- City Tour-Bandara \n"
                                     + "    Hotel Bintang 5 \n"
                                     + "    Makan 2x Sehari \n"
                                     + "    Souvenir";
                    hargaPaket = 17500000; 
                    break;
        
            case 2:
                    namaPaket      =   "Amazing Turki Tour";
                    fasilitasPaket =   "Fasilitas: \n"
                                     + "    4D/3N \n"
                                     + "    SDF- City Tour-Bandara \n"
                                     + "    Hotel Bintang 5 \n"
                                     + "    Makan 2x Sehari \n"
                                     + "    Souvenir";
                    hargaPaket = 17500000; 
                    break;
        
            case 3:
                    namaPaket      =   "Amazing Turki Tour";
                    fasilitasPaket =   "Fasilitas: \n"
                                     + "    4D/3N \n"
                                     + "    SDF- City Tour-Bandara \n"
                                     + "    Hotel Bintang 5 \n"
                                     + "    Makan 2x Sehari \n"
                                     + "    Souvenir";
                    hargaPaket = 2075000; 
                    break;
                    
            case 4:
                    namaPaket      =   "Amazing Turki Tour";
                    fasilitasPaket =   "Fasilitas: \n"
                                     + "    4D/3N \n"
                                     + "    SDF- City Tour-Bandara \n"
                                     + "    Hotel Bintang 5 \n"
                                     + "    Makan 2x Sehari \n"
                                     + "    Souvenir";
                    hargaPaket = 17500000; 
                    break;
                    
            case 5:
                    namaPaket      =   "Amazing Turki Tour";
                    fasilitasPaket =   "Fasilitas: \n"
                                     + "    4D/3N \n"
                                     + "    SDF- City Tour-Bandara \n"
                                     + "    Hotel Bintang 5 \n"
                                     + "    Makan 2x Sehari \n"
                                     + "    Souvenir";
                    hargaPaket = 17500000; 
                    break;
                    
            case 6:
                    namaPaket      =   "Amazing Turki Tour";
                    fasilitasPaket =   "Fasilitas: \n"
                                     + "    4D/3N \n"
                                     + "    SDF- City Tour-Bandara \n"
                                     + "    Hotel Bintang 5 \n"
                                     + "    Makan 2x Sehari \n"
                                     + "    Souvenir";
                    hargaPaket = 17500000; 
                    break; 
                    
            case 7:
                    namaPaket      =   "Amazing Turki Tour";
                    fasilitasPaket =   "Fasilitas: \n"
                                     + "    4D/3N \n"
                                     + "    SDF- City Tour-Bandara \n"
                                     + "    Hotel Bintang 5 \n"
                                     + "    Makan 2x Sehari \n"
                                     + "    Souvenir";
                    hargaPaket = 17500000; 
                    break;        
        }
        
        jmlPaket = Integer.parseInt(JOptionPane.showInputDialog("Berapa paket yang akan dibeli?"));
        
        if (jmlPaket > 4) {
            hargaPaketDewasa = (int) (hargaPaket - (hargaPaket * 0.15));
        }
        
        totalHarga = hargaPaket * jmlPaket;
        
        statusAnak = Integer.parseInt(JOptionPane.showInputDialog("Apakah anda membawa anak? (1.Ya/2.Tidak)"));
        
        if (statusAnak == 1) {
            jmlAnak = Integer.parseInt(JOptionPane.showInputDialog("Berapa jumlah anak yang ikut?"));
            
            for (int i = 1; i <= jmlAnak; i++) {
                usiaAnak = Integer.parseInt(JOptionPane.showInputDialog("Masukkan usia anak ke-" +i));

                if (usiaAnak < 5) {
                    hargaPaketAnak = (int) (hargaPaket - (hargaPaket * 0.50));
                } else if (usiaAnak >= 5 && usiaAnak <= 10) {
                    hargaPaketAnak = (int) (hargaPaket - (hargaPaket * 0.35));
                }

                totalHargaAnak += hargaPaketAnak;
                } //End For
        }
        
        JOptionPane.showMessageDialog(null, totalHarga + totalHargaAnak);
        
    }
}
