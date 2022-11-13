import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.Executors;

// 
// Decompiled by Procyon v0.6.0
// 

final class asbw implements asfo
{
    public asbw() {
    }
    
    @Override
    public final /* bridge */ Object a() {
        final ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(1, asby.k("grpc-timer-%d"));
        try {
            scheduledThreadPool.getClass().getMethod("setRemoveOnCancelPolicy", Boolean.TYPE).invoke(scheduledThreadPool, true);
            goto Label_0061;
        }
        catch (final Exception ex) {
            throw new RuntimeException(ex);
        }
        catch (final RuntimeException ex2) {
            throw ex2;
        }
        catch (final NoSuchMethodException ex3) {
            goto Label_0061;
        }
    }
    
    @Override
    public final /* bridge */ void b(final Object o) {
        ((ScheduledExecutorService)o).shutdown();
    }
}
