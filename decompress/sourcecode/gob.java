import android.app.AlertDialog$Builder;
import android.content.DialogInterface$OnClickListener;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protos.youtube.api.innertube.DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint;
import java.util.Map;
import android.app.AlertDialog;
import java.util.concurrent.Executor;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gob implements vau
{
    public final Context a;
    public final tdz b;
    public final Executor c;
    public final addp d;
    private AlertDialog e;
    private final adno f;
    private final aeby g;
    
    public gob(final Context a, final addp d, final tdz b, final Executor c, final adno f, final aeby g, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.a = a;
        this.d = d;
        this.b = b;
        this.c = c;
        this.f = f;
        this.g = g;
    }
    
    public final void b(final aioe aioe, final Map map) {
        agot.D(((agzd)aioe).rs((agyr)DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint.deletePendingUploadEndpoint));
        if (!((DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint)((agzd)aioe).rr((agyr)DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint.deletePendingUploadEndpoint)).d.isEmpty()) {
            final DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint deletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint = (DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint)((agzd)aioe).rr((agyr)DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint.deletePendingUploadEndpoint);
            agot.D(deletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint.d.isEmpty() ^ true);
            final adno f = this.f;
            final ListenableFuture r = afva.r((afrx)new adcd(f, deletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint.d, 9, null), f.c);
            afva.w(r, (afsz)new nol(f, 17, (byte[])null), (Executor)afsl.a);
            tcp.k(r, (Executor)afsl.a, (tcn)new fcb(this, 8), (tco)new fdd(this, deletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint, aioe, map, 4));
            return;
        }
        this.c();
    }
    
    public final void c() {
        tmy.x(this.a, 2132017845, 1);
    }
    
    public final void mE(final aioe aioe, final Map map) {
        if (this.g.ai()) {
            final AlertDialog e = this.e;
            if (e != null) {
                e.dismiss();
            }
            this.e = this.g.af(this.a).setMessage(2132017862).setNegativeButton(17039360, (DialogInterface$OnClickListener)null).setPositiveButton((CharSequence)this.a.getString(2132017864), (DialogInterface$OnClickListener)new gio(this, aioe, map, 5)).create();
        }
        else {
            if (this.e == null) {
                this.e = new AlertDialog$Builder(this.a).setMessage(2132017862).setNegativeButton(17039360, (DialogInterface$OnClickListener)null).create();
            }
            this.e.setButton(-1, (CharSequence)this.a.getString(2132017864), (DialogInterface$OnClickListener)new gio(this, aioe, map, 6));
        }
        this.e.show();
    }
}
