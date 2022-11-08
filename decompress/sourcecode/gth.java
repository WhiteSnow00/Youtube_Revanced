import android.support.v7.widget.LinearLayoutManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gth extends LinearLayoutManager
{
    final /* synthetic */ gtn a;
    
    public gth(final gtn a) {
        this.a = a;
    }
    
    public final void p(final ok ok) {
        final gtn a = this.a;
        Runnable ae = a.ae;
        if (ae != null) {
            a.ae = null;
        }
        else {
            ae = null;
        }
        super.p(ok);
        if (ae != null) {
            ae.run();
        }
    }
}
