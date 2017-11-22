/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.Alert;
import javax.swing.JOptionPane;
import view.form_cobaspk;
import model.mform_cobaspk;
import model.mform_histori;
import model.mform_utama_administrasi;
import model.mform_utama_afdelling;
import model.mform_utama_tpk;
import view.form_histori;
import view.form_utama_administrasi;
import view.form_utama_afdelling;
import view.form_utama_tpk;
/**
 *
 * @author GOGI
 */
public class cform_cobaspk {
    private form_cobaspk theview;
    private mform_cobaspk themodel;
    
    public cform_cobaspk(form_cobaspk theview,mform_cobaspk themodel){
        this.themodel=themodel;
        this.theview=theview;
        theview.setVisible(true);
        //theview.CekListener(new spkListener());
        theview.kembaliListener(new kembali());
        theview.CekListener(new hasilPerformed());
        theview.historiListener(new histori());
    }
      private class hasilPerformed implements ActionListener {
//
        @Override
        public void actionPerformed(ActionEvent e) {
           // double penyakit = Double.parseDouble(theview.getpenyakit());
            String penyakit=theview.getpenyakit();
           String musim=theview.getmusim();
          double usia=Double.parseDouble(theview.getusia());
         //   double jumlahpohon=Double.parseDouble(theview.getjumlahpohon());
           
                try {
                    if (penyakit.equals("Boktor")&&musim.equals("kemarau")&&usia>=0&&usia<=12)  {
                        
                theview.setVisible(true);
                theview.sethasil("Rawatlah tanamana dengan silvakultur\nTambah intensitas penyiraman pada pohon 1 Liter"
                        + "\nTapi jangan terlalu banyak");
                 JOptionPane.showMessageDialog(theview, "terimakasih");
                themodel.cek(theview.getpenyakit());
                if (themodel.save("NULL,'" + theview.getpenyakit() + "','" + theview.getmusim() + "','" + theview.getusia() + "','" + theview.gethasil()+ "'")) {
                        JOptionPane.showMessageDialog(theview, "berhasil ");
                        themodel.getTableModel();
                    } else {
                        JOptionPane.showMessageDialog(theview, "data gagal");
                    }
                 }else if (penyakit.equals("Karat Tumor")&&musim.equals("kemarau")&&usia>=0&&usia<=12){
                 theview.setVisible(true);
                theview.sethasil("Potong bagian Tanaman yang terserang karat tumor\nTimbun karat tumor didalam tanah\nTambah intensitas penyiraman pada pohon"
                        + "\nTapi jangan terlalu banyak");
                 JOptionPane.showMessageDialog(theview, "terimakasih");
                themodel.cek(theview.getpenyakit());
                if (themodel.save("NULL,'" + theview.getpenyakit() + "','" + theview.getmusim() + "','" + theview.getusia() + "','" + theview.gethasil()+ "'")) {
                        JOptionPane.showMessageDialog(theview, "berhasil ");
                        themodel.getTableModel();
                    } else {
                        JOptionPane.showMessageDialog(theview, "data gagal");
                    }
                }else if (penyakit.equals("uret")&&musim.equals("kemarau")&&usia>=0&&usia<=12){
                 theview.setVisible(true);
                theview.sethasil(" Pengendalian secara hayati dengan pemberian agens hayati Supermeta\n1.1 sachet (100 gr) SUPERMETA/MOSA-META dilarutkan dalam 100 sd 150 liter air, "
                        + "\nkemudian dikocorkan ke lahan / lubang tanam. Larutan ini digunakan untuk mengocor lahan ± 1.000m². Aplikasi ini dilakukan pada sore hari"
                        + "\nPemberian air dilebihkan 1 Liter");
                 JOptionPane.showMessageDialog(theview, "terimakasih");
                themodel.cek(theview.getpenyakit());
                if (themodel.save("NULL,'" + theview.getpenyakit() + "','" + theview.getmusim() + "','" + theview.getusia() + "','" + theview.gethasil()+ "'")) {
                        JOptionPane.showMessageDialog(theview, "berhasil ");
                        themodel.getTableModel();
                    } else {
                        JOptionPane.showMessageDialog(theview, "data gagal");
                    }
                }
                 else if (penyakit.equals("Jamur Upas")&&musim.equals("kemarau")&&usia>=0&&usia<=12){
                 theview.setVisible(true);
                theview.sethasil("Pangkas bagian tanaman yang terserang penyakit\nBakar hasil pangkasan tersebut\nTambah penyiraman pada pohon"
                        + "\nTapi jangan terlalu banyak");
                 JOptionPane.showMessageDialog(theview, "terimakasih");
                themodel.cek(theview.getpenyakit());
                if (themodel.save("NULL,'" + theview.getpenyakit() + "','" + theview.getmusim() + "','" + theview.getusia() + "','" + theview.gethasil()+ "'")) {
                        JOptionPane.showMessageDialog(theview, "berhasil ");
                        themodel.getTableModel();
                    } else {
                        JOptionPane.showMessageDialog(theview, "data gagal");
                    }
                }else if (penyakit.equals("Akar Merah")&&musim.equals("kemarau")&&usia>=0&&usia<=12){
                 theview.setVisible(true);
                theview.sethasil("Semprotkan fungiida Ganocida atau Calixin CP\nTambah intensitas penyiraman pada pohon sehari sekali"
                        + "\nTapi jangan terlalu banyak");
                 JOptionPane.showMessageDialog(theview, "terimakasih");
                themodel.cek(theview.getpenyakit());
                if (themodel.save("NULL,'" + theview.getpenyakit() + "','" + theview.getmusim() + "','" + theview.getusia() + "','" + theview.gethasil()+ "'")) {
                        JOptionPane.showMessageDialog(theview, "berhasil ");
                        themodel.getTableModel();
                    } else {
                        JOptionPane.showMessageDialog(theview, "data gagal");
                    }
                }else if (penyakit.equals("Buktor")&&musim.equals("hujan")&&usia>=0&&usia<=12){
                 theview.setVisible(true);
                theview.sethasil("Potong bagian Tanaman yang terserang karat tumor\nTimbun karat tumor didalam tanah\nIntensitas penyiraman sehari sekali"
                        + "\n");
                 JOptionPane.showMessageDialog(theview, "terimakasih");
                themodel.cek(theview.getpenyakit());
                if (themodel.save("NULL,'" + theview.getpenyakit() + "','" + theview.getmusim() + "','" + theview.getusia() + "','" + theview.gethasil()+ "'")) {
                        JOptionPane.showMessageDialog(theview, "berhasil ");
                        themodel.getTableModel();
                    } else {
                        JOptionPane.showMessageDialog(theview, "data gagal");
                    }
                }else if (penyakit.equals("Karat Tumor")&&musim.equals("hujan")&&usia>=0&&usia<=12){
                 theview.setVisible(true);
                theview.sethasil("Potong bagian Tanaman yang terserang karat tumor\nTimbun karat tumor didalam tanah\nTidak usah dilakukan penyiraman"
                        + "\n");
                 JOptionPane.showMessageDialog(theview, "terimakasih");
                themodel.cek(theview.getpenyakit());
                if (themodel.save("NULL,'" + theview.getpenyakit() + "','" + theview.getmusim() + "','" + theview.getusia() + "','" + theview.gethasil()+ "'")) {
                        JOptionPane.showMessageDialog(theview, "berhasil ");
                        themodel.getTableModel();
                    } else {
                        JOptionPane.showMessageDialog(theview, "data gagal");
                    }
                }else if (penyakit.equals("Jamur Upas")&&musim.equals("hujan")&&usia>=0&&usia<=12){
                 theview.setVisible(true);
                theview.sethasil("Pangkas bagian tanaman yang terserang penyakit\nBakar hasil pangkasan tersebut\nJangan lupa untuk cepat membakar"
                        + "\nTapi jangan terlalu banyak");
                 JOptionPane.showMessageDialog(theview, "terimakasih");
                themodel.cek(theview.getpenyakit());
                if (themodel.save("NULL,'" + theview.getpenyakit() + "','" + theview.getmusim() + "','" + theview.getusia() + "','" + theview.gethasil()+ "'")) {
                        JOptionPane.showMessageDialog(theview, "berhasil ");
                        themodel.getTableModel();
                    } else {
                        JOptionPane.showMessageDialog(theview, "data gagal");
                    }
                }else if (penyakit.equals("uret")&&musim.equals("hujan")&&usia>=0&&usia<=12){
                 theview.setVisible(true);
                theview.sethasil("Pengendalian secara hayati dengan pemberian agens hayati Supermeta\nSupermeta dicampur merata dengan 30 kg ( 1 karung) pupuk kandang yang sudah jadi "
                        + "kemudian diperam selama 1 sd 2 minggu. Campuran ini kemudian digunakan untuk  menabur luasan lahan ±1.000m². "
                        + "\nTidak perlu ada pemberian air lagi,cukup dengan air hujan");
                 JOptionPane.showMessageDialog(theview, "terimakasih");
                themodel.cek(theview.getpenyakit());
                if (themodel.save("NULL,'" + theview.getpenyakit() + "','" + theview.getmusim() + "','" + theview.getusia() + "','" + theview.gethasil()+ "'")) {
                        JOptionPane.showMessageDialog(theview, "berhasil ");
                        themodel.getTableModel();
                    } else {
                        JOptionPane.showMessageDialog(theview, "data gagal");
                    }
                }
                else if (penyakit.equals("Akar Merah")&&musim.equals("hujan")&&usia>=0&&usia<=12){
                 theview.setVisible(true);
                theview.sethasil("Semprotkan fungida Ganocida atau Calixin CP sebanyak 0.5 gram\nTutup bagian pohon yang terkena penyakit dengan kertas plastik"
                        + "\nTapi jangan terlalu banyak plastiknya");
                 JOptionPane.showMessageDialog(theview, "terimakasih");
                themodel.cek(theview.getpenyakit());
                if (themodel.save("NULL,'" + theview.getpenyakit() + "','" + theview.getmusim() + "','" + theview.getusia() + "','" + theview.gethasil()+ "'")) {
                        JOptionPane.showMessageDialog(theview, "berhasil ");
                        themodel.getTableModel();
                    } else {
                        JOptionPane.showMessageDialog(theview, "data gagal");
                    }
                }
                    //--24
                else if (penyakit.equals("Boktor")&&musim.equals("kemarau")&&usia>=13&&usia<=24)  {
                        
                theview.setVisible(true);
                theview.sethasil("Rawatlah tanamana dengan silvakultur \nTambah intensitas penyiraman pada pohon sebanyak 2 Liter air"
                        + "\nTapi tergantung juga pada cuaca");
                 JOptionPane.showMessageDialog(theview, "terimakasih");
                themodel.cek(theview.getpenyakit());
                if (themodel.save("NULL,'" + theview.getpenyakit() + "','" + theview.getmusim() + "','" + theview.getusia() + "','" + theview.gethasil()+ "'")) {
                        JOptionPane.showMessageDialog(theview, "berhasil ");
                        themodel.getTableModel();
                    } else {
                        JOptionPane.showMessageDialog(theview, "data gagal");
                    }
                 }else if (penyakit.equals("Karat Tumor")&&musim.equals("kemarau")&&usia>=13&&usia<=24){
                 theview.setVisible(true);
                theview.sethasil("Potong bagian Tanaman yang terserang karat tumor\nTimbun karat tumor didalam tanah\nTambah intensitas penyiraman untuk memberi nutrisi pada tanaman"
                        + "\n ");
                 JOptionPane.showMessageDialog(theview, "terimakasih");
                themodel.cek(theview.getpenyakit());
                if (themodel.save("NULL,'" + theview.getpenyakit() + "','" + theview.getmusim() + "','" + theview.getusia() + "','" + theview.gethasil()+ "'")) {
                        JOptionPane.showMessageDialog(theview, "berhasil ");
                        themodel.getTableModel();
                    } else {
                        JOptionPane.showMessageDialog(theview, "data gagal");
                    }
                }else if (penyakit.equals("uret")&&musim.equals("kemarau")&&usia>=13&&usia<=24){
                 theview.setVisible(true);
                theview.sethasil(" Pengendalian secara hayati dengan pemberian agens hayati Supermeta\n1 sachet (100 gr) SUPERMETA/MOSA-META dilarutkan dalam 100 sd 150 liter air, "
                        + "\nkemudian dikocorkan ke lahan / lubang tanam. Larutan ini digunakan untuk mengocor lahan ± 1.000m². Aplikasi ini dilakukan pada sore hari"
                        + "\nPemberian Supermeta dianjurkan pada siang hari ");
                 JOptionPane.showMessageDialog(theview, "terimakasih");
                themodel.cek(theview.getpenyakit());
                if (themodel.save("NULL,'" + theview.getpenyakit() + "','" + theview.getmusim() + "','" + theview.getusia() + "','" + theview.gethasil()+ "'")) {
                        JOptionPane.showMessageDialog(theview, "berhasil ");
                        themodel.getTableModel();
                    } else {
                        JOptionPane.showMessageDialog(theview, "data gagal");
                    }
                }
                 else if (penyakit.equals("Jamur Upas")&&musim.equals("kemarau")&&usia>=13&&usia<=24){
                 theview.setVisible(true);
                theview.sethasil("Pangkas bagian tanaman yang terserang penyakit\nBakar hasil pangkasan tersebut\nTambah penyiraman pada pohon 2 Liter air"
                        + "\nPenyiraman dialkukan secara berkala");
                 JOptionPane.showMessageDialog(theview, "terimakasih");
                themodel.cek(theview.getpenyakit());
                if (themodel.save("NULL,'" + theview.getpenyakit() + "','" + theview.getmusim() + "','" + theview.getusia() + "','" + theview.gethasil()+ "'")) {
                        JOptionPane.showMessageDialog(theview, "berhasil ");
                        themodel.getTableModel();
                    } else {
                        JOptionPane.showMessageDialog(theview, "data gagal");
                    }
                }else if (penyakit.equals("Akar Merah")&&musim.equals("kemarau")&&usia>=13&&usia<=24){
                 theview.setVisible(true);
                theview.sethasil("Semprotkan fungiida Ganocida atau Calixin CP\nTambah intensitas penyiraman pada pohon sehari sekali"
                        + "\n");
                 JOptionPane.showMessageDialog(theview, "terimakasih");
                themodel.cek(theview.getpenyakit());
                if (themodel.save("NULL,'" + theview.getpenyakit() + "','" + theview.getmusim() + "','" + theview.getusia() + "','" + theview.gethasil()+ "'")) {
                        JOptionPane.showMessageDialog(theview, "berhasil ");
                        themodel.getTableModel();
                    } else {
                        JOptionPane.showMessageDialog(theview, "data gagal");
                    }
                }else if (penyakit.equals("Buktor")&&musim.equals("hujan")&&usia>=13&&usia<=24){
                 theview.setVisible(true);
                theview.sethasil("Potong bagian Tanaman yang terserang karat tumor\nTimbun karat tumor didalam tanah \nBertujuan Agar tidak meracuni pohon yang lainya"
                        + "\n");
                 JOptionPane.showMessageDialog(theview, "terimakasih");
                themodel.cek(theview.getpenyakit());
                if (themodel.save("NULL,'" + theview.getpenyakit() + "','" + theview.getmusim() + "','" + theview.getusia() + "','" + theview.gethasil()+ "'")) {
                        JOptionPane.showMessageDialog(theview, "berhasil ");
                        themodel.getTableModel();
                    } else {
                        JOptionPane.showMessageDialog(theview, "data gagal");
                    }
                }else if (penyakit.equals("Karat Tumor")&&musim.equals("hujan")&&usia>=13&&usia<=24){
                 theview.setVisible(true);
                theview.sethasil("Potong bagian Tanaman yang terserang karat tumor\nTimbun karat tumor didalam tanah\nTidak perlu melakukan penyiraman"
                        + "\n");
                 JOptionPane.showMessageDialog(theview, "terimakasih");
                themodel.cek(theview.getpenyakit());
                if (themodel.save("NULL,'" + theview.getpenyakit() + "','" + theview.getmusim() + "','" + theview.getusia() + "','" + theview.gethasil()+ "'")) {
                        JOptionPane.showMessageDialog(theview, "berhasil ");
                        themodel.getTableModel();
                    } else {
                        JOptionPane.showMessageDialog(theview, "data gagal");
                    }
                }else if (penyakit.equals("Jamur Upas")&&musim.equals("hujan")&&usia>=13&&usia<=24){
                 theview.setVisible(true);
                theview.sethasil("Pangkas bagian tanaman yang terserang penyakit\nBakar hasil pangkasan tersebut\nJangan lupa untuk cepat membakar"
                        + "\nTidak perlu mengadakan penyiraman lagi");
                 JOptionPane.showMessageDialog(theview, "terimakasih");
                themodel.cek(theview.getpenyakit());
                if (themodel.save("NULL,'" + theview.getpenyakit() + "','" + theview.getmusim() + "','" + theview.getusia() + "','" + theview.gethasil()+ "'")) {
                        JOptionPane.showMessageDialog(theview, "berhasil ");
                        themodel.getTableModel();
                    } else {
                        JOptionPane.showMessageDialog(theview, "data gagal");
                    }
                }else if (penyakit.equals("uret")&&musim.equals("hujan")&&usia>=13&&usia<=24){
                 theview.setVisible(true);
                theview.sethasil("Pengendalian secara hayati dengan pemberian agens hayati Supermeta\nSupermeta dicampur merata dengan 30 kg ( 1 karung) pupuk kandang yang sudah jadi "
                        + "kemudian diperam selama 1 sd 2 minggu. Campuran ini kemudian digunakan untuk  menabur luasan lahan ±1.000m². "
                        + "\nTidak perlu ada pemberian air lagi");
                 JOptionPane.showMessageDialog(theview, "terimakasih");
                themodel.cek(theview.getpenyakit());
                if (themodel.save("NULL,'" + theview.getpenyakit() + "','" + theview.getmusim() + "','" + theview.getusia() + "','" + theview.gethasil()+ "'")) {
                        JOptionPane.showMessageDialog(theview, "berhasil ");
                        themodel.getTableModel();
                    } else {
                        JOptionPane.showMessageDialog(theview, "data gagal");
                    }
                }
                else if (penyakit.equals("Akar Merah")&&musim.equals("hujan")&&usia>=13&&usia<=24){
                 theview.setVisible(true);
                theview.sethasil("Semprotkan fungida Ganocida atau Calixin CP sebanyak 0.5 gram\nTutup bagian pohon yang terkena penyakit dengan kertas plastik"
                        + "\nDiusahakan agar menutup dengan rapat ");
                 JOptionPane.showMessageDialog(theview, "terimakasih");
                themodel.cek(theview.getpenyakit());
                if (themodel.save("NULL,'" + theview.getpenyakit() + "','" + theview.getmusim() + "','" + theview.getusia() + "','" + theview.gethasil()+ "'")) {
                        JOptionPane.showMessageDialog(theview, "berhasil ");
                        themodel.getTableModel();
                    } else {
                        JOptionPane.showMessageDialog(theview, "data gagal");
                    }
                }
                    //---36
                    
                    else if (penyakit.equals("Boktor")&&musim.equals("kemarau")&&usia>=25&&usia<=36)  {
                        
                theview.setVisible(true);
                theview.sethasil("Rawatlah tanamana dengan silvakultur \nTambah intensitas penyiraman pada pohon secukupnya"
                        + "\n");
                 JOptionPane.showMessageDialog(theview, "terimakasih");
                themodel.cek(theview.getpenyakit());
                if (themodel.save("NULL,'" + theview.getpenyakit() + "','" + theview.getmusim() + "','" + theview.getusia() + "','" + theview.gethasil()+ "'")) {
                        JOptionPane.showMessageDialog(theview, "berhasil ");
                        themodel.getTableModel();
                    } else {
                        JOptionPane.showMessageDialog(theview, "data gagal");
                    }
                 }else if (penyakit.equals("Karat Tumor")&&musim.equals("kemarau")&&usia>=25&&usia<=36){
                 theview.setVisible(true);
                theview.sethasil("Potong bagian Tanaman yang terserang karat tumor\nTimbun karat tumor didalam tanah\n"
                        + "\n ");
                 JOptionPane.showMessageDialog(theview, "terimakasih");
                themodel.cek(theview.getpenyakit());
                if (themodel.save("NULL,'" + theview.getpenyakit() + "','" + theview.getmusim() + "','" + theview.getusia() + "','" + theview.gethasil()+ "'")) {
                        JOptionPane.showMessageDialog(theview, "berhasil ");
                        themodel.getTableModel();
                    } else {
                        JOptionPane.showMessageDialog(theview, "data gagal");
                    }
                }else if (penyakit.equals("uret")&&musim.equals("kemarau")&&usia>=25&&usia<=36){
                 theview.setVisible(true);
                theview.sethasil(" Pengendalian secara hayati dengan pemberian agens hayati Supermeta\n1 sachet (100 gr) SUPERMETA/MOSA-META dilarutkan dalam 100 sd 150 liter air, "
                        + "\nkemudian dikocorkan ke lahan / lubang tanam."
                        + "\n");
                 JOptionPane.showMessageDialog(theview, "terimakasih");
                themodel.cek(theview.getpenyakit());
                if (themodel.save("NULL,'" + theview.getpenyakit() + "','" + theview.getmusim() + "','" + theview.getusia() + "','" + theview.gethasil()+ "'")) {
                        JOptionPane.showMessageDialog(theview, "berhasil ");
                        themodel.getTableModel();
                    } else {
                        JOptionPane.showMessageDialog(theview, "data gagal");
                    }
                }
                 else if (penyakit.equals("Jamur Upas")&&musim.equals("kemarau")&&usia>=25&&usia<=36){
                 theview.setVisible(true);
                theview.sethasil("Pangkas bagian tanaman yang terserang penyakit\nBakar hasil pangkasan tersebut\n"
                        + "\n");
                 JOptionPane.showMessageDialog(theview, "terimakasih");
                themodel.cek(theview.getpenyakit());
                if (themodel.save("NULL,'" + theview.getpenyakit() + "','" + theview.getmusim() + "','" + theview.getusia() + "','" + theview.gethasil()+ "'")) {
                        JOptionPane.showMessageDialog(theview, "berhasil ");
                        themodel.getTableModel();
                    } else {
                        JOptionPane.showMessageDialog(theview, "data gagal");
                    }
                }else if (penyakit.equals("Akar Merah")&&musim.equals("kemarau")&&usia>=25&&usia<=36){
                 theview.setVisible(true);
                theview.sethasil("Semprotkan fungiida Ganocida atau Calixin CP\nTambah intensitas penyiraman pada pohon sehari sekali"
                        + "\n");
                 JOptionPane.showMessageDialog(theview, "terimakasih");
                themodel.cek(theview.getpenyakit());
                if (themodel.save("NULL,'" + theview.getpenyakit() + "','" + theview.getmusim() + "','" + theview.getusia() + "','" + theview.gethasil()+ "'")) {
                        JOptionPane.showMessageDialog(theview, "berhasil ");
                        themodel.getTableModel();
                    } else {
                        JOptionPane.showMessageDialog(theview, "data gagal");
                    }
                }else if (penyakit.equals("Buktor")&&musim.equals("hujan")&&usia>=25&&usia<=36){
                 theview.setVisible(true);
                theview.sethasil("Potong bagian Tanaman yang terserang karat tumor\nTimbun karat tumor didalam tanah \nTempat penimbunan dianjurkan jauh dari pohon sengon"
                        + "\n");
                 JOptionPane.showMessageDialog(theview, "terimakasih");
                themodel.cek(theview.getpenyakit());
                if (themodel.save("NULL,'" + theview.getpenyakit() + "','" + theview.getmusim() + "','" + theview.getusia() + "','" + theview.gethasil()+ "'")) {
                        JOptionPane.showMessageDialog(theview, "berhasil ");
                        themodel.getTableModel();
                    } else {
                        JOptionPane.showMessageDialog(theview, "data gagal");
                    }
                }else if (penyakit.equals("Karat Tumor")&&musim.equals("hujan")&&usia>=25&&usia<=36){
                 theview.setVisible(true);
                theview.sethasil("Potong bagian Tanaman yang terserang karat tumor\nTimbun karat tumor didalam tanah\n"
                        + "\n");
                 JOptionPane.showMessageDialog(theview, "terimakasih");
                themodel.cek(theview.getpenyakit());
                if (themodel.save("NULL,'" + theview.getpenyakit() + "','" + theview.getmusim() + "','" + theview.getusia() + "','" + theview.gethasil()+ "'")) {
                        JOptionPane.showMessageDialog(theview, "berhasil ");
                        themodel.getTableModel();
                    } else {
                        JOptionPane.showMessageDialog(theview, "data gagal");
                    }
                }else if (penyakit.equals("Jamur Upas")&&musim.equals("hujan")&&usia>=25&&usia<=36){
                 theview.setVisible(true);
                theview.sethasil("Pangkas bagian tanaman yang terserang penyakit\nBakar hasil pangkasan tersebut\nJangan lupa untuk cepat membakar"
                        + "\nAbu hasil pembakaran segera dipendam dengan tanah");
                 JOptionPane.showMessageDialog(theview, "terimakasih");
                themodel.cek(theview.getpenyakit());
                if (themodel.save("NULL,'" + theview.getpenyakit() + "','" + theview.getmusim() + "','" + theview.getusia() + "','" + theview.gethasil()+ "'")) {
                        JOptionPane.showMessageDialog(theview, "berhasil ");
                        themodel.getTableModel();
                    } else {
                        JOptionPane.showMessageDialog(theview, "data gagal");
                    }
                }else if (penyakit.equals("uret")&&musim.equals("hujan")&&usia>=25&&usia<=36){
                 theview.setVisible(true);
                theview.sethasil("Pengendalian secara hayati dengan pemberian agens hayati Supermeta\nSupermeta dicampur merata dengan 30 kg ( 1 karung) pupuk kandang yang sudah jadi "
                        + "kemudian diperam selama 1 sd 2 minggu."
                        + "\n");
                 JOptionPane.showMessageDialog(theview, "terimakasih");
                themodel.cek(theview.getpenyakit());
                if (themodel.save("NULL,'" + theview.getpenyakit() + "','" + theview.getmusim() + "','" + theview.getusia() + "','" + theview.gethasil()+ "'")) {
                        JOptionPane.showMessageDialog(theview, "berhasil ");
                        themodel.getTableModel();
                    } else {
                        JOptionPane.showMessageDialog(theview, "data gagal");
                    }
                }
                else if (penyakit.equals("Akar Merah")&&musim.equals("hujan")&&usia>=25&&usia<=36){
                 theview.setVisible(true);
                theview.sethasil("Semprotkan fungida Ganocida atau Calixin CP sebanyak \nTutup bagian pohon yang terkena penyakit dengan kertas plastik"
                        + "\nDiusahakan agar menutup dengan rapat\nJika masih belum berhasil segera pangkas bagian tanaman yang terkena penyakit ");
                 JOptionPane.showMessageDialog(theview, "terimakasih");
                themodel.cek(theview.getpenyakit());
                if (themodel.save("NULL,'" + theview.getpenyakit() + "','" + theview.getmusim() + "','" + theview.getusia() + "','" + theview.gethasil()+ "'")) {
                        JOptionPane.showMessageDialog(theview, "berhasil ");
                        themodel.getTableModel();
                    } else {
                        JOptionPane.showMessageDialog(theview, "data gagal");
                    }
                }else{
                JOptionPane.showMessageDialog(theview, "silahkan cek lagi\nUsia tanaman max 36 bulan");
                }
                    
                } catch (SQLException ex) {
                    Logger.getLogger(cform_cobaspk.class.getName()).log(Level.SEVERE, null, ex);
                }
            
        }
      }
    
 
    
       class kembali implements ActionListener {

       
        @Override
        public void actionPerformed(ActionEvent e) {
           theview.setVisible(false);
           
           //  new cform_admin_baranginventaris(new mform_admin_baranginventaris(),new form_admin_barangInventaris() );
          new cform_utama_afdelling(new mform_utama_afdelling(), new form_utama_afdelling());
            theview.dispose();
           
        }
 
    }
         class histori implements ActionListener {

        
        @Override
        public void actionPerformed(ActionEvent e) {
           theview.setVisible(false);
           
            try {
                new cform_histori(new form_histori(), new mform_histori());
            } catch (SQLException ex) {
                Logger.getLogger(cform_cobaspk.class.getName()).log(Level.SEVERE, null, ex);
            }
            theview.dispose();
           
        }
 
    }
       
}
    

