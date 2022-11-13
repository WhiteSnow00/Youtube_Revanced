import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class isx implements iss
{
    public final bu a;
    public abcq b;
    private final tmx c;
    private final xnt d;
    private final ftk e;
    private ist f;
    private boolean g;
    
    public isx(final bu a, final tmx c, final xnt d, final ftk e) {
        this.a = a;
        c.getClass();
        this.c = c;
        d.getClass();
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final ist a() {
        this.c();
        if (this.f == null) {
            final ist f = new ist(this.a.getResources().getString(2132019679), new iso(this, 6));
            this.f = f;
            ((qkq)f).e = agx.a((Context)this.a, 2131231861);
            this.f.g(this.g);
        }
        return this.f;
    }
    
    public final void c() {
        teu.n((aun)this.a, this.c.a(), (ttg)new hui(this, 15), (ttg)new hui(this, 16));
    }
    
    public final void d() {
        final xnt d = this.d;
        if (d.f() == 1) {
            final xnm g = d.g();
            if (g != null) {
                g.ah();
            }
        }
        else {
            final abcq b = this.b;
            if (b != null) {
                b.g();
            }
        }
    }
    
    public final void f(final boolean g) {
        this.g = g;
        final ist f = this.f;
        if (f != null) {
            f.g(g);
        }
        this.e.a("menu_item_stats", this.g);
    }
    
    @Override
    public final void oO() {
        this.f = null;
    }
    
    @Override
    public final boolean oP() {
        return false;
    }
    
    @Override
    public final String oQ() {
        return "menu_item_stats";
    }
}
