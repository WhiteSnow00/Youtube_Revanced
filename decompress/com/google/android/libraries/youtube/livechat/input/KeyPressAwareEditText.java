// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.livechat.input;

import android.view.KeyEvent;
import android.util.AttributeSet;
import android.content.Context;
import android.support.v7.widget.AppCompatEditText;

public final class KeyPressAwareEditText extends AppCompatEditText
{
    public xpb a;
    
    public KeyPressAwareEditText(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public final boolean onKeyPreIme(final int n, final KeyEvent keyEvent) {
        final xpb a = this.a;
        int n2 = n;
        if (a != null) {
            final Object a2 = a.a;
            if ((n2 = n) == 4) {
                if (keyEvent.getAction() == 1) {
                    ((wdf)a2).c();
                }
                n2 = 4;
            }
        }
        return super.onKeyPreIme(n2, keyEvent);
    }
}
