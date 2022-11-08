import java.util.List;
import java.util.Iterator;
import com.google.protos.youtube.api.innertube.UnsubscribeEndpointOuterClass$UnsubscribeEndpoint;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fwo implements znj
{
    final /* synthetic */ Map a;
    final /* synthetic */ aioe b;
    final /* synthetic */ fwn c;
    final /* synthetic */ aslc d;
    final /* synthetic */ fbw e;
    
    public fwo(final fbw e, final Map a, final aioe b, final fwn c, final aslc d, final byte[] array) {
        this.e = e;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final void a(final dbi dbi) {
        ((tny)this.e.a).e((Throwable)dbi);
        final Iterator<Object> iterator = ((List<Object>)((UnsubscribeEndpointOuterClass$UnsubscribeEndpoint)((agzd)this.b).rr((agyr)UnsubscribeEndpointOuterClass$UnsubscribeEndpoint.unsubscribeEndpoint)).c).iterator();
        while (iterator.hasNext()) {
            final hsk d = hsk.d((acha)this.e.d, (String)iterator.next());
            if (d != null) {
                ((acha)this.e.d).d(d.b, (acgy)d);
            }
        }
        final fwn c = this.c;
        if (c != null) {
            final Object b = c.b;
            if (b != null) {
                ((fwm)b).c();
            }
        }
        final aslc d2 = this.d;
        if (d2 != null) {
            d2.b((Throwable)dbi);
        }
    }
}
