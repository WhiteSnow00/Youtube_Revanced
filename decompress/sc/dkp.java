import java.io.InputStream;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dkp implements ddr
{
    private final int a;
    private final Object b;
    private final Object c;
    
    public dkp(final dkb b, final dge c, final int a) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public dkp(final dlf b, final dgg c, final int a) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final dfy a(Object b, final int n, final int n2, final ddp ddp) {
        if (this.a != 0) {
            final dfy c = ((dlf)this.b).c((Uri)b, ddp);
            if (c == null) {
                return null;
            }
            return dkd.a((dgg)this.c, ((dlc)c).f(), n, n2);
        }
        else {
            final InputStream inputStream = (InputStream)b;
            boolean b2;
            if (inputStream instanceof dkm) {
                b = inputStream;
                b2 = false;
            }
            else {
                b = new dkm(inputStream, (dge)this.c);
                b2 = true;
            }
            Object a = dox.a;
            synchronized (a) {
                final dox dox = dox.a.poll();
                monitorexit(a);
                a = dox;
                if (dox == null) {
                    a = new dox();
                }
                ((dox)a).b = (InputStream)b;
                final dpe dpe = new dpe((InputStream)a);
                final dko dko = new dko((dkm)b, (dox)a);
                try {
                    final Object b3 = this.b;
                    final dfy a2 = ((dkb)b3).a((dkj)new dki((InputStream)dpe, ((dkb)b3).g, ((dkb)b3).f, 0), n, n2, ddp, (dka)dko);
                    ((dox)a).a();
                    if (b2) {
                        ((dkm)b).b();
                    }
                    return a2;
                }
                finally {
                    ((dox)a).a();
                    if (b2) {
                        ((dkm)b).b();
                    }
                }
            }
        }
    }
    
    @Override
    public final boolean b(final Object o, final ddp ddp) {
        if (this.a != 0) {
            return "android.resource".equals(((Uri)o).getScheme());
        }
        final InputStream inputStream = (InputStream)o;
        return true;
    }
}
