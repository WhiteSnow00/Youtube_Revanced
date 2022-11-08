import java.util.concurrent.TimeUnit;
import android.content.SharedPreferences;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fwt implements fwy, actk
{
    private static final long b;
    public View a;
    private final fwz c;
    private final SharedPreferences d;
    private final int e;
    private final String f;
    private final int g;
    private final acue h;
    private acug i;
    
    static {
        b = TimeUnit.DAYS.toMillis(1L);
    }
    
    public fwt(final fwz c, final SharedPreferences d, final int e, final String f, final int g, final acue h) {
        c.getClass();
        this.c = c;
        d.getClass();
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        h.getClass();
        this.h = h;
    }
    
    public final int c() {
        return this.e;
    }
    
    public final void d() {
        final acug i = this.i;
        if (i != null) {
            this.h.b(i);
        }
    }
    
    public final void e() {
        final View a = this.a;
        if (a == null) {
            return;
        }
        final acue h = this.h;
        final acuf a2 = h.a();
        a2.a = a;
        a2.c = a.getContext().getText(this.g);
        a2.f(2);
        a2.m(2);
        a2.f = (actk)this;
        a2.n(false);
        h.c(a2.c());
    }
    
    public final boolean f() {
        final View a = this.a;
        return a != null && a.isShown() && this.d.getBoolean(this.f, true) && this.g("time_last_browse_cling_shown") && this.d.getLong("time_fusion_enabled", 0L) != 0L && this.g("time_fusion_enabled");
    }
    
    final boolean g(final String s) {
        return adff.e(this.d, s, fwt.b, System.currentTimeMillis());
    }
}
