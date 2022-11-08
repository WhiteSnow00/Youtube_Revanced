import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahcc
{
    public static final ahcc a;
    public int b;
    public int[] c;
    public Object[] d;
    public int e;
    private boolean f;
    
    static {
        a = new ahcc(0, new int[0], new Object[0], false);
    }
    
    private ahcc() {
        this(0, new int[8], new Object[8], true);
    }
    
    private ahcc(final int b, final int[] c, final Object[] d, final boolean f) {
        this.e = -1;
        this.b = b;
        this.c = c;
        this.d = d;
        this.f = f;
    }
    
    static ahcc b(final ahcc ahcc, final ahcc ahcc2) {
        final int n = ahcc.b + ahcc2.b;
        final int[] copy = Arrays.copyOf(ahcc.c, n);
        System.arraycopy(ahcc2.c, 0, copy, ahcc.b, ahcc2.b);
        final Object[] copy2 = Arrays.copyOf(ahcc.d, n);
        System.arraycopy(ahcc2.d, 0, copy2, ahcc.b, ahcc2.b);
        return new ahcc(n, copy, copy2, true);
    }
    
    public static ahcc c() {
        return new ahcc();
    }
    
    public final int a() {
        final int e = this.e;
        if (e == -1) {
            int i = 0;
            int e2 = 0;
            while (i < this.b) {
                final int n = this.c[i];
                final int a = ahco.a(n);
                final int b = ahco.b(n);
                int n2;
                if (b != 0) {
                    if (b != 1) {
                        if (b != 2) {
                            if (b != 3) {
                                if (b != 5) {
                                    throw new IllegalStateException((Throwable)ahab.a());
                                }
                                ((Integer)this.d[i]).intValue();
                                n2 = agym.aA(a);
                            }
                            else {
                                final int ac = agym.ac(a);
                                n2 = ac + ac + ((ahcc)this.d[i]).a();
                            }
                        }
                        else {
                            n2 = agym.I(a, (agyc)this.d[i]);
                        }
                    }
                    else {
                        ((Long)this.d[i]).longValue();
                        n2 = agym.aB(a);
                    }
                }
                else {
                    n2 = agym.af(a, (long)this.d[i]);
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
        if (!(o instanceof ahcc)) {
            return false;
        }
        final ahcc ahcc = (ahcc)o;
        final int b = this.b;
        if (b == ahcc.b) {
            final int[] c = this.c;
            final int[] c2 = ahcc.c;
            for (int i = 0; i < b; ++i) {
                if (c[i] != c2[i]) {
                    return false;
                }
            }
            final Object[] d = this.d;
            final Object[] d2 = ahcc.d;
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
    
    final boolean h(final int n, final agyh agyh) {
        this.d();
        final int a = ahco.a(n);
        final int b = ahco.b(n);
        if (b == 0) {
            this.g(n, agyh.q());
            return true;
        }
        if (b == 1) {
            this.g(n, agyh.p());
            return true;
        }
        if (b == 2) {
            this.g(n, agyh.x());
            return true;
        }
        if (b == 3) {
            final ahcc ahcc = new ahcc();
            int n2;
            do {
                n2 = agyh.n();
            } while (n2 != 0 && ahcc.h(n2, agyh));
            agyh.B(ahco.c(a, 4));
            this.g(n, ahcc);
            return true;
        }
        if (b == 4) {
            return false;
        }
        if (b == 5) {
            this.g(n, agyh.h());
            return true;
        }
        throw ahab.a();
    }
    
    @Override
    public final int hashCode() {
        final int b = this.b;
        final int[] c = this.c;
        int n = 17;
        final int n2 = 0;
        int i = 0;
        int n3 = 17;
        while (i < b) {
            n3 = n3 * 31 + c[i];
            ++i;
        }
        final Object[] d = this.d;
        for (int b2 = this.b, j = n2; j < b2; ++j) {
            n = n * 31 + d[j].hashCode();
        }
        return ((b + 527) * 31 + n3) * 31 + n;
    }
    
    public final void i(final aglk aglk) {
        if (this.b != 0) {
            for (int i = 0; i < this.b; ++i) {
                final int n = this.c[i];
                final Object o = this.d[i];
                final int a = ahco.a(n);
                final int b = ahco.b(n);
                if (b != 0) {
                    if (b != 1) {
                        if (b != 2) {
                            if (b != 3) {
                                if (b != 5) {
                                    throw new RuntimeException((Throwable)ahab.a());
                                }
                                aglk.f(a, (int)o);
                            }
                            else {
                                ((agym)aglk.b).B(a, 3);
                                ((ahcc)o).i(aglk);
                                ((agym)aglk.b).B(a, 4);
                            }
                        }
                        else {
                            aglk.c(a, (agyc)o);
                        }
                    }
                    else {
                        aglk.g(a, (long)o);
                    }
                }
                else {
                    aglk.k(a, (long)o);
                }
            }
        }
    }
}
