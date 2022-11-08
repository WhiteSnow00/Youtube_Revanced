import java.util.List;
import java.util.Iterator;
import com.google.protos.youtube.api.innertube.SubscribeEndpointOuterClass$SubscribeEndpoint;
import java.util.Map;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fwl implements vau
{
    public final tny a;
    public final atjj b;
    public final acha c;
    private final zoj d;
    private final Context e;
    private final uyf f;
    private final aaca g;
    
    public fwl(final Context e, final aaca g, final tny a, final atjj b, final acha c, final zoj d, final uyf f, final byte[] array, final byte[] array2, final byte[] array3) {
        g.getClass();
        this.g = g;
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
        c.getClass();
        this.c = c;
        d.getClass();
        this.d = d;
        e.getClass();
        this.e = e;
        f.getClass();
        this.f = f;
    }
    
    public final void b(final aioe aioe, final Map map, final boolean e) {
        final fwn fwn = (fwn)tmy.O(map, (Object)"com.google.android.libraries.youtube.innertube.endpoint.tag", (Class)fwn.class);
        if (fwn != null) {
            final Object b = fwn.b;
            if (b != null) {
                ((fwm)b).a();
            }
        }
        final boolean b2 = fwn != null && fwn.a;
        final vub f = this.g.f();
        final SubscribeEndpointOuterClass$SubscribeEndpoint subscribeEndpointOuterClass$SubscribeEndpoint = (SubscribeEndpointOuterClass$SubscribeEndpoint)((agzd)aioe).rr((agyr)SubscribeEndpointOuterClass$SubscribeEndpoint.subscribeEndpoint);
        final Iterator<Object> iterator = ((List<Object>)subscribeEndpointOuterClass$SubscribeEndpoint.b).iterator();
        while (iterator.hasNext()) {
            f.w((String)iterator.next());
        }
        if (!subscribeEndpointOuterClass$SubscribeEndpoint.d.isEmpty()) {
            f.b = subscribeEndpointOuterClass$SubscribeEndpoint.d;
        }
        if (((agzd)aioe).rs((agyr)anxe.b)) {
            final anxd anxd = (anxd)((agzd)aioe).rr((agyr)anxe.b);
            if (!anxd.c.isEmpty()) {
                ((vii)f).l(anxd.c);
            }
        }
        f.a = subscribeEndpointOuterClass$SubscribeEndpoint.c;
        ((vii)f).j(aioe.c);
        alvl alvl;
        if ((alvl = this.f.b().e) == null) {
            alvl = alvl.a;
        }
        if (alvl.ab) {
            final boolean d = this.d.d(this.e);
            final long a = this.d.a();
            final agza c = f.c;
            c.copyOnWrite();
            final ampk ampk = (ampk)c.instance;
            final ampk a2 = ampk.a;
            ampk.b |= 0x1;
            ampk.c = d;
            final agza c2 = f.c;
            c2.copyOnWrite();
            final ampk ampk2 = (ampk)c2.instance;
            ampk2.b |= 0x2;
            ampk2.d = a;
            final agza c3 = f.c;
            c3.copyOnWrite();
            final ampk ampk3 = (ampk)c3.instance;
            ampk3.b |= 0x4;
            ampk3.e = e;
        }
        final accz accz = (accz)tmy.O(map, (Object)"command_status_callback", (Class)accz.class);
        aslc b3;
        if (accz != null && !accz.a()) {
            b3 = accz.b();
        }
        else {
            b3 = null;
        }
        this.g.i(f, (znj)new fwk(this, map, subscribeEndpointOuterClass$SubscribeEndpoint, b2, fwn, b3, aioe));
    }
    
    public final void mE(final aioe aioe, final Map map) {
        alvl alvl;
        if ((alvl = this.f.b().e) == null) {
            alvl = alvl.a;
        }
        if (alvl.ab) {
            tcp.k(this.d.c(), tcp.a, (tcn)new fwj(this, aioe, map, 0), (tco)new fct(this, aioe, map, 2));
            return;
        }
        this.b(aioe, map, false);
    }
}
