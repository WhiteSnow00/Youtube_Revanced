import java.util.List;
import java.util.ArrayList;
import android.util.SparseArray;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abqy implements zla
{
    private final SparseArray a;
    
    public abqy() {
        this.a = new SparseArray();
    }
    
    public final abrj b(final int n) {
        abrj abrj;
        if ((abrj = (abrj)this.a.get(n)) == null) {
            abrj = new abrj(n);
            this.a.put(n, (Object)abrj);
        }
        return abrj;
    }
    
    public final void c(final int n, final String s, final int n2, final int n3) {
        this.b(n).d(s, n2, n3);
    }
}
