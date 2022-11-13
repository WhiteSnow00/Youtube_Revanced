import com.google.android.libraries.youtube.infocards.factories.InfoCardCollection;
import android.content.Context;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class isv implements iss
{
    public final atke a;
    private final Activity b;
    private ist c;
    
    public isv(final Activity b, final atke a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final ist a() {
        if (this.c == null) {
            final uyy uyy = (uyy)this.a.a();
            uyy.getClass();
            final ist c = new ist("", new iso(uyy, 3));
            this.c = c;
            ((qkq)c).e = agx.a((Context)this.b, 2131232768);
            this.c();
        }
        final ist c2 = this.c;
        c2.getClass();
        return c2;
    }
    
    public final void c() {
        final ist c = this.c;
        if (c == null) {
            return;
        }
        final InfoCardCollection c2 = ((uyy)this.a.a()).c;
        if (c2 != null) {
            ((qkq)c).c = c2.a().toString();
            c.g(true);
            return;
        }
        ((qkq)c).c = "";
        c.g(false);
    }
    
    @Override
    public final void oO() {
        this.c = null;
    }
    
    @Override
    public final boolean oP() {
        return false;
    }
    
    @Override
    public final String oQ() {
        return "menu_item_infocards";
    }
}
