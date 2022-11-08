import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class af
{
    public ai a;
    public float b;
    boolean c;
    public final ae d;
    boolean e;
    
    public af(final cdn cdn, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = null;
        this.b = 0.0f;
        this.c = false;
        this.e = false;
        this.d = new ae(this, cdn, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public final void a(final ai a) {
        final ai a2 = this.a;
        if (a2 != null) {
            this.d.f(a2, -1.0f);
            this.a = null;
        }
        final float n = -this.d.c(a);
        this.a = a;
        if (n == 1.0f) {
            return;
        }
        this.b /= n;
        final ae d = this.d;
        for (int e = d.e, n2 = 0; e != -1 && n2 < d.a; e = d.c[e], ++n2) {
            final float[] d2 = d.d;
            d2[e] /= n;
        }
    }
    
    final void b() {
        final ae d = this.d;
        for (int e = d.e, n = 0; e != -1 && n < d.a; e = d.c[e], ++n) {
            final ai ai = ((ai[])d.h.c)[d.b[e]];
            int n2 = 0;
            while (true) {
                final int g = ai.g;
                if (n2 >= g) {
                    final af[] f = ai.f;
                    final int length = f.length;
                    if (g >= length) {
                        ai.f = Arrays.copyOf(f, length + length);
                    }
                    final af[] f2 = ai.f;
                    final int g2 = ai.g;
                    f2[g2] = this;
                    ai.g = g2 + 1;
                    break;
                }
                if (ai.f[n2] == this) {
                    break;
                }
                ++n2;
            }
        }
    }
    
    public final void c(final ai ai, final ai ai2) {
        this.d.f(ai, 1.0f);
        this.d.f(ai2, -1.0f);
    }
    
    final void d(final ai ai, final ai ai2, final int n, final float n2, final ai ai3, final ai ai4, final int n3) {
        if (ai2 == ai3) {
            this.d.f(ai, 1.0f);
            this.d.f(ai4, 1.0f);
            this.d.f(ai2, -2.0f);
            return;
        }
        if (n2 == 0.5f) {
            this.d.f(ai, 1.0f);
            this.d.f(ai2, -1.0f);
            this.d.f(ai3, -1.0f);
            this.d.f(ai4, 1.0f);
            if (n > 0 || n3 > 0) {
                this.b = (float)(-n + n3);
            }
        }
        else {
            if (n2 <= 0.0f) {
                this.d.f(ai, -1.0f);
                this.d.f(ai2, 1.0f);
                this.b = (float)n;
                return;
            }
            if (n2 >= 1.0f) {
                this.d.f(ai3, -1.0f);
                this.d.f(ai4, 1.0f);
                this.b = (float)n3;
                return;
            }
            final float n4 = 1.0f - n2;
            this.d.f(ai, n4);
            this.d.f(ai2, -n4);
            this.d.f(ai3, -n2);
            this.d.f(ai4, n2);
            if (n > 0 || n3 > 0) {
                this.b = -n * n4 + n3 * n2;
            }
        }
    }
    
    public final void e(final ai ai, final ai ai2, final ai ai3, final ai ai4, final float n) {
        this.d.f(ai, -1.0f);
        this.d.f(ai2, 1.0f);
        this.d.f(ai3, n);
        this.d.f(ai4, -n);
    }
    
    public final void f(float n, final float n2, final float n3, final ai ai, final int n4, final ai ai2, final int n5, final ai ai3, final int n6, final ai ai4, final int n7) {
        if (n2 != 0.0f && n != n3) {
            n = n / n2 / (n3 / n2);
            this.b = -n4 - n5 + n6 * n + n7 * n;
            this.d.f(ai, 1.0f);
            this.d.f(ai2, -1.0f);
            this.d.f(ai4, n);
            this.d.f(ai3, -n);
            return;
        }
        this.b = (float)(-n4 - n5 + n6 + n7);
        this.d.f(ai, 1.0f);
        this.d.f(ai2, -1.0f);
        this.d.f(ai4, 1.0f);
        this.d.f(ai3, -1.0f);
    }
    
    public final void g(final ai ai, final int n) {
        if (n < 0) {
            this.b = (float)(-n);
            this.d.f(ai, 1.0f);
            return;
        }
        this.b = (float)n;
        this.d.f(ai, -1.0f);
    }
    
    public final void h(final ai ai, final ai ai2, int n) {
        if (n != 0) {
            boolean b;
            if (n < 0) {
                n = -n;
                b = true;
            }
            else {
                b = false;
            }
            this.b = (float)n;
            if (b) {
                this.d.f(ai, 1.0f);
                this.d.f(ai2, -1.0f);
                return;
            }
        }
        this.d.f(ai, -1.0f);
        this.d.f(ai2, 1.0f);
    }
    
    public final void i(final ai ai, final ai ai2, final ai ai3, int n) {
        if (n != 0) {
            int n2;
            if (n < 0) {
                n2 = -n;
                n = 1;
            }
            else {
                final int n3 = 0;
                n2 = n;
                n = n3;
            }
            this.b = (float)n2;
            if (n != 0) {
                this.d.f(ai, 1.0f);
                this.d.f(ai2, -1.0f);
                this.d.f(ai3, -1.0f);
                return;
            }
        }
        this.d.f(ai, -1.0f);
        this.d.f(ai2, 1.0f);
        this.d.f(ai3, 1.0f);
    }
    
    public final void j(final ai ai, final ai ai2, final ai ai3, int n) {
        if (n != 0) {
            boolean b;
            if (n < 0) {
                n = -n;
                b = true;
            }
            else {
                b = false;
            }
            this.b = (float)n;
            if (b) {
                this.d.f(ai, 1.0f);
                this.d.f(ai2, -1.0f);
                this.d.f(ai3, 1.0f);
                return;
            }
        }
        this.d.f(ai, -1.0f);
        this.d.f(ai2, 1.0f);
        this.d.f(ai3, -1.0f);
    }
    
    public final void k(final af af) {
        this.d.g(this, af);
    }
    
    @Override
    public final String toString() {
        String concat;
        if (this.a == null) {
            concat = "0";
        }
        else {
            final StringBuilder sb = new StringBuilder("");
            final ai a = this.a;
            sb.append(a);
            concat = "".concat(String.valueOf(a));
        }
        String s = concat.concat(" = ");
        final float b = this.b;
        int i = 0;
        int n;
        if (b != 0.0f) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(s);
            sb2.append(this.b);
            s = sb2.toString();
            n = 1;
        }
        else {
            n = 0;
        }
        while (i < this.d.a) {
            if (this.d.d(i) != null) {
                final float b2 = this.d.b(i);
                String s2 = null;
                float n2 = 0.0f;
                Label_0202: {
                    if (n == 0) {
                        s2 = s;
                        n2 = b2;
                        if (b2 >= 0.0f) {
                            break Label_0202;
                        }
                        s2 = s.concat("- ");
                    }
                    else {
                        if (b2 > 0.0f) {
                            s2 = s.concat(" + ");
                            n2 = b2;
                            break Label_0202;
                        }
                        s2 = s.concat(" - ");
                    }
                    n2 = -b2;
                }
                if (n2 == 1.0f) {
                    s = s2.concat("null");
                }
                else {
                    final StringBuilder sb3 = new StringBuilder();
                    sb3.append(s2);
                    sb3.append(n2);
                    sb3.append(" null");
                    s = sb3.toString();
                }
                n = 1;
            }
            ++i;
        }
        String concat2 = s;
        if (n == 0) {
            concat2 = s.concat("0.0");
        }
        return concat2;
    }
}
