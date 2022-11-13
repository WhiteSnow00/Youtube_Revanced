import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import com.google.android.apps.youtube.app.common.ui.navigation.Pane;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneBackStack$BackStackEntry;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneBackStack;
import j$.util.Optional;
import j$.util.function.Function$_CC;
import java.util.function.Function;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ggb implements Function
{
    public static final ggb a;
    public static final ggb b;
    public static final ggb c;
    public static final ggb d;
    public static final ggb e;
    public static final ggb f;
    public static final ggb g;
    public static final ggb h;
    public static final ggb i;
    public static final ggb j;
    public static final ggb k;
    public static final ggb l;
    public static final ggb m;
    public static final ggb n;
    public static final ggb o;
    public static final ggb p;
    public static final ggb q;
    public static final ggb r;
    public static final ggb s;
    public static final ggb t;
    public static final ggb u;
    private final int v;
    
    static {
        u = new ggb(20);
        t = new ggb(19);
        s = new ggb(18);
        r = new ggb(17);
        q = new ggb(16);
        p = new ggb(15);
        o = new ggb(14);
        n = new ggb(13);
        m = new ggb(12);
        l = new ggb(11);
        k = new ggb(10);
        j = new ggb(9);
        i = new ggb(8);
        h = new ggb(7);
        g = new ggb(6);
        f = new ggb(5);
        e = new ggb(4);
        d = new ggb(3);
        c = new ggb(2);
        b = new ggb(1);
        a = new ggb(0);
    }
    
    private ggb(final int v) {
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
    public final Object apply(final Object o) {
        switch (this.v) {
            default: {
                final gjt gjt = (gjt)o;
                return gjv.a(gjt.a, gjt.b);
            }
            case 19: {
                return ((gjv)o).b;
            }
            case 18: {
                return ((gjv)o).a;
            }
            case 17: {
                return ((hsi)o).a();
            }
            case 16: {
                return ((hsi)o).a();
            }
            case 15: {
                return ((gia)o).a();
            }
            case 14: {
                return ((Optional)o).get();
            }
            case 13: {
                return ((gia)o).b();
            }
            case 12: {
                return ((cgi)o).a("pane_nav_controller");
            }
            case 11: {
                return ((PaneBackStack)o).e() ^ true;
            }
            case 10: {
                return ((PaneBackStack$BackStackEntry)o).a;
            }
            case 9: {
                return ((Pane)o).b;
            }
            case 8: {
                return ((PaneBackStack$BackStackEntry)o).a.a;
            }
            case 7: {
                return Optional.ofNullable((Object)((PaneBackStack)o).b()).map((Function)ggb.i);
            }
            case 6: {
                return ((ggq)o).O;
            }
            case 5: {
                return ((ggq)o).bo();
            }
            case 4: {
                return ((Pane)o).c;
            }
            case 3: {
                return ((PaneDescriptor)o).i("search_cache_key");
            }
            case 2: {
                return ((PaneBackStack)o).e();
            }
            case 1: {
                return ((PaneBackStack)o).e() ^ true;
            }
            case 0: {
                return ((Pane)o).d;
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
