import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ae
{
    public int a;
    public int[] b;
    public int[] c;
    public float[] d;
    public int e;
    public int f;
    public boolean g;
    public final cdn h;
    private final af i;
    private int j;
    
    public ae(final af i, final cdn h, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = 0;
        this.j = 8;
        this.b = new int[8];
        this.c = new int[8];
        this.d = new float[8];
        this.e = -1;
        this.f = -1;
        this.g = false;
        this.i = i;
        this.h = h;
    }
    
    public final float a(final ai ai) {
        for (int e = this.e, n = 0; e != -1 && n < this.a; e = this.c[e], ++n) {
            if (this.b[e] == ai.a) {
                return this.d[e];
            }
        }
        return 0.0f;
    }
    
    final float b(final int n) {
        for (int e = this.e, n2 = 0; e != -1 && n2 < this.a; e = this.c[e], ++n2) {
            if (n2 == n) {
                return this.d[e];
            }
        }
        return 0.0f;
    }
    
    public final float c(final ai ai) {
        int e = this.e;
        if (e != -1) {
            int n = 0;
            int n2 = -1;
            while (e != -1 && n < this.a) {
                final int n3 = this.b[e];
                if (n3 == ai.a) {
                    if (e == this.e) {
                        this.e = this.c[e];
                    }
                    else {
                        final int[] c = this.c;
                        c[n2] = c[e];
                    }
                    ((ai[])this.h.c)[n3].a(this.i);
                    --this.a;
                    this.b[e] = -1;
                    if (this.g) {
                        this.f = e;
                    }
                    return this.d[e];
                }
                final int n4 = this.c[e];
                ++n;
                n2 = e;
                e = n4;
            }
        }
        return 0.0f;
    }
    
    final ai d(int n) {
        for (int e = this.e, n2 = 0; e != -1 && n2 < this.a; e = this.c[e], ++n2) {
            if (n2 == n) {
                final Object c = this.h.c;
                n = this.b[e];
                return ((ai[])c)[n];
            }
        }
        return null;
    }
    
    public final void e(final ai ai, float n) {
        if (n == 0.0f) {
            return;
        }
        int e = this.e;
        if (e == -1) {
            this.e = 0;
            this.d[0] = n;
            this.b[0] = ai.a;
            this.c[0] = -1;
            ++this.a;
            if (!this.g) {
                ++this.f;
            }
            return;
        }
        int n2 = 0;
        int n3 = -1;
        while (e != -1 && n2 < this.a) {
            final int n4 = this.b[e];
            final int a = ai.a;
            if (n4 == a) {
                final float[] d = this.d;
                n += d[e];
                d[e] = n;
                if (n == 0.0f) {
                    if (e == this.e) {
                        this.e = this.c[e];
                    }
                    else {
                        final int[] c = this.c;
                        c[n3] = c[e];
                    }
                    ((ai[])this.h.c)[n4].a(this.i);
                    if (this.g) {
                        this.f = e;
                    }
                    --this.a;
                }
                return;
            }
            if (n4 < a) {
                n3 = e;
            }
            e = this.c[e];
            ++n2;
        }
        final int f = this.f;
        int length;
        if (this.g) {
            final int[] b = this.b;
            length = f;
            if (b[f] != -1) {
                length = b.length;
            }
        }
        else {
            length = f + 1;
        }
        final int length2 = this.b.length;
        int n5;
        if ((n5 = length) >= length2) {
            n5 = length;
            if (this.a < length2) {
                int n6 = 0;
                while (true) {
                    final int[] b2 = this.b;
                    n5 = length;
                    if (n6 >= b2.length) {
                        break;
                    }
                    if (b2[n6] == -1) {
                        n5 = n6;
                        break;
                    }
                    ++n6;
                }
            }
        }
        final int length3 = this.b.length;
        int e2;
        if ((e2 = n5) >= length3) {
            final int j = this.j;
            final int i = j + j;
            this.j = i;
            this.g = false;
            this.f = length3 - 1;
            this.d = Arrays.copyOf(this.d, i);
            this.b = Arrays.copyOf(this.b, this.j);
            this.c = Arrays.copyOf(this.c, this.j);
            e2 = length3;
        }
        final int[] b3 = this.b;
        b3[e2] = ai.a;
        this.d[e2] = n;
        if (n3 != -1) {
            final int[] c2 = this.c;
            c2[e2] = c2[n3];
            c2[n3] = e2;
        }
        else {
            this.c[e2] = this.e;
            this.e = e2;
        }
        ++this.a;
        if (!this.g) {
            ++this.f;
        }
        final int f2 = this.f;
        final int length4 = b3.length;
        if (f2 >= length4) {
            this.g = true;
            this.f = length4 - 1;
        }
    }
    
    public final void f(final ai ai, final float n) {
        if (n == 0.0f) {
            this.c(ai);
            return;
        }
        int e = this.e;
        if (e == -1) {
            this.e = 0;
            this.d[0] = n;
            this.b[0] = ai.a;
            this.c[0] = -1;
            ++this.a;
            if (!this.g) {
                ++this.f;
            }
            return;
        }
        int n2 = 0;
        int n3 = -1;
        while (e != -1 && n2 < this.a) {
            final int n4 = this.b[e];
            final int a = ai.a;
            if (n4 == a) {
                this.d[e] = n;
                return;
            }
            if (n4 < a) {
                n3 = e;
            }
            e = this.c[e];
            ++n2;
        }
        final int f = this.f;
        int length;
        if (this.g) {
            final int[] b = this.b;
            length = f;
            if (b[f] != -1) {
                length = b.length;
            }
        }
        else {
            length = f + 1;
        }
        final int length2 = this.b.length;
        int n5;
        if ((n5 = length) >= length2) {
            n5 = length;
            if (this.a < length2) {
                int n6 = 0;
                while (true) {
                    final int[] b2 = this.b;
                    n5 = length;
                    if (n6 >= b2.length) {
                        break;
                    }
                    if (b2[n6] == -1) {
                        n5 = n6;
                        break;
                    }
                    ++n6;
                }
            }
        }
        final int length3 = this.b.length;
        int e2;
        if ((e2 = n5) >= length3) {
            final int j = this.j;
            final int i = j + j;
            this.j = i;
            this.g = false;
            this.f = length3 - 1;
            this.d = Arrays.copyOf(this.d, i);
            this.b = Arrays.copyOf(this.b, this.j);
            this.c = Arrays.copyOf(this.c, this.j);
            e2 = length3;
        }
        final int[] b3 = this.b;
        b3[e2] = ai.a;
        this.d[e2] = n;
        if (n3 != -1) {
            final int[] c = this.c;
            c[e2] = c[n3];
            c[n3] = e2;
        }
        else {
            this.c[e2] = this.e;
            this.e = e2;
        }
        final int a2 = this.a + 1;
        this.a = a2;
        if (!this.g) {
            ++this.f;
        }
        if (a2 >= b3.length) {
            this.g = true;
        }
    }
    
    final void g(final af af, final af af2) {
        int n = this.e;
    Label_0005:
        while (true) {
            for (int n2 = 0; n != -1 && n2 < this.a; n = this.c[n], ++n2) {
                final int n3 = this.b[n];
                final ai a = af2.a;
                if (n3 == a.a) {
                    final float n4 = this.d[n];
                    this.c(a);
                    final ae d = af2.d;
                    for (int e = d.e, n5 = 0; e != -1 && n5 < d.a; e = d.c[e], ++n5) {
                        this.e(((ai[])this.h.c)[d.b[e]], d.d[e] * n4);
                    }
                    af.b += af2.b * n4;
                    af2.a.a(af);
                    n = this.e;
                    continue Label_0005;
                }
            }
            break;
        }
    }
    
    @Override
    public final String toString() {
        int e = this.e;
        String concat = "";
        for (int n = 0; e != -1 && n < this.a; e = this.c[e], ++n) {
            final StringBuilder sb = new StringBuilder();
            sb.append(concat.concat(" -> "));
            sb.append(this.d[e]);
            sb.append(" : ");
            final String string = sb.toString();
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(string);
            final ai ai = ((ai[])this.h.c)[this.b[e]];
            sb2.append(ai);
            concat = string.concat(String.valueOf(ai));
        }
        return concat;
    }
}
