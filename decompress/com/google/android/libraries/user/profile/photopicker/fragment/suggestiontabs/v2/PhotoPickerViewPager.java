// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.user.profile.photopicker.fragment.suggestiontabs.v2;

import android.view.View;
import android.view.MotionEvent;
import android.util.AttributeSet;
import android.content.Context;
import androidx.viewpager.widget.ViewPager;

public class PhotoPickerViewPager extends ViewPager
{
    public PhotoPickerViewPager(final Context context) {
        super(context);
    }
    
    public PhotoPickerViewPager(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public final boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        return (arrm.k() || !arrm.d()) && super.onInterceptTouchEvent(motionEvent);
    }
    
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        return (arrm.k() || !arrm.d()) && super.onTouchEvent(motionEvent);
    }
    
    protected final boolean t(final View view, final boolean b, final int n, final int n2, final int n3) {
        final boolean t = super.t(view, b, n, n2, n3);
        boolean b3;
        final boolean b2 = b3 = true;
        if (!t) {
            if (b && arrm.k()) {
                b3 = b2;
                if (!view.canScrollHorizontally(-1)) {
                    if (!view.canScrollHorizontally(1)) {
                        return false;
                    }
                    b3 = b2;
                }
            }
            else {
                b3 = false;
            }
        }
        return b3;
    }
}
