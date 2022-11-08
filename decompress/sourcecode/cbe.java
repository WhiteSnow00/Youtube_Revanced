import android.content.res.Configuration;
import android.content.Context;
import android.os.Bundle;
import android.app.Dialog;

// 
// Decompiled by Procyon v0.6.0
// 

public class cbe extends bi
{
    private Dialog ae;
    private ccj af;
    
    public cbe() {
        this.nb(true);
    }
    
    private final void aM() {
        if (this.af == null) {
            final Bundle m = ((br)this).m;
            if (m != null) {
                this.af = ccj.a(m.getBundle("selector"));
            }
            if (this.af == null) {
                this.af = ccj.a;
            }
        }
    }
    
    public final void aK(final ccj af) {
        if (af != null) {
            this.aM();
            if (!this.af.equals(af)) {
                this.af = af;
                Bundle m;
                if ((m = ((br)this).m) == null) {
                    m = new Bundle();
                }
                m.putBundle("selector", af.b);
                ((br)this).ag(m);
                final Dialog ae = this.ae;
                if (ae != null) {
                    ((cbd)ae).g(af);
                }
            }
            return;
        }
        throw new IllegalArgumentException("selector must not be null");
    }
    
    public cbd aL(final Context context) {
        return new cbd(context);
    }
    
    public final void onConfigurationChanged(final Configuration configuration) {
        super.onConfigurationChanged(configuration);
        final Dialog ae = this.ae;
        if (ae == null) {
            return;
        }
        ((cbd)ae).h();
    }
    
    public final Dialog pI(final Bundle bundle) {
        final cbd al = this.aL(((br)this).nT());
        this.ae = (Dialog)al;
        this.aM();
        final ccj af = this.af;
        final cbd cbd = al;
        al.g(af);
        return this.ae;
    }
}
