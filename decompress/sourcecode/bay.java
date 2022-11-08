import java.util.Map;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bay implements bbk
{
    private final bbk a;
    private final byte[] b;
    private baz c;
    
    public bay(final byte[] b, final bbk a) {
        this.a = a;
        this.b = b;
    }
    
    public final int a(final byte[] array, final int n, int a) {
        if (a == 0) {
            return 0;
        }
        final int a2 = this.a.a(array, n, a);
        if (a2 == -1) {
            return -1;
        }
        final baz c = this.c;
        a = baw.a;
        c.a(array, n, a2, array, n);
        return a2;
    }
    
    public final long b(final bbo bbo) {
        final long b = this.a.b(bbo);
        this.c = new baz(2, this.b, bbo.i, bbo.b + bbo.g);
        return b;
    }
    
    public final Uri c() {
        return this.a.c();
    }
    
    public final Map d() {
        return this.a.d();
    }
    
    public final void e(final bcn bcn) {
        dk.d((Object)bcn);
        this.a.e(bcn);
    }
    
    public final void f() {
        this.c = null;
        this.a.f();
    }
}
