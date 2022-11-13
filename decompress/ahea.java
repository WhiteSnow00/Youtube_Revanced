import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahea
{
    public static final ahea a;
    public int b;
    public int[] c;
    public Object[] d;
    public int e;
    private boolean f;
    
    static {
        a = new ahea(0, new int[0], new Object[0], false);
    }
    
    private ahea() {
        this(0, new int[8], new Object[8], true);
    }
    
    private ahea(final int b, final int[] c, final Object[] d, final boolean f) {
        this.e = -1;
        this.b = b;
        this.c = c;
        this.d = d;
        this.f = f;
    }
    
    static ahea b(final ahea ahea, final ahea ahea2) {
        final int n = ahea.b + ahea2.b;
        final int[] copy = Arrays.copyOf(ahea.c, n);
        System.arraycopy(ahea2.c, 0, copy, ahea.b, ahea2.b);
        final Object[] copy2 = Arrays.copyOf(ahea.d, n);
        System.arraycopy(ahea2.d, 0, copy2, ahea.b, ahea2.b);
        return new ahea(n, copy, copy2, true);
    }
    
    public static ahea c() {
        return new ahea();
    }
    
    public final int a() {
        final int e = this.e;
        if (e == -1) {
            int i = 0;
            int e2 = 0;
            while (i < this.b) {
                final int n = this.c[i];
                final int a = ahem.a(n);
                final int b = ahem.b(n);
                int n2;
                if (b != 0) {
                    if (b != 1) {
                        if (b != 2) {
                            if (b != 3) {
                                if (b != 5) {
                                    throw new IllegalStateException((Throwable)ahca.a());
                                }
                                ((Integer)this.d[i]).intValue();
                                n2 = ahal.aA(a);
                            }
                            else {
                                final int ac = ahal.ac(a);
                                n2 = ac + ac + ((ahea)this.d[i]).a();
                            }
                        }
                        else {
                            n2 = ahal.I(a, (ahab)this.d[i]);
                        }
                    }
                    else {
                        ((Long)this.d[i]).longValue();
                        n2 = ahal.aB(a);
                    }
                }
                else {
                    n2 = ahal.af(a, (long)this.d[i]);
                }
                e2 += n2;
                ++i;
            }
            return this.e = e2;
        }
        return e;
    }
    
    final void d() {
        if (this.f) {
            return;
        }
        throw new UnsupportedOperationException();
    }
    
    public final void e(int n) {
        final int[] c = this.c;
        if (n > c.length) {
            final int b = this.b;
            final int n2 = b + b / 2;
            int n3;
            if (n2 >= (n3 = n)) {
                n3 = n2;
            }
            if ((n = n3) < 8) {
                n = 8;
            }
            this.c = Arrays.copyOf(c, n);
            this.d = Arrays.copyOf(this.d, n);
        }
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (!(o instanceof ahea)) {
            return false;
        }
        final ahea ahea = (ahea)o;
        final int b = this.b;
        if (b == ahea.b) {
            final int[] c = this.c;
            final int[] c2 = ahea.c;
            for (int i = 0; i < b; ++i) {
                if (c[i] != c2[i]) {
                    return false;
                }
            }
            final Object[] d = this.d;
            final Object[] d2 = ahea.d;
            for (int b2 = this.b, j = 0; j < b2; ++j) {
                if (!d[j].equals(d2[j])) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    
    public final void f() {
        this.f = false;
    }
    
    public final void g(final int n, final Object o) {
        this.d();
        this.e(this.b + 1);
        final int[] c = this.c;
        final int b = this.b;
        c[b] = n;
        this.d[b] = o;
        this.b = b + 1;
    }
    
    final boolean h(final int n, final ahag ahag) {
        this.d();
        final int b = ahem.b(n);
        if (b == 0) {
            this.g(n, ahag.q());
            return true;
        }
        if (b == 1) {
            this.g(n, ahag.p());
            return true;
        }
        if (b == 2) {
            this.g(n, ahag.x());
            return true;
        }
        if (b == 3) {
            final ahea ahea = new ahea();
            int n2;
            do {
                n2 = ahag.n();
            } while (n2 != 0 && ahea.h(n2, ahag));
            ahag.B(ahem.c(ahem.a(n), 4));
            this.g(n, ahea);
            return true;
        }
        if (b == 4) {
            return false;
        }
        if (b == 5) {
            this.g(n, ahag.h());
            return true;
        }
        throw ahca.a();
    }
    
    @Override
    public final int hashCode() {
        final int b = this.b;
        final int[] c = this.c;
        int i = 0;
        final int n = 17;
        int j = 0;
        int n2 = 17;
        while (j < b) {
            n2 = n2 * 31 + c[j];
            ++j;
        }
        final Object[] d = this.d;
        final int b2 = this.b;
        int n3 = n;
        while (i < b2) {
            n3 = n3 * 31 + d[i].hashCode();
            ++i;
        }
        return ((b + 527) * 31 + n2) * 31 + n3;
    }
    
    public final void i(final agnj agnj) {
        if (this.b != 0) {
            for (int i = 0; i < this.b; ++i) {
                final int n = this.c[i];
                final Object o = this.d[i];
                final int b = ahem.b(n);
                final int a = ahem.a(n);
                if (b != 0) {
                    if (b != 1) {
                        if (b != 2) {
                            if (b != 3) {
                                if (b != 5) {
                                    throw new RuntimeException((Throwable)ahca.a());
                                }
                                agnj.g(a, (int)o);
                            }
                            else {
                                ((ahal)agnj.a).B(a, 3);
                                ((ahea)o).i(agnj);
                                ((ahal)agnj.a).B(a, 4);
                            }
                        }
                        else {
                            agnj.d(a, (ahab)o);
                        }
                    }
                    else {
                        agnj.h(a, (long)o);
                    }
                }
                else {
                    agnj.l(a, (long)o);
                }
            }
        }
    }
}
