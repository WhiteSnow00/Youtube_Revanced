// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.blocks;

import java.util.Iterator;
import java.util.Collection;
import java.util.Collections;
import java.util.ArrayList;

public final class StatusException extends RuntimeException
{
    public final aums a;
    public final agsq b;
    
    public StatusException(final agsq agsq, final String s) {
        this(agsq, s, new StackTraceElement[0]);
    }
    
    public StatusException(final agsq b, final String s, final StackTraceElement[] stackTrace) {
        super(s);
        this.b = b;
        this.a = null;
        this.setStackTrace(stackTrace);
    }
    
    public StatusException(final agsq b, final String s, final StackTraceElement[] array, final aums a) {
        super(s, new StatusException(b, "", array));
        this.b = b;
        this.a = a;
        if (a.c.size() > 0) {
            final ArrayList list = new ArrayList();
            final Iterator<Object> iterator = a.c.iterator();
            while (true) {
                final boolean hasNext = iterator.hasNext();
                int i = 0;
                if (!hasNext) {
                    break;
                }
                final aumr aumr = iterator.next();
                if (aumr.b != 1) {
                    continue;
                }
                final agzy e = ((aump)aumr.c).e;
                final int size = e.size();
                final StackTraceElement[] array2 = new StackTraceElement[size];
                while (i < size) {
                    final aumq aumq = e.get(i);
                    final int e2 = aumq.e;
                    final StringBuilder sb = new StringBuilder("_blocks_js_:");
                    sb.append(e2);
                    array2[i] = new StackTraceElement(sb.toString(), aumq.b, aumq.c, aumq.d);
                    ++i;
                }
                Collections.addAll(list, array2);
            }
            this.setStackTrace((StackTraceElement[])list.toArray(new StackTraceElement[0]));
        }
    }
}
