import android.content.res.Configuration;
import android.content.Context;
import android.os.Bundle;
import android.app.Dialog;

// 
// Decompiled by Procyon v0.6.0
// 

public class cbf extends bi
{
    private Dialog ae;
    private cck af;
    
    public cbf() {
        this.nb(true);
    }
    
    private final void aM() {
        if (this.af == null) {
            final Bundle m = ((br)this).m;
            if (m != null) {
                this.af = cck.a(m.getBundle("selector"));
            }
            if (this.af == null) {
                this.af = cck.a;
            }
        }
    }
    
    public final void aK(final cck af) {
        if (af != null) {
            this.aM();
            if (!this.af.equals((Object)af)) {
                this.af = af;
                Bundle m;
                if ((m = ((br)this).m) == null) {
                    m = new Bundle();
                }
                m.putBundle("selector", af.b);
                ((br)this).ag(m);
                final Dialog ae = this.ae;
                if (ae != null) {
                    ((cbe)ae).g(af);
                }
            }
            return;
        }
        throw new IllegalArgumentException("selector must not be null");
    }
    
    public cbe aL(final Context context) {
        return new cbe(context);
    }
    
    public final void onConfigurationChanged(final Configuration configuration) {
        super.onConfigurationChanged(configuration);
        final Dialog ae = this.ae;
        if (ae == null) {
            return;
        }
        ((cbe)ae).h();
    }
    
    public final Dialog pN(final Bundle bundle) {
        final cbe al = this.aL(((br)this).nT());
        this.ae = (Dialog)al;
        this.aM();
        final cck af = this.af;
        final cbe cbe = al;
        al.g(af);
        return this.ae;
    }
}
