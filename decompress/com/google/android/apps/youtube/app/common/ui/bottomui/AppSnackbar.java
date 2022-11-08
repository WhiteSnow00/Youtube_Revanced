// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.common.ui.bottomui;

import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.content.Context;
import com.google.android.libraries.quantum.snackbar.Snackbar;

public class AppSnackbar extends Snackbar implements gar
{
    public AppSnackbar(final Context context) {
        super(context);
    }
    
    public AppSnackbar(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public AppSnackbar(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
    }
    
    public final void a() {
        final String trim = super.a.getText().toString().trim();
        if (!TextUtils.isEmpty((CharSequence)trim)) {
            final Context context = this.getContext();
            final AccessibilityManager accessibilityManager = (AccessibilityManager)context.getSystemService("accessibility");
            if (accessibilityManager.isEnabled()) {
                final AccessibilityEvent obtain = AccessibilityEvent.obtain(32);
                obtain.setClassName((CharSequence)Snackbar.class.getName());
                obtain.setPackageName((CharSequence)context.getPackageName());
                obtain.getText().add(trim);
                obtain.setEnabled(true);
                final String trim2 = super.b.getText().toString().trim();
                if (!TextUtils.isEmpty((CharSequence)trim2)) {
                    obtain.getText().add(trim2);
                }
                accessibilityManager.sendAccessibilityEvent(obtain);
            }
        }
    }
}
