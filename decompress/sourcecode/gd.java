import android.view.Menu;

// 
// Decompiled by Procyon v0.6.0
// 

final class gd implements iy
{
    final /* synthetic */ ge a;
    private boolean b;
    
    public gd(final ge a) {
        this.a = a;
    }
    
    public final void a(final im im, final boolean b) {
        if (this.b) {
            return;
        }
        this.b = true;
        this.a.a.e();
        this.a.b.onPanelClosed(108, (Menu)im);
        this.b = false;
    }
    
    public final boolean b(final im im) {
        this.a.b.onMenuOpened(108, (Menu)im);
        return true;
    }
}
