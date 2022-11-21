// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v7.widget;

import android.graphics.Canvas;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewParent;
import android.view.ViewGroup;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;
import java.lang.ref.WeakReference;
import android.view.LayoutInflater;
import android.view.View;

public final class ViewStubCompat extends View
{
    public LayoutInflater a;
    private int b;
    private int c;
    private WeakReference d;
    
    public ViewStubCompat(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public ViewStubCompat(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.b = 0;
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, gm.B, n, 0);
        this.c = obtainStyledAttributes.getResourceId(2, -1);
        this.b = obtainStyledAttributes.getResourceId(1, 0);
        this.setId(obtainStyledAttributes.getResourceId(0, -1));
        obtainStyledAttributes.recycle();
        this.setVisibility(8);
        this.setWillNotDraw(true);
    }
    
    public final View a() {
        final ViewParent parent = this.getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        }
        if (this.b != 0) {
            final ViewGroup viewGroup = (ViewGroup)parent;
            LayoutInflater layoutInflater;
            if ((layoutInflater = this.a) == null) {
                layoutInflater = LayoutInflater.from(this.getContext());
            }
            final View inflate = layoutInflater.inflate(this.b, viewGroup, false);
            final int c = this.c;
            if (c != -1) {
                inflate.setId(c);
            }
            final int indexOfChild = viewGroup.indexOfChild((View)this);
            viewGroup.removeViewInLayout((View)this);
            final ViewGroup$LayoutParams layoutParams = this.getLayoutParams();
            if (layoutParams != null) {
                viewGroup.addView(inflate, indexOfChild, layoutParams);
            }
            else {
                viewGroup.addView(inflate, indexOfChild);
            }
            this.d = new WeakReference(inflate);
            return inflate;
        }
        throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
    }
    
    protected final void dispatchDraw(final Canvas canvas) {
    }
    
    public final void draw(final Canvas canvas) {
    }
    
    protected final void onMeasure(final int n, final int n2) {
        this.setMeasuredDimension(0, 0);
    }
    
    public final void setVisibility(final int n) {
        final WeakReference d = this.d;
        if (d != null) {
            final View view = (View)d.get();
            if (view != null) {
                view.setVisibility(n);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        else {
            super.setVisibility(n);
            if (n != 0 && n != 4) {
                return;
            }
            this.a();
        }
    }
}
