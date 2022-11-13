import com.google.common.util.concurrent.SettableFuture;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class aelu
{
    public static final ListenableFuture a(final aelt aelt, final TimeUnit timeUnit, final ScheduledExecutorService scheduledExecutorService) {
        final SettableFuture create = SettableFuture.create();
        final ListenableFuture t = afwm.t((ListenableFuture)create, 24L, timeUnit, scheduledExecutorService);
        create.setFuture(sl.c((ace)new xp(aelt, 20)));
        return t;
    }
    
    public static int b(final int n) {
        int n2 = 1;
        if (n != 1) {
            n2 = 2;
            if (n != 2) {
                n2 = 3;
                if (n != 3) {
                    n2 = 4;
                    if (n != 4) {
                        return 0;
                    }
                }
            }
        }
        return n2;
    }
}
