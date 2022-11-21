// 
// Decompiled by Procyon v0.6.0
// 

package androidx.preference;

import android.util.Log;
import android.text.TextUtils;
import android.os.Parcelable;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;

public class ListPreference extends DialogPreference
{
    private String G;
    private boolean H;
    public CharSequence[] g;
    public CharSequence[] h;
    public String i;
    
    public ListPreference(final Context context) {
        this(context, null);
    }
    
    public ListPreference(final Context context, final AttributeSet set) {
        this(context, set, vh.c(context, 2130969241, 16842897));
    }
    
    public ListPreference(final Context context, final AttributeSet set, final int n) {
        this(context, set, n, 0);
    }
    
    public ListPreference(final Context context, final AttributeSet set, final int n, final int n2) {
        super(context, set, n, n2);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, cfn.e, n, n2);
        this.g = vh.k(obtainStyledAttributes, 2, 0);
        this.h = vh.k(obtainStyledAttributes, 3, 1);
        if (vh.i(obtainStyledAttributes, 4, 4, false)) {
            if (cej.a == null) {
                cej.a = new cej(0);
            }
            ((Preference)this).L((ces)cej.a);
        }
        obtainStyledAttributes.recycle();
        final TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(set, cfn.g, n, n2);
        this.G = vh.h(obtainStyledAttributes2, 33, 7);
        obtainStyledAttributes2.recycle();
    }
    
    public void e(final CharSequence[] g) {
        this.g = g;
    }
    
    public void f(final int n) {
        final CharSequence[] h = this.h;
        if (h != null) {
            this.o(h[n].toString());
        }
    }
    
    protected final void g(final Parcelable parcelable) {
        if (!parcelable.getClass().equals(ListPreference$SavedState.class)) {
            super.g(parcelable);
            return;
        }
        final ListPreference$SavedState listPreference$SavedState = (ListPreference$SavedState)parcelable;
        super.g(listPreference$SavedState.getSuperState());
        this.o(listPreference$SavedState.a);
    }
    
    protected void h(final Object o) {
        this.o(((Preference)this).s((String)o));
    }
    
    public final int k(final String s) {
        if (s != null) {
            final CharSequence[] h = this.h;
            if (h != null) {
                for (int i = h.length - 1; i >= 0; --i) {
                    if (TextUtils.equals((CharSequence)this.h[i].toString(), (CharSequence)s)) {
                        return i;
                    }
                }
            }
        }
        return -1;
    }
    
    public final CharSequence l() {
        final int k = this.k(this.i);
        if (k >= 0) {
            final CharSequence[] g = this.g;
            if (g != null) {
                return g[k];
            }
        }
        return null;
    }
    
    protected final Parcelable li() {
        final Parcelable li = super.li();
        if (((Preference)this).w) {
            return li;
        }
        final ListPreference$SavedState listPreference$SavedState = new ListPreference$SavedState(li);
        listPreference$SavedState.a = this.i;
        return (Parcelable)listPreference$SavedState;
    }
    
    protected Object lj(final TypedArray typedArray, final int n) {
        return typedArray.getString(n);
    }
    
    public CharSequence m() {
        final ces f = ((Preference)this).F;
        if (f != null) {
            return f.a((Preference)this);
        }
        final CharSequence l = this.l();
        final CharSequence m = super.m();
        final String g = this.G;
        if (g == null) {
            return m;
        }
        CharSequence charSequence;
        if ((charSequence = l) == null) {
            charSequence = "";
        }
        final String format = String.format(g, charSequence);
        if (TextUtils.equals((CharSequence)format, m)) {
            return m;
        }
        Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
        return format;
    }
    
    public final void n(final CharSequence charSequence) {
        super.n(charSequence);
        if (charSequence == null) {
            this.G = null;
            return;
        }
        this.G = charSequence.toString();
    }
    
    public void o(final String i) {
        final boolean b = TextUtils.equals((CharSequence)this.i, (CharSequence)i) ^ true;
        if (b || !this.H) {
            this.i = i;
            this.H = true;
            ((Preference)this).Z(i);
            if (b) {
                ((Preference)this).d();
            }
        }
    }
}
