// 
// Decompiled by Procyon v0.6.0
// 

package androidx.preference;

import android.content.SharedPreferences$Editor;
import java.util.Collection;
import android.os.Parcelable;
import android.content.res.TypedArray;
import java.util.HashSet;
import android.util.AttributeSet;
import android.content.Context;
import java.util.Set;

public class MultiSelectListPreference extends DialogPreference
{
    public CharSequence[] g;
    public CharSequence[] h;
    public Set i;
    
    public MultiSelectListPreference(final Context context, final AttributeSet set) {
        final int c = vh.c(context, 2130969243, 16842897);
        super(context, set, c, 0);
        this.i = new HashSet();
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, cfk.f, c, 0);
        this.g = vh.k(obtainStyledAttributes, 2, 0);
        this.h = vh.k(obtainStyledAttributes, 3, 1);
        obtainStyledAttributes.recycle();
    }
    
    protected final void g(final Parcelable parcelable) {
        if (!parcelable.getClass().equals(MultiSelectListPreference$SavedState.class)) {
            super.g(parcelable);
            return;
        }
        final MultiSelectListPreference$SavedState multiSelectListPreference$SavedState = (MultiSelectListPreference$SavedState)parcelable;
        super.g(multiSelectListPreference$SavedState.getSuperState());
        this.k(multiSelectListPreference$SavedState.a);
    }
    
    protected final void h(final Object o) {
        this.k(((Preference)this).t((Set)o));
    }
    
    public final void k(final Set set) {
        this.i.clear();
        this.i.addAll(set);
        if (((Preference)this).V()) {
            if (!set.equals(((Preference)this).t((Set)null))) {
                final SharedPreferences$Editor b = ((Preference)this).k.b();
                b.putStringSet(((Preference)this).s, set);
                super.P(b);
            }
        }
        ((Preference)this).d();
    }
    
    protected final Parcelable li() {
        final Parcelable li = super.li();
        if (((Preference)this).w) {
            return li;
        }
        final MultiSelectListPreference$SavedState multiSelectListPreference$SavedState = new MultiSelectListPreference$SavedState(li);
        multiSelectListPreference$SavedState.a = this.i;
        return (Parcelable)multiSelectListPreference$SavedState;
    }
    
    protected final Object lj(final TypedArray typedArray, int i) {
        final CharSequence[] textArray = typedArray.getTextArray(i);
        final HashSet set = new HashSet();
        int length;
        for (length = textArray.length, i = 0; i < length; ++i) {
            set.add(textArray[i].toString());
        }
        return set;
    }
}
