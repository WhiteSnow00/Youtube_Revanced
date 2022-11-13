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

public final class goi implements vcv
{
    public final Context a;
    public final tgd b;
    public final Executor c;
    public final adfq d;
    private AlertDialog e;
    private final adpp f;
    private final aeea g;
    
    public goi(final Context a, final adfq d, final tgd b, final Executor c, final adpp f, final aeea g, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.a = a;
        this.d = d;
        this.b = b;
        this.c = c;
        this.f = f;
        this.g = g;
    }
    
    public final void b(final aiqj aiqj, final Map map) {
        adkp.Q(((ahbc)aiqj).ry((ahaq)DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint.deletePendingUploadEndpoint));
        if (!((DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint)((ahbc)aiqj).rx((ahaq)DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint.deletePendingUploadEndpoint)).d.isEmpty()) {
            final DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint deletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint = (DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint)((ahbc)aiqj).rx((ahaq)DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint.deletePendingUploadEndpoint);
            adkp.Q(deletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint.d.isEmpty() ^ true);
            final adpp f = this.f;
            final ListenableFuture r = afwm.r((afty)new adef(f, deletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint.d, 8, null), f.c);
            afwm.w(r, (afva)new npp(f, 17, (byte[])null), (Executor)afum.a);
            teu.k(r, (Executor)afum.a, (tes)new fcf(this, 8), (tet)new fdh(this, deletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint, aiqj, map, 4));
            return;
        }
        this.c();
    }
    
    public final void c() {
        tpe.x(this.a, 2132017846, 1);
    }
    
    public final void mE(final aiqj aiqj, final Map map) {
        if (this.g.ao()) {
            final AlertDialog e = this.e;
            if (e != null) {
                e.dismiss();
            }
            this.e = this.g.al(this.a).setMessage(2132017863).setNegativeButton(17039360, (DialogInterface$OnClickListener)null).setPositiveButton((CharSequence)this.a.getString(2132017865), (DialogInterface$OnClickListener)new giw(this, aiqj, map, 5)).create();
        }
        else {
            if (this.e == null) {
                this.e = new AlertDialog$Builder(this.a).setMessage(2132017863).setNegativeButton(17039360, (DialogInterface$OnClickListener)null).create();
            }
            this.e.setButton(-1, (CharSequence)this.a.getString(2132017865), (DialogInterface$OnClickListener)new giw(this, aiqj, map, 6));
        }
        this.e.show();
    }
}
