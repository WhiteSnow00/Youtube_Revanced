// 
// Decompiled by Procyon v0.6.0
// 

public final class adwj
{
    public adwb a;
    public adwb b;
    public adwb c;
    public adwb d;
    public adwd e;
    public adwd f;
    public adwd g;
    public adwd h;
    public adwd i;
    public adwd j;
    public adwd k;
    public adwd l;
    
    public adwj() {
        this.i = adwd.ai();
        this.j = adwd.ai();
        this.k = adwd.ai();
        this.l = adwd.ai();
        this.a = (adwb)new advz(0.0f);
        this.b = (adwb)new advz(0.0f);
        this.c = (adwb)new advz(0.0f);
        this.d = (adwb)new advz(0.0f);
        this.e = adwd.ac();
        this.f = adwd.ac();
        this.g = adwd.ac();
        this.h = adwd.ac();
    }
    
    public adwj(final adwk adwk) {
        this.i = adwd.ai();
        this.j = adwd.ai();
        this.k = adwd.ai();
        this.l = adwd.ai();
        this.a = (adwb)new advz(0.0f);
        this.b = (adwb)new advz(0.0f);
        this.c = (adwb)new advz(0.0f);
        this.d = (adwb)new advz(0.0f);
        this.e = adwd.ac();
        this.f = adwd.ac();
        this.g = adwd.ac();
        this.h = adwd.ac();
        this.i = adwk.j;
        this.j = adwk.k;
        this.k = adwk.l;
        this.l = adwk.m;
        this.a = adwk.b;
        this.b = adwk.c;
        this.c = adwk.d;
        this.d = adwk.e;
        this.e = adwk.f;
        this.f = adwk.g;
        this.g = adwk.h;
        this.h = adwk.i;
    }
    
    private static void k(final adwd adwd) {
        if (adwd instanceof adwi) {
            final float a = ((adwi)adwd).a;
            return;
        }
        if (adwd instanceof adwc) {
            final float a2 = ((adwc)adwd).a;
        }
    }
    
    public final adwk a() {
        return new adwk(this);
    }
    
    public final void b(final float n) {
        this.d = (adwb)new advz(n);
    }
    
    public final void c(final float n) {
        this.c = (adwb)new advz(n);
    }
    
    public final void d(final float n) {
        this.a = (adwb)new advz(n);
    }
    
    public final void e(final float n) {
        this.b = (adwb)new advz(n);
    }
    
    public final void f(final float n) {
        this.d(n);
        this.e(n);
        this.c(n);
        this.b(n);
    }
    
    public final void g(final adwd l) {
        k(this.l = l);
    }
    
    public final void h(final adwd k) {
        k(this.k = k);
    }
    
    public final void i(final adwd i) {
        k(this.i = i);
    }
    
    public final void j(final adwd j) {
        k(this.j = j);
    }
}
