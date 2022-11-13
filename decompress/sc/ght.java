import com.google.android.apps.youtube.app.extensions.clips.ClipController;
import com.google.android.apps.youtube.app.extensions.accountlinking.PlayBilling;
import com.google.android.apps.youtube.app.common.ui.scrollselection.DefaultScrollSelectionController;
import com.google.android.apps.youtube.app.common.ui.orientation.PlayerEnterExitFullscreenControllerImpl;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ght implements Runnable
{
    public final Object a;
    private final int b;
    
    public ght(final aaon a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ght(final abpq a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ght(final PlayerEnterExitFullscreenControllerImpl a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ght(final DefaultScrollSelectionController a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ght(final PlayBilling a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ght(final ClipController a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ght(final ghu a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ght(final gif a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ght(final gij a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ght(final gil a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ght(final gkp a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ght(final gmr a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ght(final gps a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ght(final hzm a, final int b, final byte[] array, final byte[] array2) {
        this.b = b;
        this.a = a;
    }
    
    public ght(final mcb a, final int b, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        switch (this.b) {
            default: {
                final ClipController clipController = (ClipController)this.a;
                ((abpq)clipController.d.a()).Z(clipController.w);
                return;
            }
            case 19: {
                final Object a = this.a;
                ((dh)((PlayBilling)a).a).getLifecycle().b((aum)a);
                return;
            }
            case 18: {
                ((abpq)this.a).a();
                return;
            }
            case 17: {
                ((gps)this.a).a.s(1, 1);
                return;
            }
            case 16: {
                ((bi)this.a).d.dismiss();
                return;
            }
            case 15: {
                synchronized (this.a) {
                    final Object c = ((mcb)this.a).c;
                    if (c != null) {
                        ((Runnable)c).run();
                        ((mcb)this.a).c = null;
                    }
                }
            }
            case 14: {
                ((gkp)this.a).f();
                return;
            }
            case 13: {
                ((gkp)this.a).d();
                return;
            }
            case 12: {
                ((DefaultScrollSelectionController)this.a).o();
                return;
            }
            case 11: {
                ((gij)this.a).b();
                return;
            }
            case 10: {
                ((hzm)this.a).m().F();
                return;
            }
            case 9: {
                ((hzm)this.a).m().C();
                return;
            }
            case 8: {
                ((hzm)this.a).m().a();
                return;
            }
            case 7: {
                final abcx c2 = ((gil)this.a).c;
                if (c2 == null) {
                    return;
                }
                c2.b();
                return;
            }
            case 6: {
                ((aaon)this.a).t();
                return;
            }
            case 5: {
                ((aaon)this.a).u(false);
                return;
            }
            case 4: {
                final say v = ((gif)this.a).v;
                if (v != null && fal.x(v)) {
                    v.b().d(-1, -1);
                }
                return;
            }
            case 3: {
                final abcx c3 = ((gil)this.a).c;
                if (c3 == null) {
                    return;
                }
                c3.a();
                return;
            }
            case 2: {
                ((abpu)((hzm)this.a).a).m().o();
                return;
            }
            case 1: {
                final PlayerEnterExitFullscreenControllerImpl playerEnterExitFullscreenControllerImpl = (PlayerEnterExitFullscreenControllerImpl)this.a;
                playerEnterExitFullscreenControllerImpl.d = false;
                playerEnterExitFullscreenControllerImpl.a.e(2);
                return;
            }
            case 0: {
                final ghu ghu = (ghu)this.a;
                final Integer e = ghu.e;
                if (e == null) {
                    return;
                }
                ghu.c(e);
            }
        }
    }
}
