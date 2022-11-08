import com.google.android.libraries.elements.interfaces.CachePurgeReason;
import io.grpc.Status;
import com.google.android.libraries.elements.interfaces.CacheStrategyDelegate;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acba extends CacheStrategyDelegate
{
    private final otd a;
    
    public acba(final otd a) {
        this.a = a;
    }
    
    @Override
    public final Status onCacheFull(final long n, final long n2) {
        final otd a = this.a;
        final StringBuilder sb = new StringBuilder("ELMCache: SRS cache is full.\nCurrent cache size: ");
        sb.append(n);
        sb.append("\nCache cap: ");
        sb.append(n2);
        a.b(34, sb.toString());
        return Status.OK;
    }
    
    @Override
    public final Status onCacheInvalid(final String s) {
        this.a.b(34, "ELMCache: SRS cache is invalid. Error details: ".concat(String.valueOf(s)));
        return Status.OK;
    }
    
    @Override
    public final Status onCachePurged(final CachePurgeReason cachePurgeReason) {
        final CachePurgeReason missing_BYTES = CachePurgeReason.MISSING_BYTES;
        final int ordinal = cachePurgeReason.ordinal();
        if (ordinal != 0 && ordinal != 1 && ordinal != 2) {
            String s;
            if (ordinal != 3) {
                if (ordinal == 4) {
                    return Status.OK;
                }
                s = "Unknown";
            }
            else {
                s = "Cache is invalid.";
            }
            this.a.b(34, "ELMCache: SRS cache is purged due to error: ".concat(s));
            return Status.OK;
        }
        return Status.OK;
    }
    
    @Override
    public final Status onErrorReadingResource(final String s) {
        this.a.b(34, "ELMCache: Error reading resource: ".concat(String.valueOf(s)));
        return Status.OK;
    }
}
