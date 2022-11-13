// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.setupdesign.view;

import android.view.accessibility.AccessibilityEvent;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View;
import android.support.v7.widget.RecyclerView;

public class HeaderRecyclerView extends RecyclerView
{
    public View aa;
    private int ab;
    private boolean ac;
    
    public HeaderRecyclerView(final Context context) {
        super(context);
        this.ac = false;
        this.a(null, 0);
    }
    
    public HeaderRecyclerView(final Context context, final AttributeSet set) {
        super(context, set);
        this.ac = false;
        this.a(set, 0);
    }
    
    public HeaderRecyclerView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.ac = false;
        this.a(set, n);
    }
    
    private final void a(final AttributeSet set, final int n) {
        if (this.isInEditMode()) {
            return;
        }
        final TypedArray obtainStyledAttributes = this.getContext().obtainStyledAttributes(set, aefr.h, n, 0);
        this.ab = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
    }
    
    public final void ac(final nq nq) {
        Object o = nq;
        if (this.aa != null && (o = nq) != null) {
            o = new aegi(nq);
            ((aegi)o).a = this.aa;
        }
        super.ac((nq)o);
    }
    
    public final void af(final nw nw) {
        super.af(nw);
        if (nw != null && this.aa == null && this.ab != 0) {
            this.aa = LayoutInflater.from(this.getContext()).inflate(this.ab, (ViewGroup)this, false);
        }
    }
    
    public final boolean dispatchKeyEvent(final KeyEvent keyEvent) {
        final boolean ac = this.ac;
        boolean ac2 = false;
        if (!ac || keyEvent.getAction() != 1) {
            if (keyEvent.getAction() == 0) {
                final int keyCode = keyEvent.getKeyCode();
                Label_0210: {
                    if (keyCode != 19) {
                        if (keyCode != 20) {
                            break Label_0210;
                        }
                        final View focus = this.findFocus();
                        if (focus == null) {
                            break Label_0210;
                        }
                        final int[] array = new int[2];
                        final int[] array2 = new int[2];
                        focus.getLocationInWindow(array);
                        this.getLocationInWindow(array2);
                        final int n = array[1] + focus.getMeasuredHeight() - (array2[1] + this.getMeasuredHeight());
                        if (n <= 0) {
                            break Label_0210;
                        }
                        this.ah(0, Math.min((int)(this.getMeasuredHeight() * 0.7f), n));
                    }
                    else {
                        final View focus2 = this.findFocus();
                        if (focus2 == null) {
                            break Label_0210;
                        }
                        final int[] array3 = new int[2];
                        final int[] array4 = new int[2];
                        focus2.getLocationInWindow(array3);
                        this.getLocationInWindow(array4);
                        final int n2 = array3[1] - array4[1];
                        if (n2 >= 0) {
                            break Label_0210;
                        }
                        this.ah(0, Math.max((int)(this.getMeasuredHeight() * -0.7f), n2));
                    }
                    ac2 = true;
                }
                if (this.ac = ac2) {
                    return true;
                }
            }
            return super.dispatchKeyEvent(keyEvent);
        }
        this.ac = false;
        return true;
    }
    
    public final void onInitializeAccessibilityEvent(final AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        int n;
        if (this.aa != null) {
            n = 1;
        }
        else {
            n = 0;
        }
        accessibilityEvent.setItemCount(accessibilityEvent.getItemCount() - n);
        accessibilityEvent.setFromIndex(Math.max(accessibilityEvent.getFromIndex() - n, 0));
        accessibilityEvent.setToIndex(Math.max(accessibilityEvent.getToIndex() - n, 0));
    }
}
