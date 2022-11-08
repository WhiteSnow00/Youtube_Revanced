import com.google.common.util.concurrent.ListenableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

final class afuh extends afto
{
    final /* synthetic */ afuj a;
    private final afrx b;
    
    public afuh(final afuj a, final afrx b) {
        this.a = a;
        b.getClass();
        this.b = b;
    }
    
    public final String b() {
        return this.b.toString();
    }
    
    public final void d(final Throwable exception) {
        ((afrl)this.a).setException(exception);
    }
    
    public final boolean g() {
        return ((afrl)this.a).isDone();
    }
}
