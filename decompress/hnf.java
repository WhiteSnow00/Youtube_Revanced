import com.google.protos.youtube.api.innertube.ReelNonVideoContentEndpointOuterClass$ReelNonVideoContentEndpoint;
import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hnf
{
    public final long a;
    public final boolean b;
    public final boolean c;
    public final ahab d;
    public aiqj e;
    public akqn f;
    public hoc g;
    public long h;
    
    public hnf(final long a, final aiqj e, final ahab d, final boolean b, final boolean c) {
        this.h = Long.MIN_VALUE;
        final boolean ry = ((ahbc)e).ry((ahaq)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
        boolean b2 = true;
        if (!ry) {
            b2 = (((ahbc)e).ry((ahaq)ReelNonVideoContentEndpointOuterClass$ReelNonVideoContentEndpoint.reelNonVideoContentEndpoint) && b2);
        }
        adkp.Q(b2);
        this.a = a;
        e.getClass();
        this.e = e;
        this.d = d;
        this.b = b;
        this.c = c;
    }
    
    public final ReelNonVideoContentEndpointOuterClass$ReelNonVideoContentEndpoint a() {
        return (ReelNonVideoContentEndpointOuterClass$ReelNonVideoContentEndpoint)((ahbc)this.e).rx((ahaq)ReelNonVideoContentEndpointOuterClass$ReelNonVideoContentEndpoint.reelNonVideoContentEndpoint);
    }
    
    public final ReelWatchEndpointOuterClass$ReelWatchEndpoint b() {
        return (ReelWatchEndpointOuterClass$ReelWatchEndpoint)((ahbc)this.e).rx((ahaq)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
    }
    
    public final void c(final akqn f) {
        this.f = f;
        if (hko.q(f)) {
            final ahbb ahbb = (ahbb)((ahbh)this.e).toBuilder();
            final ahbf reelWatchEndpoint = ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint;
            final ahaz builder = this.b().toBuilder();
            builder.copyOnWrite();
            final ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint = (ReelWatchEndpointOuterClass$ReelWatchEndpoint)builder.instance;
            reelWatchEndpointOuterClass$ReelWatchEndpoint.i = null;
            reelWatchEndpointOuterClass$ReelWatchEndpoint.b &= 0xFFFFFF7F;
            ahbb.e((ahaq)reelWatchEndpoint, (Object)builder.build());
            this.e = (aiqj)((ahaz)ahbb).build();
        }
    }
    
    public final boolean d() {
        return hko.t(this.e);
    }
    
    public final boolean e() {
        return ((ahbc)this.e).ry((ahaq)ReelNonVideoContentEndpointOuterClass$ReelNonVideoContentEndpoint.reelNonVideoContentEndpoint);
    }
    
    public final boolean f() {
        return ((ahbc)this.e).ry((ahaq)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
    }
}
