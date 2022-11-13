import j$.util.function.Consumer$_CC;
import com.google.android.libraries.quantum.fab.FloatingActionButton;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneBackStack;
import android.view.View;
import java.util.function.Consumer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fwj implements Consumer
{
    public static final fwj a;
    public static final fwj b;
    public static final fwj c;
    public static final fwj d;
    public static final fwj e;
    public static final fwj f;
    public static final fwj g;
    public static final fwj h;
    public static final fwj i;
    public static final fwj j;
    public static final fwj k;
    public static final fwj l;
    public static final fwj m;
    public static final fwj n;
    public static final fwj o;
    public static final fwj p;
    public static final fwj q;
    public static final fwj r;
    public static final fwj s;
    public static final fwj t;
    public static final fwj u;
    private final int v;
    
    static {
        u = new fwj(20);
        t = new fwj(19);
        s = new fwj(18);
        r = new fwj(17);
        q = new fwj(16);
        p = new fwj(15);
        o = new fwj(14);
        n = new fwj(13);
        m = new fwj(12);
        l = new fwj(11);
        k = new fwj(10);
        j = new fwj(9);
        i = new fwj(8);
        h = new fwj(7);
        g = new fwj(6);
        f = new fwj(5);
        e = new fwj(4);
        d = new fwj(3);
        c = new fwj(2);
        b = new fwj(1);
        a = new fwj(0);
    }
    
    private fwj(final int v) {
        this.v = v;
    }
    
    @Override
    public final void accept(final Object o) {
        switch (this.v) {
            default: {
                ((asir)o).dispose();
                return;
            }
            case 19: {
                ((ggq)o).bf();
                return;
            }
            case 18: {
                ((ggw)o).a();
                return;
            }
            case 17: {
                anb.aA((View)o);
                return;
            }
            case 16: {
                ((PaneBackStack)o).f();
                return;
            }
            case 15: {
                ((FloatingActionButton)o).setVisibility(8);
                return;
            }
            case 14: {
                ((FloatingActionButton)o).setVisibility(0);
                return;
            }
            case 13: {
                ((gef)o).b();
                return;
            }
            case 12: {
                ((gee)o).b();
                return;
            }
            case 11: {
                ((gef)o).f(null);
                return;
            }
            case 10: {
                ((asir)o).dispose();
                return;
            }
            case 9: {
                ((aczy)o).b();
                return;
            }
            case 8: {
                ((fwm)o).a();
                return;
            }
            case 7: {
                ((fvr)o).a();
                return;
            }
            case 6: {
                final fwp fwp = (fwp)o;
                if (fwp.e != null) {
                    fwp.b.setVisibility(0);
                }
                return;
            }
            case 5: {
                ((fwm)o).c();
                return;
            }
            case 4: {
                ((fvr)o).d();
                return;
            }
            case 3: {
                ((fwp)o).g((aomw)null, (wyw)null);
                return;
            }
            case 2: {
                ((fwm)o).b(null, null);
                return;
            }
            case 1: {
                ((fvr)o).b(null);
                return;
            }
            case 0: {
                ((fvr)o).b(null);
            }
        }
    }
    
    @Override
    public final Consumer andThen(final Consumer consumer) {
        switch (this.v) {
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
