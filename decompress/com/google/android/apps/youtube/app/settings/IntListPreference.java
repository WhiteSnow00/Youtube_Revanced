// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.settings;

import androidx.preference.Preference;
import android.util.AttributeSet;
import android.content.Context;
import java.util.Map;
import androidx.preference.ListPreference;

public final class IntListPreference extends ListPreference
{
    public Map G;
    
    public IntListPreference(final Context context) {
        super(context);
    }
    
    public IntListPreference(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    protected final void Z(final String s) {
        ((Preference)this).ab(Integer.parseInt(s));
    }
    
    @Override
    public final CharSequence m() {
        final int p = ((Preference)this).p(-1);
        if (p >= 0) {
            final Map g = this.G;
            if (g != null) {
                if (g.containsKey(String.valueOf(p))) {
                    return (CharSequence)this.G.get(String.valueOf(p));
                }
            }
        }
        return super.m();
    }
    
    protected final String s(String value) {
        final int p = ((Preference)this).p(Integer.MIN_VALUE);
        if (p != Integer.MIN_VALUE) {
            value = String.valueOf(p);
        }
        return value;
    }
}
