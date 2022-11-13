import java.util.concurrent.Executor;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.FileNotFoundException;
import java.io.EOFException;
import android.database.sqlite.SQLiteException;
import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class adoe extends adps
{
    private final arwh a;
    private final adet b;
    public final adet e;
    
    public adoe(final arwh a, final aphw aphw, final adlp adlp, final adet b, final adet e, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        super(aphw, adlp, e, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.a = a;
        this.b = b;
        this.e = e;
    }
    
    private final adkn s(final Throwable t, final int n) {
        if (t instanceof adkn) {
            return (adkn)t;
        }
        if (t instanceof adkv) {
            return adkn.b(aphv.u, t);
        }
        if (t instanceof SecurityException) {
            return adkn.b(aphv.x, t);
        }
        if (!(t instanceof IOException) && !(t instanceof IndexOutOfBoundsException)) {
            if (t instanceof SQLiteException) {
                return adkn.b(aphv.an, t);
            }
            if (t instanceof OutOfMemoryError) {
                return adkn.b(aphv.am, t);
            }
            final adkn v = this.v(t, n);
            if (v != null) {
                return v;
            }
            return adkn.b(aphv.q, t);
        }
        else {
            if (t instanceof qyh) {
                final qyg a = ((qyh)t).a;
                final qyg a2 = qyg.a;
                aphv aphv = null;
                switch (a.ordinal()) {
                    default: {
                        this.b.g("EditedVideoException missing reason.");
                        aphv = aphv.aA;
                        break;
                    }
                    case 12: {
                        aphv = aphv.aB;
                        break;
                    }
                    case 11: {
                        aphv = aphv.az;
                        break;
                    }
                    case 10: {
                        aphv = aphv.ay;
                        break;
                    }
                    case 9: {
                        aphv = aphv.ax;
                        break;
                    }
                    case 8: {
                        aphv = aphv.aw;
                        break;
                    }
                    case 7: {
                        aphv = aphv.av;
                        break;
                    }
                    case 6: {
                        aphv = aphv.au;
                        break;
                    }
                    case 5: {
                        aphv = aphv.at;
                        break;
                    }
                    case 4: {
                        aphv = aphv.as;
                        break;
                    }
                    case 3: {
                        aphv = aphv.ar;
                        break;
                    }
                    case 2: {
                        aphv = aphv.aq;
                        break;
                    }
                    case 1: {
                        aphv = aphv.ap;
                        break;
                    }
                    case 0: {
                        aphv = aphv.ao;
                        break;
                    }
                }
                return adkn.b(aphv, t);
            }
            if (t instanceof EOFException) {
                return adkn.b(aphv.al, t);
            }
            if (t instanceof FileNotFoundException) {
                return adkn.b(aphv.w, t);
            }
            final adkn v2 = this.v(t, n);
            if (v2 != null) {
                return v2;
            }
            return adkn.b(aphv.c, t);
        }
    }
    
    private final adkn v(Throwable cause, final int n) {
        cause = cause.getCause();
        if (cause != null && n > 0) {
            return this.s(cause, n - 1);
        }
        return null;
    }
    
    public abstract ListenableFuture d(final String p0, final adku p1, final admv p2);
    
    public boolean h() {
        return false;
    }
    
    public abstract boolean j(final admv p0);
    
    public final adkx m(final Throwable t, final String s, final adku adku, final boolean b) {
        try {
            final admv b2 = adku.b(s);
            if (b2 == null) {
                return this.t(this.e.r(aphv.s), b);
            }
            return this.w(t, b2, b);
        }
        catch (final adkv adkv) {
            return this.t(this.e.r(aphv.u), b);
        }
    }
    
    protected final adms n(final admv admv, final adkn adkn) {
        if (adkn.b) {
            final adet e = this.e;
            final aphv a = adkn.a;
            final adms b = this.b(admv);
            b.getClass();
            return e.D(a, b, adkn.c, this.b);
        }
        return this.e.r(adkn.a);
    }
    
    public final admv o(final String s, final adku adku, final boolean b) {
        final admv b2 = adku.b(s);
        if (b2 == null) {
            throw adkn.a(aphv.s);
        }
        if (b && !this.h() && b2.aj) {
            throw adkn.a(aphv.v);
        }
        if (this.j(b2)) {
            return b2;
        }
        throw adkn.a(aphv.t);
    }
    
    public final ListenableFuture p(final String s, final adku adku) {
        return afwm.r((afty)new jlw(this, s, adku, 16), (Executor)afum.a);
    }
    
    public void q(final admv admv) {
    }
    
    public adkx w(final Throwable t, final admv admv, final boolean b) {
        final akcn f = this.a.f();
        int x = 0;
        if (f != null) {
            x = x;
            if ((this.a.f().b & 0x1000) != 0x0) {
                apin apin;
                if ((apin = this.a.f().h) == null) {
                    apin = apin.a;
                }
                x = apin.x;
            }
        }
        final adkn s = this.s(t, x);
        if (s.a != aphv.v) {
            final adet b2 = this.b;
            final String g = this.g();
            final String message = s.getMessage();
            final StringBuilder sb = new StringBuilder();
            sb.append(g);
            sb.append(" ");
            sb.append(message);
            final String string = sb.toString();
            admt admt;
            if ((admt = admt.a(admv.l)) == null) {
                admt = admt.a;
            }
            b2.i(string, (Throwable)s, admt);
        }
        return this.t(this.n(admv, s), b);
    }
}
