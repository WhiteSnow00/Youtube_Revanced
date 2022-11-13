import j$.util.function.Consumer$_CC;
import com.google.android.apps.youtube.app.common.loading.SpecificNetworkErrorViewLoadingFrameLayout;
import java.util.concurrent.ScheduledFuture;
import androidx.cardview.widget.CardView;
import android.view.ViewGroup;
import android.view.View;
import java.util.function.Consumer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hvn implements Consumer
{
    public static final hvn a;
    public static final hvn b;
    public static final hvn c;
    public static final hvn d;
    public static final hvn e;
    public static final hvn f;
    public static final hvn g;
    public static final hvn h;
    public static final hvn i;
    public static final hvn j;
    public static final hvn k;
    public static final hvn l;
    public static final hvn m;
    public static final hvn n;
    public static final hvn o;
    public static final hvn p;
    public static final hvn q;
    public static final hvn r;
    public static final hvn s;
    private final int t;
    
    static {
        s = new hvn(20);
        r = new hvn(19);
        q = new hvn(18);
        p = new hvn(17);
        o = new hvn(16);
        n = new hvn(15);
        m = new hvn(12);
        l = new hvn(11);
        k = new hvn(10);
        j = new hvn(9);
        i = new hvn(8);
        h = new hvn(7);
        g = new hvn(6);
        f = new hvn(5);
        e = new hvn(4);
        d = new hvn(3);
        c = new hvn(2);
        b = new hvn(1);
        a = new hvn(0);
    }
    
    public hvn(final int t) {
        this.t = t;
    }
    
    @Override
    public final void accept(Object b) {
        switch (this.t) {
            default: {
                final fzw fzw = (fzw)b;
                b = fzw.b;
                ((elx)b).C((View)fzw.a);
                return;
            }
            case 19: {
                final ViewGroup viewGroup = (ViewGroup)b;
                viewGroup.setVisibility(8);
                viewGroup.removeAllViews();
                return;
            }
            case 18: {
                final ViewGroup viewGroup2 = (ViewGroup)b;
                viewGroup2.setVisibility(8);
                viewGroup2.removeAllViews();
                return;
            }
            case 17: {
                ((ep)b).j(true);
                return;
            }
            case 16: {
                ((CardView)b).setVisibility(8);
                return;
            }
            case 15: {
                ((fpn)b).j();
                return;
            }
            case 14: {
                ((fpn)b).mc();
                return;
            }
            case 13: {
                ((fpn)b).sendAccessibilityEvent(4);
                return;
            }
            case 12: {
                ((msn)b).d((xah)null);
                return;
            }
            case 11: {
                ((hyi)b).d();
                return;
            }
            case 10: {
                ((hyi)b).c();
                return;
            }
            case 9: {
                tpe.p(((View)b).findFocus());
                return;
            }
            case 8: {
                ((acir)b).a();
                return;
            }
            case 7: {
                final ScheduledFuture scheduledFuture = (ScheduledFuture)b;
                final int cu = hwl.cU;
                scheduledFuture.cancel(true);
                return;
            }
            case 6: {
                ((ksp)b).h();
                return;
            }
            case 5: {
                final frk frk = (frk)b;
                if (frk.a.isEnabled()) {
                    if (!frk.a.b) {
                        frk.sb(2);
                        frk.a();
                    }
                }
                return;
            }
            case 4: {
                ((ksp)b).g();
                return;
            }
            case 3: {
                final View view = (View)b;
                final int cu2 = hwl.cU;
                view.sendAccessibilityEvent(32);
                return;
            }
            case 2: {
                final SpecificNetworkErrorViewLoadingFrameLayout specificNetworkErrorViewLoadingFrameLayout = (SpecificNetworkErrorViewLoadingFrameLayout)b;
                final int cu3 = hwl.cU;
                final CharSequence text = specificNetworkErrorViewLoadingFrameLayout.a.getResources().getText(2132018803);
                final fkb b2 = specificNetworkErrorViewLoadingFrameLayout.b;
                b2.getClass();
                b2.e(text);
                specificNetworkErrorViewLoadingFrameLayout.g(4);
                return;
            }
            case 1: {
                ((wqa)b).c();
                return;
            }
            case 0: {
                final SpecificNetworkErrorViewLoadingFrameLayout specificNetworkErrorViewLoadingFrameLayout2 = (SpecificNetworkErrorViewLoadingFrameLayout)b;
                final int cu4 = hwl.cU;
                specificNetworkErrorViewLoadingFrameLayout2.e();
            }
        }
    }
    
    @Override
    public final Consumer andThen(final Consumer consumer) {
        switch (this.t) {
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
