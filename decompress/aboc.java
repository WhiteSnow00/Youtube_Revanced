import java.util.Collections;
import java.util.Map;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aboc implements bbl
{
    public final agoe a;
    private final bch b;
    
    public aboc(final bbl bbl, final agoe a, final byte[] array, final byte[] array2, final byte[] array3) {
        this.b = new bch(bbl, a, 0, (byte[])null, (byte[])null, (byte[])null);
        this.a = a;
    }
    
    private final void g() {
        new aboa(this).start();
    }
    
    public final int a(final byte[] array, final int n, final int n2) {
        return this.b.a(array, n, n2);
    }
    
    public final long b(final bbp bbp) {
        this.a.B(0);
        return this.b.b(bbp);
    }
    
    public final Uri c() {
        return this.b.c();
    }
    
    public final Map d() {
        return Collections.emptyMap();
    }
    
    public final void e(final bco bco) {
        this.b.e(bco);
    }
    
    public final void f() {
        try {
            this.b.f();
        }
        finally {
            this.g();
        }
    }
}
