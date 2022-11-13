// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.comment.ui;

import android.view.ViewGroup$LayoutParams;
import android.text.Layout;
import android.widget.EditText;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import android.widget.ScrollView;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.content.Context;

public final class UserMentionSuggestionsOverscrollBehavior extends aei
{
    private boolean a;
    private int b;
    private int c;
    
    public UserMentionSuggestionsOverscrollBehavior() {
        this.c = -1;
    }
    
    public UserMentionSuggestionsOverscrollBehavior(final Context context, final AttributeSet set) {
        super(context, set);
        this.c = -1;
    }
    
    public final boolean qJ(final CoordinatorLayout coordinatorLayout, final View view, final View view2) {
        final aei a = ((aek)view2.getLayoutParams()).a;
        if (view instanceof ScrollView) {
            if (a instanceof BottomSheetBehavior) {
                final EditText editText = (EditText)coordinatorLayout.findViewById(2131428424);
                final int selectionStart = editText.getSelectionStart();
                final Layout layout = editText.getLayout();
                if (layout == null) {
                    return false;
                }
                final int lineForOffset = layout.getLineForOffset(selectionStart);
                final int lineBaseline = layout.getLineBaseline(lineForOffset);
                final int lineAscent = layout.getLineAscent(lineForOffset);
                final View viewById = coordinatorLayout.findViewById(2131429009);
                final ViewGroup$LayoutParams layoutParams = viewById.getLayoutParams();
                final BottomSheetBehavior y = BottomSheetBehavior.y(view2);
                final int[] array = new int[2];
                view2.getLocationOnScreen(array);
                final int n = array[1];
                if (y.z == 5) {
                    return this.a = false;
                }
                if (!this.a) {
                    final int[] array2 = new int[2];
                    editText.getLocationOnScreen(array2);
                    final int n2 = array2[1];
                    final int lineHeight = editText.getLineHeight();
                    this.b = lineBaseline + lineAscent + n2 + (lineHeight + lineHeight);
                    this.a = true;
                }
                if (n < this.b) {
                    int c;
                    if ((c = this.c) == -1) {
                        c = viewById.getHeight();
                        this.c = c;
                    }
                    final int n3 = this.b - n;
                    final int height = viewById.getHeight();
                    final int height2 = c + n3;
                    if (height != height2) {
                        layoutParams.height = height2;
                        viewById.requestLayout();
                        view.scrollTo(0, n3);
                        view.setVerticalScrollBarEnabled(false);
                    }
                }
                else if (this.c >= 0) {
                    this.c = -1;
                    layoutParams.height = 0;
                    viewById.requestLayout();
                    view.setVerticalScrollBarEnabled(true);
                }
            }
        }
        return false;
    }
}
