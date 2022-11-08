import java.util.List;
import com.google.protos.youtube.api.innertube.ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

final class fvy implements znj
{
    final /* synthetic */ fwa a;
    private final aioe b;
    private final Map c;
    private final zpo d;
    private final feq e;
    
    public fvy(final fwa a, final aioe b, final feq e, final Map c, final zpo d, final byte[] array, final byte[] array2) {
        this.a = a;
        this.b = b;
        this.e = e;
        this.c = c;
        this.d = d;
    }
    
    public final void a(final dbi dbi) {
        trn.d("Error rating", (Throwable)dbi);
        this.a.b.e((Throwable)dbi);
        final ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint modifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint = (ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint)((agzd)this.b).rr((agyr)ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint.modifyChannelNotificationPreferenceEndpoint);
        if (modifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint.g.size() > 0) {
            ((vax)this.a.a.a()).e((List)modifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint.g, (Object)this.d);
        }
        this.e.e();
    }
}
