// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.livecreation.ui.view;

import android.view.inputmethod.InputConnection;
import android.view.inputmethod.EditorInfo;
import android.util.AttributeSet;
import android.content.Context;
import com.google.android.material.textfield.TextInputEditText;

public class EditTextTitle extends TextInputEditText
{
    public EditTextTitle(final Context context) {
        super(context);
    }
    
    public EditTextTitle(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public EditTextTitle(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
    }
    
    public final InputConnection onCreateInputConnection(final EditorInfo editorInfo) {
        final InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        editorInfo.imeOptions &= 0xFFFFFF00;
        editorInfo.imeOptions |= 0x6;
        editorInfo.imeOptions &= 0xBFFFFFFF;
        return onCreateInputConnection;
    }
}
