import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

final class fh extends anl
{
    final /* synthetic */ fw a;
    
    public fh(final fw a) {
        this.a = a;
    }
    
    @Override
    public final void a(final View view) {
        this.a.q.setAlpha(1.0f);
        this.a.I.s((ank)null);
        this.a.I = null;
    }
    
    @Override
    public final void b() {
        this.a.q.setVisibility(0);
        if (this.a.q.getParent() instanceof View) {
            ana.L((View)this.a.q.getParent());
        }
    }
}
