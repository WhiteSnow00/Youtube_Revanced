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

public final class gnm implements vcv
{
    public final Activity a;
    public final tgd b;
    private final tqd c;
    private final Executor d;
    private AlertDialog e;
    private final adfq f;
    private final aeea g;
    
    public gnm(final Activity a, final tgd b, final adfq f, final tqd c, final Executor d, final aeea g, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
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
    
    public final void b(final aiqj aiqj, final Object o) {
        final vwo a = this.f.a();
        ((vkk)a).j(vdh.a(aiqj));
        a.a = ((DeleteVideoEndpointOuterClass$DeleteVideoEndpoint)((ahbc)aiqj).rx((ahaq)DeleteVideoEndpointOuterClass$DeleteVideoEndpoint.deleteVideoEndpoint)).c;
        teu.l(this.f.d((vls)a), this.d, (tes)new fcf(this.c, 6), (tet)new fcy(this, aiqj, o, 3), afwb.a);
    }
    
    public final void mE(final aiqj aiqj, final Map map) {
        if (this.g.ao()) {
            final AlertDialog e = this.e;
            if (e != null) {
                e.dismiss();
            }
            this.e = this.g.al((Context)this.a).setMessage(2132017863).setNegativeButton(17039360, (DialogInterface$OnClickListener)null).setPositiveButton((CharSequence)this.a.getString(2132017865), (DialogInterface$OnClickListener)new giw(this, aiqj, map, 2)).create();
        }
        else {
            if (this.e == null) {
                this.e = new AlertDialog$Builder((Context)this.a).setMessage(2132017863).setNegativeButton(17039360, (DialogInterface$OnClickListener)null).create();
            }
            this.e.setButton(-1, (CharSequence)this.a.getString(2132017865), (DialogInterface$OnClickListener)new giw(this, aiqj, map, 3));
        }
        this.e.show();
    }
}
