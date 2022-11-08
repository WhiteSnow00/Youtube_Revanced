import android.text.Layout$Alignment;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bys
{
    public String a;
    public int b;
    public boolean c;
    public int d;
    public boolean e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public float k;
    public String l;
    public int m;
    public int n;
    public Layout$Alignment o;
    public Layout$Alignment p;
    public int q;
    public bym r;
    public float s;
    
    public bys() {
        this.f = -1;
        this.g = -1;
        this.h = -1;
        this.i = -1;
        this.j = -1;
        this.m = -1;
        this.n = -1;
        this.q = -1;
        this.s = Float.MAX_VALUE;
    }
    
    public final int a() {
        final int h = this.h;
        if (h == -1 && this.i == -1) {
            return -1;
        }
        int n = false ? 1 : 0;
        final boolean b = h == 1;
        if (this.i == 1) {
            n = 2;
        }
        return (b ? 1 : 0) | n;
    }
    
    public final void b(final int d) {
        this.d = d;
        this.e = true;
    }
    
    public final void c(final int b) {
        this.b = b;
        this.c = true;
    }
    
    public final void d(final bys bys) {
        if (bys != null) {
            if (!this.c && bys.c) {
                this.c(bys.b);
            }
            if (this.h == -1) {
                this.h = bys.h;
            }
            if (this.i == -1) {
                this.i = bys.i;
            }
            if (this.a == null) {
                final String a = bys.a;
                if (a != null) {
                    this.a = a;
                }
            }
            if (this.f == -1) {
                this.f = bys.f;
            }
            if (this.g == -1) {
                this.g = bys.g;
            }
            if (this.n == -1) {
                this.n = bys.n;
            }
            if (this.o == null) {
                final Layout$Alignment o = bys.o;
                if (o != null) {
                    this.o = o;
                }
            }
            if (this.p == null) {
                final Layout$Alignment p = bys.p;
                if (p != null) {
                    this.p = p;
                }
            }
            if (this.q == -1) {
                this.q = bys.q;
            }
            if (this.j == -1) {
                this.j = bys.j;
                this.k = bys.k;
            }
            if (this.r == null) {
                this.r = bys.r;
            }
            if (this.s == Float.MAX_VALUE) {
                this.s = bys.s;
            }
            if (!this.e && bys.e) {
                this.b(bys.d);
            }
            if (this.m == -1) {
                final int m = bys.m;
                if (m != -1) {
                    this.m = m;
                }
            }
        }
    }
}
