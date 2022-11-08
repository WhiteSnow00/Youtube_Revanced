// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.notifications.data.impl.room;

import java.util.HashSet;
import java.util.Set;
import java.util.Collections;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public final class ChimePerAccountRoomDatabase_Impl extends ChimePerAccountRoomDatabase
{
    private volatile pmo i;
    
    protected final cfq a() {
        final HashMap hashMap = new HashMap(0);
        new HashMap(0);
        return new cfq((cfs)this, (Map)hashMap, new String[] { "chime_thread_states" });
    }
    
    protected final cgp b(final cfn cfn) {
        return cfn.c.a(cep.b(cfn.a, cfn.b, new cgm(cfn, (cft)new pmn(this), "ea4ce6093b9d29b56181718d906e0024", "7b4a6a59292e18bdb45d33bd6152c7d2"), false, false));
    }
    
    public final List e(final Map map) {
        return Arrays.asList(new cfy[0]);
    }
    
    protected final Map f() {
        final HashMap hashMap = new HashMap();
        hashMap.put(pmo.class, Collections.emptyList());
        return hashMap;
    }
    
    public final Set g() {
        return new HashSet();
    }
    
    public final pmo r() {
        if (this.i != null) {
            return this.i;
        }
        synchronized (this) {
            if (this.i == null) {
                this.i = (pmo)new pms((cfs)this);
            }
            return this.i;
        }
    }
}
