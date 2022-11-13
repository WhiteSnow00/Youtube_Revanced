import java.util.Map;
import j$.util.function.Consumer$_CC;
import android.view.View;
import java.util.function.Consumer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gyr implements Consumer
{
    public static final gyr a;
    public static final gyr b;
    public static final gyr c;
    public static final gyr d;
    public static final gyr e;
    public static final gyr f;
    public static final gyr g;
    public static final gyr h;
    public static final gyr i;
    public static final gyr j;
    public static final gyr k;
    public static final gyr l;
    public static final gyr m;
    public static final gyr n;
    public static final gyr o;
    public static final gyr p;
    public static final gyr q;
    public static final gyr r;
    public static final gyr s;
    public static final gyr t;
    public static final gyr u;
    private final int v;
    
    static {
        u = new gyr(20);
        t = new gyr(19);
        s = new gyr(18);
        r = new gyr(17);
        q = new gyr(16);
        p = new gyr(15);
        o = new gyr(14);
        n = new gyr(13);
        m = new gyr(12);
        l = new gyr(11);
        k = new gyr(10);
        j = new gyr(9);
        i = new gyr(8);
        h = new gyr(7);
        g = new gyr(6);
        f = new gyr(5);
        e = new gyr(4);
        d = new gyr(3);
        c = new gyr(2);
        b = new gyr(1);
        a = new gyr(0);
    }
    
    private gyr(final int v) {
        this.v = v;
    }
    
    @Override
    public final void accept(final Object o) {
        switch (this.v) {
            default: {
                ((wqa)o).c();
                return;
            }
            case 19: {
                ((hqj)o).m();
                return;
            }
            case 18: {
                ((hqj)o).g();
                return;
            }
            case 17: {
                ((hpb)o).q();
                return;
            }
            case 16: {
                ((gvp)o).aN();
                return;
            }
            case 15: {
                ((gvp)o).aO();
                return;
            }
            case 14: {
                tpe.v((View)((hqo)o).d, false);
                return;
            }
            case 13: {
                ((hri)o).l();
                return;
            }
            case 12: {
                ((hri)o).t().h();
                return;
            }
            case 11: {
                ((hqo)o).g();
                return;
            }
            case 10: {
                ((hqo)o).c();
                return;
            }
            case 9: {
                final hqo hqo = (hqo)o;
                hqo.i = false;
                ajrk ajrk;
                if ((ajrk = hqo.m.f().A) == null) {
                    ajrk = ajrk.a;
                }
                final ahaz builder = ((ahbh)ajrl.a).createBuilder();
                builder.copyOnWrite();
                ajrl.a((ajrl)builder.instance);
                final ajrl ajrl = (ajrl)builder.build();
                final ahcr b = ajrk.b;
                final Long value = 45382468L;
                ajrl ajrl2 = ajrl;
                if (((Map)b).containsKey(value)) {
                    ajrl2 = (ajrl)((Map)b).get(value);
                }
                if (ajrl2.b != 1 || !(boolean)ajrl2.c) {
                    hqo.j = false;
                }
                hqo.h = null;
                hqo.f.a(hqo.d);
                tpe.v((View)hqo.d, true);
                return;
            }
            case 8: {
                ((hqo)o).b();
                return;
            }
            case 7: {
                ((hqo)o).c();
                return;
            }
            case 6: {
                ((hqo)o).g();
                return;
            }
            case 5: {
                final hqk hqk = (hqk)o;
                if (hqk.m && hqk.j) {
                    hqk.r.c(hqk.o);
                    hqk.v.c(true);
                    hqk.o = 0;
                    hqk.j = false;
                }
                return;
            }
            case 4: {
                ((euo)o).a();
                return;
            }
            case 3: {
                ((hog)o).D();
                return;
            }
            case 2: {
                ((txy)o).b();
                return;
            }
            case 1: {
                ((guy)o).h();
                return;
            }
            case 0: {
                ((txy)o).c();
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
