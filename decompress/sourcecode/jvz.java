import android.view.ViewGroup$LayoutParams;
import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import android.view.ViewGroup;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class jvz
{
    public final Context a;
    protected final arhr b;
    int c;
    
    protected jvz(final Context a, final arhr b) {
        this.c = -1;
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
    }
    
    protected int a() {
        return -1;
    }
    
    protected int b() {
        return -1;
    }
    
    protected abstract ViewGroup c();
    
    protected final AppBarLayout d() {
        return (AppBarLayout)this.b.a();
    }
    
    protected void e() {
        final AppBarLayout d = this.d();
        final ViewGroup c = this.c();
        final ViewGroup viewGroup = (ViewGroup)c.getParent();
        if (viewGroup != d) {
            if (viewGroup != null) {
                viewGroup.removeView((View)c);
            }
            final ViewGroup$LayoutParams viewGroup$LayoutParams = new ViewGroup$LayoutParams(-1, this.a());
            ((View)c).setTag(295039029, (Object)this.b());
            final int b = this.b();
            int i;
            if (b < 0) {
                i = ((ViewGroup)d).getChildCount();
            }
            else {
                for (i = 0; i < ((ViewGroup)d).getChildCount(); ++i) {
                    final Object tag = ((ViewGroup)d).getChildAt(i).getTag(295039029);
                    int intValue;
                    if (tag instanceof Integer) {
                        intValue = (int)tag;
                    }
                    else {
                        intValue = 0;
                    }
                    if (intValue < 0 || intValue > b) {
                        break;
                    }
                }
            }
            d.addView((View)c, i, viewGroup$LayoutParams);
            this.c = -1;
        }
    }
    
    protected void f() {
        tmy.v((View)this.c(), false);
    }
    
    protected final void g() {
        if (this.j()) {
            this.e();
            if (this.c != 1) {
                this.i();
                this.c = 1;
            }
        }
        else if (this.c != 0) {
            this.f();
            this.c = 0;
        }
    }
    
    public abstract void h(final fzw p0);
    
    protected void i() {
        tmy.v((View)this.c(), true);
    }
    
    protected boolean j() {
        throw null;
    }
}
