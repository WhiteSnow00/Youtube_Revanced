import java.util.List;
import java.util.Iterator;
import com.google.protos.youtube.api.innertube.SubscribeEndpointOuterClass$SubscribeEndpoint;
import java.util.Map;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fwt implements vcv
{
    public final tqd a;
    public final atke b;
    public final acjd c;
    private final zqe d;
    private final Context e;
    private final vaf f;
    private final aadx g;
    
    public fwt(final Context e, final aadx g, final tqd a, final atke b, final acjd c, final zqe d, final vaf f, final byte[] array, final byte[] array2, final byte[] array3) {
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
    
    public final void b(final aiqj aiqj, final Map map, final boolean e) {
        final fwv fwv = (fwv)tpe.O(map, (Object)"com.google.android.libraries.youtube.innertube.endpoint.tag", (Class)fwv.class);
        if (fwv != null) {
            final Object b = fwv.b;
            if (b != null) {
                ((fwu)b).a();
            }
        }
        final boolean b2 = fwv != null && fwv.a;
        final vwe f = this.g.f();
        final SubscribeEndpointOuterClass$SubscribeEndpoint subscribeEndpointOuterClass$SubscribeEndpoint = (SubscribeEndpointOuterClass$SubscribeEndpoint)((ahbc)aiqj).rx((ahaq)SubscribeEndpointOuterClass$SubscribeEndpoint.subscribeEndpoint);
        final Iterator<Object> iterator = ((List<Object>)subscribeEndpointOuterClass$SubscribeEndpoint.b).iterator();
        while (iterator.hasNext()) {
            f.w((String)iterator.next());
        }
        if (!subscribeEndpointOuterClass$SubscribeEndpoint.d.isEmpty()) {
            f.b = subscribeEndpointOuterClass$SubscribeEndpoint.d;
        }
        if (((ahbc)aiqj).ry((ahaq)anzh.b)) {
            final anzg anzg = (anzg)((ahbc)aiqj).rx((ahaq)anzh.b);
            if (!anzg.c.isEmpty()) {
                ((vkk)f).l(anzg.c);
            }
        }
        f.a = subscribeEndpointOuterClass$SubscribeEndpoint.c;
        ((vkk)f).j(aiqj.c);
        alxp alxp;
        if ((alxp = this.f.b().e) == null) {
            alxp = alxp.a;
        }
        if (alxp.ab) {
            final boolean d = this.d.d(this.e);
            final long a = this.d.a();
            final ahaz c = f.c;
            c.copyOnWrite();
            final amro amro = (amro)c.instance;
            final amro a2 = amro.a;
            amro.b |= 0x1;
            amro.c = d;
            final ahaz c2 = f.c;
            c2.copyOnWrite();
            final amro amro2 = (amro)c2.instance;
            amro2.b |= 0x2;
            amro2.d = a;
            final ahaz c3 = f.c;
            c3.copyOnWrite();
            final amro amro3 = (amro)c3.instance;
            amro3.b |= 0x4;
            amro3.e = e;
        }
        final acfb acfb = (acfb)tpe.O(map, (Object)"command_status_callback", (Class)acfb.class);
        aslr b3;
        if (acfb != null && !acfb.a()) {
            b3 = acfb.b();
        }
        else {
            b3 = null;
        }
        this.g.i(f, (zpf)new fws(this, map, subscribeEndpointOuterClass$SubscribeEndpoint, b2, fwv, b3, aiqj));
    }
    
    public final void mE(final aiqj aiqj, final Map map) {
        alxp alxp;
        if ((alxp = this.f.b().e) == null) {
            alxp = alxp.a;
        }
        if (alxp.ab) {
            teu.k(this.d.c(), teu.a, (tes)new fwr(this, aiqj, map, 0), (tet)new fcy(this, aiqj, map, 2));
            return;
        }
        this.b(aiqj, map, false);
    }
}
