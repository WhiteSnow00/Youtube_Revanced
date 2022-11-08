import android.hardware.fingerprint.FingerprintManager;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class ajb
{
    public final Context a;
    
    private ajb(final Context a) {
        this.a = a;
    }
    
    public static ajb a(final Context context) {
        return new ajb(context);
    }
    
    public final boolean b() {
        final FingerprintManager c = aiz.c(this.a);
        return c != null && aiz.f(c);
    }
    
    public final boolean c() {
        final FingerprintManager c = aiz.c(this.a);
        return c != null && aiz.g(c);
    }
}
