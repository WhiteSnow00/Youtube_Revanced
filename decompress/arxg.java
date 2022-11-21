import java.util.logging.Level;
import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class arxg
{
    static final arxh a;
    
    static {
        final AtomicReference atomicReference = new AtomicReference();
        Object a2;
        try {
            a2 = (arxh)Class.forName("io.grpc.override.ContextStorageOverride").asSubclass(arxh.class).getConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]);
        }
        catch (final Exception ex) {
            throw new RuntimeException("Storage override failed to initialize", ex);
        }
        catch (final ClassNotFoundException ex2) {
            atomicReference.set(ex2);
            a2 = new asaf();
        }
        a = (arxh)a2;
        final Throwable t = atomicReference.get();
        if (t != null) {
            arxi.a.logp(Level.FINE, "io.grpc.Context$LazyStorage", "<clinit>", "Storage override doesn't exist. Using default", t);
        }
    }
}
