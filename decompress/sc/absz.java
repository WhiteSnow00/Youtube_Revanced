import java.util.List;
import java.util.ArrayList;
import android.util.SparseArray;

// 
// Decompiled by Procyon v0.6.0
// 

public final class absz implements zmx
{
    private final SparseArray a;
    
    public absz() {
        this.a = new SparseArray();
    }
    
    public final /* bridge */ Object a() {
        final ArrayList list = new ArrayList();
        for (int i = 0; i < this.a.size(); ++i) {
            list.add(((abtk)this.a.valueAt(i)).b());
        }
        return new abta(list);
    }
    
    public final abtk b(final int n) {
        abtk abtk;
        if ((abtk = (abtk)this.a.get(n)) == null) {
            abtk = new abtk(n);
            this.a.put(n, (Object)abtk);
        }
        return abtk;
    }
    
    public final void c(final int n, final String s, final int n2, final int n3) {
        this.b(n).d(s, n2, n3);
    }
}
