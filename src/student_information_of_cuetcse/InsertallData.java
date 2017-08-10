package student_information_of_cuetcse;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author RUKUNUJJAMAN MIAJI
 */
class InsertallData extends JFrame implements ActionListener
{
     private final JLabel BLOOD_GROUP;
    private final JTextField DISTRICT_ID;
    private final JLabel DISTRI_ID;
    private final JLabel FATHER_NAME;
    private final JLabel HALL_ID;
    private final JLabel ID;
    private final JLabel L_GRADE;
    private final JLabel MOBILE_NO;
    private final JLabel MOTHER_NAME;
    private final JLabel NAME;
    private final JLabel POINT;
    private final JLabel SAMPLE_DISTRICT_ID;
    private final JLabel SAMPLE_HALL_ID;
    private final JLabel SAMPLE_SUB_ID;
    private final JLabel SAMPLE_THANA_ID;
    private final JLabel SUB_ID;
    private final JLabel TERM;
    private final JTextField TEXT_MOBILE;
    private final JLabel THANA;
    private final JTextField THANA_ID;
    private final JTextField hall_id;
    private final JButton jButton1;
    private final JComboBox jComboBox1;
    private final JComboBox jComboBox2;
    private final JComboBox jComboBox3;
    private final JComboBox jComboBox4;
    private final JComboBox jComboBox5;
    private final JComboBox jComboBox6;
    private final JComboBox jComboBox7;
    private final JComboBox jComboBox8;
    private final JLabel jLabel1;
    private final JTextField sun_id;
    private final JTextField text_FATHER;
    private final JTextField text_MOTHER;
    private final JTextField text_id;
    private final JTextField text_name;
    static Connection con;
    static Statement st;
    DefaultTableModel table_model;
    ResultSet result_set;
    
  InsertallData()
  {
  initComponent();
        jLabel1 = new JLabel();
        ID = new JLabel();
        text_id = new JTextField();
        TERM = new JLabel();
        jComboBox1 = new JComboBox();
        SUB_ID = new JLabel();
        sun_id = new JTextField();
        SAMPLE_SUB_ID = new JLabel();
        jComboBox2 = new JComboBox();
        L_GRADE = new JLabel();
        jComboBox3 = new JComboBox();
        NAME = new JLabel();
        text_name = new JTextField();
        SAMPLE_HALL_ID = new JLabel();
        jComboBox4 = new JComboBox();
        HALL_ID = new JLabel();
        hall_id = new JTextField();
        FATHER_NAME = new JLabel();
        text_FATHER = new JTextField();
        MOTHER_NAME = new JLabel();
        text_MOTHER = new JTextField();
        POINT = new JLabel();
        jComboBox5 = new JComboBox();
        MOBILE_NO = new JLabel();
        TEXT_MOBILE = new JTextField();
        BLOOD_GROUP = new JLabel();
        jComboBox6 = new JComboBox();
        DISTRI_ID = new JLabel();
        DISTRICT_ID = new JTextField();
        THANA = new JLabel();
        THANA_ID = new JTextField();
        SAMPLE_THANA_ID = new JLabel();
        jComboBox7 = new JComboBox();
        SAMPLE_DISTRICT_ID = new JLabel();
        jComboBox8 = new JComboBox();
        jButton1 = new JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Insert Data");

        ID.setText("ID:");

        TERM.setText("TERM:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Term 1", "Term 2", "Term 3", "Term 4", "Term 5", "Term 6", "Term 7", "Term 8" }));

        SUB_ID.setText("SUB_ID:");

        SAMPLE_SUB_ID.setText("SAMPLE SUB_ID:");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1  CSE-141", "2  ME-143", "3  MATH-141", "4  PHY-141", "5  HUM-141", "6  CSE-142", "7  ME-144", "8  PHY-142", "9  CSE-143", "10 EE-181", "11 MATH-143", "12 CHEM-141", "13 HUM-143", "14 CSE-144", "15 EE-182", "16 ME-146", "17 CHEM-142", "18 CSE-221", "19 CSE-241", "20 EE-281", "21 MATH-241", "22 HUM-241", "23 CSE-222", "24 CSE-242", "25 EE-282", "26 CSE-211", "27 CSE-223", "28 CSE-243", "29 EE-283", "30 MATH-243", "31 CSE-224", "32 CSE-244", "33 EE-284", "34 CSE-323", "35 CSE-331", "36 CSE-333", "37 CSE-341", "38 CSE-351", "39 CSE-334", "40 CSE-342", "41 CSE-352", "42 CSE-313", "43 CSE-321", "44 CSE-335", "45 CSE-345", "46 CSE-353", "47 CSE-314", "48 CSE-336", "49 CSE-346", "50 CSE-354", "51 CSE-411", "52 CSE-431", "53 CSE-437", "54 CSE-487", "55 CSE-412", "56 CSE-432", "57 CSE-438", "58 CSE-488", "59 CSE-400", "60 CSE-402", "61 OP-CSE-441", "62 OP-CSE-442", "63 CSE-419", "64 CSE-421", "65 CSE-433", "66 CSE-457", "67 CSE-422", "68 CSE-434", "69 CSE-458", "70 OP-EE-481" }));

        L_GRADE.setText("L_GRADE:");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A+", "A", "A-", "B+", "B", "B-", "C+", "C", "D", "F" }));

        NAME.setText("NAME:");

        SAMPLE_HALL_ID.setText("SAMPLE HALL_ID:");

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1  DR QK HALL", "2  SHAHID MO.SHAH HALL", "3  SHAID TAREK HUDA HALL", "4  BONGOBONDU HALL", "5 SUFIA KAMAL HALL" }));

        HALL_ID.setText("HALL ID:");

        FATHER_NAME.setText("FATHER NAME:");

        MOTHER_NAME.setText("MOTHER NAME:");

        POINT.setText("POINT:");

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "4.00", "3.75", "3.50", "3.25", "3.00", "2.75", "2.50", "2.25", "2.00", "0.00" }));

        MOBILE_NO.setText("MOBILE NO:");

        BLOOD_GROUP.setText("BLOOD GROUP:");

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A+", "A-", "AB+", "AB-", "B+", "B-", "O+", "O-" }));

        DISTRI_ID.setText("DISTRICT ID:");

        THANA.setText("THANA ID:");

        SAMPLE_THANA_ID.setText("SAMPLE THANA ID:");

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "bagerhat district:1", "1 1 Bagerhat Sadar Upazila", "1 2 Chitalmari Upazila", "1 3 Fakirhat Upazila", "1 4 Kachua Upazila", "1 5 Mollahat Upazila", "1 6 Mongla Upazila", "1 7 Morrelganj Upazila", "1 8 Rampal Upazila", "1 9 Sarankhola Upazila", "barguna district:2", "2 1 Amtali Upazila", "2 2 Bamna Upazila", "2 3 Barguna Sadar Upazila", "2 4 Betagi Upazila", "2 5 Patharghata Upazila", "2 6 Taltoli Upazila", "Barisal district:3", "3 1 Agailjhara Upazila", "3 2 Babuganj Upazila", "3 3 Bakerganj Upazila", "3 4 Banaripara Upazila", "3 5 Gaurnadi Upazila", "3 6 Hizla Upazila", "3 7 Barisal Sadar Upazila", "3 8 Mehendiganj Upazila", "3 9 Muladi Upazila", "3 10 Wazirpur Upazila", "Bhola district:4", "4 1 Bhola Sadar Upazila", "4 2 Burhanuddin Upazila", "4 3 Char Fasson Upazila", "4 4 Daulatkhan Upazila", "4 5 Lalmohan Upazila", "4 6 Manpura Upazila", "4 7 Tazumuddin Upazila", "Bandorban district:5", "5 1 Ali Kadam Upazila", "5 2 Bandarban Sadar Upazila", "5 3 Lama Upazila", "5 4 Naikhongchhari Upazila", "5 5 Rowangchhari Upazila", "5 6 Ruma Upazila", "5 7 Thanchi Upazila", "Brahmanbaria district:6", "6 1 Akhaura Upazila", "6 2 Bancharampur Upazila", "6 3 Brahmanbaria Sadar Upazila", "6 4 Kasba Upazila", "6 5 Nabinagar Upazila", "6 6 Nasirnagar Upazila", "6 7 Sarail Upazila", "6 8 Ashuganj Upazila", "6 9 Bijoynagar Upazila", "Bogra district:7", "7 1 Adamdighi Upazila", "7 2 Bogra Sadar Upazila", "7 3 Dhunat Upazila", "7 4 Dhupchanchia Upazila", "7 5 Gabtali Upazila", "7 6 Kahaloo Upazila", "7 7 Nandigram Upazila", "7 8 Sariakandi Upazila", "7 9 Shajahanpur Upazila", "7 10 Sherpur Upazila", "7 11 Shibganj Upazila", "7 12 Sonatola Upazila", "Chandpur district:8", "8 1 Chandpur Sadar Upazila", "8 2Faridganj Upazila", "8 3 Haimchar Upazila", "8 4 Haziganj Upazila", "8 5 Kachua Upazila", "8 6 Matlab Dakshin Upazila", "8 7 Matlab Uttar Upazila", "8 8 Shahrasti Upazila", "Chittagong district:9", "9 1  Anwara Upazila   ", "9 2  Banshkhali Upazila   ", "9 3  Boalkhali Upazila   ", "9 4  Chandanaish Upazila   ", "9 5  Fatikchhari Upazila   ", "9 6  Hathazari Upazila   ", "9 7  Lohagara Upazila   ", "9 8  Mirsharai Upazila   ", "9 9  Patiya Upazila   ", "9 10  Rangunia Upazila   ", "9 11  Raozan Upazila   ", "9 12  Sandwip Upazila   ", "9 13  Satkania Upazila   ", "9 14  Sitakunda Upazila   ", "9 15  Bandor Chittagong Port  Thana   ", "9 16  Chandgaon Thana   ", "9 17  Double Mooring Thana   ", "9 18  Kotwali Thana   ", "9 19  Pahartali Thana   ", "9 20  Panchlaish Thana   ", "Chuadanga district:10", "10 1  Alamdanga Upazila   ", "10 2  Chuadanga Sadar Upazila   ", "10 3  Damurhuda Upazila   ", "10 4  Jibannagar Upazila   ", "Comilla district:11", "11 1  Barura Upazila   ", "11 2  Brahmanpara Upazila   ", "11 3  Burichang Upazila   ", "11 4  Chandina Upazila   ", "11 5  Chauddagram Upazila   ", "11 6  Daudkandi Upazila   ", "11 7  Debidwar Upazila   ", "11 8  Homna Upazila   ", "11 9  Laksam Upazila   ", "11 10  Muradnagar Upazila   ", "11 11  Nangalkot Upazila   ", "11 12  Comilla Sadar Upazila   ", "11 13  Meghna Upazila   ", "11 14  Titas Upazila   ", "11 15  Monohargonj Upazila   ", "11 16  Sadar South Upazila   ", "Cox s Bazar district:12", "12 1  Chakaria Upazila   ", "12 2  Cox s Bazar Sadar Upazila   ", "12 3  Kutubdia Upazila   ", "12 4  Maheshkhali Upazila   ", "12 5  Ramu Upazila   ", "12 6  Teknaf Upazila   ", "12 7  Ukhia Upazila   ", "12 8  Pekua Upazila   ", "Dhaka district:13", "13 1  Dhamrai Upazila   ", "13 2  Dohar Upazila   ", "13 3  Keraniganj Upazila   ", "13 4  Nawabganj Upazila   ", "13 5  Savar Upazila   ", "Dinajpur district:14", "14 1  Birampur Upazila   ", "14 2  Birganj Upazila   ", "14 3  Biral Upazila   ", "14 4  Bochaganj Upazila   ", "14 5  Chirirbandar Upazila   ", "14 6  Phulbari Upazila   ", "14 7  Ghoraghat Upazila   ", "14 8  Hakimpur Upazila   ", "14 9  Kaharole Upazila   ", "14 10  Khansama Upazila   ", "14 11  Dinajpur Sadar Upazila   ", "14 12  Nawabganj Upazila   ", "14 13  Parbatipur Upazila   ", "Faridpur district:15", "15 1  Alfadanga Upazila   ", "15 2  Bhanga Upazila   ", "15 3  Boalmari Upazila   ", "15 4  Charbhadrasan Upazila   ", "15 5  Faridpur Sadar Upazila   ", "15 6  Madhukhali Upazila   ", "15 7  Nagarkanda Upazila   ", "15 8  Sadarpur Upazila   ", "Feni district:16", "16 1  Chhagalnaiya Upazila   ", "16 2  Daganbhuiyan Upazila   ", "16 3  Feni Sadar Upazila   ", "16 4  Parshuram Upazila   ", "16 5  Sonagazi Upazila   ", "16 6  Fulgazi Upazila   ", "Gaibandha district:17", "17 1  Phulchhari Upazila   ", "17 2  Gaibandha Sadar Upazila   ", "17 3  Gobindaganj Upazila   ", "17 4  Palashbari Upazila   ", "17 5  Sadullapur Upazila   ", "17 6  Sughatta Upazila   ", "17 7  Sundarganj Upazila   ", "Gazipur district:18", "18 1  Gazipur Sadar Upazila   ", "18 2  Kaliakair Upazila   ", "18 3  Kaliganj Upazila   ", "18 4  Kapasia Upazila   ", "18 5  Sreepur Upazila   ", "Gopalganj district:19", "19 1  Gopalganj Sadar Upazila   ", "19 2  Kashiani Upazila   ", "19 3  Kotalipara Upazila   ", "19 4  Muksudpur Upazila   ", "19 5  Tungipara Upazila   ", "Habiganj district:20", "20 1  Ajmiriganj Upazila   ", "20 2  Bahubal Upazila   ", "20 3  Baniyachong Upazila   ", "20 4  Chunarughat Upazila   ", "20 5  Habiganj Sadar Upazila   ", "20 6  Lakhai Upazila   ", "20 7  Madhabpur Upazila   ", "20 8  Nabiganj Upazila   ", "Jaipurhat district:21", "21 1  Akkelpur Upazila   ", "21 2  Joypurhat Sadar Upazila   ", "21 3  Kalai Upazila   ", "21 4  Khetlal Upazila   ", "21 5  Panchbibi Upazila   ", "Jamalpur district:22", "22 1  Baksiganj Upazila   ", "22 2  Dewanganj Upazila   ", "22 3  Islampur Upazila   ", "22 4  Jamalpur Sadar Upazila   ", "22 5  Madarganj Upazila   ", "22 6  Melandaha Upazila   ", "22 7  Sarishabari Upazila  ", "Jessore district:23", "23 1  Abhaynagar Upazila   ", "23 2  Bagherpara Upazila   ", "23 3  Chaugachha Upazila   ", "23 4  Jhikargachha Upazila   ", "23 5  Keshabpur Upazila   ", "23 6  Jessore Sadar Upazila   ", "23 7  Manirampur Upazila   ", "23 8  Sharsha Upazila   ", "Jhalokathi district:24", "24 1  Jhalokati Sadar Upazila   ", "24 2  Kathalia Upazila   ", "24 3  Nalchity Upazila   ", "24 4  Rajapur Upazila   ", "Jhenaidah district:25", "25 1  Harinakunda Upazila   ", "25 2  Jhenaidah Sadar Upazila   ", "25 3  Kaliganj Upazila   ", "25 4  Kotchandpur Upazila   ", "25 5  Maheshpur Upazila   ", "25 6  Shailkupa Upazila   ", "Khagrachari district:26", "26 1  Dighinala Upazila   ", "26 2  Khagrachhari Upazila   ", "26 3  Lakshmichhari Upazila   ", "26 4  Mahalchhari Upazila   ", "26 5  Manikchhari Upazila   ", "26 6  Matiranga Upazila   ", "26 7  Panchhari Upazila   ", "26 8  Ramgarh Upazila   ", "Khulna district:27", "27 1  Batiaghata Upazila   ", "27 2  Dacope Upazila   ", "27 3  Dumuria Upazila   ", "27 4  Dighalia Upazila   ", "27 5  Koyra Upazila   ", "27 6  Paikgachha Upazila   ", "27 7  Phultala Upazila   ", "27 8  Rupsha Upazila   ", "27 9  Terokhada Upazila   ", "27 10  Daulatpur Thana   ", "27 11  Khalishpur Thana   ", "27 12  Khan Jahan Ali Thana   ", "27 13  Kotwali Thana   ", "27 14  Sonadanga Thana   ", "27 15  Harintana Thana   ", "Kishoreganj district:28", "28 1  Astagram Upazila   ", "28 2  Bajitpur Upazila   ", "28 3  Bhairab Upazila   ", "28 4  Hossainpur Upazila   ", "28 5  Itna Upazila   ", "28 6  Karimganj Upazila   ", "28 7  Katiadi Upazila   ", "28 8  Kishoreganj Sadar Upazila   ", "28 9  Kuliarchar Upazila   ", "28 10  Mithamain Upazila   ", "28 11  Nikli Upazila   ", "28 12  Pakundia Upazila   ", "28 13  Tarail Upazila   ", "Kurigram district:29", "29 1  Bhurungamari Upazila   ", "29 2  Char Rajibpur Upazila   ", "29 3  Chilmari Upazila   ", "29 4  Phulbari Upazila   ", "29 5  Kurigram Sadar Upazila   ", "29 6  Nageshwari Upazila   ", "29 7  Rajarhat Upazila   ", "29 8  Raomari Upazila   ", "29 9  Ulipur Upazila   ", "Khustia district:30", "30 1  Bheramara Upazila   ", "30 2  Daulatpur Upazila   ", "30 3  Khoksa Upazila   ", "30 4  Kumarkhali Upazila   ", "30 5  Kushtia Sadar Upazila   ", "30 6  Mirpur Upazila   ", "30 7  Shekhpara Upazila   ", "Lakshmipur district:31", "31 1  Lakshmipur Sadar Upazila   ", "31 2  Raipur Upazila   ", "31 3  Ramganj Upazila   ", "31 4  Ramgati Upazila   ", "31 5  Komolnagar Upazila   ", "Lalmonirhat district:32", "32 1  Aditmari Upazila   ", "32 2  CHatibandha Upazila   ", "32 3  Kaliganj Upazila   ", "32 4  Lalmonirhat Sadar Upazila   ", "32 5  Patgram Upazila   ", "Madaripur district:33", "33 1  Rajoir Upazila   ", "33 2  Madaripur Sadar Upazila   ", "33 3  Kalkini Upazila   ", "33 4  Shibchar Upazila   ", "Magura district:34", "34 1  Magura Sadar Upazila   ", "34 2  Mohammadpur Upazila   ", "34 3  Shalikha Upazila   ", "34 4  Sreepur Upazila   ", "Manikgonj district:35", "35 1  Daulatpur Upazila   ", "35 2  Ghior Upazila   ", "35 3  Harirampur Upazila   ", "35 4  Manikgonj Sadar Upazila   ", "35 5  Saturia Upazila   ", "35 6  Shivalaya Upazila   ", "35 7  Singair Upazila   ", "Meherpur district:36", "36 1  Gangni Upazila   ", "36 2  Meherpur Sadar Upazila   ", "36 3  Mujibnagar Upazila   ", "Moulvibazar district:37", "37 1  Barlekha Upazila   ", "37 2  Kamalganj Upazila   ", "37 3  Kulaura Upazila   ", "37 4  Moulvibazar Sadar Upazila   ", "37 5  Rajnagar Upazila   ", "37 6  Sreemangal Upazila   ", "37 7  Juri Upazila   ", "Munshigonj district:38", "38 1  Gazaria Upazila   ", "38 2  Lohajang Upazila   ", "38 3  Munshiganj Sadar Upazila   ", "38 4  Sirajdikhan Upazila   ", "38 5  Sreenagar Upazila   ", "38 6  Tongibari Upazila   ", "Mymensingh district:39", "39 1  Bhaluka Upazila   ", "39 2  Dhobaura Upazila   ", "39 3  Fulbaria Upazila   ", "39 4  Gaffargaon Upazila   ", "39 5  Gauripur Upazila   ", "39 6  Haluaghat Upazila   ", "39 7  Ishwarganj Upazila   ", "39 8  Mymensingh Sadar Upazila   ", "39 9  Muktagachha Upazila   ", "39 10  Nandail Upazila   ", "39 11  Phulpur Upazila   ", "39 12  Trishal Upazila   ", "39 13  Tara Khanda Upazila   ", "Naogaon district:40", "40 1  Atrai Upazila   ", "40 2  Badalgachhi Upazila   ", "40 3  Manda Upazila   ", "40 4  Dhamoirhat Upazila   ", "40 5  Mohadevpur Upazila   ", "40 6  Naogaon Sadar Upazila   ", "40 7  Niamatpur Upazila   ", "40 8  Patnitala Upazila   ", "40 9  Porsha Upazila   ", "40 10  Raninagar Upazila   ", "40 11  Sapahar Upazila   ", "Narayanganj district:41", "41 1  Araihazar Upazila   ", "41 2  Bandar Upazila   ", "41 3  Narayanganj Sadar Upazila   ", "41 4  Rupganj Upazila   ", "41 5  Sonargaon Upazila   ", "41 6  Fatullah Upazila   ", "41 7  Siddhirganj Upazila   ", "Narsindi district:42", "42 1  Narsingdi Sadar Upazila   ", "42 2  Belabo Upazila   ", "42 3  Monohardi Upazila   ", "42 4  Palash Upazila   ", "42 5  Raipura Upazila   ", "42 6  Shibpur Upazila   ", "Natore district:43", "43 1  Bagatipara Upazila   ", "43 2  Baraigram Upazila   ", "43 3  Gurudaspur Upazila   ", "43 4  Lalpur Upazila   ", "43 5  Natore Sadar Upazila   ", "43 6  Singra Upazila   ", "43 7  Naldanga Upazila   ", "Nawabgonj district:44", "44 1  Bholahat Upazila   ", "44 2  Gomastapur Upazila   ", "44 3  Nachole Upazila   ", "44 4  Nawabganj Sadar Upazila   ", "44 5  Shibganj Upazila   ", "Netrokona district:45", "45 1  Atpara Upazila   ", "45 2  Barhatta Upazila   ", "45 3  Durgapur Upazila   ", "45 4  Khaliajuri Upazila   ", "45 5  Kalmakanda Upazila   ", "45 6  Kendua Upazila   ", "45 7  Madan Upazila   ", "45 8  Mohanganj Upazila   ", "45 9  Netrokona Sadar Upazila   ", "45 10  Purbadhala Upazila   ", "Nilphamari district:46", "46 1  Dimla Upazila   ", "46 2  Domar Upazila   ", "46 3  Jaldhaka Upazila   ", "46 4  Kishoreganj Upazila   ", "46 5  Nilphamari Sadar Upazila   ", "46 6  Saidpur Upazila   ", "Noakhali district:47", "47 1  Begumganj Upazila   ", "47 2  Noakhali Sadar Upazila   ", "47 3  Chatkhil Upazila   ", "47 4  Companiganj Upazila   ", "47 5  Hatiya Upazila   ", "47 6  Senbagh Upazila   ", "47 7  Sonaimuri Upazila   ", "47 8  Subarnachar Upazila   ", "47 9  Kabirhat Upazila   ", "Norial district:48", "48 1  Kalia Upazila   ", "48 2  Lohagara Upazila   ", "48 3  Narail Sadar Upazila   ", "48 4  Naragati Thana   ", "Pabna district:49", "49 1  Ataikula Upazila   ", "49 2  Atgharia Upazila   ", "49 3  Bera Upazila   ", "49 4  Bhangura Upazila   ", "49 5  Chatmohar Upazila   ", "49 6  Faridpur Upazila   ", "49 7  Ishwardi Upazila   ", "49 8  Pabna Sadar Upazila   ", "49 9  Santhia Upazila   ", "49 10  Sujanagar Upazila   ", "Panchagar district:50", "50 1  Atwari Upazila   ", "50 2  Boda Upazila   ", "50 3  Debiganj Upazila   ", "50 4  Panchagarh Sadar Upazila   ", "50 5  Tetulia Upazila   ", "Potuakhali district:51", "51 1  Bauphal Upazila   ", "51 2  Dashmina Upazila   ", "51 3  Galachipa Upazila   ", "51 4  Kalapara Upazila   ", "51 5  Mirzaganj Upazila   ", "51 6  Patuakhali Sadar Upazila   ", "51 7  Rangabali Upazila   ", "51 8  Dumki Upazila   ", "Pirojpur district:52", "52 1  Bhandaria Upazila   ", "52 2  Kawkhali Upazila   ", "52 3  Mathbaria Upazila   ", "52 4  Nazirpur Upazila   ", "52 5  Pirojpur Sadar Upazila   ", "52 6  NesarabadSwarupkati  Upazila   ", "52 7  Zianagor Upazila   ", "Rajbari district:53", "53 1  Baliakandi Upazila   ", "53 2  Goalandaghat Upazila   ", "53 3  Pangsha Upazila   ", "53 4  Rajbari Sadar Upazila   ", "53 5  Kalukhali Upazila   ", "Rajshahi district:54", "54 1  Bagha Upazila   ", "54 2  Bagmara Upazila   ", "54 3  Charghat Upazila   ", "54 4  Durgapur Upazila   ", "54 5  Godagari Upazila   ", "54 6  Mohanpur Upazila   ", "54 7  Paba Upazila   ", "54 8  Puthia Upazila   ", "54 9  Tanore Upazila   ", "54 10  Boalia Thana   ", "54 11  Matihar Thana   ", "54 12  Rajpara Thana   ", "54 13  Shah Mokdum Thana   ", "Rangamati district:55", "55 1  Bagaichhari Upazila   ", "55 2  Barkal Upazila   ", "55 3  Kawkhali Betbunia  Upazila   ", "55 4  Belaichhari Upazila   ", "55 5  Kaptai Upazila   ", "55 6  Juraichhari Upazila   ", "55 7  Langadu Upazila   ", "55 8  Naniyachar Upazila   ", "55 9  Rajasthali Upazila   ", "55 10  Rangamati Sadar Upazila   ", "Rangpur district:56", "56 1  Badarganj Upazila   ", "56 2  Gangachhara Upazila   ", "56 3  Kaunia Upazila   ", "56 4  Rangpur Sadar Upazila   ", "56 5  Mithapukur Upazila   ", "56 6  Pirgachha Upazila   ", "56 7  Pirganj Upazila   ", "56 8  Taraganj Upazila   ", "Shatkhira district:57", "57 1  Assasuni Upazila   ", "57 2  Debhata Upazila   ", "57 3  Kalaroa Upazila   ", "57 4  Kaliganj Upazila   ", "57 5  Satkhira Sadar Upazila   ", "57 6  Shyamnagar Upazila   ", "57 7  Tala Upazila   ", "Shariyatpur district:58", "58 1  Bhedarganj Upazila   ", "58 2  Damudya Upazila   ", "58 3  Gosairhat Upazila   ", "58 4  Naria Upazila   ", "58 5  Shariatpur Sadar Upazila   ", "58 6  Zanjira Upazila   ", "58 7  Shakhipur Upazila   ", "Sherpur district:59", "59 1  Jhenaigati Upazila   ", "59 2  Nakla Upazila   ", "59 3  Nalitabari Upazila   ", "59 4  Sherpur Sadar Upazila   ", "59 5  Sreebardi Upazila   ", "Shirajgonj district:60", "60 1  Belkuchi Upazila   ", "60 2  Chauhali Upazila   ", "60 3  Kamarkhanda Upazila   ", "60 4  Kazipur Upazila   ", "60 5  Raiganj Upazila   ", "60 6  Shahjadpur Upazila   ", "60 7  Sirajganj Sadar Upazila   ", "60 8  Tarash Upazila   ", "60 9  Ullahpara Upazila   ", "Sunamgonj district:61", "61 1  Bishwamvarpur Upazila   ", "61 2  Chhatak Upazila   ", "61 3  Derai Upazila   ", "61 4  Dharampasha Upazila   ", "61 5  Dowarabazar Upazila   ", "61 6  Jagannathpur Upazila   ", "61 7  Jamalganj Upazila   ", "61 8  Sullah Upazila   ", "61 9  Sunamganj Upazila   ", "61 10  Tahirpur Upazila   ", "61 11  South Sunamganj Upazila   ", "Shylhet district:62", "62 1  Balaganj Upazila   ", "62 2  Beanibazar Upazila   ", "62 3  Bishwanath Upazila   ", "62 4  Companigonj Upazila   ", "62 5  Fenchuganj Upazila   ", "62 6  Golapganj Upazila   ", "62 7  Gowainghat Upazila   ", "62 8  Jaintiapur Upazila   ", "62 9  Kanaighat Upazila   ", "62 10  Sylhet Sadar Upazila   ", "62 11  Zakiganj Upazila   ", "62 12  South Shurma Upazila   ", "Tangail district:63", "63 1  Gopalpur Upazila   ", "63 2  Basail Upazila   ", "63 3  Bhuapur Upazila   ", "63 4  Delduar Upazila   ", "63 5  Ghatail Upazila   ", "63 6  Kalihati Upazila   ", "63 7  Madhupur Upazila   ", "63 8  Mirzapur Upazila   ", "63 9  Nagarpur Sadar Upazila   ", "63 10  Sakhipur Upazila   ", "63 11  Dhanbari Upazila   ", "63 12  Tangail Sadar Upazila   ", "Thakurgaon district:64", "64 1  Baliadangi Upazila   ", "64 2  Haripur Upazila   ", "64 3  Pirganj Upazila   ", "64 4  Ranisankail Upazila   ", "64 5  Thakurgaon Sadar Upazila   " }));

        SAMPLE_DISTRICT_ID.setText("SAMPLE DISTRICT ID:");

        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1   Bagerhat", "2   Barguna", "3   Barisal", "4   Bhola", "5   Bandorban", "6   Brahmanbaria", "7   Bogra", "8   Chandpur", "9   Chittagong", "10 Chuadanga", "11 Comilla", "12 Cox's Bazar", "13 Dhaka", "14 Dinajpur", "15 Faridpur", "16 Feni", "17 Gaibandha", "18 Gazipur", "19 Gopalganj", "20 Habiganj", "21 Jaipurhat", "22 Jamalpur", "23 Jessore", "24 Jhalokathi", "25 Jhenaidah", "26 Khagrachari", "27 Khulna", "28 Kishoreganj", "29 Kurigram", "30 Khustia", "31 Lakshmipur", "32 Lalmonirhat", "33 Madaripur", "34 Magura", "35 Manikgonj", "36 Meherpur", "37 Moulvibazar", "38 Munshigonj", "39 Mymensingh", "40 Naogaon", "41 Narayanganj", "42 Narsindi", "43 Natore", "44 Nawabgonj", "45 Netrokona", "46 Nilphamari", "47 Noakhali", "48 Norial", "49 Pabna", "50 Panchagar", "51 Potuakhali", "52 Pirojpur", "53 Rajbari", "54 Rajshahi", "55 Rangamati", "56 Rangpur", "57 Shatkhira", "58 Shariyatpur", "59 Sherpur", "60 Shirajgonj", "61 Sunamgonj", "62 Shylhet", "63 Tangail", "64 Thakurgaon" }));

        jButton1.setText("INSERT");
        jButton1.addActionListener(this);
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(221, 221, 221)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(THANA, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(79, 79, 79)
                                        .addComponent(THANA_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(SAMPLE_THANA_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(79, 79, 79)
                                        .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(DISTRI_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(79, 79, 79)
                                        .addComponent(DISTRICT_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(SAMPLE_DISTRICT_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(79, 79, 79)
                                        .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(BLOOD_GROUP, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(79, 79, 79)
                                        .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(MOBILE_NO, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(79, 79, 79)
                                        .addComponent(TEXT_MOBILE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(MOTHER_NAME, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(79, 79, 79)
                                        .addComponent(text_MOTHER, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(FATHER_NAME, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(79, 79, 79)
                                        .addComponent(text_FATHER, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(HALL_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(79, 79, 79)
                                        .addComponent(hall_id, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(SAMPLE_HALL_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(79, 79, 79)
                                        .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(L_GRADE, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(79, 79, 79)
                                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(SUB_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(79, 79, 79)
                                        .addComponent(sun_id, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(SAMPLE_SUB_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(79, 79, 79)
                                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(TERM, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(79, 79, 79)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(NAME, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(79, 79, 79)
                                        .addComponent(text_name, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(79, 79, 79)
                                        .addComponent(text_id, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(POINT, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(3, 3, 3)))
                .addGap(48, 48, 48))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text_id, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text_name, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NAME, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TERM, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SAMPLE_SUB_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sun_id, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SUB_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L_GRADE, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(POINT, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SAMPLE_HALL_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hall_id, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HALL_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text_FATHER, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FATHER_NAME, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text_MOTHER, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MOTHER_NAME, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TEXT_MOBILE, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MOBILE_NO, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BLOOD_GROUP, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SAMPLE_DISTRICT_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DISTRICT_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DISTRI_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SAMPLE_THANA_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(THANA_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(THANA, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE,34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }                
    public void actionPerformed(ActionEvent e)
    {
        String s = e.getActionCommand();
        String ID ="";
        if(s.equals("INSERT")) 
        {
                String id_number = text_id.getText();
                String name = text_name.getText();
                String term = jComboBox1.getSelectedItem().toString();
                String sub_id = sun_id.getText();
                String l_grade = jComboBox3.getSelectedItem().toString();
                String point = jComboBox5.getSelectedItem().toString();
                String hall = hall_id.getText();
                String father=text_FATHER.getText();
                String mother=text_MOTHER.getText();
                String mobile =TEXT_MOBILE.getText();
                String blood_group=jComboBox6.getSelectedItem().toString();
                String dis_id =DISTRICT_ID.getText();
                String thana_id =THANA_ID.getText();
                 boolean a=isNumeric(id_number);
                 boolean h=isNumeric(name);
                 boolean b=isNumeric(sub_id);
                 boolean c=isNumeric(hall);
                 boolean i=isNumeric(father);
                 boolean j=isNumeric(mother);
                 boolean d=isNumeric(mobile);
                 boolean f=isNumeric(dis_id);
                 boolean g=isNumeric(thana_id);
                 if(((id_number.equals("")||name.equals("") || sub_id.equals("")) || father.equals(""))||mother.equals("")||mobile.equals("")||dis_id.equals("")||thana_id.equals(""))
                 {
                     JOptionPane.showMessageDialog(this,"Please Insert id,name,sub_id,hall_id,father,mother and others","Error",JOptionPane.ERROR_MESSAGE);
                 }
                 else if(a==false)
                 {
                     JOptionPane.showMessageDialog(this,"Please check id_number and confirm it is integer","Error",JOptionPane.ERROR_MESSAGE); 
                 }
                 else if(h==true)
                 {
                     JOptionPane.showMessageDialog(this,"Please check name  and confirm it is String","Error",JOptionPane.ERROR_MESSAGE); 
                 }
                 else if(b==false)
                 {
                     JOptionPane.showMessageDialog(this,"Please check sub_id  and confirm it is integer","Error",JOptionPane.ERROR_MESSAGE); 
                 }
                 else if(c==false)
                 {
                     JOptionPane.showMessageDialog(this,"Please check sub_id  and confirm it is integer","Error",JOptionPane.ERROR_MESSAGE); 
                 }
                 else if(i==true)
                 {
                     JOptionPane.showMessageDialog(this,"Please check Father's name and confirm it is String","Error",JOptionPane.ERROR_MESSAGE); 
                 }
                 else if(j==true)
                 {
                     JOptionPane.showMessageDialog(this,"Please check Mother's name and confirm it is String","Error",JOptionPane.ERROR_MESSAGE); 
                 }
                 else if(d==false)
                 {
                     JOptionPane.showMessageDialog(this,"Please mobile_no and confirm it is integer","Error",JOptionPane.ERROR_MESSAGE); 
                 }
                 else if(f==false)
                 {
                     JOptionPane.showMessageDialog(this,"Please check District_id  and confirm it is integer","Error",JOptionPane.ERROR_MESSAGE); 
                 }
                 else if(g==false)
                 {
                     JOptionPane.showMessageDialog(this,"Please check thana_id  and confirm it is integer","Error",JOptionPane.ERROR_MESSAGE); 
                 }
                 else
                 {
                  try {
                 st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
                 } catch (SQLException ex) {
                Logger.getLogger(InsertallData.class.getName()).log(Level.SEVERE, null, ex);
                 }

                try {
                String query = ("SELECT ID from PERSONAL_INFORMATION where id= \'" + id_number + "\'");
     
                result_set = st.executeQuery(query);
           
            } catch (SQLException ex) {
                Logger.getLogger(InsertallData.class.getName()).log(Level.SEVERE, null, ex);
            } 
            try {
                while (result_set.next()) {
                    ID = result_set.getString("ID");
                }
            } catch (SQLException ex) {
                Logger.getLogger(InsertallData.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            if (id_number.equals(ID)) 
            {
                  JOptionPane.showMessageDialog(this,"This ID STUDENT IS OLD SO U CAN TRY IN INSERTOLDSTUDENTDATA CLASS","Error",JOptionPane.ERROR_MESSAGE); 
            }
            else
            {
                     String r = "insert into PERSONAL_INFORMATION values(\'" + id_number + "\',\'" + father + "\',\'" + mother + "\',\'" + mobile + "\',\'" + blood_group+ "\'," + dis_id+ "," + thana_id+ ",\'" + name + "\'," + hall + ")";
                     System.out.println(r);
                    
                      
                     String p = "insert into ACADEMIC_DEPT_INFO values(\'" + id_number + "\',\'" + term + "\'," + sub_id + ",\'" + l_grade + "\'," + point+ ")";
                     System.out.println(p);
                     
                     
                      try {
                          st.executeQuery(r);
                      } catch (SQLException ex) {
                          Logger.getLogger(InsertallData.class.getName()).log(Level.SEVERE, null, ex);
                      }
                     
                      try { 
                          st.executeQuery(p);
                      } catch (SQLException ex) {
                          Logger.getLogger(InsertallData.class.getName()).log(Level.SEVERE, null, ex);
                      }
                     JOptionPane.showMessageDialog(this,"Insert Successful","Successfull",JOptionPane.OK_OPTION);
                 }
            } 
            } 
            }
        public final void initComponent() 
    {
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        try {
            con = MakeConnection.getDatabaseConnection();
        } catch (Exception e) 
        {
            System.out.println(e.toString());
        } finally {
            System.out.println("Database Connected");
        }
        try 
        {
            st = con.createStatement();
        } catch (SQLException ex)
        {
            Logger.getLogger(InsertallData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 public static boolean isNumeric(String str)  
{  
  try  
  {  
    double d = Double.parseDouble(str);  
  }  
  catch(NumberFormatException nfe)  
  {  
    return false;  
  }  
  return true;  
}
static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InsertallData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsertallData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsertallData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsertallData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InsertallData().setVisible(true);
            }
        });
}               
}

      
    
    
