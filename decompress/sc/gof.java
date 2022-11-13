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

public final class gof implements vcv
{
    public final bu a;
    public final tqd b;
    public final vcy c;
    public final Executor d;
    public final vtn e;
    protected AlertDialog f;
    private final aeea g;
    
    public gof(final bu a, final vtn e, final tqd b, final vcy c, final Executor d, final aeea g, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = a;
        this.e = e;
        this.b = b;
        this.c = c;
        this.d = d;
        this.g = g;
    }
    
    public final void mE(final aiqj aiqj, final Map map) {
        final AlertDialog f = this.f;
        if (f != null) {
            f.dismiss();
        }
        final acba al = this.g.al((Context)this.a);
        Object b;
        if (((ahbc)aiqj).ry((ahaq)NotificationOptOutEndpointOuterClass$NotificationOptOutEndpoint.notificationOptOutEndpoint)) {
            final NotificationOptOutEndpointOuterClass$NotificationOptOutEndpoint notificationOptOutEndpointOuterClass$NotificationOptOutEndpoint = (NotificationOptOutEndpointOuterClass$NotificationOptOutEndpoint)((ahbc)aiqj).rx((ahaq)NotificationOptOutEndpointOuterClass$NotificationOptOutEndpoint.notificationOptOutEndpoint);
            ajut ajut;
            if ((notificationOptOutEndpointOuterClass$NotificationOptOutEndpoint.b & 0x8) != 0x0) {
                if ((ajut = notificationOptOutEndpointOuterClass$NotificationOptOutEndpoint.d) == null) {
                    ajut = ajut.a;
                }
            }
            else {
                ajut = null;
            }
            b = acak.b(ajut);
        }
        else {
            b = "";
        }
        (this.f = ((AlertDialog$Builder)al).setMessage((CharSequence)b).setNegativeButton(2132017611, (DialogInterface$OnClickListener)null).setPositiveButton((CharSequence)this.a.getString(2132018939), (DialogInterface$OnClickListener)new giw(this, aiqj, map, 4)).create()).show();
    }
}
