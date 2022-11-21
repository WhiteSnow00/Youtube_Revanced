import android.os.Bundle;
import android.app.Dialog;

// 
// Decompiled by Procyon v0.6.0
// 

public class advk extends ga
{
    private final void qi() {
        final Dialog d = ((bi)this).d;
        if (d instanceof advj) {
            final boolean w = ((advj)d).a().w;
        }
    }
    
    public void dismiss() {
        this.qi();
        super.dismiss();
    }
    
    public Dialog pM(final Bundle bundle) {
        return (Dialog)new advj(((br)this).nQ(), ((bi)this).b);
    }
    
    public final void pN() {
        this.qi();
        super.pN();
    }
}
