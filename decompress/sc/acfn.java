import java.util.List;
import com.google.protobuf.MessageLite;
import android.util.SparseIntArray;
import android.util.SparseArray;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acfn implements oup
{
    public final wyw a;
    public final SparseArray b;
    public final SparseIntArray c;
    public final wzz d;
    public final vai e;
    
    public acfn(final vai e, final wyw a, final ajmo ajmo, final wzz d) {
        this.b = new SparseArray();
        this.c = new SparseIntArray();
        this.a = a;
        this.e = e;
        if (d != null) {
            this.d = d;
            return;
        }
        Object d2;
        if (ajmo != null && (ajmo.b & 0x8) != 0x0 && ajmo.e.d() > 0) {
            d2 = new wyt(ajmo.e);
        }
        else {
            d2 = null;
        }
        this.d = (wzz)d2;
    }
    
    public static int c(final aqgo aqgo) {
        final alvw ad = xmm.ad((MessageLite)f(aqgo));
        if (ad != null && (ad.c & 0x8) != 0x0) {
            aina aina;
            if ((aina = ad.h) == null) {
                aina = aina.a;
            }
            if ((aina.b & 0x1) != 0x0) {
                aina aina2;
                if ((aina2 = ad.h) == null) {
                    aina2 = aina.a;
                }
                return aina2.c;
            }
        }
        return -1;
    }
    
    public static apvz f(final aqgo aqgo) {
        aqgq aqgq;
        if ((aqgq = aqgo.c) == null) {
            aqgq = aqgq.a;
        }
        return (apvz)((ahbc)aqgq).rx((ahaq)apvz.b);
    }
    
    public static boolean g(final aqgo aqgo) {
        alvw alvw;
        if ((alvw = f(aqgo).e) == null) {
            alvw = alvw.b;
        }
        aina aina;
        if ((aina = alvw.h) == null) {
            aina = aina.a;
        }
        return (aina.b & 0x2) != 0x0;
    }
    
    public static boolean h(final aqgo aqgo) {
        final alvw ad = xmm.ad((MessageLite)f(aqgo));
        return ad != null && (ad.c & 0x8) != 0x0;
    }
    
    public final void a(final aqgo aqgo, final int n) {
        if (n != 2) {
            return;
        }
        if (!this.i(aqgo)) {
            return;
        }
        final wzz d = this.d(aqgo);
        if (f(aqgo).d && d != null) {
            this.a.J(3, d, (alhi)null);
        }
    }
    
    public final void b(final afeq afeq, final int n) {
        for (int c = ((afih)afeq).c, i = 0; i < c; ++i) {
            final aqgo aqgo = ((List<aqgo>)afeq).get(i);
            if (this.i(aqgo)) {
                final wzz d = this.d(aqgo);
                if (d != null) {
                    if (n == 2) {
                        this.a.t(d, (alhi)null);
                    }
                    else {
                        this.a.o(d, (alhi)null);
                    }
                }
            }
        }
    }
    
    public final wzz d(final aqgo aqgo) {
        monitorenter(this);
        try {
            final wzz e = this.e(aqgo.d);
            if (e != null) {
                monitorexit(this);
                return e;
            }
            final apvz f = f(aqgo);
            int n;
            if (h(aqgo) && g(aqgo)) {
                alvw alvw;
                if ((alvw = f.e) == null) {
                    alvw = alvw.b;
                }
                aina aina;
                if ((aina = alvw.h) == null) {
                    aina = aina.a;
                }
                n = aina.d;
            }
            else {
                n = aqgo.d;
            }
            Object o = null;
            Label_0220: {
                if (f == null) {
                    ttr.m("INTERACTIONLOGGINGBUG->", "LoggingProperties is null when creating visual element container!");
                }
                else {
                    if ((f.c & 0x2) != 0x0) {
                        alvw alvw2;
                        if ((alvw2 = f.e) == null) {
                            alvw2 = alvw.b;
                        }
                        final wyt wyt = new wyt(alvw2);
                        final ahaz builder = ((ahbh)((wzz)wyt).a).toBuilder();
                        final int abs = Math.abs(n);
                        builder.copyOnWrite();
                        final appm appm = (appm)builder.instance;
                        appm.b |= 0x8;
                        appm.f = abs;
                        ((wzz)wyt).a = (appm)builder.build();
                        o = wyt;
                        break Label_0220;
                    }
                    ttr.m("INTERACTIONLOGGINGBUG->", "LoggingProperties is missing LoggingDirectives when creating visual element container!");
                }
                o = null;
            }
            if (o != null) {
                this.b.put(aqgo.d, o);
                monitorexit(this);
                return (wzz)o;
            }
            monitorexit(this);
            return null;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final wzz e(final int n) {
        synchronized (this) {
            return (wzz)this.b.get(n);
        }
    }
    
    public final boolean i(final aqgo aqgo) {
        aqgq aqgq;
        if ((aqgq = aqgo.c) == null) {
            aqgq = aqgq.a;
        }
        if (!((ahbc)aqgq).ry((ahaq)apvz.b)) {
            int e = aqgo.e;
            while (true) {
                final int value = this.c.get(e, -1);
                if (value == -1) {
                    break;
                }
                e = value;
            }
            if (this.b.get(e) != null) {
                this.c.put(aqgo.d, e);
            }
            return false;
        }
        final apvz f = f(aqgo);
        return !((ahbh)f).equals((Object)apvz.a) && (f.c & 0x2) != 0x0;
    }
}
