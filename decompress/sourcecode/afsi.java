import java.util.concurrent.Executor;
import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

final class afsi extends afsj
{
    final /* synthetic */ afsk a;
    private final Callable c;
    
    public afsi(final afsk a, final Callable c, final Executor executor) {
        this.a = a;
        super(a, executor);
        c.getClass();
        this.c = c;
    }
    
    public final Object a() {
        return this.c.call();
    }
    
    public final String b() {
        return this.c.toString();
    }
    
    @Override
    public final void c(final Object o) {
        ((afrl)this.a).set(o);
    }
}
