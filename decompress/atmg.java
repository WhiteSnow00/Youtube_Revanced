import java.util.concurrent.Executor;
import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atmg
{
    public static final askz a;
    static final askz b;
    static final askz c;
    
    static {
        final asvd asvd = new asvd(5);
        final asmn d = aqvq.d;
        askz a2;
        if (d == null) {
            a2 = aqvq.t((Callable)asvd);
        }
        else {
            a2 = aqvq.s(d, (Callable)asvd);
        }
        a = a2;
        final asvd asvd2 = new asvd(2);
        final asmn c2 = aqvq.c;
        askz b2;
        if (c2 == null) {
            b2 = aqvq.t((Callable)asvd2);
        }
        else {
            b2 = aqvq.s(c2, (Callable)asvd2);
        }
        b = b2;
        final asvd asvd3 = new asvd(3);
        final asmn e = aqvq.e;
        askz c3;
        if (e == null) {
            c3 = aqvq.t((Callable)asvd3);
        }
        else {
            c3 = aqvq.s(e, (Callable)asvd3);
        }
        c = c3;
        final asvd asvd4 = new asvd(4);
        final asmn f = aqvq.f;
        if (f == null) {
            aqvq.t((Callable)asvd4);
            return;
        }
        aqvq.s(f, (Callable)asvd4);
    }
    
    public static askz a() {
        final askz b = atmg.b;
        final asmn g = aqvq.g;
        return b;
    }
    
    public static askz b(final Executor executor) {
        return (askz)new atjo(executor);
    }
    
    public static askz c() {
        final askz c = atmg.c;
        final asmn i = aqvq.i;
        return c;
    }
}
