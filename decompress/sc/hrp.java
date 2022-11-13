import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hrp
{
    @Deprecated
    public final Map a;
    public final Map b;
    private final xam c;
    
    public hrp(final xam c) {
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = c;
    }
    
    public final xan a(final ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint) {
        if (reelWatchEndpointOuterClass$ReelWatchEndpoint == null) {
            return this.c.c(almx.j);
        }
        synchronized (this.b) {
            xan c;
            if ((c = this.b.get(reelWatchEndpointOuterClass$ReelWatchEndpoint)) == null) {
                c = this.c.c(almx.j);
            }
            this.b.put(reelWatchEndpointOuterClass$ReelWatchEndpoint, c);
            return c;
        }
    }
    
    @Deprecated
    public final xan b(final String s) {
        s.getClass();
        synchronized (this.a) {
            xan c;
            if ((c = this.a.get(s)) == null) {
                c = this.c.c(almx.j);
            }
            this.a.put(s, c);
            return c;
        }
    }
}
