import java.util.concurrent.Executor;
import org.chromium.net.NetworkQualityRttListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class auhn extends NetworkQualityRttListener
{
    private final NetworkQualityRttListener a;
    
    public auhn(final NetworkQualityRttListener a) {
        super(a.getExecutor());
        this.a = a;
    }
    
    public final boolean equals(final Object o) {
        return o != null && o instanceof auhn && this.a.equals(((auhn)o).a);
    }
    
    public final Executor getExecutor() {
        return this.a.getExecutor();
    }
    
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    public final void onRttObservation(final int n, final long n2, final int n3) {
        this.a.onRttObservation(n, n2, n3);
    }
}
