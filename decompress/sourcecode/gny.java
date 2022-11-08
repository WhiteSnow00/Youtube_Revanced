import android.app.AlertDialog$Builder;
import android.content.DialogInterface$OnClickListener;
import com.google.protos.youtube.api.innertube.NotificationOptOutEndpointOuterClass$NotificationOptOutEndpoint;
import android.content.Context;
import java.util.Map;
import android.app.AlertDialog;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gny implements vau
{
    public final bu a;
    public final tny b;
    public final vax c;
    public final Executor d;
    public final vrk e;
    protected AlertDialog f;
    private final aeby g;
    
    public gny(final bu a, final vrk e, final tny b, final vax c, final Executor d, final aeby g, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = a;
        this.e = e;
        this.b = b;
        this.c = c;
        this.d = d;
        this.g = g;
    }
    
    public final void mE(final aioe aioe, final Map map) {
        final AlertDialog f = this.f;
        if (f != null) {
            f.dismiss();
        }
        final abyy af = this.g.af((Context)this.a);
        Object b;
        if (((agzd)aioe).rs((agyr)NotificationOptOutEndpointOuterClass$NotificationOptOutEndpoint.notificationOptOutEndpoint)) {
            final NotificationOptOutEndpointOuterClass$NotificationOptOutEndpoint notificationOptOutEndpointOuterClass$NotificationOptOutEndpoint = (NotificationOptOutEndpointOuterClass$NotificationOptOutEndpoint)((agzd)aioe).rr((agyr)NotificationOptOutEndpointOuterClass$NotificationOptOutEndpoint.notificationOptOutEndpoint);
            ajsq ajsq;
            if ((notificationOptOutEndpointOuterClass$NotificationOptOutEndpoint.b & 0x8) != 0x0) {
                if ((ajsq = notificationOptOutEndpointOuterClass$NotificationOptOutEndpoint.d) == null) {
                    ajsq = ajsq.a;
                }
            }
            else {
                ajsq = null;
            }
            b = abyh.b(ajsq);
        }
        else {
            b = "";
        }
        (this.f = ((AlertDialog$Builder)af).setMessage((CharSequence)b).setNegativeButton(2132017611, (DialogInterface$OnClickListener)null).setPositiveButton((CharSequence)this.a.getString(2132018938), (DialogInterface$OnClickListener)new gio(this, aioe, map, 4)).create()).show();
    }
}
