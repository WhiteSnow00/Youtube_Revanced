import android.hardware.fingerprint.FingerprintManager;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class ajd
{
    public final Context a;
    
    private ajd(final Context a) {
        this.a = a;
    }
    
    public static ajd a(final Context context) {
        return new ajd(context);
    }
    
    public final boolean b() {
        final FingerprintManager c = ajb.c(this.a);
        return c != null && ajb.f(c);
    }
    
    public final boolean c() {
        final FingerprintManager c = ajb.c(this.a);
        return c != null && ajb.g(c);
    }
}
