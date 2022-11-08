import io.grpc.Status;
import java.util.ArrayList;
import com.youtube.android.libraries.elements.StatusOr;
import com.google.android.libraries.elements.interfaces.DataSourceDelegate;

// 
// Decompiled by Procyon v0.6.0
// 

public final class orp extends DataSourceDelegate implements asic
{
    public final omk a;
    public final int b;
    public final boolean c;
    public final boolean d;
    public final mck e;
    private final DataSourceDelegate f;
    private boolean g;
    
    public orp() {
    }
    
    public orp(final mck mck, final orz orz, final DataSourceDelegate f, final omk a, final aglt aglt, final aglt aglt2, final aglt aglt3, final byte[] array, final byte[] array2, final byte[] array3) {
        this.f = f;
        this.a = a;
        int int1;
        if (aglt == null) {
            int1 = -1;
        }
        else {
            final int b = aglt.b(4);
            if (b != 0) {
                int1 = aglt.b.getInt(b + aglt.a);
            }
            else {
                int1 = 0;
            }
        }
        this.b = int1;
        final boolean b2 = true;
        boolean c = false;
        Label_0118: {
            if (aglt2 != null) {
                final int b3 = aglt2.b(4);
                if (b3 != 0 && aglt2.b.get(b3 + aglt2.a) != 0) {
                    c = true;
                    break Label_0118;
                }
            }
            c = false;
        }
        this.c = c;
        mck j = null;
        final aglt aglt4 = null;
        if (aglt2 != null) {
            final aglt aglt5 = new aglt();
            final int b4 = aglt2.b(6);
            aglt aglt6 = aglt4;
            if (b4 != 0) {
                aglt5.f(aglt2.a(b4 + aglt2.a), aglt2.b);
                aglt6 = aglt5;
            }
            j = mck.J(aglt6, orz);
        }
        this.e = j;
        boolean d = false;
        Label_0245: {
            if (aglt3 != null) {
                final int b5 = aglt3.b(4);
                if (b5 != 0 && aglt3.b.get(b5 + aglt3.a) != 0) {
                    d = b2;
                    break Label_0245;
                }
            }
            d = false;
        }
        this.d = d;
        this.g = false;
    }
    
    public final void dispose() {
        this.g = true;
        this.a.a.clear();
        this.f.dispose();
    }
    
    public final StatusOr elementAtIndex(final int n) {
        return this.f.elementAtIndex(n);
    }
    
    public final ArrayList identifiers() {
        return this.f.identifiers();
    }
    
    public final Status loadMore() {
        return this.f.loadMore();
    }
    
    public final Status moveItem(final int n, final int n2) {
        return this.f.moveItem(n, n2);
    }
    
    public final Status reload() {
        return this.f.reload();
    }
    
    public final Status removeItem(final int n) {
        return this.f.removeItem(n);
    }
    
    public final int size() {
        return this.f.size();
    }
    
    public final boolean tx() {
        return this.g;
    }
}
