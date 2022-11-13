// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.creation.common.ui;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.content.Context;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

public final class LockedBottomSheetBehavior extends BottomSheetBehavior
{
    public LockedBottomSheetBehavior() {
    }
    
    public LockedBottomSheetBehavior(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    @Override
    public final boolean j(final CoordinatorLayout coordinatorLayout, final View view, final View view2, final float n, final float n2) {
        return false;
    }
    
    @Override
    public final boolean l(final CoordinatorLayout coordinatorLayout, final View view, final View view2, final View view3, final int n, final int n2) {
        return false;
    }
    
    @Override
    public final boolean m(final CoordinatorLayout coordinatorLayout, final View view, final MotionEvent motionEvent) {
        return false;
    }
    
    @Override
    public final void qH(final CoordinatorLayout coordinatorLayout, final View view, final View view2, final int n) {
    }
    
    @Override
    public final boolean qK(final CoordinatorLayout coordinatorLayout, final View view, final MotionEvent motionEvent) {
        return false;
    }
    
    @Override
    public final void ss(final CoordinatorLayout coordinatorLayout, final View view, final View view2, final int n, final int n2, final int[] array, final int n3) {
    }
}
