// 
// Decompiled by Procyon v0.6.0
// 

package androidx.preference;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.drawable.Drawable;

public abstract class DialogPreference extends Preference
{
    public CharSequence a;
    public CharSequence b;
    public Drawable c;
    public CharSequence d;
    public CharSequence e;
    public int f;
    
    public DialogPreference(final Context context) {
        this(context, null);
    }
    
    public DialogPreference(final Context context, final AttributeSet set) {
        this(context, set, vh.c(context, 2130969243, 16842897));
    }
    
    public DialogPreference(final Context context, final AttributeSet set, final int n) {
        this(context, set, n, 0);
    }
    
    public DialogPreference(final Context context, final AttributeSet set, final int n, final int n2) {
        super(context, set, n, n2);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, cfj.c, n, n2);
        final String h = vh.h(obtainStyledAttributes, 9, 0);
        this.a = h;
        if (h == null) {
            this.a = super.q;
        }
        this.b = vh.h(obtainStyledAttributes, 8, 1);
        Drawable c;
        if ((c = obtainStyledAttributes.getDrawable(6)) == null) {
            c = obtainStyledAttributes.getDrawable(2);
        }
        this.c = c;
        this.d = vh.h(obtainStyledAttributes, 11, 3);
        this.e = vh.h(obtainStyledAttributes, 10, 4);
        this.f = vh.e(obtainStyledAttributes, 7, 5, 0);
        obtainStyledAttributes.recycle();
    }
    
    protected void c() {
        super.k.h((Preference)this);
    }
}
