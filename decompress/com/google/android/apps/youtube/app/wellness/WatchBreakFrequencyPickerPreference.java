// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.wellness;

import androidx.preference.Preference;
import android.widget.CompoundButton$OnCheckedChangeListener;
import android.widget.Switch;
import java.util.concurrent.atomic.AtomicReference;
import android.util.AttributeSet;
import android.content.Context;
import androidx.preference.DialogPreference;

public class WatchBreakFrequencyPickerPreference extends DialogPreference
{
    public lmr g;
    private asic h;
    private asic i;
    
    public WatchBreakFrequencyPickerPreference(final Context context) {
        this(context, null);
    }
    
    public WatchBreakFrequencyPickerPreference(final Context context, final AttributeSet set) {
        super(context, set);
        ((lmm)ahbz.az(context, (Class)lmm.class)).wA(this);
        ((Preference)this).I("watch_break_frequency_picker_preference");
    }
    
    public final void B() {
        super.Q();
        asjg.b((AtomicReference)this.h);
        asjg.b((AtomicReference)this.i);
    }
    
    public final void k(final boolean b) {
        if (b) {
            ((Preference)this).n(lml.a(((Preference)this).j.getResources(), this.g.a()));
        }
        else {
            ((Preference)this).K(2132020190);
        }
        ((Preference)this).d();
    }
    
    public final void rH(final cfi cfi) {
        super.rH(cfi);
        final Switch switch1 = (Switch)cfi.a.findViewById(2131432111);
        final boolean g = this.g.g();
        switch1.setOnCheckedChangeListener((CompoundButton$OnCheckedChangeListener)null);
        if (switch1.isChecked() != g) {
            switch1.setChecked(g);
        }
        switch1.setOnCheckedChangeListener((CompoundButton$OnCheckedChangeListener)new cfl(this, 14));
    }
    
    public final void z() {
        super.E();
        this.k(this.g.g());
        this.h = ((ashe)this.g.c).z().aa(ashw.a()).aB((asix)new llp(this, 9));
        this.i = ((ashe)this.g.d).z().aa(ashw.a()).aB((asix)new llp(this, 10));
    }
}
