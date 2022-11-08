import io.grpc.Status;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

final class aryr implements Runnable
{
    final /* synthetic */ arys a;
    private final long b;
    
    public aryr(final arys a, final long b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void run() {
        final asau asau = new asau();
        this.a.e.b(asau);
        final long n = Math.abs(this.b) / TimeUnit.SECONDS.toNanos(1L);
        final long abs = Math.abs(this.b);
        final long nanos = TimeUnit.SECONDS.toNanos(1L);
        final StringBuilder sb = new StringBuilder("deadline exceeded after ");
        if (this.b < 0L) {
            sb.append('-');
        }
        sb.append(n);
        sb.append(String.format(Locale.US, ".%09d", abs % nanos));
        sb.append("s. ");
        sb.append(asau);
        this.a.e.c(Status.e.a(sb.toString()));
    }
}
