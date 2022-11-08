import android.app.AlertDialog$Builder;
import android.content.DialogInterface$OnClickListener;
import android.content.Context;
import java.util.Map;
import com.google.protos.youtube.api.innertube.DeleteVideoEndpointOuterClass$DeleteVideoEndpoint;
import android.app.AlertDialog;
import java.util.concurrent.Executor;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gng implements vau
{
    public final Activity a;
    public final tdz b;
    private final tny c;
    private final Executor d;
    private AlertDialog e;
    private final addp f;
    private final aeby g;
    
    public gng(final Activity a, final tdz b, final addp f, final tny c, final Executor d, final aeby g, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
        f.getClass();
        this.f = f;
        c.getClass();
        this.c = c;
        this.d = d;
        this.g = g;
    }
    
    public final void b(final aioe aioe, final Object o) {
        final vul a = this.f.a();
        ((vii)a).j(vem.c(aioe));
        a.a = ((DeleteVideoEndpointOuterClass$DeleteVideoEndpoint)((agzd)aioe).rr((agyr)DeleteVideoEndpointOuterClass$DeleteVideoEndpoint.deleteVideoEndpoint)).c;
        tcp.l(this.f.d((vjn)a), this.d, (tcn)new fcb(this.c, 6), (tco)new fct(this, aioe, o, 3), afua.a);
    }
    
    public final void mE(final aioe aioe, final Map map) {
        if (this.g.ai()) {
            final AlertDialog e = this.e;
            if (e != null) {
                e.dismiss();
            }
            this.e = this.g.af((Context)this.a).setMessage(2132017862).setNegativeButton(17039360, (DialogInterface$OnClickListener)null).setPositiveButton((CharSequence)this.a.getString(2132017864), (DialogInterface$OnClickListener)new gio(this, aioe, map, 2)).create();
        }
        else {
            if (this.e == null) {
                this.e = new AlertDialog$Builder((Context)this.a).setMessage(2132017862).setNegativeButton(17039360, (DialogInterface$OnClickListener)null).create();
            }
            this.e.setButton(-1, (CharSequence)this.a.getString(2132017864), (DialogInterface$OnClickListener)new gio(this, aioe, map, 3));
        }
        this.e.show();
    }
}
