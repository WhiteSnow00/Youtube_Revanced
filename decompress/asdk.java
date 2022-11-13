import java.util.logging.LogRecord;
import java.util.logging.Level;
import java.lang.ref.SoftReference;
import java.util.concurrent.atomic.AtomicBoolean;
import java.lang.ref.Reference;
import java.util.concurrent.ConcurrentMap;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asdk extends WeakReference
{
    public static final int a = 0;
    private static final boolean b;
    private static final RuntimeException c;
    private final ReferenceQueue d;
    private final ConcurrentMap e;
    private final String f;
    private final Reference g;
    private final AtomicBoolean h;
    
    static {
        b = Boolean.parseBoolean(System.getProperty("io.grpc.ManagedChannel.enableAllocationTracking", "true"));
        final RuntimeException c2 = new RuntimeException("ManagedChannel allocation site not recorded.  Set -Dio.grpc.ManagedChannel.enableAllocationTracking=true to enable it");
        c2.setStackTrace(new StackTraceElement[0]);
        c = c2;
    }
    
    public asdk(final asdl asdl, final arvx arvx, final ReferenceQueue d, final ConcurrentMap e) {
        super(asdl, d);
        this.h = new AtomicBoolean();
        RuntimeException c;
        if (asdk.b) {
            c = new RuntimeException("ManagedChannel allocation site");
        }
        else {
            c = asdk.c;
        }
        this.g = new SoftReference(c);
        this.f = arvx.toString();
        this.d = d;
        (this.e = e).put(this, this);
        b(d);
    }
    
    static void b(final ReferenceQueue referenceQueue) {
        while (true) {
            final asdk asdk = (asdk)referenceQueue.poll();
            if (asdk == null) {
                break;
            }
            final RuntimeException thrown = asdk.g.get();
            asdk.c();
            if (asdk.h.get()) {
                continue;
            }
            final Level severe = Level.SEVERE;
            if (!asdl.b.isLoggable(severe)) {
                continue;
            }
            final String property = System.getProperty("line.separator");
            final StringBuilder sb = new StringBuilder("*~*~*~ Previous channel {0} was not shutdown properly!!! ~*~*~*");
            sb.append(property);
            sb.append("    Make sure to call shutdown()/shutdownNow() and wait until awaitTermination() returns true.");
            final LogRecord logRecord = new LogRecord(severe, sb.toString());
            logRecord.setLoggerName(asdl.b.getName());
            logRecord.setParameters(new Object[] { asdk.f });
            logRecord.setThrown(thrown);
            asdl.b.log(logRecord);
        }
    }
    
    private final void c() {
        super.clear();
        this.e.remove(this);
        this.g.clear();
    }
    
    public final void a() {
        if (!this.h.getAndSet(true)) {
            this.clear();
        }
    }
    
    @Override
    public final void clear() {
        this.c();
        b(this.d);
    }
}
