import java.util.concurrent.Executor;
import com.google.android.youtube.api.jar.client.d;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aejl implements aeou
{
    public static final afik a;
    public final Context b;
    public final Map c;
    public final agjt d;
    private final aftr e;
    
    static {
        a = afik.m("com/google/apps/tiktok/cache/OrphanCacheSingletonSynclet");
    }
    
    public aejl(final Context b, final Map c, final aftr e, final agjt d, final byte[] array, final byte[] array2) {
        this.b = b;
        this.c = c;
        this.e = e;
        this.d = d;
    }
    
    private final ListenableFuture b(final aeol aeol) {
        return this.e.rw(aesm.h((Runnable)new adpd(this, aeol, 8)));
    }
    
    public final ListenableFuture a() {
        return afva.G(new ListenableFuture[] { this.e.rw(aesm.h((Runnable)new d(this, 8))), this.b(aeol.a(1)), this.b(aeol.a(2)) }).j(afva.y(), (Executor)this.e);
    }
}
