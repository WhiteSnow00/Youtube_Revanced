import java.util.Iterator;
import java.util.List;
import com.google.android.apps.youtube.app.watch.panel.ui.DefaultWatchPanelViewController;

// 
// Decompiled by Procyon v0.6.0
// 

public final class etp implements roe
{
    private final elw a;
    
    public etp(final elw a, final byte[] array, final byte[] array2) {
        this.a = a;
    }
    
    private final utk c() {
        final Object a = this.a.a;
        if (a != null) {
            return ((DefaultWatchPanelViewController)a).d;
        }
        throw new rnm("Unable to acquire engagementPanelController", 70);
    }
    
    public final void a(final List list) {
        for (final String s : list) {
            final utk c = this.c();
            s.getClass();
            c.l((aext)new eto(s, 0));
        }
    }
    
    public final void b(final List list, final alek v) {
        alff alff2;
        if (v != null) {
            final agza builder = ((agzi)alff.a).createBuilder();
            builder.copyOnWrite();
            final alff alff = (alff)builder.instance;
            alff.v = v;
            alff.c |= 0x400;
            alff2 = (alff)builder.build();
        }
        else {
            alff2 = null;
        }
        for (final ajnh ajnh : list) {
            final utk c = this.c();
            ajnl b;
            if (ajnh.b == 138681066) {
                b = (ajnl)ajnh.c;
            }
            else {
                b = ajnl.b;
            }
            c.p(b, alff2);
        }
    }
}
