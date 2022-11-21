import java.util.Comparator;
import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acn extends ack
{
    public int f;
    final acm g;
    private aco[] h;
    private aco[] i;
    
    public acn(final cdr cdr, final byte[] array, final byte[] array2) {
        super(cdr, null, null);
        this.h = new aco[128];
        this.i = new aco[128];
        this.f = 0;
        this.g = new acm(this);
    }
    
    @Override
    public final void d(final acl acl, final ack ack, final boolean b) {
        final aco a = ack.a;
        if (a == null) {
            return;
        }
        final acj e = ack.e;
        for (int a2 = e.a, i = 0; i < a2; ++i) {
            final aco d = e.d(i);
            final float b2 = e.b(i);
            final acm g = this.g;
            g.a = d;
            if (g.a.b) {
                boolean b3 = true;
                for (int j = 0; j < 9; ++j) {
                    final float[] k = g.a.i;
                    final float n = k[j] + a.i[j] * b2;
                    k[j] = n;
                    if (Math.abs(n) < 1.0E-4f) {
                        g.a.i[j] = 0.0f;
                    }
                    else {
                        b3 = false;
                    }
                }
                if (b3) {
                    g.b.n(g.a);
                }
            }
            else {
                for (int l = 0; l < 9; ++l) {
                    final float n2 = a.i[l];
                    if (n2 != 0.0f) {
                        float n3;
                        if (Math.abs(n3 = n2 * b2) < 1.0E-4f) {
                            n3 = 0.0f;
                        }
                        g.a.i[l] = n3;
                    }
                    else {
                        g.a.i[l] = 0.0f;
                    }
                }
                this.m(d);
            }
            this.b += ack.b * b2;
        }
        this.n(a);
    }
    
    @Override
    public final boolean e() {
        return this.f == 0;
    }
    
    @Override
    public final aco k(final boolean[] array) {
        int i = 0;
        int n = -1;
        while (i < this.f) {
            final aco[] h = this.h;
            final aco a = h[i];
            int n2 = n;
            Label_0174: {
                if (!array[a.c]) {
                    final acm g = this.g;
                    g.a = a;
                    int n3 = 8;
                    if (n == -1) {
                        while (true) {
                            n2 = n;
                            if (n3 < 0) {
                                break Label_0174;
                            }
                            final float n4 = g.a.i[n3];
                            n2 = n;
                            if (n4 > 0.0f) {
                                break Label_0174;
                            }
                            if (n4 < 0.0f) {
                                break;
                            }
                            --n3;
                        }
                    }
                    else {
                        final aco aco = h[n];
                        while (true) {
                            n2 = n;
                            if (n3 < 0) {
                                break Label_0174;
                            }
                            final float n5 = aco.i[n3];
                            final float n6 = g.a.i[n3];
                            if (n6 == n5) {
                                --n3;
                            }
                            else {
                                n2 = n;
                                if (n6 < n5) {
                                    break;
                                }
                                break Label_0174;
                            }
                        }
                    }
                    n2 = i;
                }
            }
            ++i;
            n = n2;
        }
        if (n == -1) {
            return null;
        }
        return this.h[n];
    }
    
    public final void m(final aco aco) {
        final int f = this.f;
        final aco[] h = this.h;
        final int length = h.length;
        if (f + 1 > length) {
            final aco[] h2 = Arrays.copyOf(h, length + length);
            this.h = h2;
            final int length2 = h2.length;
            this.i = Arrays.copyOf(h2, length2 + length2);
        }
        final aco[] h3 = this.h;
        int f2 = this.f;
        h3[f2] = aco;
        ++f2;
        this.f = f2;
        if (f2 > 1 && h3[f2 - 1].c > aco.c) {
            final int n = 0;
            int n2 = 0;
            int f3;
            while (true) {
                f3 = this.f;
                if (n2 >= f3) {
                    break;
                }
                this.i[n2] = this.h[n2];
                ++n2;
            }
            Arrays.sort(this.i, 0, f3, (Comparator<? super aco>)new mn(2));
            for (int i = n; i < this.f; ++i) {
                this.h[i] = this.i[i];
            }
        }
        aco.b = true;
        aco.a(this);
    }
    
    public final void n(final aco aco) {
        for (int i = 0; i < this.f; ++i) {
            if (this.h[i] == aco) {
                int f;
                while (true) {
                    f = this.f - 1;
                    if (i >= f) {
                        break;
                    }
                    final aco[] h = this.h;
                    final int n = i + 1;
                    h[i] = h[n];
                    i = n;
                }
                this.f = f;
                aco.b = false;
                return;
            }
        }
    }
    
    @Override
    public final String toString() {
        final float b = this.b;
        final StringBuilder sb = new StringBuilder(" goal -> (");
        sb.append(b);
        sb.append(") : ");
        String s = sb.toString();
        for (int i = 0; i < this.f; ++i) {
            final aco a = this.h[i];
            final acm g = this.g;
            g.a = a;
            final String value = String.valueOf(g);
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(s);
            sb2.append(value);
            sb2.append(" ");
            s = sb2.toString();
        }
        return s;
    }
}
