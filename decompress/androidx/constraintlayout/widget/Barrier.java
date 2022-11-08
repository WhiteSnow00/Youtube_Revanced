// 
// Decompiled by Procyon v0.6.0
// 

package androidx.constraintlayout.widget;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;

public class Barrier extends ado
{
    public int a;
    public aco b;
    
    public Barrier(final Context context) {
        super(context);
        super.setVisibility(8);
    }
    
    public Barrier(final Context context, final AttributeSet set) {
        super(context, set);
        super.setVisibility(8);
    }
    
    public Barrier(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        super.setVisibility(8);
    }
    
    protected final void a(final AttributeSet set) {
        if (set != null) {
            final TypedArray obtainStyledAttributes = this.getContext().obtainStyledAttributes(set, aed.b);
            for (int indexCount = obtainStyledAttributes.getIndexCount(), i = 0; i < indexCount; ++i) {
                final int index = obtainStyledAttributes.getIndex(i);
                if (index == 35) {
                    this.e(super.f = obtainStyledAttributes.getString(35));
                }
                else if (index == 36) {
                    this.f(super.g = obtainStyledAttributes.getString(36));
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.b = new aco();
        if (set != null) {
            final TypedArray obtainStyledAttributes2 = this.getContext().obtainStyledAttributes(set, aed.b);
            for (int indexCount2 = obtainStyledAttributes2.getIndexCount(), j = 0; j < indexCount2; ++j) {
                final int index2 = obtainStyledAttributes2.getIndex(j);
                if (index2 == 26) {
                    this.a = obtainStyledAttributes2.getInt(26, 0);
                }
                else if (index2 == 25) {
                    this.b.b = obtainStyledAttributes2.getBoolean(25, true);
                }
                else if (index2 == 27) {
                    this.b.c = obtainStyledAttributes2.getDimensionPixelSize(27, 0);
                }
            }
            obtainStyledAttributes2.recycle();
        }
        this.i = (acv)this.b;
        this.h();
    }
    
    public final void b(final acr acr, final boolean b) {
        final int a = this.a;
        int a2 = 0;
        Label_0055: {
            Label_0037: {
                if (b) {
                    if (a != 5) {
                        if ((a2 = a) == 6) {
                            break Label_0037;
                        }
                        break Label_0055;
                    }
                }
                else {
                    if (a == 5) {
                        break Label_0037;
                    }
                    if ((a2 = a) != 6) {
                        break Label_0055;
                    }
                }
                a2 = 1;
                break Label_0055;
            }
            a2 = 0;
        }
        if (acr instanceof aco) {
            ((aco)acr).a = a2;
        }
    }
    
    public final void c(final int c) {
        this.b.c = c;
    }
}
