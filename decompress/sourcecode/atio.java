import java.util.concurrent.Executor;
import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atio
{
    public static final asho a;
    static final asho b;
    static final asho c;
    
    static {
        final asrs asrs = new asrs(5);
        final asjc d = aulo.d;
        asho a2;
        if (d == null) {
            a2 = aulo.o((Callable)asrs);
        }
        else {
            a2 = aulo.n(d, (Callable)asrs);
        }
        a = a2;
        final asrs asrs2 = new asrs(2);
        final asjc c2 = aulo.c;
        asho b2;
        if (c2 == null) {
            b2 = aulo.o((Callable)asrs2);
        }
        else {
            b2 = aulo.n(c2, (Callable)asrs2);
        }
        b = b2;
        final asrs asrs3 = new asrs(3);
        final asjc e = aulo.e;
        asho c3;
        if (e == null) {
            c3 = aulo.o((Callable)asrs3);
        }
        else {
            c3 = aulo.n(e, (Callable)asrs3);
        }
        c = c3;
        final asrs asrs4 = new asrs(4);
        final asjc f = aulo.f;
        if (f == null) {
            aulo.o((Callable)asrs4);
            return;
        }
        aulo.n(f, (Callable)asrs4);
    }
    
    public static asho a() {
        final asho b = atio.b;
        final asjc g = aulo.g;
        return b;
    }
    
    public static asho b(final Executor executor) {
        return (asho)new atfz(executor);
    }
    
    public static asho c() {
        final asho c = atio.c;
        final asjc i = aulo.i;
        return c;
    }
}
