// 
// Decompiled by Procyon v0.6.0
// 

public enum fkk
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
    
    private fkk(final String s, final int n) {
    }
    
    public final boolean a() {
        final fkk a = fkk.a;
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
        return this == fkk.e || this == fkk.k || this == fkk.l;
    }
    
    public final boolean d() {
        return this == fkk.a || this.e();
    }
    
    public final boolean e() {
        return this == fkk.j;
    }
    
    public final boolean f() {
        return this == fkk.l;
    }
    
    public final boolean g() {
        return this != fkk.a && this != fkk.b;
    }
    
    public final boolean h() {
        return this == fkk.k;
    }
    
    public final boolean i() {
        return this == fkk.c || this == fkk.d || this == fkk.e || this == fkk.f || this == fkk.g || this == fkk.h || this == fkk.i || this == fkk.l;
    }
    
    public final boolean j() {
        return this == fkk.f || this == fkk.i;
    }
    
    public final boolean k() {
        return this == fkk.d || this == fkk.e;
    }
    
    public final boolean l() {
        return this.k() || this == fkk.f;
    }
    
    public final boolean m() {
        return this == fkk.c || this == fkk.h;
    }
    
    public final boolean n() {
        return this.m() || this.o();
    }
    
    public final boolean o() {
        return this == fkk.g || this == fkk.h || this == fkk.f || this == fkk.i;
    }
}
