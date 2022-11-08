import java.util.List;
import com.google.protos.youtube.api.innertube.ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint;
import java.util.Map;
import java.util.concurrent.Executor;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fwa implements vau
{
    public final atjj a;
    public final tny b;
    public final acha c;
    private final Context d;
    private final vrk e;
    private final zoj f;
    private final Executor g;
    
    public fwa(final Context d, final vrk e, final atjj a, final tny b, final acha c, final zoj f, final Executor g) {
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
    
    public final void b(final aioe aioe, final Map map, final ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint modifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint, final boolean c) {
        final vrg a = this.e.a();
        a.c = c;
        a.d = xkm.W(this.d, this.f);
        a.a = modifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint.b;
        final String[] array = ((List)modifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint.c).toArray(new String[0]);
        array.getClass();
        a.b = array;
        ((vii)a).k(aioe.c.I());
        final Object m = tmy.M(map, (Object)"com.google.android.libraries.youtube.innertube.endpoint.tag");
        final zpo zpo = (zpo)tmy.O(map, (Object)"notification_data", (Class)zpo.class);
        final vrk e = this.e;
        Object o;
        if (m instanceof fvj) {
            o = new fvz((fvj)m);
        }
        else if (m instanceof fvw) {
            o = new fvx((fvw)m);
        }
        else {
            o = new feq();
        }
        e.b(a, (znj)new fvy(this, aioe, (feq)o, map, zpo, null, null));
    }
    
    public final void mE(final aioe aioe, final Map map) {
        final ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint modifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint = (ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint)((agzd)aioe).rr((agyr)ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint.modifyChannelNotificationPreferenceEndpoint);
        ((vax)this.a.a()).d((List)modifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint.d, map);
        tcp.k(this.f.c(), this.g, (tcn)new gfj(this, aioe, map, modifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint, 1), (tco)new fdd(this, aioe, map, modifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint, 2));
    }
}
