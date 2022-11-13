import com.google.common.util.concurrent.ListenableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acye implements aftz
{
    public final boolean a;
    private final int b;
    
    public acye(final boolean a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final ListenableFuture a(final Object o) {
        if (this.b != 0) {
            final boolean a = this.a;
            final Void void1 = (Void)o;
            return afwm.m((Object)a);
        }
        final boolean a2 = this.a;
        final acyh acyh = (acyh)o;
        acvg.p((acxy)acyh);
        ListenableFuture listenableFuture;
        if (acyh == null) {
            listenableFuture = afwm.m((Object)acyh.a);
        }
        else {
            if (a2) {
                acyh.c = true;
            }
            listenableFuture = afwm.m((Object)acyh);
        }
        return listenableFuture;
    }
}
