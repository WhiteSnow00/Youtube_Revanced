import io.grpc.Status;

// 
// Decompiled by Procyon v0.6.0
// 

final class asdj implements UncaughtExceptionHandler
{
    public asdj() {
    }
    
    @Override
    public final void uncaughtException(final Thread thread, final Throwable t) {
        throw Status.b(t).withDescription("Uncaught exception in the SynchronizationContext. Re-thrown.").d();
    }
}
