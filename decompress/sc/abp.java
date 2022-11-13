// 
// Decompiled by Procyon v0.6.0
// 

public final class abp implements Cloneable
{
    @Deprecated
    private static final Object e;
    public boolean a;
    public int[] b;
    public Object[] c;
    public int d;
    
    static {
        e = new Object();
    }
    
    public abp() {
        this(10);
    }
    
    public abp(int d) {
        d = abq.d(d);
        this.b = new int[d];
        this.c = new Object[d];
    }
    
    public final int a(final Object o) {
        if (this.a) {
            this.g();
        }
        for (int d = this.d, i = 0; i < d; ++i) {
            if (this.c[i] == o) {
                return i;
            }
        }
        return -1;
    }
    
    public final int b(final int n) {
        if (this.a) {
            this.g();
        }
        return this.b[n];
    }
    
    public final int c() {
        if (this.a) {
            this.g();
        }
        return this.d;
    }
    
    public final /* bridge */ Object clone() {
        final abp abp = (abp)super.clone();
        abp.b = this.b.clone();
        abp.c = this.c.clone();
        return abp;
    }
    
    public final Object d(int a) {
        a = abq.a(this.b, this.d, a);
        if (a >= 0) {
            final Object o = this.c[a];
            if (o != abp.e) {
                return o;
            }
        }
        return null;
    }
    
    public final Object e(final int n) {
        if (this.a) {
            this.g();
        }
        return this.c[n];
    }
    
    public final void f() {
        final int d = this.d;
        final Object[] c = this.c;
        for (int i = 0; i < d; ++i) {
            c[i] = null;
        }
        this.d = 0;
        this.a = false;
    }
    
    public final void g() {
        final int d = this.d;
        final int[] b = this.b;
        final Object[] c = this.c;
        int i = 0;
        int d2 = 0;
        while (i < d) {
            final Object o = c[i];
            int n = d2;
            if (o != abp.e) {
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
    
    public final void h(final int n, final Object o) {
        final int a = abq.a(this.b, this.d, n);
        if (a >= 0) {
            this.c[a] = o;
            return;
        }
        final int n2 = ~a;
        final int d = this.d;
        if (n2 < d) {
            final Object[] c = this.c;
            if (c[n2] == abp.e) {
                this.b[n2] = n;
                c[n2] = o;
                return;
            }
        }
        int n3 = n2;
        if (this.a) {
            n3 = n2;
            if (d >= this.b.length) {
                this.g();
                n3 = ~abq.a(this.b, this.d, n);
            }
        }
        final int d2 = this.d;
        final int[] b = this.b;
        final int length = b.length;
        if (d2 >= length) {
            final int d3 = abq.d(d2 + 1);
            final int[] b2 = new int[d3];
            final Object[] c2 = new Object[d3];
            System.arraycopy(b, 0, b2, 0, length);
            final Object[] c3 = this.c;
            System.arraycopy(c3, 0, c2, 0, c3.length);
            this.b = b2;
            this.c = c2;
        }
        final int n4 = this.d - n3;
        if (n4 != 0) {
            final int[] b3 = this.b;
            final int n5 = n3 + 1;
            System.arraycopy(b3, n3, b3, n5, n4);
            final Object[] c4 = this.c;
            System.arraycopy(c4, n3, c4, n5, this.d - n3);
        }
        this.b[n3] = n;
        this.c[n3] = o;
        ++this.d;
    }
    
    public final void i(int a) {
        a = abq.a(this.b, this.d, a);
        if (a >= 0) {
            final Object[] c = this.c;
            final Object o = c[a];
            final Object e = abp.e;
            if (o != e) {
                c[a] = e;
                this.a = true;
            }
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
            sb.append(this.b(i));
            sb.append('=');
            final Object e = this.e(i);
            if (e != this) {
                sb.append(e);
            }
            else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
