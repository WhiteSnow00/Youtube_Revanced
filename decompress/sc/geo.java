import android.content.Context;
import android.view.ViewGroup;
import android.view.View;
import android.widget.FrameLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class geo extends FrameLayout implements arln, foj
{
    public View a;
    public ViewGroup b;
    private arli c;
    private boolean d;
    
    public geo(final Context context) {
        super(context);
        if (!this.d) {
            this.d = true;
            ((gfa)this.aR()).o(this);
        }
        this.setClipChildren(false);
    }
    
    public final void a(final View a, final View view) {
        a.getClass();
        this.a = a;
        view.getClass();
        this.addView(a);
        this.addView(view);
        this.addView((View)this.b);
    }
    
    public final Object aR() {
        return this.d().aR();
    }
    
    public final void b(final View view, final View view2) {
        if (view != this.a) {
            return;
        }
        this.removeAllViews();
        this.a = null;
    }
    
    public final arli d() {
        if (this.c == null) {
            this.c = new arli((View)this, false);
        }
        return this.c;
    }
    
    public final /* bridge */ arlm lC() {
        return (arlm)this.d();
    }
    
    public final void setAlpha(final float n) {
    }
}
