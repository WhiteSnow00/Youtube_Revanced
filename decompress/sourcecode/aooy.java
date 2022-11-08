import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aooy extends agzi implements ahax
{
    public static final aooy a;
    private static volatile ahbe c;
    public int b;
    private int d;
    
    static {
        agzi.registerDefaultInstance((Class)aooy.class, (agzi)(a = new aooy()));
    }
    
    private aooy() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = aooy.c) == null) {
                    synchronized (aooy.class) {
                        if (aooy.c == null) {
                            aooy.c = (ahbe)new agzb((agzi)aooy.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aooy.a;
            }
            case 4: {
                return new agza((agzi)aooy.a);
            }
            case 3: {
                return new aooy();
            }
            case 2: {
                return newMessageInfo((MessageLite)aooy.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u1004\u0001", new Object[] { "d", "b" });
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
