public class xe {
    private String tenChuXe;
    private String loaiXe;
    private int dungTich;
    private double triGia;
    public int getDungTich() {
        return dungTich;
    }
    public void setDungTich(int dungTich) {
        this.dungTich = dungTich;
    }
    public void nhap(){
        Scanner s=new Scanner(System.in);
        System.out.print("nhap ten chur xe, loai xe:");
        tenChuXe=s.nextLine();
        loaiXe=s.nextLine();
        System.out.println("nhap dung tich, gia=");
                dungTich=s.nextInt();
        triGia=s.nextDouble();
    }
    public double tinhThue(){
        double thue=0;
        if (dungTich<100)thue=triGia/100;
        else if (dungTich<200)
            thue=triGia*3/100;
        else thue=triGia*5/100;
        return thue;
    }

    public static void xuatTieuDe(){

        System.out.printf("%-15s %-15s %15s %15s %15s %n", "Ten chu xe","loai Xe","Dung tic","tri gia","Thue phai nop");
    }
    public void xuatDL(){
        System.out.printf("%-15s %-15s %15d %15.1f %15.1f %n",tenChuXe, loaiXe,dungTich, triGia, tinhThue());
    }
}

