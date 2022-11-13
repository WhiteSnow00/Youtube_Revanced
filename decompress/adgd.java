import com.google.common.util.concurrent.ListenableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

final class adgd implements aftz
{
    final String a;
    final aezp b;
    final adgf c;
    
    public adgd(final adgf c, final String a, final aezp b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public final /* bridge */ ListenableFuture a(final Object o) {
        final agoe agoe = (agoe)o;
        ListenableFuture listenableFuture;
        if (agoe != null) {
            listenableFuture = afwm.m((Object)agoe);
        }
        else {
            listenableFuture = this.c.e(this.a, false, this.b);
        }
        return listenableFuture;
    }
}
