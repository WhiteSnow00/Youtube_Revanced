// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.setupdesign.items;

import android.util.AttributeSet;
import android.content.Context;
import java.util.ArrayList;
import android.util.SparseIntArray;
import java.util.List;

public class ItemGroup extends AbstractItemHierarchy
{
    public final List a;
    public final SparseIntArray b;
    
    public ItemGroup() {
        this.a = new ArrayList();
        this.b = new SparseIntArray();
    }
    
    public ItemGroup(final Context context, final AttributeSet set) {
        super(context, set);
        this.a = new ArrayList();
        this.b = new SparseIntArray();
    }
}
