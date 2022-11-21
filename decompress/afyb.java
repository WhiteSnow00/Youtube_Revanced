import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

final class afyb extends afxg
{
    final afyc a;
    private final Callable b;
    
    public afyb(final afyc a, final Callable b) {
        this.a = a;
        b.getClass();
        this.b = b;
    }
    
    @Override
    public final Object a() {
        return this.b.call();
    }
    
    @Override
    public final String b() {
        return this.b.toString();
    }
    
    @Override
    public final void d(final Throwable exception) {
        ((afvd)this.a).setException(exception);
    }
    
    @Override
    public final void e(final Object o) {
        ((afvd)this.a).set(o);
    }
    
    @Override
    public final boolean g() {
        return ((afvd)this.a).isDone();
    }
}
