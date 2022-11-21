import com.google.common.util.concurrent.ListenableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aczr implements afvq
{
    public final boolean a;
    private final int b;
    
    public aczr(final boolean a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final ListenableFuture a(final Object o) {
        if (this.b != 0) {
            final boolean a = this.a;
            final Void void1 = (Void)o;
            return afxr.l(a);
        }
        final boolean a2 = this.a;
        final aczu aczu = (aczu)o;
        acws.j((aczl)aczu);
        ListenableFuture listenableFuture;
        if (aczu == null) {
            listenableFuture = afxr.l(aczu.a);
        }
        else {
            if (a2) {
                aczu.c = true;
            }
            listenableFuture = afxr.l(aczu);
        }
        return listenableFuture;
    }
}
