import java.util.Iterator;
import com.google.android.libraries.youtube.player.features.overlay.timebar.TimeBar;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.k;
import com.google.android.apps.youtube.app.player.overlay.suggestedactions.SuggestedActionsMainController;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jbk implements abcc
{
    final /* synthetic */ Object a = a;
    private final /* synthetic */ int b;
    
    public jbk(final SuggestedActionsMainController a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jbk(final k a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jbk(final jbl a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jbk(final lgz a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final void h(final int n, final long n2) {
        final int b = this.b;
        if (b == 0) {
            if (n == 3) {
                ((jbl)this.a).a(2);
            }
            return;
        }
        final boolean b2 = true;
        final boolean b3 = true;
        if (b == 1) {
            final Iterator iterator = ((iye)this.a).b.iterator();
            while (iterator.hasNext()) {
                ((abcc)iterator.next()).h(n, n2);
            }
            return;
        }
        boolean k = false;
        if (b == 2) {
            final SuggestedActionsMainController suggestedActionsMainController = (SuggestedActionsMainController)this.a;
            final boolean i = suggestedActionsMainController.k;
            if (n == 1 || n == 2) {
                k = true;
            }
            if (i != (suggestedActionsMainController.k = k)) {
                suggestedActionsMainController.p(k ^ true, true);
            }
            return;
        }
        if (b == 3) {
            boolean b4 = b2;
            if (n != 1) {
                b4 = b2;
                if (n != 2) {
                    b4 = false;
                }
            }
            final lgz lgz = (lgz)this.a;
            final apha d = aphb.d(lgz.d);
            d.b(Boolean.valueOf(b4));
            lgz.a();
            lgz.d(lgz.d, d.c().d(), 2);
            return;
        }
        if (b != 4) {
            return;
        }
        abbx.K((abcb)((k)this.a).i, n2);
        if (n == 1) {
            final k j = (k)this.a;
            j.L = true;
            j.H();
            final k l = (k)this.a;
            if (l.M) {
                l.oE();
                ((k)this.a).w.e(true);
                ((k)this.a).C.c(28244);
            }
            ((k)this.a).b.q();
            return;
        }
        if (n == 2) {
            ((k)this.a).b.p(n2);
            return;
        }
        if (n != 3 && n != 4) {
            return;
        }
        ((abbx)((k)this.a).h).mc();
        final k m = (k)this.a;
        m.S(n2 == m.i.a && b3);
        final k k2 = (k)this.a;
        if (k2.M) {
            k2.w.e(false);
            ((k)this.a).v();
        }
        ((k)this.a).b.r(n2);
        ((k)this.a).L = false;
    }
}
