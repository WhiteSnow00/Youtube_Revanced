import com.google.apps.tiktok.concurrent.futuresmixin.ParcelableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aekj implements afsz
{
    final /* synthetic */ ParcelableFuture a;
    
    public aekj(final ParcelableFuture a) {
        this.a = a;
    }
    
    public final void b(final Object e) {
        final ParcelableFuture a = this.a;
        a.e = e;
        a.b = true;
        a.a();
    }
    
    public final void rz(final Throwable t) {
        this.a.b(t);
    }
}
