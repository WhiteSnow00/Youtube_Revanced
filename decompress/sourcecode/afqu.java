import com.google.common.util.concurrent.ListenableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

final class afqu extends afqv
{
    public afqu(final ListenableFuture listenableFuture, final Class clazz, final aexg aexg) {
        super(listenableFuture, clazz, (Object)aexg);
    }
    
    public final void d(final Object o) {
        ((afrl)this).set(o);
    }
}
