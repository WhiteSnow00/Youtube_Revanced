import java.util.Arrays;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Logger;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arze
{
    public static final Logger a;
    public static final aryx b;
    public static final aryv c;
    static final afqo d;
    public Object[] e;
    public int f;
    
    static {
        a = Logger.getLogger(arze.class.getName());
        b = (aryx)new aryt(0);
        c = (aryv)new ases(1);
        afqo d2 = afqo.d;
        final afqn afqn = (afqn)d2;
        if (afqn.c != null) {
            d2 = afqn.b(afqn.b, (Character)null);
        }
        d = d2;
    }
    
    public arze() {
    }
    
    public arze(final int f, final Object[] e) {
        this.f = f;
        this.e = e;
    }
    
    public static byte[] h(final InputStream inputStream) {
        try {
            return afqq.d(inputStream);
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
    
    public final Object b(final aryz aryz) {
        int f = this.f;
        int n;
        do {
            n = f - 1;
            if (n < 0) {
                return null;
            }
            f = n;
        } while (!Arrays.equals(aryz.b, this.g(n)));
        final Object c = this.c(n);
        Object o;
        if (c instanceof byte[]) {
            o = aryz.a((byte[])c);
        }
        else {
            final arzb arzb = (arzb)c;
            if (aryz.f()) {
                final aryy a = arzb.a(aryz);
                if (a != null) {
                    o = a.b(arzb.b());
                    return o;
                }
            }
            o = aryz.a(arzb.c());
        }
        return o;
    }
    
    public final Object c(final int n) {
        return this.e[n + n + 1];
    }
    
    public final void d(final aryz aryz) {
        if (!this.n()) {
            int i = 0;
            int f = 0;
            while (i < this.f) {
                int n = f;
                if (!Arrays.equals(aryz.b, this.g(i))) {
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
    
    public final void e(final arze arze) {
        if (arze.n()) {
            return;
        }
        final int j = this.j();
        final int a = this.a();
        if (this.n() || j - a < arze.a()) {
            this.k(this.a() + arze.a());
        }
        System.arraycopy(arze.e, 0, this.e, this.a(), arze.a());
        this.f += arze.f;
    }
    
    public final void f(final aryz aryz, final Object o) {
        aryz.getClass();
        o.getClass();
        if (this.a() == 0 || this.a() == this.j()) {
            final int a = this.a();
            this.k(Math.max(a + a, 8));
        }
        this.l(this.f, aryz.b);
        if (aryz.f()) {
            final int f = this.f;
            final aryy a2 = arzb.a(aryz);
            a2.getClass();
            this.m(f, new arzb(a2, o));
        }
        else {
            final int f2 = this.f;
            this.e[f2 + f2 + 1] = aryz.b(o);
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
        return ((arzb)c).c();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("Metadata(");
        for (int i = 0; i < this.f; ++i) {
            if (i != 0) {
                sb.append(',');
            }
            final String s = new String(this.g(i), afas.a);
            sb.append(s);
            sb.append('=');
            if (s.endsWith("-bin")) {
                sb.append(arze.d.i(this.i(i)));
            }
            else {
                sb.append(new String(this.i(i), afas.a));
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
