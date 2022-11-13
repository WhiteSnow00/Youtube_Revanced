// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.litho;

import java.util.List;
import java.util.Collections;
import android.graphics.Rect;

public class TestItem
{
    public String a;
    public final Rect b;
    public ComponentHost c;
    public Object d;
    private final TestItem$AcquireKey e;
    
    public TestItem() {
        this.b = new Rect();
        this.e = new TestItem$AcquireKey();
    }
    
    public TestItem$AcquireKey getAcquireKey() {
        return this.e;
    }
    
    public Rect getBounds() {
        return this.b;
    }
    
    public ComponentHost getHost() {
        return this.c;
    }
    
    public String getTestKey() {
        return this.a;
    }
    
    public String getTextContent() {
        final List textItems = com.c((List)Collections.singletonList(this.d)).getTextItems();
        final StringBuilder sb = new StringBuilder();
        for (int size = textItems.size(), i = 0; i < size; ++i) {
            sb.append((CharSequence)textItems.get(i));
        }
        return sb.toString();
    }
}
