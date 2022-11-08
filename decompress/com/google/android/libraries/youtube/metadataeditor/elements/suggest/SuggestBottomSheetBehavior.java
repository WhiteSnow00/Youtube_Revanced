// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.metadataeditor.elements.suggest;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.content.Context;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

public class SuggestBottomSheetBehavior extends BottomSheetBehavior
{
    public SuggestBottomSheetBehavior(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public final boolean qF(final CoordinatorLayout coordinatorLayout, final View view, final MotionEvent motionEvent) {
        super.qF(coordinatorLayout, view, motionEvent);
        return false;
    }
}
