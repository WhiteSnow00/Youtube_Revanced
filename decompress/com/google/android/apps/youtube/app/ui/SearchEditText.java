// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.ui;

import android.content.ClipData;
import android.text.Spannable;
import android.text.Selection;
import android.content.ClipboardManager;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.EditText;

public class SearchEditText extends EditText
{
    public SearchEditText(final Context context) {
        super(context);
    }
    
    public SearchEditText(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public SearchEditText(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
    }
    
    public SearchEditText(final Context context, final AttributeSet set, final int n, final int n2) {
        super(context, set, n, n2);
    }
    
    public final boolean onTextContextMenuItem(int i) {
        int n = i;
        if (i == 16908322) {
            final ClipData primaryClip = ((ClipboardManager)this.getContext().getSystemService("clipboard")).getPrimaryClip();
            if (primaryClip != null) {
                final StringBuilder sb = new StringBuilder();
                final int n2 = 0;
                for (i = 0; i < primaryClip.getItemCount(); ++i) {
                    sb.append(primaryClip.getItemAt(i).coerceToText(this.getContext()));
                }
                int length = this.getText().length();
                i = n2;
                if (this.isFocused()) {
                    i = this.getSelectionStart();
                    final int selectionEnd = this.getSelectionEnd();
                    final int max = Math.max(0, Math.min(i, selectionEnd));
                    final int[] array = { 0, i, selectionEnd };
                    agot.u(true);
                    i = array[0];
                    int n4;
                    for (int j = 1; j < 3; ++j, i = n4) {
                        final int n3 = array[j];
                        if (n3 > (n4 = i)) {
                            n4 = n3;
                        }
                    }
                    final int n5 = max;
                    length = i;
                    i = n5;
                }
                Selection.setSelection((Spannable)this.getText(), length);
                this.getText().replace(i, length, (CharSequence)sb.toString());
                return true;
            }
            n = 16908322;
        }
        return super.onTextContextMenuItem(n);
    }
}
