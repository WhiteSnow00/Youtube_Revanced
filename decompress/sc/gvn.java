import com.google.android.apps.youtube.app.extensions.reel.common.browse.ReelBrowseFragmentControllerImpl;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gvn implements tes
{
    public final ReelBrowseFragmentControllerImpl a;
    
    public gvn(final ReelBrowseFragmentControllerImpl a) {
        this.a = a;
    }
    
    public final /* bridge */ void a(final Object o) {
        this.b((Throwable)o);
    }
    
    public final void b(final Throwable t) {
        final ReelBrowseFragmentControllerImpl a = this.a;
        final gvp c = a.c;
        if (c == null) {
            return;
        }
        final gvm gvm = (gvm)c;
        gvm.ai.b((CharSequence)gvm.nZ().getString(2132019444), true);
        gvm.ae.h();
        a.a.c("br_e");
    }
}
