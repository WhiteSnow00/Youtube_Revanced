// 
// Decompiled by Procyon v0.6.0
// 

public enum fkr
{
    a("NONE", 0), 
    b("HIDDEN", 1), 
    c("WATCH_WHILE_MINIMIZED", 2), 
    d("WATCH_WHILE_MAXIMIZED", 3), 
    e("WATCH_WHILE_FULLSCREEN", 4), 
    f("WATCH_WHILE_SLIDING_MAXIMIZED_FULLSCREEN", 5), 
    g("WATCH_WHILE_SLIDING_MINIMIZED_MAXIMIZED", 6), 
    h("WATCH_WHILE_SLIDING_MINIMIZED_DISMISSED", 7), 
    i("WATCH_WHILE_SLIDING_FULLSCREEN_DISMISSED", 8), 
    j("INLINE_MINIMAL", 9), 
    k("VIRTUAL_REALITY_FULLSCREEN", 10), 
    l("WATCH_WHILE_PICTURE_IN_PICTURE", 11);
    
    private static final fkr[] m;
    
    private fkr(final String s, final int n) {
    }
    
    public final boolean a() {
        final fkr a = fkr.a;
        boolean b = true;
        if (this != a) {
            if (!this.c()) {
                if (!this.i()) {
                    return false;
                }
                b = b;
            }
            else {
                b = false;
            }
        }
        return b;
    }
    
    public final boolean b() {
        return !this.f() && this.c() && this.i();
    }
    
    public final boolean c() {
        return this == fkr.e || this == fkr.k || this == fkr.l;
    }
    
    public final boolean d() {
        return this == fkr.a || this.e();
    }
    
    public final boolean e() {
        return this == fkr.j;
    }
    
    public final boolean f() {
        return this == fkr.l;
    }
    
    public final boolean g() {
        return this != fkr.a && this != fkr.b;
    }
    
    public final boolean h() {
        return this == fkr.k;
    }
    
    public final boolean i() {
        return this == fkr.c || this == fkr.d || this == fkr.e || this == fkr.f || this == fkr.g || this == fkr.h || this == fkr.i || this == fkr.l;
    }
    
    public final boolean j() {
        return this == fkr.f || this == fkr.i;
    }
    
    public final boolean k() {
        return this == fkr.d || this == fkr.e;
    }
    
    public final boolean l() {
        return this.k() || this == fkr.f;
    }
    
    public final boolean m() {
        return this == fkr.c || this == fkr.h;
    }
    
    public final boolean n() {
        return this.m() || this.o();
    }
    
    public final boolean o() {
        return this == fkr.g || this == fkr.h || this == fkr.f || this == fkr.i;
    }
}
