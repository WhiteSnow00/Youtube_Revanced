import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asju
{
    public static final asjc a;
    public static final Runnable b;
    public static final asir c;
    public static final asix d;
    public static final asix e;
    public static final asjd f;
    public static final asjd g;
    public static final asgk h;
    
    static {
        a = (asjc)new asjr();
        b = new asjp();
        c = (asir)new asjn();
        d = (asix)new asjo();
        e = (asix)new asjt();
        h = new asgk();
        f = (asjd)new adhr(7);
        g = (asjd)new adhr(6);
    }
    
    public static asjc a(final Class clazz) {
        return (asjc)new asjm(clazz);
    }
    
    public static asjc b(final Object o) {
        return (asjc)new asjs(o);
    }
    
    public static asjc c(final asit asit) {
        asjv.b(asit, "f is null");
        return (asjc)new opg(asit, 2);
    }
    
    public static asjc d(final asiy asiy) {
        asjv.b(asiy, "f is null");
        return (asjc)new opg(asiy, 3);
    }
    
    public static asjc e(final asiz asiz) {
        asjv.b(asiz, "f is null");
        return (asjc)new opg(asiz, 4);
    }
    
    public static asjc f(final asja asja) {
        asjv.b(asja, "f is null");
        return (asjc)new opg(asja, 5);
    }
    
    public static asjc g(final asjb asjb) {
        asjv.b(asjb, "f is null");
        return (asjc)new opg(asjb, 6);
    }
    
    public static Callable h(final Object o) {
        return (Callable)new asjs(o);
    }
}
