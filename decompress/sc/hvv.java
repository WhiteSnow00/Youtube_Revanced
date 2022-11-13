import com.google.android.apps.youtube.app.common.loading.SpecificNetworkErrorViewLoadingFrameLayout;
import android.os.Bundle;
import com.google.android.libraries.youtube.innertube.model.BrowseResponseModel;
import android.view.MenuItem;
import androidx.mediarouter.app.MediaRouteButton;
import j$.util.Optional;
import java.util.Collection;
import j$.util.Collection$_EL;
import j$.util.function.Function$_CC;
import java.util.function.Function;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hvv implements Function
{
    public static final hvv a;
    public static final hvv b;
    public static final hvv c;
    public static final hvv d;
    public static final hvv e;
    public static final hvv f;
    public static final hvv g;
    public static final hvv h;
    public static final hvv i;
    public static final hvv j;
    public static final hvv k;
    public static final hvv l;
    public static final hvv m;
    public static final hvv n;
    public static final hvv o;
    public static final hvv p;
    public static final hvv q;
    public static final hvv r;
    public static final hvv s;
    public static final hvv t;
    public static final hvv u;
    private final int v;
    
    static {
        u = new hvv(20);
        t = new hvv(19);
        s = new hvv(18);
        r = new hvv(17);
        q = new hvv(16);
        p = new hvv(15);
        o = new hvv(14);
        n = new hvv(13);
        m = new hvv(12);
        l = new hvv(11);
        k = new hvv(10);
        j = new hvv(9);
        i = new hvv(8);
        h = new hvv(7);
        g = new hvv(6);
        f = new hvv(5);
        e = new hvv(4);
        d = new hvv(3);
        c = new hvv(2);
        b = new hvv(1);
        a = new hvv(0);
    }
    
    private hvv(final int v) {
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
                return Collection$_EL.stream((Collection)o);
            }
            case 19: {
                return ied.k((aaat)o);
            }
            case 18: {
                return ((Optional)o).get();
            }
            case 17: {
                return idz.a((vfn)o);
            }
            case 16: {
                return ((icw)o).a.j;
            }
            case 15: {
                return ((icm)o).b().Z((asjr)hzh.k);
            }
            case 14: {
                return afk.b((MenuItem)o);
            }
            case 13: {
                akia akia;
                if ((akia = ((BrowseResponseModel)o).a.f) == null) {
                    akia = akia.a;
                }
                akii a;
                if (akia.b == 58173949) {
                    a = (akii)akia.c;
                }
                else {
                    a = akii.a;
                }
                return Collection$_EL.stream((Collection)a.c).flatMap((Function)tms.r).collect(afci.b);
            }
            case 12: {
                final BrowseResponseModel browseResponseModel = (BrowseResponseModel)o;
                Object o2;
                if (browseResponseModel.a() == null) {
                    o2 = afiq.a;
                }
                else {
                    o2 = afft.p((Collection)((anyv)((ahbc)browseResponseModel.a()).rx((ahaq)anyv.b)).e);
                }
                return o2;
            }
            case 11: {
                return ((hyd)o).f();
            }
            case 10: {
                return ((Bundle)o).getInt("active_panel_on_single_panel_mode_key", 0);
            }
            case 9: {
                return ((hyi)o).j();
            }
            case 8: {
                return ((hyi)o).g();
            }
            case 7: {
                return ((hyi)o).i();
            }
            case 6: {
                return ((aovi)o).d;
            }
            case 5: {
                return ((ksp)o).a;
            }
            case 4: {
                return aezq.a((Object)o, (Object)Optional.empty());
            }
            case 3: {
                return ((SpecificNetworkErrorViewLoadingFrameLayout)o).g;
            }
            case 2: {
                return aezq.a((Object)o, (Object)Optional.empty());
            }
            case 1: {
                return ((Optional)o).get();
            }
            case 0: {
                return new wyt((ahab)o);
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
