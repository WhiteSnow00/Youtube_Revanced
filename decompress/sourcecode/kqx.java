import com.google.android.apps.youtube.app.ui.swipetocontainer.DrawerContainerLayout;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public class kqx extends aqq implements ariy
{
    private arit i;
    private boolean j;
    
    kqx(final Context context) {
        super(context);
        this.w();
    }
    
    public kqx(final Context context, final AttributeSet set) {
        super(context, set);
        this.w();
    }
    
    public kqx(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.w();
    }
    
    public final Object aR() {
        return this.v().aR();
    }
    
    public final arit v() {
        if (this.i == null) {
            this.i = new arit((View)this, false);
        }
        return this.i;
    }
    
    protected final void w() {
        if (!this.j) {
            this.j = true;
            final kqw kqw = (kqw)this.aR();
            final DrawerContainerLayout drawerContainerLayout = (DrawerContainerLayout)this;
            kqw.p();
        }
    }
}
