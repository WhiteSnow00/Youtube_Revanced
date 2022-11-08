import android.graphics.drawable.Drawable;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.EditorInfo;
import android.view.ActionMode$Callback;
import android.widget.TextView;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.CheckedTextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kc extends CheckedTextView
{
    private final ka a;
    private final lc b;
    private kg c;
    private final sin d;
    
    public kc(final Context context, final AttributeSet set) {
        pn.a(context);
        super(context, set, 2130968965);
        pl.d((View)this, this.getContext());
        final lc b = new lc((TextView)this);
        (this.b = b).g(set, 2130968965);
        b.e();
        (this.a = new ka((View)this)).b(set, 2130968965);
        (this.d = new sin((CheckedTextView)this)).q(set);
        this.a().a(set, 2130968965);
    }
    
    private final kg a() {
        if (this.c == null) {
            this.c = new kg((TextView)this);
        }
        return this.c;
    }
    
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        final lc b = this.b;
        if (b != null) {
            b.e();
        }
        final ka a = this.a;
        if (a != null) {
            a.a();
        }
        final sin d = this.d;
        if (d != null) {
            d.p();
        }
    }
    
    public final ActionMode$Callback getCustomSelectionActionModeCallback() {
        return api.d(super.getCustomSelectionActionModeCallback());
    }
    
    public final InputConnection onCreateInputConnection(final EditorInfo editorInfo) {
        final InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        fn.d(onCreateInputConnection, editorInfo, (View)this);
        return onCreateInputConnection;
    }
    
    public final void setAllCaps(final boolean allCaps) {
        super.setAllCaps(allCaps);
        this.a();
        asu.d();
    }
    
    public final void setBackgroundDrawable(final Drawable backgroundDrawable) {
        super.setBackgroundDrawable(backgroundDrawable);
        final ka a = this.a;
        if (a != null) {
            a.e();
        }
    }
    
    public final void setBackgroundResource(final int backgroundResource) {
        super.setBackgroundResource(backgroundResource);
        final ka a = this.a;
        if (a != null) {
            a.c(backgroundResource);
        }
    }
    
    public final void setCheckMarkDrawable(final int n) {
        this.setCheckMarkDrawable(fc.b(this.getContext(), n));
    }
    
    public final void setCheckMarkDrawable(final Drawable checkMarkDrawable) {
        super.setCheckMarkDrawable(checkMarkDrawable);
        final sin d = this.d;
        if (d != null) {
            if (d.a) {
                d.a = false;
                return;
            }
            d.a = true;
            d.p();
        }
    }
    
    public final void setCompoundDrawables(final Drawable drawable, final Drawable drawable2, final Drawable drawable3, final Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        final lc b = this.b;
        if (b != null) {
            b.e();
        }
    }
    
    public final void setCompoundDrawablesRelative(final Drawable drawable, final Drawable drawable2, final Drawable drawable3, final Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        final lc b = this.b;
        if (b != null) {
            b.e();
        }
    }
    
    public final void setCustomSelectionActionModeCallback(final ActionMode$Callback actionMode$Callback) {
        super.setCustomSelectionActionModeCallback(api.e((TextView)this, actionMode$Callback));
    }
    
    public final void setTextAppearance(final Context context, final int n) {
        super.setTextAppearance(context, n);
        final lc b = this.b;
        if (b != null) {
            b.h(context, n);
        }
    }
}
