import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mxl
{
    public final Context a;
    public final mxe b;
    public final mxf c;
    public nly d;
    public nly e;
    private final Executor f;
    
    public mxl(final Context a, final Executor f, final mxe b, final mxf c) {
        this.a = a;
        this.f = f;
        this.b = b;
        this.c = c;
    }
    
    public static ehs a(final nly nly, final ehs ehs) {
        if (!nly.j()) {
            return ehs;
        }
        return (ehs)nly.f();
    }
    
    public final nly b(final Callable callable) {
        final nly a = nmr.a(this.f, callable);
        a.n(this.f, (nls)new mii(this, 5));
        return a;
    }
}
