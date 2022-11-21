import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asnf
{
    public static final asmn a;
    public static final Runnable b;
    public static final asmc c;
    public static final asmi d;
    public static final asmi e;
    public static final asmo f;
    public static final asmo g;
    public static final atrh h;
    
    static {
        a = new asnc();
        b = new asna();
        c = new asmy();
        d = new asmz();
        e = new asne();
        h = new atrh();
        f = new adlc(16);
        g = new adlc(15);
    }
    
    public static asmn a(final Class clazz) {
        return new asmx(clazz);
    }
    
    public static asmn b(final Object o) {
        return new asnd(o);
    }
    
    public static asmn c(final asme asme) {
        asng.b(asme, "f is null");
        return (asmn)new ore(asme, 2);
    }
    
    public static asmn d(final asmj asmj) {
        asng.b(asmj, "f is null");
        return (asmn)new ore(asmj, 3);
    }
    
    public static asmn e(final asmk asmk) {
        asng.b(asmk, "f is null");
        return (asmn)new ore(asmk, 4);
    }
    
    public static asmn f(final asml asml) {
        asng.b(asml, "f is null");
        return (asmn)new ore(asml, 5);
    }
    
    public static asmn g(final asmm asmm) {
        asng.b(asmm, "f is null");
        return (asmn)new ore(asmm, 6);
    }
    
    public static Callable h(final Object o) {
        return new asnd(o);
    }
}
