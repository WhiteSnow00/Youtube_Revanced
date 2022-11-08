import android.content.Context;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ikn implements fwy
{
    public View a;
    private final Context b;
    private final acue c;
    private final zki d;
    private acug e;
    
    public ikn(final Context b, final acue c, final zki d) {
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final int c() {
        return 2800;
    }
    
    public final void d() {
    }
    
    public final void e() {
        if (this.a == null) {
            return;
        }
        final acue c = this.c;
        if (this.e == null) {
            final acuf a = c.a();
            final View a2 = this.a;
            a2.getClass();
            a.a = a2;
            a.c = this.b.getResources().getString(2132018904);
            a.m(1);
            a.f(2);
            a.f = (actk)new ibb(2);
            a.n(false);
            this.e = a.c();
        }
        c.c(this.e);
    }
    
    public final boolean f() {
        return this.d.t();
    }
}
