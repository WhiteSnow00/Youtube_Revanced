import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface$OnCancelListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class bf implements DialogInterface$OnCancelListener
{
    final /* synthetic */ bi a;
    
    public bf(final bi a) {
        this.a = a;
    }
    
    public final void onCancel(final DialogInterface dialogInterface) {
        final bi a = this.a;
        final Dialog d = a.d;
        if (d != null) {
            a.onCancel((DialogInterface)d);
        }
    }
}
