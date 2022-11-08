import java.util.Arrays;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Logger;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arug
{
    public static final Logger a;
    public static final artz b;
    public static final artx c;
    static final afmy d;
    public Object[] e;
    public int f;
    
    static {
        a = Logger.getLogger(arug.class.getName());
        b = (artz)new artv(0);
        c = (artx)new asao(1);
        afmy d2 = afmy.d;
        final afmx afmx = (afmx)d2;
        if (afmx.c != null) {
            d2 = afmx.b(afmx.b, null);
        }
        d = d2;
    }
    
    public arug() {
    }
    
    public arug(final int f, final Object[] e) {
        this.f = f;
        this.e = e;
    }
    
    public static byte[] h(final InputStream inputStream) {
        try {
            return afna.d(inputStream);
        }
        catch (final IOException ex) {
            throw new RuntimeException("failure reading serialized stream", ex);
        }
    }
    
    private final int j() {
        final Object[] e = this.e;
        if (e != null) {
            return e.length;
        }
        return 0;
    }
    
    private final void k(final int n) {
        final Object[] e = new Object[n];
        if (!this.n()) {
            System.arraycopy(this.e, 0, e, 0, this.a());
        }
        this.e = e;
    }
    
    private final void l(final int n, final byte[] array) {
        this.e[n + n] = array;
    }
    
    private final void m(final int n, final Object o) {
        if (this.e instanceof byte[][]) {
            this.k(this.j());
        }
        this.e[n + n + 1] = o;
    }
    
    private final boolean n() {
        return this.f == 0;
    }
    
    public final int a() {
        final int f = this.f;
        return f + f;
    }
    
    public final Object b(final arub arub) {
        int f = this.f;
        int n;
        do {
            n = f - 1;
            if (n < 0) {
                return null;
            }
            f = n;
        } while (!Arrays.equals(arub.b, this.g(n)));
        final Object c = this.c(n);
        Object o;
        if (c instanceof byte[]) {
            o = arub.a((byte[])c);
        }
        else {
            final arud arud = (arud)c;
            if (arub.g()) {
                final arua a = arud.a(arub);
                if (a != null) {
                    o = a.b(arud.b());
                    return o;
                }
            }
            o = arub.a(arud.c());
        }
        return o;
    }
    
    public final Object c(final int n) {
        return this.e[n + n + 1];
    }
    
    public final void d(final arub arub) {
        if (!this.n()) {
            int i = 0;
            int f = 0;
            while (i < this.f) {
                int n = f;
                if (!Arrays.equals(arub.b, this.g(i))) {
                    this.l(f, this.g(i));
                    this.m(f, this.c(i));
                    n = f + 1;
                }
                ++i;
                f = n;
            }
            Arrays.fill(this.e, f + f, this.a(), null);
            this.f = f;
        }
    }
    
    public final void e(final arug arug) {
        if (arug.n()) {
            return;
        }
        final int j = this.j();
        final int a = this.a();
        if (this.n() || j - a < arug.a()) {
            this.k(this.a() + arug.a());
        }
        System.arraycopy(arug.e, 0, this.e, this.a(), arug.a());
        this.f += arug.f;
    }
    
    public final void f(final arub arub, final Object o) {
        arub.getClass();
        o.getClass();
        if (this.a() == 0 || this.a() == this.j()) {
            final int a = this.a();
            this.k(Math.max(a + a, 8));
        }
        this.l(this.f, arub.b);
        if (arub.g()) {
            final int f = this.f;
            final arua a2 = arud.a(arub);
            a2.getClass();
            this.m(f, new arud(a2, o));
        }
        else {
            final int f2 = this.f;
            this.e[f2 + f2 + 1] = arub.b(o);
        }
        ++this.f;
    }
    
    public final byte[] g(final int n) {
        return (byte[])this.e[n + n];
    }
    
    public final byte[] i(final int n) {
        final Object c = this.c(n);
        if (c instanceof byte[]) {
            return (byte[])c;
        }
        return ((arud)c).c();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("Metadata(");
        for (int i = 0; i < this.f; ++i) {
            if (i != 0) {
                sb.append(',');
            }
            final String s = new String(this.g(i), aexb.a);
            sb.append(s);
            sb.append('=');
            if (s.endsWith("-bin")) {
                sb.append(arug.d.i(this.i(i)));
            }
            else {
                sb.append(new String(this.i(i), aexb.a));
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
