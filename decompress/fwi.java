import java.util.List;
import com.google.protos.youtube.api.innertube.ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint;
import java.util.Map;
import java.util.concurrent.Executor;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fwi implements vcv
{
    public final atke a;
    public final tqd b;
    public final acjd c;
    private final Context d;
    private final vtn e;
    private final zqe f;
    private final Executor g;
    
    public fwi(final Context d, final vtn e, final atke a, final tqd b, final acjd c, final zqe f, final Executor g) {
        d.getClass();
        this.d = d;
        e.getClass();
        this.e = e;
        this.a = a;
        b.getClass();
        this.b = b;
        this.c = c;
        this.f = f;
        this.g = g;
    }
    
    public final void b(final aiqj aiqj, final Map map, final ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint modifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint, final boolean c) {
        final vtj a = this.e.a();
        a.c = c;
        a.d = xmm.D(this.d, this.f);
        a.a = modifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint.b;
        final String[] array = ((List)modifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint.c).toArray(new String[0]);
        array.getClass();
        a.b = array;
        ((vkk)a).k(aiqj.c.I());
        final Object m = tpe.M(map, (Object)"com.google.android.libraries.youtube.innertube.endpoint.tag");
        final zri zri = (zri)tpe.O(map, (Object)"notification_data", (Class)zri.class);
        final vtn e = this.e;
        Object o;
        if (m instanceof fvr) {
            o = new fwh((fvr)m);
        }
        else if (m instanceof fwe) {
            o = new fwf((fwe)m);
        }
        else {
            o = new fex();
        }
        e.b(a, (zpf)new fwg(this, aiqj, (fex)o, map, zri, null, null));
    }
    
    public final void mE(final aiqj aiqj, final Map map) {
        final ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint modifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint = (ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint)((ahbc)aiqj).rx((ahaq)ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint.modifyChannelNotificationPreferenceEndpoint);
        ((vcy)this.a.a()).d((List)modifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint.d, map);
        teu.k(this.f.c(), this.g, (tes)new gfr(this, aiqj, map, modifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint, 1), (tet)new fdh(this, aiqj, map, modifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint, 2));
    }
}
