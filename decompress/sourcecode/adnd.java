import java.util.List;
import java.io.IOException;
import java.io.FileNotFoundException;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class adnd extends admd
{
    private final oas a;
    private final adcr b;
    private final arud c;
    private final aeim d;
    private final aeim f;
    
    public adnd(final apfs apfs, final oas a, final arud c, final adcr b, final adjo adjo, final aeim d, final aeim f, final adcr adcr, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        super(c, apfs, adjo, b, adcr, (byte[])null, (byte[])null, (byte[])null);
        this.a = a;
        this.c = c;
        this.b = b;
        this.d = d;
        this.f = f;
    }
    
    public final void q(final adku adku) {
        final long c = this.a.c();
        apgj apgj;
        if ((apgj = this.c.f().h) == null) {
            apgj = apgj.a;
        }
        final long l = apgj.l;
        if (l > 0L && c - adku.h > l) {
            throw adim.a(apfr.E);
        }
    }
    
    public adiw w(final Throwable t, final adku adku, final boolean b) {
        if (t instanceof FileNotFoundException) {
            final adcr b2 = this.b;
            final String concat = this.g().concat(" File Not Found");
            adks adks;
            if ((adks = adks.a(adku.l)) == null) {
                adks = adks.a;
            }
            b2.l(concat, t, adks);
            return ((adnr)this).t(this.e.s(this.d.e(adku)), b);
        }
        if (t instanceof IOException) {
            final int v = adku.v;
            final int d = adio.D(v);
            Label_0133: {
                if (d != 0) {
                    if (d == 2) {
                        break Label_0133;
                    }
                }
                final int d2 = adio.D(v);
                if (d2 == 0) {
                    return super.w(t, adku, b);
                }
                if (d2 != 3) {
                    return super.w(t, adku, b);
                }
            }
            final adcr b3 = this.b;
            final String message = t.getMessage();
            final StringBuilder sb = new StringBuilder();
            sb.append(this.g());
            sb.append(" while reusing file input stream ");
            sb.append(message);
            final String string = sb.toString();
            adks adks2;
            if ((adks2 = adks.a(adku.l)) == null) {
                adks2 = adks.a;
            }
            b3.l(string, t, adks2);
            this.f.h();
            apfr apfr;
            if (t instanceof adik) {
                apfr = ((adik)t).a;
            }
            else {
                apfr = apfr.c;
            }
            final adcr e = this.e;
            final adkr b4 = this.b(adku);
            b4.getClass();
            return ((adnr)this).u(e.I(apfr, b4, (List)afcr.r((Object)0L), this.b), b, (asix)adnc.a);
        }
        return super.w(t, adku, b);
    }
}
