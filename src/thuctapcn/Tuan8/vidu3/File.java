package thuctapcn.Tuan8.vidu3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedHashSet;

public class File {
    public static void GhiFile(String Path, LinkedHashSet<SinhVien> ls) throws Exception{
        FileOutputStream fo = new FileOutputStream(Path);
        ObjectOutputStream out = new ObjectOutputStream(fo);
        out.writeObject(ls);
        fo.close();
        out.close();
    }
    
    public static LinkedHashSet<SinhVien> DocFile(String Path) throws Exception{
        FileInputStream fi = new FileInputStream(Path);
        ObjectInputStream in = new ObjectInputStream(fi);
        LinkedHashSet<SinhVien> ls = (LinkedHashSet<SinhVien>)in.readObject();
        in.close();
        fi.close();
        return ls;
    }
}
