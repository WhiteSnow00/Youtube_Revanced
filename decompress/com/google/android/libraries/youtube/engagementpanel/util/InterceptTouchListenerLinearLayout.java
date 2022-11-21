// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.engagementpanel.util;

import android.view.MotionEvent;
import android.view.View$OnTouchListener;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.LinearLayout;

public class InterceptTouchListenerLinearLayout extends LinearLayout
{
    private uzr a;
    
    public InterceptTouchListenerLinearLayout(final Context context) {
        super(context);
    }
    
    public InterceptTouchListenerLinearLayout(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public InterceptTouchListenerLinearLayout(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
    }
    
    public final void a(final uzr a) {
        this.setOnTouchListener((View$OnTouchListener)(this.a = a));
    }
    
    public final boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        final uzr a = this.a;
        if (a != null) {
            final int actionMasked = motionEvent.getActionMasked();
            boolean b = false;
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked != 3) {
                            return b;
                        }
                    }
                    else {
                        final uzk uzk = (uzk)a;
                        if (uzk.b(uzk.a, motionEvent)) {
                            return true;
                        }
                        return false;
                    }
                }
                final uzk uzk2 = (uzk)a;
                if (!uzk2.b(uzk2.a, motionEvent)) {
                    uzk2.a.g();
                    return false;
                }
                b = true;
                return b;
            }
            ((uzk)a).a.h(motionEvent);
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}
