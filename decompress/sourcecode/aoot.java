import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoot extends agzi implements ahax
{
    public static final aoot a;
    private static volatile ahbe c;
    public int b;
    private int d;
    
    static {
        agzi.registerDefaultInstance((Class)aoot.class, (agzi)(a = new aoot()));
    }
    
    private aoot() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = aoot.c) == null) {
                    synchronized (aoot.class) {
                        if (aoot.c == null) {
                            aoot.c = (ahbe)new agzb((agzi)aoot.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aoot.a;
            }
            case 4: {
                return new agza((agzi)aoot.a);
            }
            case 3: {
                return new aoot();
            }
            case 2: {
                return newMessageInfo((MessageLite)aoot.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1004\u0000", new Object[] { "d", "b" });
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
