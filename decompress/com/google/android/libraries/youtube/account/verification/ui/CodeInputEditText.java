// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.account.verification.ui;

import android.view.inputmethod.InputConnection;
import android.view.inputmethod.EditorInfo;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.EditText;

public class CodeInputEditText extends EditText
{
    public rnm a;
    
    public CodeInputEditText(final Context context) {
        super(context);
    }
    
    public CodeInputEditText(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public CodeInputEditText(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
    }
    
    public final InputConnection onCreateInputConnection(final EditorInfo editorInfo) {
        return (InputConnection)new rnl(this, super.onCreateInputConnection(editorInfo));
    }
}
