import android.os.Bundle;
import android.content.res.Configuration;
import android.content.Context;
import android.app.Dialog;

// 
// Decompiled by Procyon v0.6.0
// 

public class cbo extends bi
{
    public Dialog ae;
    public ccj af;
    
    public cbo() {
        this.nb(true);
    }
    
    public cbn aK(final Context context) {
        return new cbn(context, 0);
    }
    
    public final void np() {
        super.np();
        final Dialog ae = this.ae;
        if (ae != null) {
            ((cbn)ae).k(false);
        }
    }
    
    public final void onConfigurationChanged(final Configuration configuration) {
        super.onConfigurationChanged(configuration);
        final Dialog ae = this.ae;
        if (ae != null) {
            ((cbn)ae).r();
        }
    }
    
    public final Dialog pI(final Bundle bundle) {
        return this.ae = (Dialog)this.aK(((br)this).nT());
    }
}
