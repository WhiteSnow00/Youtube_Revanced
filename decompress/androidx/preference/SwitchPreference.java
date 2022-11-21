// 
// Decompiled by Procyon v0.6.0
// 

package androidx.preference;

import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton$OnCheckedChangeListener;
import android.widget.Switch;
import android.view.View;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;

public class SwitchPreference extends TwoStatePreference
{
    private final cfp c;
    private CharSequence d;
    private CharSequence e;
    
    public SwitchPreference(final Context context) {
        this(context, null);
    }
    
    public SwitchPreference(final Context context, final AttributeSet set) {
        this(context, set, vh.c(context, 2130970507, 16843629));
    }
    
    public SwitchPreference(final Context context, final AttributeSet set, final int n) {
        this(context, set, n, 0);
    }
    
    public SwitchPreference(final Context context, final AttributeSet set, final int n, final int n2) {
        super(context, set, n, n2);
        this.c = new cfp(this, 0);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, cfn.l, n, n2);
        this.ac((CharSequence)vh.h(obtainStyledAttributes, 7, 0));
        this.l((CharSequence)vh.h(obtainStyledAttributes, 6, 1));
        this.d = vh.h(obtainStyledAttributes, 9, 3);
        ((Preference)this).d();
        this.e = vh.h(obtainStyledAttributes, 8, 4);
        ((Preference)this).d();
        super.b = vh.i(obtainStyledAttributes, 5, 2, false);
        obtainStyledAttributes.recycle();
    }
    
    private final void af(final View view) {
        final boolean b = view instanceof Switch;
        if (b) {
            ((Switch)view).setOnCheckedChangeListener((CompoundButton$OnCheckedChangeListener)null);
        }
        if (view instanceof Checkable) {
            ((Checkable)view).setChecked(this.a);
        }
        if (b) {
            final Switch switch1 = (Switch)view;
            switch1.setTextOn(this.d);
            switch1.setTextOff(this.e);
            switch1.setOnCheckedChangeListener((CompoundButton$OnCheckedChangeListener)this.c);
        }
    }
    
    public final void rN(final cfm cfm) {
        super.rN(cfm);
        this.af(cfm.E(16908352));
        this.ae(cfm);
    }
    
    public final void rO(final View view) {
        ((Preference)this).D();
        if (!((AccessibilityManager)((Preference)this).j.getSystemService("accessibility")).isEnabled()) {
            return;
        }
        this.af(view.findViewById(16908352));
        this.ad(view.findViewById(16908304));
    }
}
