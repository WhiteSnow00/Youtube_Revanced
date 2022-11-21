// 
// Decompiled by Procyon v0.6.0
// 

package androidx.preference;

import android.text.TextUtils;
import android.os.Parcelable;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;

public class EditTextPreference extends DialogPreference
{
    public String g;
    
    public EditTextPreference(final Context context) {
        this(context, null);
    }
    
    public EditTextPreference(final Context context, final AttributeSet set) {
        this(context, set, vh.c(context, 2130969297, 16842898));
    }
    
    public EditTextPreference(final Context context, final AttributeSet set, final int n) {
        this(context, set, n, 0);
    }
    
    public EditTextPreference(final Context context, final AttributeSet set, final int n, final int n2) {
        super(context, set, n, n2);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, cfn.d, n, n2);
        if (vh.i(obtainStyledAttributes, 0, 0, false)) {
            if (cej.b == null) {
                cej.b = new cej(1);
            }
            ((Preference)this).L((ces)cej.b);
        }
        obtainStyledAttributes.recycle();
    }
    
    protected final void g(final Parcelable parcelable) {
        if (!parcelable.getClass().equals(EditTextPreference$SavedState.class)) {
            super.g(parcelable);
            return;
        }
        final EditTextPreference$SavedState editTextPreference$SavedState = (EditTextPreference$SavedState)parcelable;
        super.g(editTextPreference$SavedState.getSuperState());
        this.i(editTextPreference$SavedState.a);
    }
    
    protected void h(final Object o) {
        this.i(((Preference)this).s((String)o));
    }
    
    public final void i(final String g) {
        final boolean j = ((Preference)this).j();
        ((Preference)this).Z(this.g = g);
        final boolean i = ((Preference)this).j();
        if (i != j) {
            ((Preference)this).x(i);
        }
        ((Preference)this).d();
    }
    
    public final boolean j() {
        return TextUtils.isEmpty((CharSequence)this.g) || super.j();
    }
    
    protected final Parcelable li() {
        final Parcelable li = super.li();
        if (((Preference)this).w) {
            return li;
        }
        final EditTextPreference$SavedState editTextPreference$SavedState = new EditTextPreference$SavedState(li);
        editTextPreference$SavedState.a = this.g;
        return (Parcelable)editTextPreference$SavedState;
    }
    
    protected Object lj(final TypedArray typedArray, final int n) {
        return typedArray.getString(n);
    }
}
