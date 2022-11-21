// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.bedtime;

import androidx.preference.Preference;
import android.view.ViewGroup;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import android.content.Context;
import androidx.preference.DialogPreference;

public class BedtimeReminderPreference extends DialogPreference
{
    public acmf g;
    acmb h;
    
    public BedtimeReminderPreference(final Context context, final AttributeSet set) {
        super(context, set);
        ((Preference)this).B = 2131625364;
        Context baseContext = context;
        if (context instanceof ContextWrapper) {
            baseContext = ((ContextWrapper)context).getBaseContext();
        }
        ((exc)aqvs.i((Object)baseContext, (Class)exc.class)).bc(this);
    }
    
    protected final void C() {
        super.Q();
        final acmb h = this.h;
        if (h != null) {
            h.c(null);
        }
    }
    
    public final void rN(final cfm cfm) {
        super.rN(cfm);
        if (this.h == null) {
            this.h = (acmb)((exv)this.g).b((ViewGroup)cfm.a);
            ((ViewGroup)cfm.a).addView(this.h.a());
        }
        this.h.mK(new aclz(), new jry((aocc)null));
    }
}
