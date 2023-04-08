// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int chon=0;
        Scanner s=new Scanner(System.in);
        do {
            System.out.println("1.Nhap thong tin
                    xe");
                    System.out.println("2.Xuất bảng kê thuế trước bạn");
                            System.out.println("3.Thoát" );
            System.out.println("Lựa chọn");
            chon=s.nextInt();
            switch (chon){
                case 1:
                    nhap();
                    break;
                case 2:
                    inDSXe();
                    break;
                case 3:
                    System.exit(0);
            }
        } while (chon !=3);
    }
}
}