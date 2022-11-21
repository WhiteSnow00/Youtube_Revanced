// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.innertube;

import java.util.Map;
import java.util.LinkedHashMap;

final class l extends LinkedHashMap
{
    private final int a;
    
    public l() {
        super(30, 0.75f, true);
        this.a = 30;
    }
    
    @Override
    protected final boolean removeEldestEntry(final Map.Entry entry) {
        return this.size() >= this.a;
    }
}
