import android.os.Bundle;
import android.content.res.Configuration;
import android.content.Context;
import android.app.Dialog;

// 
// Decompiled by Procyon v0.6.0
// 

public class cbp extends bi
{
    public Dialog ae;
    public cck af;
    
    public cbp() {
        this.nb(true);
    }
    
    public cbo aK(final Context context) {
        return new cbo(context, 0);
    }
    
    public final void np() {
        super.np();
        final Dialog ae = this.ae;
        if (ae != null) {
            ((cbo)ae).k(false);
        }
    }
    
    public final void onConfigurationChanged(final Configuration configuration) {
        super.onConfigurationChanged(configuration);
        final Dialog ae = this.ae;
        if (ae != null) {
            ((cbo)ae).r();
        }
    }
    
    public final Dialog pN(final Bundle bundle) {
        return this.ae = (Dialog)this.aK(((br)this).nT());
    }
}
