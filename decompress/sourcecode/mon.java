import android.app.Activity;
import android.content.Context;
import android.app.AlertDialog$Builder;
import android.os.Bundle;
import android.content.DialogInterface;
import android.content.DialogInterface$OnCancelListener;
import android.app.Dialog;
import android.app.DialogFragment;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mon extends DialogFragment
{
    public Dialog a;
    public DialogInterface$OnCancelListener b;
    private Dialog c;
    
    public final void onCancel(final DialogInterface dialogInterface) {
        final DialogInterface$OnCancelListener b = this.b;
        if (b != null) {
            b.onCancel(dialogInterface);
        }
    }
    
    public final Dialog onCreateDialog(final Bundle bundle) {
        Dialog dialog;
        if ((dialog = this.a) == null) {
            this.setShowsDialog(false);
            if (this.c == null) {
                final Activity activity = this.getActivity();
                kgk.aL((Object)activity);
                this.c = (Dialog)new AlertDialog$Builder((Context)activity).create();
            }
            dialog = this.c;
        }
        return dialog;
    }
}
