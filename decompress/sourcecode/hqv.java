import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hqv
{
    @Deprecated
    public final Map a;
    public final Map b;
    private final wym c;
    
    public hqv(final wym c) {
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = c;
    }
    
    public final wyn a(final ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint) {
        if (reelWatchEndpointOuterClass$ReelWatchEndpoint == null) {
            return this.c.c(alku.j);
        }
        synchronized (this.b) {
            wyn c;
            if ((c = this.b.get(reelWatchEndpointOuterClass$ReelWatchEndpoint)) == null) {
                c = this.c.c(alku.j);
            }
            this.b.put(reelWatchEndpointOuterClass$ReelWatchEndpoint, c);
            return c;
        }
    }
    
    @Deprecated
    public final wyn b(final String s) {
        s.getClass();
        synchronized (this.a) {
            wyn c;
            if ((c = this.a.get(s)) == null) {
                c = this.c.c(alku.j);
            }
            this.a.put(s, c);
            return c;
        }
    }
}
