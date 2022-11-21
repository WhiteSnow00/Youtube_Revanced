import com.google.common.util.concurrent.ListenableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

final class afuv implements Runnable
{
    final afvd a;
    final ListenableFuture b;
    
    public afuv(final afvd a, final ListenableFuture b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void run() {
        final afvd a = this.a;
        final afuo h = afvd.h;
        if (a.value != this) {
            return;
        }
        if (afvd.h.f(this.a, this, afvd.g(this.b))) {
            afvd.i(this.a, false);
        }
    }
}
