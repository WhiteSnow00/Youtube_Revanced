import android.view.MenuInflater;
import android.view.Menu;
import android.view.View;
import android.content.Context;
import android.view.ActionMode;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hq extends ActionMode
{
    final Context a;
    final hm b;
    
    public hq(final Context a, final hm b) {
        this.a = a;
        this.b = b;
    }
    
    public final void finish() {
        this.b.f();
    }
    
    public final View getCustomView() {
        return this.b.c();
    }
    
    public final Menu getMenu() {
        return (Menu)new jc(this.a, (ajd)this.b.a());
    }
    
    public final MenuInflater getMenuInflater() {
        return this.b.b();
    }
    
    public final CharSequence getSubtitle() {
        return this.b.d();
    }
    
    public final Object getTag() {
        return this.b.d;
    }
    
    public final CharSequence getTitle() {
        return this.b.e();
    }
    
    public final boolean getTitleOptionalHint() {
        return this.b.e;
    }
    
    public final void invalidate() {
        this.b.g();
    }
    
    public final boolean isTitleOptional() {
        return this.b.n();
    }
    
    public final void setCustomView(final View view) {
        this.b.h(view);
    }
    
    public final void setSubtitle(final int n) {
        this.b.i(n);
    }
    
    public final void setSubtitle(final CharSequence charSequence) {
        this.b.j(charSequence);
    }
    
    public final void setTag(final Object d) {
        this.b.d = d;
    }
    
    public final void setTitle(final int n) {
        this.b.k(n);
    }
    
    public final void setTitle(final CharSequence charSequence) {
        this.b.l(charSequence);
    }
    
    public final void setTitleOptionalHint(final boolean b) {
        this.b.m(b);
    }
}
