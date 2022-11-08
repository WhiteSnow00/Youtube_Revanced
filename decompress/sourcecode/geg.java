import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class geg extends FrameLayout implements ariy, foe
{
    public View a;
    private arit b;
    private boolean c;
    
    public geg(final Context context) {
        super(context);
        if (!this.c) {
            this.c = true;
            ((ges)this.aR()).q();
        }
    }
    
    public final void a(final View a, final View view) {
        a.getClass();
        this.a = a;
        view.getClass();
        this.addView(a);
        this.addView(view);
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
    
    public final arit d() {
        if (this.b == null) {
            this.b = new arit((View)this, false);
        }
        return this.b;
    }
    
    public final void setAlpha(final float n) {
    }
}
