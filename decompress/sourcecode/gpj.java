import android.content.Context;
import java.util.Collection;
import java.util.ArrayList;
import com.google.android.apps.youtube.app.watchwhile.WatchWhileActivity;
import java.util.List;
import com.google.android.apps.youtube.app.common.endpoint.LoggingUrlsPingController;
import java.util.Map;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gpj implements vax
{
    private static final gpk a;
    private final Activity b;
    private final tdz c;
    private final atjj d;
    private final Map e;
    private final Map f;
    private final Map g;
    private final LoggingUrlsPingController h;
    
    static {
        a = new gpk();
    }
    
    public gpj(final Activity b, final tdz c, final atjj d, final Map e, final Map f, final Map g, final LoggingUrlsPingController h) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    private static vau f(final Class clazz, final Map map) {
        final atjj atjj = map.get(clazz);
        if (atjj != null) {
            return (vau)atjj.a();
        }
        return null;
    }
    
    public final void c(final aioe vbh, final Map map) {
        this.b.getClass();
        if (vbh == null) {
            return;
        }
        final vau vau = null;
        Object a = null;
        try {
            try {
                a = vay.a((aioe)vbh);
            }
            catch (final vbh vbh) {}
        }
        catch (final IllegalStateException ex) {
            zjp.c(zjo.b, zjn.y, "Failed to process the Command", (Throwable)ex);
            a = null;
        }
        try {
            vau vau2;
            if (a == null) {
                vau2 = vau;
            }
            else {
                final Class<?> class1 = a.getClass();
                vau2 = f(class1, this.e);
                if (vau2 == null) {
                    vau2 = f(class1, this.f);
                    if (vau2 == null) {
                        vau2 = f(class1, this.g);
                        if (vau2 == null) {
                            throw new vbh("Unknown Command encountered");
                        }
                    }
                }
            }
            if (vau2 != null) {
                if (WatchWhileActivity.class.isInstance(this.b)) {
                    final int intValue = (int)tmy.N(map, (Object)"com.google.android.apps.youtube.app.endpoint.flags", (Object)0);
                    final boolean b = vau2 instanceof fbz;
                    if ((intValue & 0x1) != 0x0 && !b) {
                        ((ggv)this.d.a()).r();
                    }
                }
                this.h.k((List)new ArrayList(((aioe)vbh).d), map);
                vau2.mE((aioe)vbh, map);
                this.c.f((Object)gpj.a);
            }
            return;
        }
        catch (final IllegalStateException ex2) {
            zjp.c(zjo.b, zjn.y, "Failed to process the Command", (Throwable)ex2);
            return;
        }
        tmy.y((Context)this.b, (CharSequence)vbh.getMessage(), 1);
    }
}
