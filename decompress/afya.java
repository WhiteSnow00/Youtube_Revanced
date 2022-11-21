import com.google.common.util.concurrent.ListenableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

final class afya extends afxg
{
    final afyc a;
    private final afvp b;
    
    public afya(final afyc a, final afvp b) {
        this.a = a;
        b.getClass();
        this.b = b;
    }
    
    @Override
    public final /* bridge */ Object a() {
        final ListenableFuture a = this.b.a();
        a.getClass();
        return a;
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
    public final /* bridge */ void e(final Object o) {
        ((afvd)this.a).setFuture((ListenableFuture)o);
    }
    
    @Override
    public final boolean g() {
        return ((afvd)this.a).isDone();
    }
}
