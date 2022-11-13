// 
// Decompiled by Procyon v0.6.0
// 

package androidx.preference;

import android.util.AttributeSet;
import android.content.Context;

public final class PreferenceScreen extends PreferenceGroup
{
    public boolean d;
    
    public PreferenceScreen(final Context context, final AttributeSet set) {
        super(context, set, vh.c(context, 2130970126, 16842891));
        this.d = true;
    }
    
    public final boolean ae() {
        return false;
    }
    
    protected final void c() {
        if (((Preference)this).t == null && ((Preference)this).u == null) {
            if (this.k() != 0) {
                final cfe e = ((Preference)this).k.e;
                if (e != null) {
                    e.aN();
                }
            }
        }
    }
}
