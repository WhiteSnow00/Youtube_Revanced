import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import android.os.Bundle;
import j$.util.function.Function$_CC;
import java.util.function.Function;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hon implements Function
{
    public static final hon a;
    public static final hon b;
    public static final hon c;
    public static final hon d;
    public static final hon e;
    public static final hon f;
    public static final hon g;
    public static final hon h;
    public static final hon i;
    public static final hon j;
    public static final hon k;
    public static final hon l;
    public static final hon m;
    public static final hon n;
    public static final hon o;
    public static final hon p;
    public static final hon q;
    public static final hon r;
    public static final hon s;
    public static final hon t;
    public static final hon u;
    private final int v;
    
    static {
        u = new hon(20);
        t = new hon(19);
        s = new hon(18);
        r = new hon(17);
        q = new hon(16);
        p = new hon(15);
        o = new hon(14);
        n = new hon(13);
        m = new hon(12);
        l = new hon(11);
        k = new hon(10);
        j = new hon(9);
        i = new hon(8);
        h = new hon(7);
        g = new hon(6);
        f = new hon(5);
        e = new hon(4);
        d = new hon(3);
        c = new hon(2);
        b = new hon(1);
        a = new hon(0);
    }
    
    private hon(final int v) {
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
        boolean b = false;
        switch (v) {
            default: {
                return ((gva)o).n();
            }
            case 19: {
                return o;
            }
            case 18: {
                return ((hoe)o).n();
            }
            case 17: {
                return ((cl)o).f("reel_browse_fragment_in_pager");
            }
            case 16: {
                return ((cl)o).f("reel_browse_fragment_in_pager");
            }
            case 15: {
                return o;
            }
            case 14: {
                return ((cl)o).f("reel_watch_fragment_in_pager");
            }
            case 13: {
                return ((cl)o).f("reel_browse_fragment_in_pager");
            }
            case 12: {
                return ((hoe)o).l();
            }
            case 11: {
                return ((tvn)o).a();
            }
            case 10: {
                alog alog;
                if ((alog = alog.b(((aloa)o).d)) == null) {
                    alog = alog.a;
                }
                return alog;
            }
            case 9: {
                if (((hog)o).v() == ansi.c) {
                    b = true;
                }
                return b;
            }
            case 8: {
                antf antf;
                if ((antf = ((akqn)o).d) == null) {
                    antf = antf.a;
                }
                return antf;
            }
            case 7: {
                final Bundle bundle = (Bundle)o;
                final int cl = how.cl;
                return bundle.getBoolean("ReelWatchFragment.isAtRoot", false);
            }
            case 6: {
                final Bundle bundle2 = (Bundle)o;
                final int cl2 = how.cl;
                return vdb.c(bundle2.getByteArray(gut.a));
            }
            case 5: {
                ansi ansi;
                if ((ansi = ansi.b(((akqn)o).j)) == null) {
                    ansi = ansi.a;
                }
                return ansi;
            }
            case 4: {
                return ((hnf)o).f;
            }
            case 3: {
                return hko.l((ante)o);
            }
            case 2: {
                aiqj aiqj;
                if ((aiqj = ((ReelWatchEndpointOuterClass$ReelWatchEndpoint)o).u) == null) {
                    aiqj = aiqj.a;
                }
                return aiqj;
            }
            case 1: {
                final Bundle bundle3 = (Bundle)o;
                final int cl3 = how.cl;
                return bundle3.getBoolean("ReelWatchFragment.isInWatchWhileActivity", false);
            }
            case 0: {
                final Bundle bundle4 = (Bundle)o;
                final int cl4 = how.cl;
                return bundle4.getBoolean("com.google.android.apps.youtube.ReelWatchActivityIntentCreator.IS_REFERRED_FROM_DISCOVER_KEY", false);
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
