import android.animation.ValueAnimator;
import android.view.ViewStub;
import java.util.List;
import j$.util.Optional;
import android.animation.ObjectAnimator;
import com.google.android.libraries.quantum.fab.FloatingActionButton;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneBackStack;
import android.os.Bundle;
import j$.util.function.Function$_CC;
import java.util.function.Function;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fwk implements Function
{
    public static final fwk a;
    public static final fwk b;
    public static final fwk c;
    public static final fwk d;
    public static final fwk e;
    public static final fwk f;
    public static final fwk g;
    public static final fwk h;
    public static final fwk i;
    public static final fwk j;
    public static final fwk k;
    public static final fwk l;
    public static final fwk m;
    public static final fwk n;
    public static final fwk o;
    public static final fwk p;
    public static final fwk q;
    public static final fwk r;
    public static final fwk s;
    public static final fwk t;
    public static final fwk u;
    private final int v;
    
    static {
        u = new fwk(20);
        t = new fwk(19);
        s = new fwk(18);
        r = new fwk(17);
        q = new fwk(16);
        p = new fwk(15);
        o = new fwk(14);
        n = new fwk(13);
        m = new fwk(12);
        l = new fwk(11);
        k = new fwk(10);
        j = new fwk(9);
        i = new fwk(8);
        h = new fwk(7);
        g = new fwk(6);
        f = new fwk(5);
        e = new fwk(4);
        d = new fwk(3);
        c = new fwk(2);
        b = new fwk(1);
        a = new fwk(0);
    }
    
    private fwk(final int v) {
        this.v = v;
    }
    
    @Override
    public final Function andThen(final Function function) {
        switch (this.v) {
            default: {
                return Function$_CC.$default$andThen((Function)this, function);
            }
            case 19: {
                return Function$_CC.$default$andThen((Function)this, function);
            }
            case 18: {
                return Function$_CC.$default$andThen((Function)this, function);
            }
            case 17: {
                return Function$_CC.$default$andThen((Function)this, function);
            }
            case 16: {
                return Function$_CC.$default$andThen((Function)this, function);
            }
            case 15: {
                return Function$_CC.$default$andThen((Function)this, function);
            }
            case 14: {
                return Function$_CC.$default$andThen((Function)this, function);
            }
            case 13: {
                return Function$_CC.$default$andThen((Function)this, function);
            }
            case 12: {
                return Function$_CC.$default$andThen((Function)this, function);
            }
            case 11: {
                return Function$_CC.$default$andThen((Function)this, function);
            }
            case 10: {
                return Function$_CC.$default$andThen((Function)this, function);
            }
            case 9: {
                return Function$_CC.$default$andThen((Function)this, function);
            }
            case 8: {
                return Function$_CC.$default$andThen((Function)this, function);
            }
            case 7: {
                return Function$_CC.$default$andThen((Function)this, function);
            }
            case 6: {
                return Function$_CC.$default$andThen((Function)this, function);
            }
            case 5: {
                return Function$_CC.$default$andThen((Function)this, function);
            }
            case 4: {
                return Function$_CC.$default$andThen((Function)this, function);
            }
            case 3: {
                return Function$_CC.$default$andThen((Function)this, function);
            }
            case 2: {
                return Function$_CC.$default$andThen((Function)this, function);
            }
            case 1: {
                return Function$_CC.$default$andThen((Function)this, function);
            }
            case 0: {
                return Function$_CC.$default$andThen((Function)this, function);
            }
        }
    }
    
    @Override
    public final Object apply(Object a) {
        final int v = this.v;
        final boolean b = true;
        boolean b2 = true;
        switch (v) {
            default: {
                return ((Bundle)a).getIntegerArrayList("tabBackStack");
            }
            case 19: {
                return ((Bundle)a).getSparseParcelableArray("panes");
            }
            case 18: {
                return ((Bundle)a).getInt("activePaneKey");
            }
            case 17: {
                return ((PaneBackStack)a).e() ^ true;
            }
            case 16: {
                return ((ggt)a).I();
            }
            case 15: {
                return ((gdz)a).d();
            }
            case 14: {
                akdh akdh;
                if ((akdh = akdh.b(((akdi)a).c)) == null) {
                    akdh = akdh.a;
                }
                return akdh;
            }
            case 13: {
                return ((gdz)a).c();
            }
            case 12: {
                if (((FloatingActionButton)a).getVisibility() == 0) {
                    b2 = false;
                }
                return b2;
            }
            case 11: {
                a = ((cya)a).a;
                return null;
            }
            case 10: {
                return ((gdz)a).e();
            }
            case 9: {
                return ((ValueAnimator)a).isRunning();
            }
            case 8: {
                return Optional.of((Object)((gcp)a).b);
            }
            case 7: {
                return Optional.of((Object)((gcp)a).c);
            }
            case 6: {
                return ((gcp)a).a;
            }
            case 5: {
                final ggq f = ((ghb)((hzn)a).a).f();
                if (f instanceof hpo) {
                    final bu od = f.od();
                    if (od != null && od.getSupportFragmentManager().f("REEL_COMMENT_VIEW_TAG") != null) {
                        return b;
                    }
                }
                return false;
            }
            case 4: {
                return ((List)a).toArray(new aiao[0]);
            }
            case 3: {
                return ((ViewStub)a).inflate();
            }
            case 2: {
                return afev.m("com.google.android.libraries.youtube.logging.interaction_logger", a);
            }
            case 1: {
                aomc aomc;
                if ((aomc = ((aome)a).p) == null) {
                    aomc = aomc.a;
                }
                return aomc;
            }
            case 0: {
                final aomc aomc2 = (aomc)a;
                aona a2;
                if (aomc2.b == 119226798) {
                    a2 = (aona)aomc2.c;
                }
                else {
                    a2 = aona.a;
                }
                return a2;
            }
        }
    }
    
    @Override
    public final Function compose(final Function function) {
        switch (this.v) {
            default: {
                return Function$_CC.$default$compose((Function)this, function);
            }
            case 19: {
                return Function$_CC.$default$compose((Function)this, function);
            }
            case 18: {
                return Function$_CC.$default$compose((Function)this, function);
            }
            case 17: {
                return Function$_CC.$default$compose((Function)this, function);
            }
            case 16: {
                return Function$_CC.$default$compose((Function)this, function);
            }
            case 15: {
                return Function$_CC.$default$compose((Function)this, function);
            }
            case 14: {
                return Function$_CC.$default$compose((Function)this, function);
            }
            case 13: {
                return Function$_CC.$default$compose((Function)this, function);
            }
            case 12: {
                return Function$_CC.$default$compose((Function)this, function);
            }
            case 11: {
                return Function$_CC.$default$compose((Function)this, function);
            }
            case 10: {
                return Function$_CC.$default$compose((Function)this, function);
            }
            case 9: {
                return Function$_CC.$default$compose((Function)this, function);
            }
            case 8: {
                return Function$_CC.$default$compose((Function)this, function);
            }
            case 7: {
                return Function$_CC.$default$compose((Function)this, function);
            }
            case 6: {
                return Function$_CC.$default$compose((Function)this, function);
            }
            case 5: {
                return Function$_CC.$default$compose((Function)this, function);
            }
            case 4: {
                return Function$_CC.$default$compose((Function)this, function);
            }
            case 3: {
                return Function$_CC.$default$compose((Function)this, function);
            }
            case 2: {
                return Function$_CC.$default$compose((Function)this, function);
            }
            case 1: {
                return Function$_CC.$default$compose((Function)this, function);
            }
            case 0: {
                return Function$_CC.$default$compose((Function)this, function);
            }
        }
    }
}
