import android.app.AlertDialog$Builder;
import android.view.ViewGroup;
import android.app.AlertDialog;
import android.widget.TextView;
import android.widget.ImageView;
import android.view.View;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gmk extends gmb
{
    public final Context d;
    public final acpk e;
    public final acaf f;
    public View g;
    public ImageView h;
    public TextView i;
    public TextView j;
    public TextView k;
    public TextView l;
    public boolean m;
    private final aeea n;
    
    public gmk(final Context d, final acpk e, final aeea aeea, final acnc f, final aeea n, final fjv fjv, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        super(aeea, fjv, afeq.r((Object)fkr.l), null, null, null, null);
        this.d = d;
        this.e = e;
        this.f = (acaf)f;
        this.n = n;
    }
    
    @Override
    protected final AlertDialog a() {
        final acba al = this.n.al(this.d);
        final View g = this.g;
        if (g != null) {
            ((AlertDialog$Builder)al).setView(g);
        }
        return ((AlertDialog$Builder)al).create();
    }
    
    @Override
    public final void e() {
        if (this.g.getParent() instanceof ViewGroup) {
            ((ViewGroup)this.g.getParent()).removeView(this.g);
        }
    }
}
