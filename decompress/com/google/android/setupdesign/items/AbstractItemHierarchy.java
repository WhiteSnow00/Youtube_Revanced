// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.setupdesign.items;

import java.util.List;
import android.util.Log;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;
import java.util.ArrayList;

public abstract class AbstractItemHierarchy
{
    private final ArrayList a;
    
    public AbstractItemHierarchy() {
        this.a = new ArrayList();
    }
    
    public AbstractItemHierarchy(final Context context, final AttributeSet set) {
        this.a = new ArrayList();
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, aedq.b);
        obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
    }
    
    public final void a(final int n) {
        if (n < 0) {
            final StringBuilder sb = new StringBuilder("notifyItemRangeChanged: Invalid position=");
            sb.append(n);
            Log.w("AbstractItemHierarchy", sb.toString());
            return;
        }
        final ArrayList a = this.a;
        for (int size = a.size(), i = 0; i < size; ++i) {
            final ItemGroup itemGroup = (ItemGroup)a.get(i);
            final List a2 = itemGroup.a;
            final int size2 = a2.size();
            int n2 = 0;
            int n3;
            while (true) {
                n3 = -1;
                if (n2 >= size2) {
                    n2 = -1;
                    break;
                }
                if (a2.get(n2) == this) {
                    break;
                }
                ++n2;
            }
            if (n2 != -1) {
                final int size3 = itemGroup.a.size();
                final int n4 = -1;
                int n5;
                int value;
                for (n5 = n2, value = n4; value < 0 && n5 < size3; value = itemGroup.b.get(n5, -1), ++n5) {}
                if (value < 0) {
                    n3 = 0;
                }
                else {
                    n3 = value;
                }
            }
            if (n3 >= 0) {
                ((AbstractItemHierarchy)itemGroup).a(n3 + n);
            }
            else {
                Log.e("ItemGroup", "Unexpected child change ".concat(this.toString()));
            }
        }
    }
}
