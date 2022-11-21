import com.google.android.apps.youtube.app.common.dialog.DialogFragmentController;
import android.app.Dialog;
import com.google.android.apps.youtube.app.ui.YpcOffersListDialogFragmentController;
import android.app.AlertDialog;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aaka implements acci
{
    public final Object a;
    private final int b;
    
    public aaka(final accf a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aaka(final AlertDialog a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aaka(final YpcOffersListDialogFragmentController a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final void nr() {
        final int b = this.b;
        if (b == 0) {
            ((Dialog)this.a).dismiss();
            return;
        }
        if (b == 1) {
            ((DialogFragmentController)this.a).k();
            return;
        }
        final accf accf = (accf)this.a;
        if (accf.j == null) {
            return;
        }
        accf.i(6);
    }
}
