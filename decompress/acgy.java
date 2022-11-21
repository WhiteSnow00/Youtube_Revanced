import com.google.protobuf.MessageLite;
import android.util.SparseIntArray;
import android.util.SparseArray;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acgy implements ovh
{
    public final xab a;
    public final SparseArray b;
    public final SparseIntArray c;
    public final xbe d;
    public final vbs e;
    
    public acgy(final vbs e, final xab a, final ajon ajon, final xbe d) {
        this.b = new SparseArray();
        this.c = new SparseIntArray();
        this.a = a;
        this.e = e;
        if (d != null) {
            this.d = d;
            return;
        }
        Object d2;
        if (ajon != null && (ajon.b & 0x8) != 0x0 && ajon.e.d() > 0) {
            d2 = new wzy(ajon.e);
        }
        else {
            d2 = null;
        }
        this.d = (xbe)d2;
    }
    
    public static int c(final aqji aqji) {
        final alxw q = xny.Q((MessageLite)f(aqji));
        if (q != null && (q.c & 0x8) != 0x0) {
            aiot aiot;
            if ((aiot = q.h) == null) {
                aiot = aiot.a;
            }
            if ((aiot.b & 0x1) != 0x0) {
                aiot aiot2;
                if ((aiot2 = q.h) == null) {
                    aiot2 = aiot.a;
                }
                return aiot2.c;
            }
        }
        return -1;
    }
    
    public static apyn f(final aqji aqji) {
        aqjk aqjk;
        if ((aqjk = aqji.c) == null) {
            aqjk = aqjk.a;
        }
        return (apyn)aqjk.rx((ahci)apyn.b);
    }
    
    public static boolean g(final aqji aqji) {
        alxw alxw;
        if ((alxw = f(aqji).e) == null) {
            alxw = alxw.b;
        }
        aiot aiot;
        if ((aiot = alxw.h) == null) {
            aiot = aiot.a;
        }
        return (aiot.b & 0x2) != 0x0;
    }
    
    public static boolean h(final aqji aqji) {
        final alxw q = xny.Q((MessageLite)f(aqji));
        return q != null && (q.c & 0x8) != 0x0;
    }
    
    public final void a(final aqji aqji, final int n) {
        if (n != 2) {
            return;
        }
        if (!this.i(aqji)) {
            return;
        }
        final xbe d = this.d(aqji);
        if (f(aqji).d && d != null) {
            this.a.J(3, d, (alji)null);
        }
    }
    
    public final void b(final afgh afgh, final int n) {
        for (int c = ((afjx)afgh).c, i = 0; i < c; ++i) {
            final aqji aqji = afgh.get(i);
            if (this.i(aqji)) {
                final xbe d = this.d(aqji);
                if (d != null) {
                    if (n == 2) {
                        this.a.t(d, (alji)null);
                    }
                    else {
                        this.a.o(d, (alji)null);
                    }
                }
            }
        }
    }
    
    public final xbe d(final aqji aqji) {
        monitorenter(this);
        try {
            final xbe e = this.e(aqji.d);
            if (e != null) {
                monitorexit(this);
                return e;
            }
            final apyn f = f(aqji);
            int n;
            if (h(aqji) && g(aqji)) {
                alxw alxw;
                if ((alxw = f.e) == null) {
                    alxw = alxw.b;
                }
                aiot aiot;
                if ((aiot = alxw.h) == null) {
                    aiot = aiot.a;
                }
                n = aiot.d;
            }
            else {
                n = aqji.d;
            }
            Object o = null;
            Label_0220: {
                if (f == null) {
                    tut.m("INTERACTIONLOGGINGBUG->", "LoggingProperties is null when creating visual element container!");
                }
                else {
                    if ((f.c & 0x2) != 0x0) {
                        alxw alxw2;
                        if ((alxw2 = f.e) == null) {
                            alxw2 = alxw.b;
                        }
                        final wzy wzy = new wzy(alxw2);
                        final ahcr builder = ((xbe)wzy).a.toBuilder();
                        final int abs = Math.abs(n);
                        builder.copyOnWrite();
                        final apry apry = (apry)builder.instance;
                        apry.b |= 0x8;
                        apry.f = abs;
                        ((xbe)wzy).a = (apry)builder.build();
                        o = wzy;
                        break Label_0220;
                    }
                    tut.m("INTERACTIONLOGGINGBUG->", "LoggingProperties is missing LoggingDirectives when creating visual element container!");
                }
                o = null;
            }
            if (o != null) {
                this.b.put(aqji.d, o);
                monitorexit(this);
                return (xbe)o;
            }
            monitorexit(this);
            return null;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final xbe e(final int n) {
        synchronized (this) {
            return (xbe)this.b.get(n);
        }
    }
    
    public final boolean i(final aqji aqji) {
        aqjk aqjk;
        if ((aqjk = aqji.c) == null) {
            aqjk = aqjk.a;
        }
        if (!aqjk.ry((ahci)apyn.b)) {
            int e = aqji.e;
            while (true) {
                final int value = this.c.get(e, -1);
                if (value == -1) {
                    break;
                }
                e = value;
            }
            if (this.b.get(e) != null) {
                this.c.put(aqji.d, e);
            }
            return false;
        }
        final apyn f = f(aqji);
        return !f.equals(apyn.a) && (f.c & 0x2) != 0x0;
    }
}
