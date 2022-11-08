import android.view.View;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.content.Context;
import android.view.SubMenu;

// 
// Decompiled by Procyon v0.6.0
// 

public class jg extends im implements SubMenu
{
    public final im k;
    public final io l;
    
    public jg(final Context context, final im k, final io l) {
        super(context);
        this.k = k;
        this.l = l;
    }
    
    public final im a() {
        return this.k.a();
    }
    
    public final String d() {
        final int a = this.l.a;
        if (a == 0) {
            return null;
        }
        final StringBuilder sb = new StringBuilder("android:menu:actionviewstates:");
        sb.append(a);
        return sb.toString();
    }
    
    public final MenuItem getItem() {
        return (MenuItem)this.l;
    }
    
    public final void p(final ik ik) {
        this.k.p(ik);
    }
    
    public final void setGroupDividerEnabled(final boolean groupDividerEnabled) {
        this.k.setGroupDividerEnabled(groupDividerEnabled);
    }
    
    public final SubMenu setHeaderIcon(final int n) {
        super.q(0, (CharSequence)null, n, (Drawable)null, (View)null);
        return (SubMenu)this;
    }
    
    public final SubMenu setHeaderIcon(final Drawable drawable) {
        super.q(0, (CharSequence)null, 0, drawable, (View)null);
        return (SubMenu)this;
    }
    
    public final SubMenu setHeaderTitle(final int n) {
        super.q(n, (CharSequence)null, 0, (Drawable)null, (View)null);
        return (SubMenu)this;
    }
    
    public final SubMenu setHeaderTitle(final CharSequence charSequence) {
        super.q(0, charSequence, 0, (Drawable)null, (View)null);
        return (SubMenu)this;
    }
    
    public final SubMenu setHeaderView(final View view) {
        super.q(0, (CharSequence)null, 0, (Drawable)null, view);
        return (SubMenu)this;
    }
    
    public final SubMenu setIcon(final int icon) {
        this.l.setIcon(icon);
        return (SubMenu)this;
    }
    
    public final SubMenu setIcon(final Drawable icon) {
        this.l.setIcon(icon);
        return (SubMenu)this;
    }
    
    public final void setQwertyMode(final boolean qwertyMode) {
        this.k.setQwertyMode(qwertyMode);
    }
    
    public final boolean t(final io io) {
        return this.k.t(io);
    }
    
    public final boolean u(final im im, final MenuItem menuItem) {
        return super.u(im, menuItem) || this.k.u(im, menuItem);
    }
    
    public final boolean v(final io io) {
        return this.k.v(io);
    }
    
    public final boolean w() {
        return this.k.w();
    }
    
    public final boolean x() {
        return this.k.x();
    }
    
    public final boolean y() {
        return this.k.y();
    }
}
