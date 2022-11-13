import java.util.Iterator;
import java.util.List;
import com.google.android.apps.youtube.app.watch.panel.ui.DefaultWatchPanelViewController;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ets implements rqi
{
    private final elx a;
    
    public ets(final elx a, final byte[] array, final byte[] array2) {
        this.a = a;
    }
    
    private final uve c() {
        final Object a = this.a.a;
        if (a != null) {
            return ((DefaultWatchPanelViewController)a).d;
        }
        throw new rpq("Unable to acquire engagementPanelController", 70);
    }
    
    public final void a(final List list) {
        for (final String s : list) {
            final uve c = this.c();
            s.getClass();
            c.l((aezs)new etr(s, 0));
        }
    }
    
    public final void b(final List list, final algn v) {
        alhi alhi2;
        if (v != null) {
            final ahaz builder = ((ahbh)alhi.a).createBuilder();
            builder.copyOnWrite();
            final alhi alhi = (alhi)builder.instance;
            alhi.v = v;
            alhi.c |= 0x400;
            alhi2 = (alhi)builder.build();
        }
        else {
            alhi2 = null;
        }
        for (final ajpm ajpm : list) {
            final uve c = this.c();
            ajpq b;
            if (ajpm.b == 138681066) {
                b = (ajpq)ajpm.c;
            }
            else {
                b = ajpq.b;
            }
            c.p(b, alhi2);
        }
    }
}
