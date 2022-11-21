import android.os.Binder;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aain extends tfp
{
    final aagx g;
    
    public aain(final Class clazz, final aagx g) {
        this.g = g;
        super(clazz);
    }
    
    public final /* bridge */ void b(final Binder binder) {
        final aahi aahi = (aahi)binder;
        if (aahi != null) {
            ((aahj)aahi.a).o(this.g);
        }
    }
}
