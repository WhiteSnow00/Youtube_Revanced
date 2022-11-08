import java.util.List;
import java.util.Iterator;
import com.google.protos.youtube.api.innertube.SubscribeEndpointOuterClass$SubscribeEndpoint;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

final class fwk implements znj
{
    final /* synthetic */ Map a;
    final /* synthetic */ SubscribeEndpointOuterClass$SubscribeEndpoint b;
    final /* synthetic */ boolean c;
    final /* synthetic */ fwn d;
    final /* synthetic */ aioe e;
    final /* synthetic */ fwl f;
    final /* synthetic */ aslc g;
    
    public fwk(final fwl f, final Map a, final SubscribeEndpointOuterClass$SubscribeEndpoint b, final boolean c, final fwn d, final aslc g, final aioe e) {
        this.f = f;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.g = g;
        this.e = e;
    }
    
    public final void a(final dbi dbi) {
        this.f.a.e((Throwable)dbi);
        final Iterator<Object> iterator = ((List<Object>)((SubscribeEndpointOuterClass$SubscribeEndpoint)((agzd)this.e).rr((agyr)SubscribeEndpointOuterClass$SubscribeEndpoint.subscribeEndpoint)).b).iterator();
        while (iterator.hasNext()) {
            final hsk d = hsk.d(this.f.c, (String)iterator.next());
            if (d != null) {
                final hsj f = d.f();
                f.c(this.c);
                final hsk a = f.a();
                this.f.c.d(a.b, (acgy)a);
            }
        }
        final fwn d2 = this.d;
        if (d2 != null) {
            final Object b = d2.b;
            if (b != null) {
                ((fwm)b).c();
            }
        }
        final aslc g = this.g;
        if (g != null) {
            g.b((Throwable)dbi);
        }
    }
}
