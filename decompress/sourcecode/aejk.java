import java.util.concurrent.Executor;
import java.util.concurrent.Callable;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aejk implements aeou
{
    public static final afik a;
    public final Map b;
    private final aftr c;
    private final auip d;
    
    static {
        a = afik.m("com/google/apps/tiktok/cache/OrphanCacheAccountSynclet");
    }
    
    public aejk(final Map b, final auip d, final aftr c, final byte[] array, final byte[] array2, final byte[] array3) {
        this.b = b;
        this.d = d;
        this.c = c;
    }
    
    private final ListenableFuture b(final aeol aeol) {
        final auip d = this.d;
        return afrp.e(((aftr)d.c).rt(aesm.i((Callable)new aejg(d, aeol, 0, (byte[])null, (byte[])null, (byte[])null))), new aeis(this, 5), (Executor)this.c);
    }
    
    public final ListenableFuture a() {
        return afva.G(new ListenableFuture[] { this.b(aeol.a(1)), this.b(aeol.a(2)) }).j(afva.y(), (Executor)this.c);
    }
}
