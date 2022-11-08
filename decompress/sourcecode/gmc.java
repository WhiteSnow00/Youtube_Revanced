import com.google.protos.youtube.api.innertube.ExecuteEntityCommandOuterClass$ExecuteEntityCommand;
import com.google.protos.youtube.api.innertube.CoWatchCommandOuterClass$CoWatchCommand;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gmc extends abht
{
    private final vbq a;
    private final rgh b;
    
    public gmc(final vbq a, final rgh b) {
        this.a = a;
        this.b = b;
    }
    
    private static aioe g() {
        final agzc agzc = (agzc)((agzi)aioe.a).createBuilder();
        agzc.e((agyr)WatchEndpointOuterClass.watchEndpoint, (Object)apqg.a);
        return (aioe)((agza)agzc).build();
    }
    
    public final agyr a() {
        return CoWatchCommandOuterClass$CoWatchCommand.coWatchCommand;
    }
}
