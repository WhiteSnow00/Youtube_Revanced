import com.google.protos.youtube.api.innertube.AddToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iaz extends ibg
{
    private final kui e;
    private final lag f;
    private final boolean g;
    
    public iaz(final xnt xnt, final abkz abkz, final tqd tqd, final Context context, final abnl abnl, final kui e, final lag f, final vaf vaf) {
        super(xnt, abkz, tqd, context, abnl);
        this.e = e;
        this.f = f;
        ameg ameg;
        if ((ameg = vaf.b().l) == null) {
            ameg = ameg.a;
        }
        this.g = ameg.j;
    }
    
    protected final String b(final aiqj aiqj) {
        final AddToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint addToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint = (AddToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint)((ahbc)aiqj).rx((ahaq)AddToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint.addToRemoteQueueEndpoint);
        if (((ahbc)aiqj).ry((ahaq)AddToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint.addToRemoteQueueEndpoint)) {
            return addToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint.c;
        }
        throw new vdj("AddToRemoteQueueEndpoint not present in the given Command.");
    }
    
    protected final String c(final aiqj aiqj) {
        final AddToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint addToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint = (AddToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint)((ahbc)aiqj).rx((ahaq)AddToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint.addToRemoteQueueEndpoint);
        if (((ahbc)aiqj).ry((ahaq)AddToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint.addToRemoteQueueEndpoint)) {
            return addToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint.b;
        }
        throw new vdj("AddToRemoteQueueEndpoint not present in the given Command.");
    }
    
    protected final void d(final String s) {
        final xnm f = this.f();
        if (f != null && f.a() == 1) {
            f.w(s);
            if (this.g && this.f.c()) {
                this.e.s(1, 2);
            }
            tpe.x(this.b, 2132020163, 0);
        }
    }
    
    public final void e(final String s) {
        final xnm f = this.f();
        if (f != null && f.a() == 1) {
            f.y(s);
            if (this.g && this.f.c()) {
                this.e.s(1, 2);
            }
            tpe.x(this.b, 2132020127, 0);
        }
    }
}
