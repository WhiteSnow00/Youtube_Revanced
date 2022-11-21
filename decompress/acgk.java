import android.content.DialogInterface;
import android.content.DialogInterface$OnDismissListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acgk implements DialogInterface$OnDismissListener
{
    public final acgl a;
    public final aslm b;
    public final ojn c;
    public final ojo d;
    
    public acgk(final acgl a, final aslm b, final ojn c, final ojo d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final void onDismiss(final DialogInterface dialogInterface) {
        final acgl a = this.a;
        final aslm b = this.b;
        final ojn c = this.c;
        final ojo d = this.d;
        b.dispose();
        if (c != null) {
            c.d();
        }
        if (a.c == dialogInterface) {
            if (d.i != -1) {
                a.a.setRequestedOrientation(a.b);
            }
        }
    }
}
