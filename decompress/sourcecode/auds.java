import java.util.Collections;
import org.chromium.net.CronetException;
import org.chromium.net.UrlResponseInfo;
import org.chromium.net.RequestFinishedInfo$Metrics;
import java.util.Collection;
import org.chromium.net.RequestFinishedInfo;

// 
// Decompiled by Procyon v0.6.0
// 

public final class auds extends RequestFinishedInfo
{
    private final String a;
    private final Collection b;
    private final RequestFinishedInfo$Metrics c;
    private final int d;
    private final UrlResponseInfo e;
    private final CronetException f;
    
    public auds(final String a, final Collection b, final RequestFinishedInfo$Metrics c, final int d, final UrlResponseInfo e, final CronetException f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public final Collection getAnnotations() {
        Collection<Object> collection;
        if ((collection = this.b) == null) {
            collection = Collections.emptyList();
        }
        return collection;
    }
    
    public final CronetException getException() {
        return this.f;
    }
    
    public final int getFinishedReason() {
        return this.d;
    }
    
    public final RequestFinishedInfo$Metrics getMetrics() {
        return this.c;
    }
    
    public final UrlResponseInfo getResponseInfo() {
        return this.e;
    }
    
    public final String getUrl() {
        return this.a;
    }
}
