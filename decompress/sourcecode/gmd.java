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

public final class gmd extends glt
{
    public final Context d;
    public final acng e;
    public final abyc f;
    public View g;
    public ImageView h;
    public TextView i;
    public TextView j;
    public TextView k;
    public TextView l;
    public boolean m;
    private final aeby n;
    
    public gmd(final Context d, final acng e, final aeby aeby, final ackz f, final aeby n, final fjp fjp, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        super(aeby, fjp, afcr.r((Object)fkk.l), (byte[])null, (byte[])null, (byte[])null);
        this.d = d;
        this.e = e;
        this.f = (abyc)f;
        this.n = n;
    }
    
    protected final AlertDialog a() {
        final abyy af = this.n.af(this.d);
        final View g = this.g;
        if (g != null) {
            ((AlertDialog$Builder)af).setView(g);
        }
        return ((AlertDialog$Builder)af).create();
    }
    
    public final void e() {
        if (this.g.getParent() instanceof ViewGroup) {
            ((ViewGroup)this.g.getParent()).removeView(this.g);
        }
    }
}
