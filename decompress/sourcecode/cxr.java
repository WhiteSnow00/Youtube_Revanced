import java.util.Iterator;
import java.util.Locale;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cxr
{
    public final List a;
    public final ctu b;
    public final String c;
    public final long d;
    public final long e;
    public final String f;
    public final List g;
    public final cww h;
    public final int i;
    public final int j;
    public final int k;
    public final float l;
    public final float m;
    public final int n;
    public final int o;
    public final cwv p;
    public final cwn q;
    public final List r;
    public final boolean s;
    public final int t;
    public final int u;
    public final der v;
    
    public cxr(final List a, final ctu b, final String c, final long d, final int t, final long e, final String f, final List g, final cww h, final int i, final int j, final int k, final float l, final float m, final int n, final int o, final cwv p23, final der v, final List r, final int u, final cwn q, final boolean s, final byte[] array) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.t = t;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
        this.o = o;
        this.p = p23;
        this.v = v;
        this.r = r;
        this.u = u;
        this.q = q;
        this.s = s;
    }
    
    public final String a(final String s) {
        final StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.append(this.c);
        sb.append("\n");
        final cxr c = this.b.c(this.e);
        if (c != null) {
            sb.append("\t\tParents: ");
            sb.append(c.c);
            for (cxr cxr = this.b.c(c.e); cxr != null; cxr = this.b.c(cxr.e)) {
                sb.append("->");
                sb.append(cxr.c);
            }
            sb.append(s);
            sb.append("\n");
        }
        if (!this.g.isEmpty()) {
            sb.append(s);
            sb.append("\tMasks: ");
            sb.append(this.g.size());
            sb.append("\n");
        }
        if (this.i != 0 && this.j != 0) {
            sb.append(s);
            sb.append("\tBackground: ");
            sb.append(String.format(Locale.US, "%dx%d %X\n", this.i, this.j, this.k));
        }
        if (!this.a.isEmpty()) {
            sb.append(s);
            sb.append("\tShapes:\n");
            for (final Object next : this.a) {
                sb.append(s);
                sb.append("\t\t");
                sb.append(next);
                sb.append("\n");
            }
        }
        return sb.toString();
    }
    
    @Override
    public final String toString() {
        return this.a("");
    }
}