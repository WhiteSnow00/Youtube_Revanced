import java.util.logging.Level;
import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class arse
{
    static final arsf a;
    
    static {
        final AtomicReference atomicReference = new AtomicReference();
        Object a2;
        try {
            a2 = (arsf)Class.forName("io.grpc.override.ContextStorageOverride").asSubclass(arsf.class).getConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]);
        }
        catch (final Exception ex) {
            throw new RuntimeException("Storage override failed to initialize", ex);
        }
        catch (final ClassNotFoundException ex2) {
            atomicReference.set(ex2);
            a2 = new arvp();
        }
        a = (arsf)a2;
        final Throwable t = atomicReference.get();
        if (t != null) {
            arsg.c.logp(Level.FINE, "io.grpc.Context$LazyStorage", "<clinit>", "Storage override doesn't exist. Using default", t);
        }
    }
}
