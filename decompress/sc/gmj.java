import com.google.protos.youtube.api.innertube.ExecuteEntityCommandOuterClass$ExecuteEntityCommand;
import com.google.protos.youtube.api.innertube.CoWatchCommandOuterClass$CoWatchCommand;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gmj extends abjl
{
    private final vdr a;
    private final ril b;
    
    public gmj(final vdr a, final ril b) {
        this.a = a;
        this.b = b;
    }
    
    private static aiqj g() {
        final ahbb ahbb = (ahbb)((ahbh)aiqj.a).createBuilder();
        ahbb.e((ahaq)WatchEndpointOuterClass.watchEndpoint, (Object)apsk.a);
        return (aiqj)((ahaz)ahbb).build();
    }
    
    public final ahaq a() {
        return (ahaq)CoWatchCommandOuterClass$CoWatchCommand.coWatchCommand;
    }
    
    public final /* bridge */ aiqj b(final Object o) {
        aiqj aiqj;
        if ((aiqj = ((CoWatchCommandOuterClass$CoWatchCommand)o).c) == null) {
            aiqj = aiqj.a;
        }
        final ExecuteEntityCommandOuterClass$ExecuteEntityCommand executeEntityCommandOuterClass$ExecuteEntityCommand = (ExecuteEntityCommandOuterClass$ExecuteEntityCommand)((ahbc)aiqj).rx((ahaq)ExecuteEntityCommandOuterClass$ExecuteEntityCommand.executeEntityCommand);
        aiqj aiqj2;
        if ((executeEntityCommandOuterClass$ExecuteEntityCommand.b & 0x1) != 0x0) {
            final aiqf aiqf = (aiqf)((vfp)this.a.a(this.b.c())).f(executeEntityCommandOuterClass$ExecuteEntityCommand.c).j((Class)aiqf.class).af();
            if (aiqf == null) {
                aiqj2 = g();
            }
            else {
                aiqj2 = aiqf.getCommand();
            }
        }
        else {
            aiqj2 = g();
        }
        return aiqj2;
    }
}
