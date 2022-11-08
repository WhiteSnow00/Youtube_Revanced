import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

final class afui extends afto
{
    final /* synthetic */ afuj a;
    private final Callable b;
    
    public afui(final afuj a, final Callable b) {
        this.a = a;
        b.getClass();
        this.b = b;
    }
    
    public final Object a() {
        return this.b.call();
    }
    
    public final String b() {
        return this.b.toString();
    }
    
    public final void d(final Throwable exception) {
        ((afrl)this.a).setException(exception);
    }
    
    public final void e(final Object o) {
        ((afrl)this.a).set(o);
    }
    
    public final boolean g() {
        return ((afrl)this.a).isDone();
    }
}
