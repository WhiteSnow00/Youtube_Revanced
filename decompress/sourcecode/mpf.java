import android.content.Context;
import android.app.AlertDialog$Builder;
import android.os.Bundle;
import android.content.DialogInterface;
import android.content.DialogInterface$OnCancelListener;
import android.app.Dialog;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mpf extends bi
{
    public Dialog ae;
    public DialogInterface$OnCancelListener af;
    private Dialog ag;
    
    public final void onCancel(final DialogInterface dialogInterface) {
        final DialogInterface$OnCancelListener af = this.af;
        if (af != null) {
            af.onCancel(dialogInterface);
        }
    }
    
    public final Dialog pI(final Bundle bundle) {
        Dialog dialog;
        if ((dialog = this.ae) == null) {
            super.c = false;
            if (this.ag == null) {
                final Context nt = ((br)this).nT();
                kgk.aL((Object)nt);
                this.ag = (Dialog)new AlertDialog$Builder(nt).create();
            }
            dialog = this.ag;
        }
        return dialog;
    }
}
