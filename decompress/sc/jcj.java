import java.util.Iterator;
import com.google.android.libraries.youtube.player.features.overlay.timebar.TimeBar;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.l;
import com.google.android.apps.youtube.app.player.overlay.suggestedactions.SuggestedActionsMainController;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jcj implements abdw
{
    final Object a;
    private final int b;
    
    public jcj(final SuggestedActionsMainController a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jcj(final l a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jcj(final TimeBar a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jcj(final izd a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jcj(final jck a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jcj(final lia a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final void h(final int n, final long n2) {
        final int b = this.b;
        if (b == 0) {
            if (n == 3) {
                ((jck)this.a).a(2);
            }
            return;
        }
        final boolean b2 = true;
        final boolean b3 = true;
        if (b == 1) {
            final Iterator iterator = ((izd)this.a).b.iterator();
            while (iterator.hasNext()) {
                ((abdw)iterator.next()).h(n, n2);
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
            final lia lia = (lia)this.a;
            final apje d = apjf.d(lia.d);
            d.b(Boolean.valueOf(b4));
            lia.a();
            lia.d(lia.d, d.c().d(), 2);
            return;
        }
        if (b != 4) {
            return;
        }
        abdr.K((abdv)((l)this.a).i, n2);
        if (n == 1) {
            final l l = (l)this.a;
            l.L = true;
            l.H();
            final l j = (l)this.a;
            if (j.M) {
                j.oE();
                ((l)this.a).w.e(true);
                ((l)this.a).C.c(28244);
            }
            ((l)this.a).b.q();
            return;
        }
        if (n == 2) {
            ((l)this.a).b.p(n2);
            return;
        }
        if (n != 3 && n != 4) {
            return;
        }
        ((abdr)((l)this.a).h).mc();
        final l m = (l)this.a;
        m.S(n2 == m.i.a && b3);
        final l l2 = (l)this.a;
        if (l2.M) {
            l2.w.e(false);
            ((l)this.a).v();
        }
        ((l)this.a).b.r(n2);
        ((l)this.a).L = false;
    }
}
