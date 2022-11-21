import java.util.List;
import java.io.IOException;
import java.io.FileNotFoundException;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class adqs extends adpt
{
    private final oco a;
    private final arzb b;
    private final adgg c;
    private final aheu d;
    private final aheu f;
    
    public adqs(final apki apki, final oco a, final arzb b, final adgg c, final adnd adnd, final aheu d, final aheu f, final adgg adgg, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        super(b, apki, adnd, c, adgg, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.f = f;
    }
    
    public final void q(final adoj adoj) {
        final long c = this.a.c();
        apkz apkz;
        if ((apkz = this.b.f().h) == null) {
            apkz = apkz.a;
        }
        final long l = apkz.l;
        if (l > 0L && c - adoj.h > l) {
            throw admc.a(apkh.E);
        }
    }
    
    public admm w(final Throwable t, final adoj adoj, final boolean b) {
        if (t instanceof FileNotFoundException) {
            final adgg c = this.c;
            final String g = this.g();
            adoh adoh;
            if ((adoh = adoh.a(adoj.l)) == null) {
                adoh = adoh.a;
            }
            c.E(g.concat(" File Not Found"), t, adoh);
            return ((adrh)this).t(this.e.m(this.d.m(adoj)), b);
        }
        if (t instanceof IOException) {
            final int v = adoj.v;
            final int z = adme.z(v);
            Label_0133: {
                if (z != 0) {
                    if (z == 2) {
                        break Label_0133;
                    }
                }
                final int z2 = adme.z(v);
                if (z2 == 0) {
                    return super.w(t, adoj, b);
                }
                if (z2 != 3) {
                    return super.w(t, adoj, b);
                }
            }
            final adgg c2 = this.c;
            final String g2 = this.g();
            final String message = t.getMessage();
            final StringBuilder sb = new StringBuilder();
            sb.append(g2);
            sb.append(" while reusing file input stream ");
            sb.append(message);
            final String string = sb.toString();
            adoh adoh2;
            if ((adoh2 = adoh.a(adoj.l)) == null) {
                adoh2 = adoh.a;
            }
            c2.E(string, t, adoh2);
            this.f.p();
            apkh apkh;
            if (t instanceof adma) {
                apkh = ((adma)t).a;
            }
            else {
                apkh = apkh.c;
            }
            final adgg e = this.e;
            final adog b2 = this.b(adoj);
            b2.getClass();
            return ((adrh)this).u(e.H(apkh, b2, afgh.r(0L), this.c), b, adpl.d);
        }
        return super.w(t, adoj, b);
    }
}
