// 
// Decompiled by Procyon v0.6.0
// 

public final class abm implements Cloneable
{
    private boolean a;
    private long[] b;
    private Object[] c;
    private int d;
    
    public abm() {
        this(10);
    }
    
    public abm(int e) {
        if (e == 0) {
            this.b = abr.b;
            this.c = abr.c;
            return;
        }
        e = abr.e(e);
        this.b = new long[e];
        this.c = new Object[e];
    }
    
    private final void l() {
        final int d = this.d;
        final long[] b = this.b;
        final Object[] c = this.c;
        int i = 0;
        int d2 = 0;
        while (i < d) {
            final Object o = c[i];
            int n = d2;
            if (o != abn.a) {
                if (i != d2) {
                    b[d2] = b[i];
                    c[d2] = o;
                    c[i] = null;
                }
                n = d2 + 1;
            }
            ++i;
            d2 = n;
        }
        this.a = false;
        this.d = d2;
    }
    
    public final int a(final long n) {
        if (this.a) {
            this.l();
        }
        return abr.b(this.b, this.d, n);
    }
    
    public final int b(final Object o) {
        if (this.a) {
            this.l();
        }
        for (int d = this.d, i = 0; i < d; ++i) {
            if (this.c[i] == o) {
                return i;
            }
        }
        return -1;
    }
    
    public final int c() {
        if (this.a) {
            this.l();
        }
        return this.d;
    }
    
    public final /* bridge */ Object clone() {
        final abm abm = (abm)super.clone();
        abm.b = this.b.clone();
        abm.c = this.c.clone();
        return abm;
    }
    
    public final long d(final int n) {
        if (n >= 0 && n < this.d) {
            if (this.a) {
                this.l();
            }
            return this.b[n];
        }
        final StringBuilder sb = new StringBuilder("Expected index to be within 0..size()-1, but was ");
        sb.append(n);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public final Object e(final long n) {
        final int b = abr.b(this.b, this.d, n);
        if (b >= 0) {
            final Object o = this.c[b];
            if (o != abn.a) {
                return o;
            }
        }
        return null;
    }
    
    public final Object f(final long n, final Object o) {
        final int b = abr.b(this.b, this.d, n);
        if (b >= 0) {
            final Object o2 = this.c[b];
            if (o2 != abn.a) {
                return o2;
            }
        }
        return o;
    }
    
    public final Object g(final int n) {
        if (n >= 0 && n < this.d) {
            if (this.a) {
                this.l();
            }
            return this.c[n];
        }
        final StringBuilder sb = new StringBuilder("Expected index to be within 0..size()-1, but was ");
        sb.append(n);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public final void h() {
        final int d = this.d;
        final Object[] c = this.c;
        for (int i = 0; i < d; ++i) {
            c[i] = null;
        }
        this.d = 0;
        this.a = false;
    }
    
    public final void i(final long n, final Object o) {
        final int b = abr.b(this.b, this.d, n);
        if (b >= 0) {
            this.c[b] = o;
            return;
        }
        final int n2 = ~b;
        final int d = this.d;
        if (n2 < d) {
            final Object[] c = this.c;
            if (c[n2] == abn.a) {
                this.b[n2] = n;
                c[n2] = o;
                return;
            }
        }
        int n3 = n2;
        if (this.a) {
            n3 = n2;
            if (d >= this.b.length) {
                this.l();
                n3 = ~abr.b(this.b, this.d, n);
            }
        }
        final int d2 = this.d;
        final long[] b2 = this.b;
        final int length = b2.length;
        if (d2 >= length) {
            final int e = abr.e(d2 + 1);
            final long[] b3 = new long[e];
            final Object[] c2 = new Object[e];
            System.arraycopy(b2, 0, b3, 0, length);
            final Object[] c3 = this.c;
            System.arraycopy(c3, 0, c2, 0, c3.length);
            this.b = b3;
            this.c = c2;
        }
        final int n4 = this.d - n3;
        if (n4 != 0) {
            final long[] b4 = this.b;
            final int n5 = n3 + 1;
            System.arraycopy(b4, n3, b4, n5, n4);
            final Object[] c4 = this.c;
            System.arraycopy(c4, n3, c4, n5, this.d - n3);
        }
        this.b[n3] = n;
        this.c[n3] = o;
        ++this.d;
    }
    
    public final void j(final long n) {
        final int b = abr.b(this.b, this.d, n);
        if (b >= 0) {
            final Object[] c = this.c;
            final Object o = c[b];
            final Object a = abn.a;
            if (o != a) {
                c[b] = a;
                this.a = true;
            }
        }
    }
    
    public final void k(final int n) {
        final Object[] c = this.c;
        final Object o = c[n];
        final Object a = abn.a;
        if (o != a) {
            c[n] = a;
            this.a = true;
        }
    }
    
    @Override
    public final String toString() {
        if (this.c() <= 0) {
            return "{}";
        }
        final StringBuilder sb = new StringBuilder(this.d * 28);
        sb.append('{');
        for (int d = this.d, i = 0; i < d; ++i) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(this.d(i));
            sb.append('=');
            final Object g = this.g(i);
            if (g != sb) {
                sb.append(g);
            }
            else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
