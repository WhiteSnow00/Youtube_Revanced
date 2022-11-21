import java.util.Locale;
import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aule
{
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    
    public aule() {
        this.b = new int[363];
        this.a = new short[121];
        this.c = new byte[167];
        this.d = new int[51];
    }
    
    public aule(final aumb a, final aulz b) {
        this.a = a;
        this.b = b;
        this.c = null;
        this.d = null;
    }
    
    public aule(final aumb a, final aulz b, final auih c, final auip d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final String a(final aujc aujc) {
        final StringBuilder sb = new StringBuilder(this.e().b());
        try {
            this.f(sb, auim.b(aujc), auim.e(aujc));
            return sb.toString();
        }
        catch (final IOException ex) {
            return sb.toString();
        }
    }
    
    public final auih b(auih d) {
        d = auim.d((auih)d);
        final Object c = this.c;
        if (c != null) {
            d = c;
        }
        final Object d2 = this.d;
        if (d2 != null) {
            return ((auih)d).b((auip)d2);
        }
        return (auih)d;
    }
    
    public final aule c(final auip auip) {
        if (this.d == auip) {
            return this;
        }
        return new aule((aumb)this.a, (aulz)this.b, (auih)this.c, auip);
    }
    
    public final aule d() {
        return this.c(auip.a);
    }
    
    public final aumb e() {
        final Object a = this.a;
        if (a != null) {
            return (aumb)a;
        }
        throw new UnsupportedOperationException("Printing not supported");
    }
    
    public final void f(final Appendable appendable, final long n, final auih auih) {
        final aumb e = this.e();
        final auih b = this.b(auih);
        final auip z = b.z();
        final int a = z.a(n);
        final long n2 = a;
        final long n3 = n + n2;
        auip a2 = z;
        int n4 = a;
        long n5 = n3;
        if ((n ^ n3) < 0L) {
            a2 = z;
            n4 = a;
            n5 = n3;
            if ((n2 ^ n) >= 0L) {
                a2 = auip.a;
                n4 = 0;
                n5 = n;
            }
        }
        e.d(appendable, n5, b.a(), n4, a2, null);
    }
    
    public final auma g() {
        return auma.b((aulz)this.b);
    }
}
