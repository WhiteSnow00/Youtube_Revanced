import android.graphics.drawable.Drawable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acgx implements ovz
{
    public final ahci a() {
        return aoyg.b;
    }
    
    public final /* bridge */ void b(final dta dta, final Object o, final ovy ovy) {
        final aoyg aoyg = (aoyg)o;
        if (!aoyg.d) {
            return;
        }
        final acwq a = acwq.a(dta.b);
        a.b = ovy.d;
        final int c = aoyg.c;
        if ((c & 0x2) != 0x0) {
            a.a = aoyg.e;
        }
        if ((c & 0x4) != 0x0) {
            a.c(aoyg.f);
        }
        ovy.d = (Drawable)a.b();
    }
}
