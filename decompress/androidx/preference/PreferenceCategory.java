// 
// Decompiled by Procyon v0.6.0
// 

package androidx.preference;

import android.os.Build$VERSION;
import android.util.AttributeSet;
import android.content.Context;

public class PreferenceCategory extends PreferenceGroup
{
    public PreferenceCategory(final Context context, final AttributeSet set) {
        super(context, set, vh.c(context, 2130970117, 16842892), (byte[])null);
    }
    
    public final boolean U() {
        return false;
    }
    
    public final boolean j() {
        return !super.U();
    }
    
    public final void rN(final cfm cfm) {
        super.rN(cfm);
        if (Build$VERSION.SDK_INT >= 28) {
            cet.a(cfm.a, true);
        }
    }
}
