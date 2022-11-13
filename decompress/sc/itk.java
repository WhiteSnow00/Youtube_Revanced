import app.revanced.integrations.patches.HideWatchinVRPatch;
import android.content.Context;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class itk implements aavk, iss
{
    public final wyw a;
    public aavj b;
    private final Activity c;
    private final ftk d;
    private ist e;
    private boolean f;
    
    public itk(final Activity c, final wyw a, final ftk d) {
        c.getClass();
        this.c = c;
        a.getClass();
        this.a = a;
        this.d = d;
        a.D((wzz)new wyt(xaa.c(47948)));
        d.a("menu_item_cardboard_vr", false);
    }
    
    public final ist a() {
        if (this.e == null) {
            final ist e = new ist(this.c.getString(2132020174), new iso(this, 13));
            this.e = e;
            ((qkq)e).e = tpe.k((Context)this.c, 2131233929, 2130970924);
            this.e.g(this.f);
        }
        final ist e2 = this.e;
        e2.getClass();
        return e2;
    }
    
    public final void c(final boolean f) {
        if (HideWatchinVRPatch.hideWatchinVR()) {
            return;
        }
        if (this.f == f) {
            return;
        }
        this.f = f;
        final ist e = this.e;
        if (e != null) {
            e.g(f);
        }
        this.a.D((wzz)new wyt(xaa.c(47948)));
        this.d.a("menu_item_cardboard_vr", f);
    }
    
    public final void oO() {
        this.e = null;
    }
    
    public final boolean oP() {
        return false;
    }
    
    public final String oQ() {
        return "menu_item_cardboard_vr";
    }
}
