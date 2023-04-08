import java.util.Scanner;
public class xeDemo {
    static Xe dsXe[];
    static int n;
    static void nhap(){
        System.out.print("nhập số lượng xe");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        s.nextLine();
        //xin cấp phát mảng
        dsXe=new Xe[n];
        for (int i=0;i<n;i++){
            dsXe[i]=new Xe();
            dsXe[i].nhap();
         }
        }
    static void inDSXe(){
        //in danh sach
        Xe.xuatTieuDe();
        for (Xe x:dsXe)
            x.xuatDL();
    }

}
