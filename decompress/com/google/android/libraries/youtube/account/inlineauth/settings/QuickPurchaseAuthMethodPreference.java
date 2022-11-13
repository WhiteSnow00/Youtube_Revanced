// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.account.inlineauth.settings;

import androidx.preference.Preference;
import android.app.Activity;
import android.content.Context;
import java.util.List;
import androidx.preference.ListPreference;

public class QuickPurchaseAuthMethodPreference extends ListPreference implements rjl
{
    public int G;
    public List H;
    public final aekp I;
    
    public QuickPurchaseAuthMethodPreference(final Context context, final aekp i, final byte[] array, final byte[] array2, final byte[] array3) {
        super(context);
        this.G = -1;
        this.H = null;
        this.I = i;
    }
    
    public final void a() {
    }
    
    public final void b() {
        ((Activity)((Preference)this).j).runOnUiThread((Runnable)new riy(this, 10));
    }
}
