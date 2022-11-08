import java.util.List;
import com.google.protobuf.MessageLite;
import android.util.SparseIntArray;
import android.util.SparseArray;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acdk implements otg
{
    public final wwv a;
    public final SparseArray b;
    public final SparseIntArray c;
    public final wxz d;
    public final uyi e;
    
    public acdk(final uyi e, final wwv a, final ajkj ajkj, final wxz d) {
        this.b = new SparseArray();
        this.c = new SparseIntArray();
        this.a = a;
        this.e = e;
        if (d != null) {
            this.d = d;
            return;
        }
        Object d2;
        if (ajkj != null && (ajkj.b & 0x8) != 0x0 && ajkj.e.d() > 0) {
            d2 = new wws(ajkj.e);
        }
        else {
            d2 = null;
        }
        this.d = (wxz)d2;
    }
    
    public static int c(final aqec aqec) {
        final alts ar = xkm.ar((MessageLite)f(aqec));
        if (ar != null && (ar.c & 0x8) != 0x0) {
            ailc ailc;
            if ((ailc = ar.h) == null) {
                ailc = ailc.a;
            }
            if ((ailc.b & 0x1) != 0x0) {
                ailc ailc2;
                if ((ailc2 = ar.h) == null) {
                    ailc2 = ailc.a;
                }
                return ailc2.c;
            }
        }
        return -1;
    }
    
    public static aptp f(final aqec aqec) {
        aqee aqee;
        if ((aqee = aqec.c) == null) {
            aqee = aqee.a;
        }
        return (aptp)((agzd)aqee).rr((agyr)aptp.b);
    }
    
    public static boolean g(final aqec aqec) {
        alts alts;
        if ((alts = f(aqec).e) == null) {
            alts = alts.b;
        }
        ailc ailc;
        if ((ailc = alts.h) == null) {
            ailc = ailc.a;
        }
        return (ailc.b & 0x2) != 0x0;
    }
    
    public static boolean h(final aqec aqec) {
        final alts ar = xkm.ar((MessageLite)f(aqec));
        return ar != null && (ar.c & 0x8) != 0x0;
    }
    
    @Override
    public final void a(final aqec aqec, final int n) {
        if (n != 2) {
            return;
        }
        if (!this.i(aqec)) {
            return;
        }
        final wxz d = this.d(aqec);
        if (f(aqec).d && d != null) {
            this.a.J(3, d, (alff)null);
        }
    }
    
    @Override
    public final void b(final afcr afcr, final int n) {
        for (int c = ((afgh)afcr).c, i = 0; i < c; ++i) {
            final aqec aqec = ((List<aqec>)afcr).get(i);
            if (this.i(aqec)) {
                final wxz d = this.d(aqec);
                if (d != null) {
                    if (n == 2) {
                        this.a.t(d, (alff)null);
                    }
                    else {
                        this.a.o(d, (alff)null);
                    }
                }
            }
        }
    }
    
    public final wxz d(final aqec aqec) {
        monitorenter(this);
        try {
            final wxz e = this.e(aqec.d);
            if (e != null) {
                monitorexit(this);
                return e;
            }
            final aptp f = f(aqec);
            int n;
            if (h(aqec) && g(aqec)) {
                alts alts;
                if ((alts = f.e) == null) {
                    alts = alts.b;
                }
                ailc ailc;
                if ((ailc = alts.h) == null) {
                    ailc = ailc.a;
                }
                n = ailc.d;
            }
            else {
                n = aqec.d;
            }
            Object o = null;
            Label_0213: {
                if (f == null) {
                    trn.m("INTERACTIONLOGGINGBUG->", "LoggingProperties is null when creating visual element container!");
                }
                else {
                    if ((f.c & 0x2) != 0x0) {
                        alts alts2;
                        if ((alts2 = f.e) == null) {
                            alts2 = alts.b;
                        }
                        final wws wws = new wws(alts2);
                        final agza builder = ((wxz)wws).a.toBuilder();
                        final int abs = Math.abs(n);
                        builder.copyOnWrite();
                        final apni apni = (apni)builder.instance;
                        apni.b |= 0x8;
                        apni.f = abs;
                        ((wxz)wws).a = (apni)builder.build();
                        o = wws;
                        break Label_0213;
                    }
                    trn.m("INTERACTIONLOGGINGBUG->", "LoggingProperties is missing LoggingDirectives when creating visual element container!");
                }
                o = null;
            }
            if (o != null) {
                this.b.put(aqec.d, o);
                monitorexit(this);
                return (wxz)o;
            }
            monitorexit(this);
            return null;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final wxz e(final int n) {
        synchronized (this) {
            return (wxz)this.b.get(n);
        }
    }
    
    public final boolean i(final aqec aqec) {
        aqee aqee;
        if ((aqee = aqec.c) == null) {
            aqee = aqee.a;
        }
        if (!((agzd)aqee).rs((agyr)aptp.b)) {
            int e = aqec.e;
            while (true) {
                final int value = this.c.get(e, -1);
                if (value == -1) {
                    break;
                }
                e = value;
            }
            if (this.b.get(e) != null) {
                this.c.put(aqec.d, e);
            }
            return false;
        }
        final aptp f = f(aqec);
        return !((agzi)f).equals((Object)aptp.a) && (f.c & 0x2) != 0x0;
    }
}
