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
    public acks g;
    acko h;
    
    public BedtimeReminderPreference(final Context context, final AttributeSet set) {
        super(context, set);
        ((Preference)this).B = 2131625362;
        Context baseContext = context;
        if (context instanceof ContextWrapper) {
            baseContext = ((ContextWrapper)context).getBaseContext();
        }
        ((exa)aqsy.k((Object)baseContext, (Class)exa.class)).bd(this);
    }
    
    protected final void C() {
        super.Q();
        final acko h = this.h;
        if (h != null) {
            h.c(null);
        }
    }
    
    public final void rN(final cfj cfj) {
        super.rN(cfj);
        if (this.h == null) {
            this.h = (acko)((exs)this.g).b((ViewGroup)cfj.a);
            ((ViewGroup)cfj.a).addView(this.h.a());
        }
        this.h.mN(new ackm(), new jrp((anzv)null));
    }
}
