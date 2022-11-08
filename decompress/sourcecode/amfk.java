import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amfk extends agzi implements ahax
{
    public static final amfk a;
    private static volatile ahbe c;
    public int b;
    private int d;
    
    static {
        agzi.registerDefaultInstance((Class)amfk.class, (agzi)(a = new amfk()));
    }
    
    private amfk() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = amfk.c) == null) {
                    synchronized (amfk.class) {
                        if (amfk.c == null) {
                            amfk.c = (ahbe)new agzb((agzi)amfk.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return amfk.a;
            }
            case 4: {
                return new agza((agzi)amfk.a);
            }
            case 3: {
                return new amfk();
            }
            case 2: {
                return newMessageInfo((MessageLite)amfk.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "d", "b", akbe.a() });
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
