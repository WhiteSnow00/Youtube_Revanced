import android.view.View;
import android.graphics.Rect;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class lbo
{
    public abstract float a();
    
    public abstract Rect b();
    
    public abstract Rect c();
    
    public abstract View d();
    
    public final View e() {
        final View d = this.d();
        d.getClass();
        return d;
    }
    
    public final void f() {
        if (!this.g()) {
            return;
        }
        this.e().setTranslationX((float)this.c().left);
        this.e().setTranslationY((float)this.c().top);
    }
    
    public abstract boolean g();
}
