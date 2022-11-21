import java.util.List;
import java.util.ArrayList;
import android.util.SparseArray;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abuj implements zos
{
    private final SparseArray a;
    
    public abuj() {
        this.a = new SparseArray();
    }
    
    public final /* bridge */ Object a() {
        final ArrayList list = new ArrayList();
        for (int i = 0; i < this.a.size(); ++i) {
            list.add(((abuu)this.a.valueAt(i)).b());
        }
        return new abuk(list);
    }
    
    public final abuu b(final int n) {
        abuu abuu;
        if ((abuu = (abuu)this.a.get(n)) == null) {
            abuu = new abuu(n);
            this.a.put(n, (Object)abuu);
        }
        return abuu;
    }
    
    public final void c(final int n, final String s, final int n2, final int n3) {
        this.b(n).d(s, n2, n3);
    }
}
