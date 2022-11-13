// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.common.ui.bottomui;

import android.view.KeyEvent;
import android.util.AttributeSet;
import android.content.Context;
import android.support.v7.widget.AppCompatEditText;

public final class KeyPressAwareEditText extends AppCompatEditText
{
    public pvh a;
    
    public KeyPressAwareEditText(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public final boolean onKeyPreIme(final int n, final KeyEvent keyEvent) {
        final pvh a = this.a;
        int n2 = n;
        if (a != null) {
            final Object a2 = a.a;
            if ((n2 = n) == 4) {
                if (keyEvent.getAction() == 1) {
                    ((gch)a2).g.tu(gcg.b(false));
                }
                n2 = 4;
            }
        }
        return super.onKeyPreIme(n2, keyEvent);
    }
}
