import java.util.List;
import java.util.Iterator;
import com.google.protos.youtube.api.innertube.UnsubscribeEndpointOuterClass$UnsubscribeEndpoint;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fww implements zpf
{
    final Map a;
    final aiqj b;
    final fwv c;
    final aslr d;
    final fca e;
    
    public fww(final fca e, final Map a, final aiqj b, final fwv c, final aslr d, final byte[] array) {
        this.e = e;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final void a(final dbj dbj) {
        ((tqd)this.e.a).e((Throwable)dbj);
        final Iterator<Object> iterator = ((List<Object>)((UnsubscribeEndpointOuterClass$UnsubscribeEndpoint)((ahbc)this.b).rx((ahaq)UnsubscribeEndpointOuterClass$UnsubscribeEndpoint.unsubscribeEndpoint)).c).iterator();
        while (iterator.hasNext()) {
            final htg d = htg.d((acjd)this.e.d, (String)iterator.next());
            if (d != null) {
                ((acjd)this.e.d).d(d.b, (acjb)d);
            }
        }
        final fwv c = this.c;
        if (c != null) {
            final Object b = c.b;
            if (b != null) {
                ((fwu)b).c();
            }
        }
        final aslr d2 = this.d;
        if (d2 != null) {
            d2.b(dbj);
        }
    }
    
    public final void mX(final Object o) {
        final alah alah = (alah)o;
        final Map a = this.a;
        if (a != null && (alah.b & 0x4) != 0x0) {
            final wyw wyw = (wyw)tpe.O(a, (Object)"com.google.android.libraries.youtube.logging.interaction_logger", (Class)wyw.class);
            if (wyw != null) {
                wyw.D((wzz)new wyt(alah.f.I()));
                wyw.t((wzz)new wyt(alah.f.I()), (alhi)null);
            }
        }
        final Iterator<Object> iterator = ((List<Object>)((UnsubscribeEndpointOuterClass$UnsubscribeEndpoint)((ahbc)this.b).rx((ahaq)UnsubscribeEndpointOuterClass$UnsubscribeEndpoint.unsubscribeEndpoint)).c).iterator();
        while (iterator.hasNext()) {
            final htf c = htg.c((String)iterator.next());
            c.d = false;
            c.e(true);
            c.d(alah.g);
            final htg a2 = c.a();
            ((acjd)this.e.d).c(a2.b, (acjb)a2);
        }
        final fwv c2 = this.c;
        if (c2 != null) {
            final Object b = c2.b;
            if (b != null) {
                ((fwu)b).b(null);
            }
        }
        if (alah.e.size() != 0) {
            ((vcy)this.e.b).d((List)alah.e, this.a);
        }
        final aslr d = this.d;
        if (d != null) {
            d.a();
        }
    }
    
    public final void mY() {
    }
}
