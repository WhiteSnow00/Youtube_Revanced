// 
// Decompiled by Procyon v0.6.0
// 

package androidx.preference;

import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton$OnCheckedChangeListener;
import android.support.v7.widget.SwitchCompat;
import android.view.View;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;

public class SwitchPreferenceCompat extends TwoStatePreference
{
    private final CharSequence c;
    private final CharSequence d;
    private final cfp e;
    
    public SwitchPreferenceCompat(final Context context, final AttributeSet set) {
        super(context, set, 2130970506, 0);
        this.e = new cfp(this, 2);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, cfn.m, 2130970506, 0);
        this.ac((CharSequence)vh.h(obtainStyledAttributes, 7, 0));
        this.l((CharSequence)vh.h(obtainStyledAttributes, 6, 1));
        this.c = vh.h(obtainStyledAttributes, 9, 3);
        ((Preference)this).d();
        this.d = vh.h(obtainStyledAttributes, 8, 4);
        ((Preference)this).d();
        super.b = vh.i(obtainStyledAttributes, 5, 2, false);
        obtainStyledAttributes.recycle();
    }
    
    private final void af(final View view) {
        final boolean b = view instanceof SwitchCompat;
        if (b) {
            ((SwitchCompat)view).setOnCheckedChangeListener((CompoundButton$OnCheckedChangeListener)null);
        }
        if (view instanceof Checkable) {
            ((Checkable)view).setChecked(this.a);
        }
        if (b) {
            final SwitchCompat switchCompat = (SwitchCompat)view;
            switchCompat.f(this.c);
            switchCompat.requestLayout();
            if (switchCompat.isChecked()) {
                switchCompat.c();
            }
            switchCompat.e(this.d);
            switchCompat.requestLayout();
            if (!switchCompat.isChecked()) {
                switchCompat.b();
            }
            switchCompat.setOnCheckedChangeListener((CompoundButton$OnCheckedChangeListener)this.e);
        }
    }
    
    public final void rN(final cfm cfm) {
        super.rN(cfm);
        this.af(cfm.E(2131431918));
        this.ae(cfm);
    }
    
    public final void rO(final View view) {
        ((Preference)this).D();
        if (!((AccessibilityManager)((Preference)this).j.getSystemService("accessibility")).isEnabled()) {
            return;
        }
        this.af(view.findViewById(2131431918));
        this.ad(view.findViewById(16908304));
    }
}
