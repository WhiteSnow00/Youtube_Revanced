import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

final class ez implements rc
{
    final /* synthetic */ fa a;
    
    public ez(final fa a) {
        this.a = a;
    }
    
    public final void a(final Context context) {
        final fe delegate = this.a.getDelegate();
        delegate.m();
        this.a.getSavedStateRegistry().a("androidx:appcompat");
        delegate.F();
    }
}
