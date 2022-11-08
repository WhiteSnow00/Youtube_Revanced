import android.text.InputFilter;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import android.widget.CompoundButton;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.CheckBox;

// 
// Decompiled by Procyon v0.6.0
// 

public class kb extends CheckBox
{
    public final kd a;
    private final ka b;
    private final lc c;
    private kg d;
    
    public kb(final Context context, final AttributeSet set) {
        pn.a(context);
        super(context, set, 2130968954);
        pl.d((View)this, this.getContext());
        (this.a = new kd((CompoundButton)this)).b(set, 2130968954);
        (this.b = new ka((View)this)).b(set, 2130968954);
        (this.c = new lc((TextView)this)).g(set, 2130968954);
        this.a().a(set, 2130968954);
    }
    
    private final kg a() {
        if (this.d == null) {
            this.d = new kg((TextView)this);
        }
        return this.d;
    }
    
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        final ka b = this.b;
        if (b != null) {
            b.a();
        }
        final lc c = this.c;
        if (c != null) {
            c.e();
        }
    }
    
    public final int getCompoundPaddingLeft() {
        return super.getCompoundPaddingLeft();
    }
    
    public final void setAllCaps(final boolean allCaps) {
        super.setAllCaps(allCaps);
        this.a();
        asu.d();
    }
    
    public void setBackgroundDrawable(final Drawable backgroundDrawable) {
        super.setBackgroundDrawable(backgroundDrawable);
        final ka b = this.b;
        if (b != null) {
            b.e();
        }
    }
    
    public void setBackgroundResource(final int backgroundResource) {
        super.setBackgroundResource(backgroundResource);
        final ka b = this.b;
        if (b != null) {
            b.c(backgroundResource);
        }
    }
    
    public void setButtonDrawable(final int n) {
        this.setButtonDrawable(fc.b(this.getContext(), n));
    }
    
    public void setButtonDrawable(final Drawable buttonDrawable) {
        super.setButtonDrawable(buttonDrawable);
        final kd a = this.a;
        if (a != null) {
            a.c();
        }
    }
    
    public void setCompoundDrawables(final Drawable drawable, final Drawable drawable2, final Drawable drawable3, final Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        final lc c = this.c;
        if (c != null) {
            c.e();
        }
    }
    
    public void setCompoundDrawablesRelative(final Drawable drawable, final Drawable drawable2, final Drawable drawable3, final Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        final lc c = this.c;
        if (c != null) {
            c.e();
        }
    }
    
    public final void setFilters(final InputFilter[] filters) {
        this.a();
        asu.d();
        super.setFilters(filters);
    }
}
