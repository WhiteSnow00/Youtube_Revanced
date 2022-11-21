// 
// Decompiled by Procyon v0.6.0
// 

public final class ayx
{
    public CharSequence a;
    public CharSequence b;
    public CharSequence c;
    public CharSequence d;
    public CharSequence e;
    public byte[] f;
    public Integer g;
    public Integer h;
    public Integer i;
    public Integer j;
    public Integer k;
    public Integer l;
    public Integer m;
    public Integer n;
    public Integer o;
    public CharSequence p;
    public CharSequence q;
    public CharSequence r;
    public CharSequence s;
    public CharSequence t;
    
    public ayx() {
    }
    
    public ayx(final ayy ayy) {
        this.a = ayy.b;
        this.b = ayy.c;
        this.c = ayy.d;
        this.d = ayy.e;
        this.e = ayy.f;
        this.f = ayy.g;
        this.g = ayy.h;
        this.h = ayy.i;
        this.i = ayy.j;
        this.j = ayy.l;
        this.k = ayy.m;
        this.l = ayy.n;
        this.m = ayy.o;
        this.n = ayy.p;
        this.o = ayy.q;
        this.p = ayy.r;
        this.q = ayy.s;
        this.r = ayy.t;
        this.s = ayy.u;
        this.t = ayy.v;
    }
    
    public final ayy a() {
        return new ayy(this);
    }
    
    public final void b(final byte[] array, final int n) {
        if (this.f != null) {
            final Integer value = 3;
            if (!baz.aa(n, value)) {
                if (baz.aa(this.g, value)) {
                    return;
                }
            }
        }
        this.f = array.clone();
        this.g = n;
    }
    
    public final void c(final byte[] array, final Integer g) {
        this.f = array.clone();
        this.g = g;
    }
}
