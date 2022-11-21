import java.io.Closeable;
import java.io.InputStream;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bru implements bro
{
    public final long a;
    public final bbr b;
    public final int c;
    public volatile Object d;
    private final bco e;
    private final brt f;
    
    public bru(final bbn bbn, final Uri a, final int c, final brt f) {
        final bbq bbq = new bbq();
        bbq.a = a;
        bbq.i = 1;
        final bbr a2 = bbq.a();
        this.e = new bco(bbn);
        this.b = a2;
        this.c = c;
        this.f = f;
        this.a = bnr.a();
    }
    
    @Override
    public final void a() {
    }
    
    @Override
    public final void b() {
        this.e.a = 0L;
        final bbp bbp = new bbp((bbn)this.e, this.b);
        try {
            bbp.a();
            final Uri c = this.e.c();
            bad.b(c);
            this.d = this.f.a(c, bbp);
        }
        finally {
            baz.X(bbp);
        }
    }
    
    public final long c() {
        return this.e.a;
    }
    
    public final Uri d() {
        return this.e.b;
    }
}
