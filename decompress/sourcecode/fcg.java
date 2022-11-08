import com.google.protos.youtube.api.innertube.CoWatchWatchEndpointWrapperCommandOuterClass$CoWatchWatchEndpointWrapperCommand;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fcg implements vau
{
    public final arhr a;
    public final arhr b;
    private final vbq c;
    private final asho d;
    private final vax e;
    private final zki f;
    
    public fcg(final arhr a, final arhr b, final vbq c, final zki f, final asho d, final vax e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.f = f;
        this.d = d;
        this.e = e;
    }
    
    public final void b(final aioe aioe, final Map map) {
        this.e.c(aioe, map);
    }
    
    public final void mE(aioe aioe, final Map map) {
        final CoWatchWatchEndpointWrapperCommandOuterClass$CoWatchWatchEndpointWrapperCommand coWatchWatchEndpointWrapperCommandOuterClass$CoWatchWatchEndpointWrapperCommand = (CoWatchWatchEndpointWrapperCommandOuterClass$CoWatchWatchEndpointWrapperCommand)((agzd)aioe).rr((agyr)CoWatchWatchEndpointWrapperCommandOuterClass$CoWatchWatchEndpointWrapperCommand.coWatchWatchEndpointWrapperCommand);
        if ((coWatchWatchEndpointWrapperCommandOuterClass$CoWatchWatchEndpointWrapperCommand.b & 0x1) != 0x0) {
            if (((tul)this.a.a()).a() != tuj.g) {
                if ((aioe = coWatchWatchEndpointWrapperCommandOuterClass$CoWatchWatchEndpointWrapperCommand.c) == null) {
                    aioe = aioe.a;
                }
                this.b(aioe, map);
                return;
            }
            ((vdo)this.c.a(this.f.c())).f(coWatchWatchEndpointWrapperCommandOuterClass$CoWatchWatchEndpointWrapperCommand.e).E(this.d).p((asir)new fcf(this, coWatchWatchEndpointWrapperCommandOuterClass$CoWatchWatchEndpointWrapperCommand, map, 0)).s((asix)new gna(this, coWatchWatchEndpointWrapperCommandOuterClass$CoWatchWatchEndpointWrapperCommand, map, 1)).q((asix)ezm.f).ab();
        }
    }
}
