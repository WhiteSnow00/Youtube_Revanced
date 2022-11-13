import android.app.Activity;
import android.view.Window;
import com.google.android.libraries.youtube.innertube.model.BrowseResponseModel;
import j$.util.Optional;
import com.google.android.apps.youtube.embeddedplayer.service.hostappverification.e;
import java.util.Collection;
import java.util.ArrayList;
import com.google.android.libraries.youtube.logging.interaction.InteractionLoggingScreen;
import android.os.Bundle;
import j$.util.function.Function$_CC;
import java.util.function.Function;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hvo implements Function
{
    public static final hvo a;
    public static final hvo b;
    public static final hvo c;
    public static final hvo d;
    public static final hvo e;
    public static final hvo f;
    public static final hvo g;
    public static final hvo h;
    public static final hvo i;
    public static final hvo j;
    public static final hvo k;
    public static final hvo l;
    public static final hvo m;
    public static final hvo n;
    public static final hvo o;
    public static final hvo p;
    public static final hvo q;
    public static final hvo r;
    public static final hvo s;
    public static final hvo t;
    public static final hvo u;
    private final int v;
    
    static {
        u = new hvo(20);
        t = new hvo(19);
        s = new hvo(18);
        r = new hvo(17);
        q = new hvo(16);
        p = new hvo(15);
        o = new hvo(14);
        n = new hvo(13);
        m = new hvo(12);
        l = new hvo(11);
        k = new hvo(10);
        j = new hvo(9);
        i = new hvo(8);
        h = new hvo(7);
        g = new hvo(6);
        f = new hvo(5);
        e = new hvo(4);
        d = new hvo(3);
        c = new hvo(2);
        b = new hvo(1);
        a = new hvo(0);
    }
    
    private hvo(final int v) {
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
        final int v = this.v;
        boolean b = true;
        final Object o2 = null;
        final akav akav = null;
        switch (v) {
            default: {
                return asie.I((Object)o).J((asjr)huy.h).g((asjs)hus.j).C((asjr)huy.i).C((asjr)huy.j).af();
            }
            case 19: {
                return ((aezq)o).a;
            }
            case 18: {
                final Bundle bundle = (Bundle)o;
                final int cu = hwl.cU;
                return bundle.getBoolean("split_pane_library_opened_in_offline_mode");
            }
            case 17: {
                final ksp ksp = (ksp)o;
                final int cu2 = hwl.cU;
                return ksp.b((afft)afiq.a);
            }
            case 16: {
                return ((InteractionLoggingScreen)o).a;
            }
            case 15: {
                final ktm ktm = (ktm)o;
                final Object a = ((ksp)ktm).a;
                akav akav2 = akav;
                if (a != null) {
                    anik anik;
                    if ((anik = ((anio)a).M) == null) {
                        anik = anik.a;
                    }
                    akav2 = akav;
                    if ((0x1 & anik.b) != 0x0) {
                        anik anik2;
                        if ((anik2 = ((anio)((ksp)ktm).a).M) == null) {
                            anik2 = anik.a;
                        }
                        if ((akav2 = anik2.c) == null) {
                            akav2 = akav.a;
                        }
                    }
                }
                return new gdy(akav2);
            }
            case 14: {
                final ksp ksp2 = (ksp)o;
                final int cu3 = hwl.cU;
                return ksp2;
            }
            case 13: {
                return ((hwj)o).t;
            }
            case 12: {
                return afeq.o((Collection)new ArrayList(((kag)o).a.values()));
            }
            case 11: {
                return ((jyk)o).b();
            }
            case 10: {
                final jug jug = (jug)o;
                return new juf(jug.d, jug.b);
            }
            case 9: {
                final e e = (e)o;
                final zxn zxn = new zxn((aorj)e.c);
                final Object a2 = e.a;
                Object qa = o2;
                if (a2 != null) {
                    qa = ((acov)a2).qA();
                }
                return aezq.a((Object)zxn, (Object)Optional.ofNullable(qa));
            }
            case 8: {
                final Bundle bundle2 = (Bundle)o;
                final int cu4 = hwl.cU;
                return bundle2.getByteArray("navigation_endpoint_interaction_logging_extension");
            }
            case 7: {
                return ((kty)o).j();
            }
            case 6: {
                aiqj aiqj;
                if ((aiqj = ((akhz)o).p) == null) {
                    aiqj = aiqj.a;
                }
                return aiqj;
            }
            case 5: {
                return ((BrowseResponseModel)o).a;
            }
            case 4: {
                final Bundle bundle3 = (Bundle)o;
                final int cu5 = hwl.cU;
                return bundle3.getByteArray("navigation_endpoint");
            }
            case 3: {
                return ((Window)o).getDecorView();
            }
            case 2: {
                return ((Activity)o).getWindow();
            }
            case 1: {
                final ksp ksp3 = (ksp)o;
                final int cu6 = hwl.cU;
                if (ksp3.f() == null) {
                    b = false;
                }
                return b;
            }
            case 0: {
                final int cu7 = hwl.cU;
                return o;
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
