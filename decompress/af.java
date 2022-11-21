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
    
    public af(final cdr cdr, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = null;
        this.b = 0.0f;
        this.c = false;
        this.e = false;
        this.d = new ae(this, cdr, (byte[])null, (byte[])null, (byte[])null);
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
    
    final void d(final ai ai, final ai ai2, int n, final float n2, final ai ai3, final ai ai4, final int n3) {
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
            final ae d = this.d;
            final float n4 = 1.0f - n2;
            d.f(ai, n4);
            this.d.f(ai2, -n4);
            this.d.f(ai3, -n2);
            this.d.f(ai4, n2);
            if (n > 0 || n3 > 0) {
                n = -n;
                this.b = n * n4 + n3 * n2;
            }
        }
    }
    
    public final void e(final ai ai, final ai ai2, final ai ai3, final ai ai4, float n) {
        this.d.f(ai, -1.0f);
        this.d.f(ai2, 1.0f);
        this.d.f(ai3, n);
        n = -n;
        this.d.f(ai4, n);
    }
    
    public final void f(float n, float n2, float n3, final ai ai, int n4, final ai ai2, final int n5, final ai ai3, final int n6, final ai ai4, final int n7) {
        if (n2 != 0.0f && n != n3) {
            n /= n2;
            final float n8 = n3 / n2;
            n4 = -n4;
            n2 = (float)n6;
            n3 = (float)n7;
            n /= n8;
            this.b = n4 - n5 + n2 * n + n3 * n;
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
        final float b = this.b;
        int i = 0;
        String s = concat.concat(" = ");
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
            String s2 = s;
            int n2 = n;
            if (this.d.d(i) != null) {
                final float b2 = this.d.b(i);
                String s3;
                float n3;
                if (n == 0) {
                    s3 = s;
                    n3 = b2;
                    if (b2 < 0.0f) {
                        n3 = -b2;
                        s3 = s.concat("- ");
                    }
                }
                else {
                    String s4;
                    if (b2 > 0.0f) {
                        s4 = " + ";
                        n3 = b2;
                    }
                    else {
                        n3 = -b2;
                        s4 = " - ";
                    }
                    s3 = s.concat(s4);
                }
                String s5;
                if (n3 == 1.0f) {
                    s5 = s3.concat("null");
                }
                else {
                    final StringBuilder sb3 = new StringBuilder();
                    sb3.append(s3);
                    sb3.append(n3);
                    sb3.append(" null");
                    s5 = sb3.toString();
                }
                n2 = 1;
                s2 = s5;
            }
            ++i;
            s = s2;
            n = n2;
        }
        String concat2 = s;
        if (n == 0) {
            concat2 = s.concat("0.0");
        }
        return concat2;
    }
}
