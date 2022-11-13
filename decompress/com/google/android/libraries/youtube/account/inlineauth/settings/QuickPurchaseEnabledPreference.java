// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.account.inlineauth.settings;

import androidx.preference.Preference;
import android.app.Activity;
import android.content.Context;
import androidx.preference.SwitchPreference;

public class QuickPurchaseEnabledPreference extends SwitchPreference implements rjl
{
    public final anzv c;
    public final boolean d;
    public final rkc e;
    public final aekp f;
    
    public QuickPurchaseEnabledPreference(final Context context, final boolean d, final rkc e, final aekp f, final anzv c, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        super(context);
        this.d = d;
        this.e = e;
        this.c = c;
        this.f = f;
    }
    
    public final void a() {
    }
    
    public final void b() {
        ((Activity)((Preference)this).j).runOnUiThread((Runnable)new riy(this, 11));
    }
}
