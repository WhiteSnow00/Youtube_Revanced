import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class isq implements abbh, iss
{
    public final bu a;
    public final isp b;
    public final ftk c;
    public boolean d;
    public String e;
    public ist f;
    
    public isq(final bu a, final isp b, final ftk c) {
        this.a = a;
        this.b = b;
        (this.c = c).a("menu_item_audio_track", false);
    }
    
    public final ist a() {
        if (this.f == null) {
            final ist f = new ist(this.a.getString(2132017513), new iso(this, 0));
            this.f = f;
            ((qkq)f).e = agx.a((Context)this.a, 2131233855);
            this.f.f(this.e);
            this.f.g(this.d);
        }
        return this.f;
    }
    
    public final void oO() {
    }
    
    public final boolean oP() {
        return false;
    }
    
    public final String oQ() {
        return "menu_item_audio_track";
    }
}
