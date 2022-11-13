import j$.util.function.Consumer$_CC;
import android.widget.FrameLayout;
import com.google.android.apps.youtube.app.common.loading.SpecificNetworkErrorViewLoadingFrameLayout;
import java.util.Collection;
import j$.util.Optional;
import androidx.mediarouter.app.MediaRouteButton;
import android.view.View;
import android.widget.ProgressBar;
import com.google.android.libraries.youtube.commerce.red.entity.LayerableFilterEntityController;
import android.os.Bundle;
import java.util.function.Consumer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hvr implements Consumer
{
    public final Object a;
    private final int b;
    
    public hvr(final aibh a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hvr(final Bundle a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hvr(final LayerableFilterEntityController a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hvr(final fzx a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hvr(final hwl a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hvr(final hyf a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hvr(final iam a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hvr(final ian a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hvr(final iat a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void accept(final Object o) {
        final int b = this.b;
        boolean b2 = true;
        switch (b) {
            default: {
                final Object a = this.a;
                final ProgressBar progressBar = (ProgressBar)o;
                if (((iat)a).a != 2) {
                    b2 = false;
                }
                tpe.v((View)progressBar, b2);
                return;
            }
            case 19: {
                ((ian)this.a).a.b((acwk)o);
                return;
            }
            case 18: {
                ((acvy)((iam)this.a).b.a()).k((acwa)o);
                return;
            }
            case 17: {
                final Object a2 = this.a;
                ((MediaRouteButton)o).performClick();
                final iam iam = (iam)a2;
                iam.e.bi(iam.c.a());
                return;
            }
            case 16: {
                final Object a3 = this.a;
                final ahaz ahaz = (ahaz)o;
                ahaz.copyOnWrite();
                final akhy akhy = (akhy)ahaz.instance;
                final akhy a4 = akhy.a;
                a3.getClass();
                akhy.c = (aibh)a3;
                akhy.b |= 0x2;
                return;
            }
            case 15: {
                ((hyf)this.a).aM(2131428645, ((hyi)o).h);
                return;
            }
            case 14: {
                ((Bundle)this.a).putBundle("fragments.panels.PanelsFragment.restoredPanelsLayoutController", ((hyi)o).a());
                return;
            }
            case 13: {
                ((hyf)this.a).aM(2131428645, ((hyi)o).h);
                return;
            }
            case 12: {
                ((hyf)this.a).aM(2131431372, ((hyi)o).g);
                return;
            }
            case 11: {
                ((hwl)this.a).pF().t((wzz)o, (alhi)null);
                return;
            }
            case 10: {
                final Object a5 = this.a;
                final afft afft = (afft)o;
                final hwl hwl = (hwl)a5;
                hwl.aF = new fzw((CharSequence)Optional.ofNullable((Object)hwl.ag).orElse((Object)""), (Collection)afft);
                hwl.bj(hwl.aG);
                return;
            }
            case 9: {
                final Object a6 = this.a;
                final ksp ksp = (ksp)o;
                ksp.b = (kte)a6;
                ksp.c = (ktc)a6;
                ksp.d = (ktd)a6;
                if (((hwl)a6).getLifecycle().a().a(auh.d)) {
                    ksp.g();
                }
                return;
            }
            case 8: {
                ((fzx)this.a).f((String)o);
                return;
            }
            case 7: {
                ((View)o).setAccessibilityPaneTitle(((hwl)this.a).ag);
                return;
            }
            case 6: {
                ((LayerableFilterEntityController)this.a).b = aezp.k((Object)o);
                return;
            }
            case 5: {
                final Object a7 = this.a;
                final SpecificNetworkErrorViewLoadingFrameLayout specificNetworkErrorViewLoadingFrameLayout = (SpecificNetworkErrorViewLoadingFrameLayout)o;
                final hwl hwl2 = (hwl)a7;
                final boolean bp = hwl2.bP();
                if (bp) {
                    hwl2.bF(false, false);
                }
                if (specificNetworkErrorViewLoadingFrameLayout.g != 1 && !bp) {
                    return;
                }
                specificNetworkErrorViewLoadingFrameLayout.f(true);
                return;
            }
            case 4: {
                ((gdn)o).b = tpe.bb(((hwl)this.a).nY()) * 5;
                return;
            }
            case 3: {
                final Object a8 = this.a;
                final SpecificNetworkErrorViewLoadingFrameLayout specificNetworkErrorViewLoadingFrameLayout2 = (SpecificNetworkErrorViewLoadingFrameLayout)o;
                final hwl hwl3 = (hwl)a8;
                final wyw cc = hwl3.cc;
                final FrameLayout d = specificNetworkErrorViewLoadingFrameLayout2.d;
                if (d != null) {
                    specificNetworkErrorViewLoadingFrameLayout2.removeView((View)d);
                    specificNetworkErrorViewLoadingFrameLayout2.d();
                    final fjz e = specificNetworkErrorViewLoadingFrameLayout2.e;
                    e.getClass();
                    e.a(cc);
                    final FrameLayout d2 = specificNetworkErrorViewLoadingFrameLayout2.d;
                    d2.getClass();
                    d2.setVisibility(0);
                }
                specificNetworkErrorViewLoadingFrameLayout2.h(new pvh(hwl3));
                return;
            }
            case 2: {
                ((hwl)this.a).bw((dbj)o);
                return;
            }
            case 1: {
                ((SpecificNetworkErrorViewLoadingFrameLayout)o).setBackgroundColor(tpe.cx(((br)this.a).nT(), 2130970845).orElse(0));
                return;
            }
            case 0: {
                ((hwl)this.a).aO((hwf)o);
            }
        }
    }
    
    @Override
    public final Consumer andThen(final Consumer consumer) {
        switch (this.b) {
            default: {
                return Consumer$_CC.$default$andThen((Consumer)this, consumer);
            }
            case 19: {
                return Consumer$_CC.$default$andThen((Consumer)this, consumer);
            }
            case 18: {
                return Consumer$_CC.$default$andThen((Consumer)this, consumer);
            }
            case 17: {
                return Consumer$_CC.$default$andThen((Consumer)this, consumer);
            }
            case 16: {
                return Consumer$_CC.$default$andThen((Consumer)this, consumer);
            }
            case 15: {
                return Consumer$_CC.$default$andThen((Consumer)this, consumer);
            }
            case 14: {
                return Consumer$_CC.$default$andThen((Consumer)this, consumer);
            }
            case 13: {
                return Consumer$_CC.$default$andThen((Consumer)this, consumer);
            }
            case 12: {
                return Consumer$_CC.$default$andThen((Consumer)this, consumer);
            }
            case 11: {
                return Consumer$_CC.$default$andThen((Consumer)this, consumer);
            }
            case 10: {
                return Consumer$_CC.$default$andThen((Consumer)this, consumer);
            }
            case 9: {
                return Consumer$_CC.$default$andThen((Consumer)this, consumer);
            }
            case 8: {
                return Consumer$_CC.$default$andThen((Consumer)this, consumer);
            }
            case 7: {
                return Consumer$_CC.$default$andThen((Consumer)this, consumer);
            }
            case 6: {
                return Consumer$_CC.$default$andThen((Consumer)this, consumer);
            }
            case 5: {
                return Consumer$_CC.$default$andThen((Consumer)this, consumer);
            }
            case 4: {
                return Consumer$_CC.$default$andThen((Consumer)this, consumer);
            }
            case 3: {
                return Consumer$_CC.$default$andThen((Consumer)this, consumer);
            }
            case 2: {
                return Consumer$_CC.$default$andThen((Consumer)this, consumer);
            }
            case 1: {
                return Consumer$_CC.$default$andThen((Consumer)this, consumer);
            }
            case 0: {
                return Consumer$_CC.$default$andThen((Consumer)this, consumer);
            }
        }
    }
}
