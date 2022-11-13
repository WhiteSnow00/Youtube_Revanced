import android.os.Bundle;
import j$.util.Optional;
import android.net.Uri;
import java.io.File;
import j$.util.function.Function$_CC;
import java.util.function.Function;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hpl implements Function
{
    public static final hpl a;
    public static final hpl b;
    public static final hpl c;
    public static final hpl d;
    public static final hpl e;
    public static final hpl f;
    public static final hpl g;
    public static final hpl h;
    public static final hpl i;
    public static final hpl j;
    public static final hpl k;
    public static final hpl l;
    public static final hpl m;
    public static final hpl n;
    public static final hpl o;
    public static final hpl p;
    public static final hpl q;
    public static final hpl r;
    public static final hpl s;
    public static final hpl t;
    public static final hpl u;
    private final int v;
    
    static {
        u = new hpl(20);
        t = new hpl(19);
        s = new hpl(18);
        r = new hpl(17);
        q = new hpl(16);
        p = new hpl(15);
        o = new hpl(14);
        n = new hpl(13);
        m = new hpl(12);
        l = new hpl(11);
        k = new hpl(10);
        j = new hpl(9);
        i = new hpl(8);
        h = new hpl(7);
        g = new hpl(6);
        f = new hpl(5);
        e = new hpl(4);
        d = new hpl(3);
        c = new hpl(2);
        b = new hpl(1);
        a = new hpl(0);
    }
    
    private hpl(final int v) {
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
                return ((kau)o).b;
            }
            case 19: {
                return new File((String)o).toURI();
            }
            case 18: {
                return ((adjz)o).h;
            }
            case 17: {
                return Optional.ofNullable((Object)((Uri)o).getQueryParameter("videoFileUri"));
            }
            case 16: {
                return ((Uri)o).toString();
            }
            case 15: {
                return ((hsi)o).a();
            }
            case 14: {
                return ((hog)o).u();
            }
            case 13: {
                return o;
            }
            case 12: {
                return ((ggq)o).og().f("reel_watch_fragment_watch_while");
            }
            case 11: {
                return o;
            }
            case 10: {
                return ((hpb)o).og().f("reel_watch_fragment_in_pager");
            }
            case 9: {
                return o;
            }
            case 8: {
                return ((ggq)o).og().f("reel_watch_pager_fragment");
            }
            case 7: {
                return o;
            }
            case 6: {
                return ((hoe)o).n();
            }
            case 5: {
                return ((hpb)o).p();
            }
            case 4: {
                return ((hoe)o).l();
            }
            case 3: {
                return ((hpb)o).aK();
            }
            case 2: {
                return o;
            }
            case 1: {
                return ((cl)o).f("reel_browse_fragment_in_pager");
            }
            case 0: {
                return ((Bundle)o).getBundle("ReelWatchFragmentArgs");
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
