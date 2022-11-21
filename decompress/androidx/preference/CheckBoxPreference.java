// 
// Decompiled by Procyon v0.6.0
// 

package androidx.preference;

import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton$OnCheckedChangeListener;
import android.widget.CompoundButton;
import android.view.View;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;

public class CheckBoxPreference extends TwoStatePreference
{
    private final cfp c;
    
    public CheckBoxPreference(final Context context) {
        this(context, null);
    }
    
    public CheckBoxPreference(final Context context, final AttributeSet set) {
        this(context, set, vh.c(context, 2130968948, 16842895));
    }
    
    public CheckBoxPreference(final Context context, final AttributeSet set, final int n) {
        this(context, set, n, 0);
    }
    
    public CheckBoxPreference(final Context context, final AttributeSet set, final int n, final int n2) {
        super(context, set, n, n2);
        this.c = new cfp(this, 1);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, cfn.b, n, n2);
        this.ac((CharSequence)vh.h(obtainStyledAttributes, 5, 0));
        this.l((CharSequence)vh.h(obtainStyledAttributes, 4, 1));
        super.b = vh.i(obtainStyledAttributes, 3, 2, false);
        obtainStyledAttributes.recycle();
    }
    
    private final void af(final View view) {
        final boolean b = view instanceof CompoundButton;
        if (b) {
            ((CompoundButton)view).setOnCheckedChangeListener((CompoundButton$OnCheckedChangeListener)null);
        }
        if (view instanceof Checkable) {
            ((Checkable)view).setChecked(this.a);
        }
        if (b) {
            ((CompoundButton)view).setOnCheckedChangeListener((CompoundButton$OnCheckedChangeListener)this.c);
        }
    }
    
    public void rN(final cfm cfm) {
        super.rN(cfm);
        this.af(cfm.E(16908289));
        this.ae(cfm);
    }
    
    public final void rO(final View view) {
        ((Preference)this).D();
        if (!((AccessibilityManager)((Preference)this).j.getSystemService("accessibility")).isEnabled()) {
            return;
        }
        this.af(view.findViewById(16908289));
        this.ad(view.findViewById(16908304));
    }
}
