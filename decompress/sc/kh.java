import android.graphics.drawable.Drawable;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.EditorInfo;
import android.text.method.KeyListener;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.MultiAutoCompleteTextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kh extends MultiAutoCompleteTextView
{
    private static final int[] a;
    private final ka b;
    private final lc c;
    private final bab d;
    
    static {
        a = new int[] { 16843126 };
    }
    
    public kh(final Context context, final AttributeSet set) {
        pn.a(context);
        super(context, set, 2130968761);
        pl.d((View)this, this.getContext());
        final cdo w = cdo.w(this.getContext(), set, kh.a, 2130968761, 0);
        if (w.q(0)) {
            this.setDropDownBackgroundDrawable(w.k(0));
        }
        w.o();
        (this.b = new ka((View)this)).b(set, 2130968761);
        final lc c = new lc((TextView)this);
        (this.c = c).g(set, 2130968761);
        c.e();
        (this.d = new bab((EditText)this)).i(set, 2130968761);
        final KeyListener keyListener = this.getKeyListener();
        if (bab.j(keyListener)) {
            final boolean focusable = super.isFocusable();
            final boolean clickable = super.isClickable();
            final boolean longClickable = super.isLongClickable();
            final int inputType = super.getInputType();
            final KeyListener k = bab.k(keyListener);
            if (k != keyListener) {
                super.setKeyListener(k);
                super.setRawInputType(inputType);
                super.setFocusable(focusable);
                super.setClickable(clickable);
                super.setLongClickable(longClickable);
            }
        }
    }
    
    protected final void drawableStateChanged() {
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
    
    public final InputConnection onCreateInputConnection(final EditorInfo editorInfo) {
        final InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        fn.d(onCreateInputConnection, editorInfo, (View)this);
        return this.d.l(onCreateInputConnection);
    }
    
    public final void setBackgroundDrawable(final Drawable backgroundDrawable) {
        super.setBackgroundDrawable(backgroundDrawable);
        final ka b = this.b;
        if (b != null) {
            b.e();
        }
    }
    
    public final void setBackgroundResource(final int backgroundResource) {
        super.setBackgroundResource(backgroundResource);
        final ka b = this.b;
        if (b != null) {
            b.c(backgroundResource);
        }
    }
    
    public final void setCompoundDrawables(final Drawable drawable, final Drawable drawable2, final Drawable drawable3, final Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        final lc c = this.c;
        if (c != null) {
            c.e();
        }
    }
    
    public final void setCompoundDrawablesRelative(final Drawable drawable, final Drawable drawable2, final Drawable drawable3, final Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        final lc c = this.c;
        if (c != null) {
            c.e();
        }
    }
    
    public final void setDropDownBackgroundResource(final int n) {
        this.setDropDownBackgroundDrawable(fc.b(this.getContext(), n));
    }
    
    public final void setKeyListener(final KeyListener keyListener) {
        super.setKeyListener(bab.k(keyListener));
    }
    
    public final void setTextAppearance(final Context context, final int n) {
        super.setTextAppearance(context, n);
        final lc c = this.c;
        if (c != null) {
            c.h(context, n);
        }
    }
}
