import java.util.Map;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bcm implements bbk
{
    private final bbk a;
    private final bbi b;
    private boolean c;
    private long d;
    
    public bcm(final bbk a, final bbi b) {
        dk.d((Object)a);
        this.a = a;
        this.b = b;
    }
    
    public final int a(final byte[] array, final int n, int a) {
        if (this.d == 0L) {
            return -1;
        }
        a = this.a.a(array, n, a);
        if (a > 0) {
            this.b.c(array, n, a);
            final long d = this.d;
            if (d != -1L) {
                this.d = d - a;
            }
        }
        return a;
    }
    
    public final long b(final bbo bbo) {
        final long b = this.a.b(bbo);
        this.d = b;
        if (b == 0L) {
            return 0L;
        }
        bbo c = bbo;
        if (bbo.h == -1L) {
            c = bbo;
            if (b != -1L) {
                c = bbo.c(0L, b);
            }
        }
        this.c = true;
        this.b.b(c);
        return this.d;
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
        try {
            this.a.f();
            if (this.c) {
                this.c = false;
                this.b.a();
            }
        }
        finally {
            if (this.c) {
                this.c = false;
                this.b.a();
            }
        }
    }
}
