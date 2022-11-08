// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protobuf;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ExtensionRegistryLite
{
    public static final ExtensionRegistryLite a;
    private static volatile boolean b;
    private static volatile ExtensionRegistryLite c;
    private final Map d;
    
    static {
        a = new ExtensionRegistryLite(null);
    }
    
    public ExtensionRegistryLite() {
        this.d = new HashMap();
    }
    
    public ExtensionRegistryLite(final byte[] array) {
        this.d = Collections.emptyMap();
    }
    
    public static ExtensionRegistryLite a() {
        return new ExtensionRegistryLite();
    }
    
    public static ExtensionRegistryLite getGeneratedRegistry() {
        final ExtensionRegistryLite c = ExtensionRegistryLite.c;
        if (c != null) {
            return c;
        }
        synchronized (ExtensionRegistryLite.class) {
            final ExtensionRegistryLite c2 = ExtensionRegistryLite.c;
            if (c2 != null) {
                return c2;
            }
            return ExtensionRegistryLite.c = agyz.b(ExtensionRegistryLite.class);
        }
    }
    
    public agzg b(final MessageLite messageLite, final int n) {
        return this.d.get(new agys(messageLite, n));
    }
    
    public final void c(final agzg agzg) {
        this.d.put(new agys(agzg.a, agzg.a()), agzg);
    }
}
