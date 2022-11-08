// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.settings.datasaving;

import androidx.preference.Preference;
import android.widget.CompoundButton$OnCheckedChangeListener;
import android.widget.Switch;
import java.util.concurrent.atomic.AtomicReference;
import android.util.AttributeSet;
import android.content.Context;
import androidx.preference.EditTextPreference;

public class DataReminderPreference extends EditTextPreference
{
    private asic G;
    public tku h;
    public asho i;
    
    public DataReminderPreference(final Context context) {
        this(context, null);
    }
    
    public DataReminderPreference(final Context context, final AttributeSet set) {
        super(context, set);
        ((jot)ahbz.az(context, (Class)jot.class)).wx(this);
        ((Preference)this).I("data_saving_data_reminder_key");
    }
    
    public final void B() {
        super.Q();
        final asic g = this.G;
        if (g != null) {
            athh.f((AtomicReference)g);
        }
    }
    
    public final void rH(final cfi cfi) {
        super.rH(cfi);
        final Switch switch1 = (Switch)cfi.a.findViewById(2131432111);
        tcp.i(this.h.a(), (tco)new jma(this, switch1, 2));
        switch1.setOnCheckedChangeListener((CompoundButton$OnCheckedChangeListener)new cfl(this, 7));
    }
    
    public final void z() {
        super.E();
        this.G = this.h.d().p().P(this.i).al((asix)new jmj(this, 11));
    }
}
