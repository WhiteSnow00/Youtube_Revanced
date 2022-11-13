import java.io.Closeable;
import java.io.InputStream;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class brr implements brl
{
    public final long a;
    public final bbp b;
    public final int c;
    public volatile Object d;
    private final bcm e;
    private final brq f;
    
    public brr(final bbl bbl, final Uri a, final int c, final brq f) {
        final bbo bbo = new bbo();
        bbo.a = a;
        bbo.i = 1;
        final bbp a2 = bbo.a();
        this.e = new bcm(bbl);
        this.b = a2;
        this.c = c;
        this.f = f;
        this.a = bno.a();
    }
    
    public final void a() {
    }
    
    public final void b() {
        this.e.a = 0L;
        final bbn bbn = new bbn((bbl)this.e, this.b);
        try {
            bbn.a();
            final Uri c = this.e.c();
            dk.d((Object)c);
            this.d = this.f.a(c, (InputStream)bbn);
        }
        finally {
            bax.X((Closeable)bbn);
        }
    }
    
    public final long c() {
        return this.e.a;
    }
    
    public final Uri d() {
        return this.e.b;
    }
}
