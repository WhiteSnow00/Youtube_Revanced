import java.util.concurrent.Executor;
import org.chromium.net.NetworkQualityThroughputListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class auho extends NetworkQualityThroughputListener
{
    private final NetworkQualityThroughputListener a;
    
    public auho(final NetworkQualityThroughputListener a) {
        super(a.getExecutor());
        this.a = a;
    }
    
    public final boolean equals(final Object o) {
        return o != null && o instanceof auho && this.a.equals(((auho)o).a);
    }
    
    public final Executor getExecutor() {
        return this.a.getExecutor();
    }
    
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    public final void onThroughputObservation(final int n, final long n2, final int n3) {
        this.a.onThroughputObservation(n, n2, n3);
    }
}
