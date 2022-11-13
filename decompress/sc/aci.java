import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aci
{
    int a;
    public int[] b;
    public int[] c;
    public float[] d;
    public int e;
    protected final cdo f;
    private final acj g;
    private int h;
    private int i;
    private boolean j;
    
    public aci(final acj g, final cdo f, final byte[] array, final byte[] array2) {
        this.a = 0;
        this.h = 8;
        this.b = new int[8];
        this.c = new int[8];
        this.d = new float[8];
        this.e = -1;
        this.i = -1;
        this.j = false;
        this.g = g;
        this.f = f;
    }
    
    public final float a(final acn acn) {
        for (int e = this.e, n = 0; e != -1 && n < this.a; e = this.c[e], ++n) {
            if (this.b[e] == acn.c) {
                return this.d[e];
            }
        }
        return 0.0f;
    }
    
    public final float b(final int n) {
        for (int e = this.e, n2 = 0; e != -1 && n2 < this.a; e = this.c[e], ++n2) {
            if (n2 == n) {
                return this.d[e];
            }
        }
        return 0.0f;
    }
    
    public final float c(final acn acn, final boolean b) {
        int e = this.e;
        if (e != -1) {
            int n = 0;
            int n2 = -1;
            while (e != -1 && n < this.a) {
                if (this.b[e] == acn.c) {
                    if (e == this.e) {
                        this.e = this.c[e];
                    }
                    else {
                        final int[] c = this.c;
                        c[n2] = c[e];
                    }
                    if (b) {
                        acn.b(this.g);
                    }
                    --acn.l;
                    --this.a;
                    this.b[e] = -1;
                    if (this.j) {
                        this.i = e;
                    }
                    return this.d[e];
                }
                final int n3 = this.c[e];
                ++n;
                n2 = e;
                e = n3;
            }
        }
        return 0.0f;
    }
    
    public final acn d(int n) {
        for (int e = this.e, n2 = 0; e != -1 && n2 < this.a; e = this.c[e], ++n2) {
            if (n2 == n) {
                final Object c = this.f.c;
                n = this.b[e];
                return ((acn[])c)[n];
            }
        }
        return null;
    }
    
    public final void e(final acn acn, float n, final boolean b) {
        if (n > -0.001f && n < 0.001f) {
            return;
        }
        int e = this.e;
        if (e == -1) {
            this.e = 0;
            this.d[0] = n;
            this.b[0] = acn.c;
            this.c[0] = -1;
            ++acn.l;
            acn.a(this.g);
            ++this.a;
            if (!this.j) {
                final int i = this.i + 1;
                this.i = i;
                final int length = this.b.length;
                if (i >= length) {
                    this.j = true;
                    this.i = length - 1;
                }
            }
            return;
        }
        int n2 = 0;
        int n3 = -1;
        while (e != -1 && n2 < this.a) {
            final int n4 = this.b[e];
            final int c = acn.c;
            if (n4 == c) {
                final float[] d = this.d;
                final float n5 = n += d[e];
                if (n5 > -0.001f) {
                    n = n5;
                    if (n5 < 0.001f) {
                        n = 0.0f;
                    }
                }
                d[e] = n;
                if (n == 0.0f) {
                    if (e == this.e) {
                        this.e = this.c[e];
                    }
                    else {
                        final int[] c2 = this.c;
                        c2[n3] = c2[e];
                    }
                    if (b) {
                        acn.b(this.g);
                    }
                    if (this.j) {
                        this.i = e;
                    }
                    --acn.l;
                    --this.a;
                }
                return;
            }
            if (n4 < c) {
                n3 = e;
            }
            e = this.c[e];
            ++n2;
        }
        final int j = this.i;
        int length2;
        if (this.j) {
            final int[] b2 = this.b;
            length2 = j;
            if (b2[j] != -1) {
                length2 = b2.length;
            }
        }
        else {
            length2 = j + 1;
        }
        final int length3 = this.b.length;
        int n6;
        if ((n6 = length2) >= length3) {
            n6 = length2;
            if (this.a < length3) {
                int n7 = 0;
                while (true) {
                    final int[] b3 = this.b;
                    n6 = length2;
                    if (n7 >= b3.length) {
                        break;
                    }
                    if (b3[n7] == -1) {
                        n6 = n7;
                        break;
                    }
                    ++n7;
                }
            }
        }
        final int length4 = this.b.length;
        int e2;
        if ((e2 = n6) >= length4) {
            final int h = this.h;
            final int h2 = h + h;
            this.h = h2;
            this.j = false;
            this.i = length4 - 1;
            this.d = Arrays.copyOf(this.d, h2);
            this.b = Arrays.copyOf(this.b, this.h);
            this.c = Arrays.copyOf(this.c, this.h);
            e2 = length4;
        }
        this.b[e2] = acn.c;
        this.d[e2] = n;
        if (n3 != -1) {
            final int[] c3 = this.c;
            c3[e2] = c3[n3];
            c3[n3] = e2;
        }
        else {
            this.c[e2] = this.e;
            this.e = e2;
        }
        ++acn.l;
        acn.a(this.g);
        ++this.a;
        if (!this.j) {
            ++this.i;
        }
        final int k = this.i;
        final int length5 = this.b.length;
        if (k >= length5) {
            this.j = true;
            this.i = length5 - 1;
        }
    }
    
    public final void f() {
        for (int e = this.e, n = 0; e != -1 && n < this.a; e = this.c[e], ++n) {
            final acn acn = ((acn[])this.f.c)[this.b[e]];
            if (acn != null) {
                acn.b(this.g);
            }
        }
        this.e = -1;
        this.i = -1;
        this.j = false;
        this.a = 0;
    }
    
    public final void g(final acn acn, final float n) {
        if (n == 0.0f) {
            this.c(acn, true);
            return;
        }
        int e = this.e;
        if (e == -1) {
            this.e = 0;
            this.d[0] = n;
            this.b[0] = acn.c;
            this.c[0] = -1;
            ++acn.l;
            acn.a(this.g);
            ++this.a;
            if (!this.j) {
                final int i = this.i + 1;
                this.i = i;
                final int length = this.b.length;
                if (i >= length) {
                    this.j = true;
                    this.i = length - 1;
                }
            }
            return;
        }
        int n2 = 0;
        int n3 = -1;
        while (e != -1 && n2 < this.a) {
            final int n4 = this.b[e];
            final int c = acn.c;
            if (n4 == c) {
                this.d[e] = n;
                return;
            }
            if (n4 < c) {
                n3 = e;
            }
            e = this.c[e];
            ++n2;
        }
        final int j = this.i;
        int length2;
        if (this.j) {
            final int[] b = this.b;
            length2 = j;
            if (b[j] != -1) {
                length2 = b.length;
            }
        }
        else {
            length2 = j + 1;
        }
        final int length3 = this.b.length;
        int n5;
        if ((n5 = length2) >= length3) {
            n5 = length2;
            if (this.a < length3) {
                int n6 = 0;
                while (true) {
                    final int[] b2 = this.b;
                    n5 = length2;
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
        final int length4 = this.b.length;
        int e2;
        if ((e2 = n5) >= length4) {
            final int h = this.h;
            final int h2 = h + h;
            this.h = h2;
            this.j = false;
            this.i = length4 - 1;
            this.d = Arrays.copyOf(this.d, h2);
            this.b = Arrays.copyOf(this.b, this.h);
            this.c = Arrays.copyOf(this.c, this.h);
            e2 = length4;
        }
        this.b[e2] = acn.c;
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
        ++acn.l;
        acn.a(this.g);
        final int a = this.a + 1;
        this.a = a;
        if (!this.j) {
            ++this.i;
        }
        final int length5 = this.b.length;
        if (a >= length5) {
            this.j = true;
        }
        if (this.i >= length5) {
            this.j = true;
            this.i = length5 - 1;
        }
    }
    
    @Override
    public final String toString() {
        int e = this.e;
        int n = 0;
        String concat = "";
        while (e != -1 && n < this.a) {
            final String concat2 = concat.concat(" -> ");
            final float n2 = this.d[e];
            final StringBuilder sb = new StringBuilder();
            sb.append(concat2);
            sb.append(n2);
            sb.append(" : ");
            concat = sb.toString().concat(String.valueOf(String.valueOf(((acn[])this.f.c)[this.b[e]])));
            e = this.c[e];
            ++n;
        }
        return concat;
    }
}
