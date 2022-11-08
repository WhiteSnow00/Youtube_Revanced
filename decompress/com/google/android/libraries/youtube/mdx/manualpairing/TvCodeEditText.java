// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.mdx.manualpairing;

import android.util.AttributeSet;
import android.content.Context;
import com.google.android.material.textfield.TextInputEditText;

public class TvCodeEditText extends TextInputEditText
{
    public TvCodeEditText(final Context context) {
        this(context, null);
    }
    
    public TvCodeEditText(final Context context, final AttributeSet set) {
        this(context, set, 2130969300);
    }
    
    public TvCodeEditText(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
    }
    
    public final boolean performClick() {
        super.performClick();
        return true;
    }
}
