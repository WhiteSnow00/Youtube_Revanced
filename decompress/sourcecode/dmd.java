import android.view.View;
import android.view.ViewTreeObserver$OnDrawListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dmd implements ViewTreeObserver$OnDrawListener
{
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;
    
    public dmd(final dmc b, final dkg a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public dmd(final dme b, final View a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public final void onDraw() {
        if (this.c != 0) {
            ((dmc)this.b).a = true;
            final Object a = this.a;
            dpg.k();
            if (!((dkg)a).c.get()) {
                dpg.l(new dmb(this, 0, null));
            }
            return;
        }
        dpg.l((Runnable)new cog(this, (ViewTreeObserver$OnDrawListener)this, 11));
    }
}
