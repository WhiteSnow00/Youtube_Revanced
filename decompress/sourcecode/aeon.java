import java.util.concurrent.Executor;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aeon implements aeou
{
    public static final afik a;
    public final Map b;
    public final aftr c;
    
    static {
        a = afik.m("com/google/apps/tiktok/storage/wipeout/WipeoutSynclet");
    }
    
    public aeon(final Map b, final aftr c) {
        this.b = b;
        this.c = c;
    }
    
    public final ListenableFuture a() {
        return afva.r(aesm.c((afrx)new aeiq(this, 6)), (Executor)this.c);
    }
}
