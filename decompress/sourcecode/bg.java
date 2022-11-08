import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface$OnDismissListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class bg implements DialogInterface$OnDismissListener
{
    final /* synthetic */ bi a;
    
    public bg(final bi a) {
        this.a = a;
    }
    
    public final void onDismiss(final DialogInterface dialogInterface) {
        final bi a = this.a;
        final Dialog d = a.d;
        if (d != null) {
            a.onDismiss((DialogInterface)d);
        }
    }
}
