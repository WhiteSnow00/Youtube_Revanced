import android.app.Dialog;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public class fz extends bi
{
    public Dialog pI(final Bundle bundle) {
        return (Dialog)new fy(((br)this).nT(), super.b);
    }
    
    public final void rC(final Dialog dialog, final int n) {
        if (dialog instanceof fy) {
            final fy fy = (fy)dialog;
            if (n != 1 && n != 2) {
                if (n != 3) {
                    return;
                }
                dialog.getWindow().addFlags(24);
            }
            fy.e();
            return;
        }
        super.rC(dialog, n);
    }
}
