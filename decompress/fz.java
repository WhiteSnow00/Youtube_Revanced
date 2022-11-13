import android.app.Dialog;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public class fz extends bi
{
    @Override
    public Dialog pN(final Bundle bundle) {
        return (Dialog)new fy(this.nT(), super.b);
    }
    
    @Override
    public final void rI(final Dialog dialog, final int n) {
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
        super.rI(dialog, n);
    }
}
