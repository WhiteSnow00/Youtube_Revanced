import java.lang.ref.WeakReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class gnd implements afsz
{
    private final tny a;
    private final WeakReference b;
    
    public gnd(final vax vax, final tny a) {
        this.b = new WeakReference((T)vax);
        this.a = a;
    }
    
    public final void rz(final Throwable t) {
        trn.d("Error creating post", t);
        this.a.e(t);
    }
}
