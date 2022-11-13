import com.google.protos.youtube.api.innertube.InsertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iba extends ibg
{
    public iba(final xnt xnt, final abkz abkz, final tqd tqd, final Context context, final abnl abnl) {
        super(xnt, abkz, tqd, context, abnl);
    }
    
    protected final String b(final aiqj aiqj) {
        final InsertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint insertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint = (InsertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint)((ahbc)aiqj).rx((ahaq)InsertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint.insertInRemoteQueueEndpoint);
        if (((ahbc)aiqj).ry((ahaq)InsertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint.insertInRemoteQueueEndpoint)) {
            return insertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint.c;
        }
        throw new vdj("InsertInRemoteQueueEndpoint not present in the given Command.");
    }
    
    protected final String c(final aiqj aiqj) {
        final InsertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint insertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint = (InsertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint)((ahbc)aiqj).rx((ahaq)InsertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint.insertInRemoteQueueEndpoint);
        if (((ahbc)aiqj).ry((ahaq)InsertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint.insertInRemoteQueueEndpoint)) {
            return insertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint.b;
        }
        throw new vdj("InsertInRemoteQueueEndpoint not present in the given Command.");
    }
    
    protected final void d(final String s) {
        final xnm f = this.f();
        if (f != null && f.a() == 1) {
            f.C(s);
            tpe.x(this.b, 2132020163, 0);
        }
    }
    
    public final void e(final String s) {
        final xnm f = this.f();
        if (f != null && f.a() == 1) {
            f.D(s);
            tpe.x(this.b, 2132020127, 0);
        }
    }
}
