// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class StoriesShareCommandOuterClass$StoriesShareCommand extends ahbh implements ahcw
{
    public static final StoriesShareCommandOuterClass$StoriesShareCommand a;
    private static volatile ahdd j;
    public static final ahbf storiesShareCommand;
    public int b;
    public Object c;
    public ahab d;
    public int e;
    public String f;
    public String g;
    public float h;
    public float i;
    private int k;
    
    static {
        final StoriesShareCommandOuterClass$StoriesShareCommand a2 = new StoriesShareCommandOuterClass$StoriesShareCommand();
        ahbh.registerDefaultInstance((Class)StoriesShareCommandOuterClass$StoriesShareCommand.class, (ahbh)(a = a2));
        storiesShareCommand = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 377377894, ahek.k, (Class)StoriesShareCommandOuterClass$StoriesShareCommand.class);
    }
    
    private StoriesShareCommandOuterClass$StoriesShareCommand() {
        this.b = 0;
        this.d = ahab.b;
        this.f = "";
        this.g = "";
        this.h = 0.5f;
        this.i = 0.5f;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd j;
                if ((j = StoriesShareCommandOuterClass$StoriesShareCommand.j) == null) {
                    synchronized (StoriesShareCommandOuterClass$StoriesShareCommand.class) {
                        if (StoriesShareCommandOuterClass$StoriesShareCommand.j == null) {
                            StoriesShareCommandOuterClass$StoriesShareCommand.j = (ahdd)new ahba((ahbh)StoriesShareCommandOuterClass$StoriesShareCommand.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return StoriesShareCommandOuterClass$StoriesShareCommand.a;
            }
            case 4: {
                return new ahaz((ahbh)StoriesShareCommandOuterClass$StoriesShareCommand.a);
            }
            case 3: {
                return new StoriesShareCommandOuterClass$StoriesShareCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)StoriesShareCommandOuterClass$StoriesShareCommand.a, "\u0001\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001\u100a\u0000\u0002\u103d\u0000\u0003\u103d\u0000\u0004\u100c\u0003\u0005\u1008\u0004\u0006\u1008\u0005\u0007\u1001\u0006\b\u1001\u0007", new Object[] { "c", "b", "k", "d", "e", aola.e, "f", "g", "h", "i" });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
