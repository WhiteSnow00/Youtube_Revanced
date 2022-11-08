import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoph extends agzi implements ahax
{
    public static final aoph a;
    private static volatile ahbe c;
    public int b;
    private int d;
    
    static {
        agzi.registerDefaultInstance((Class)aoph.class, (agzi)(a = new aoph()));
    }
    
    private aoph() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = aoph.c) == null) {
                    synchronized (aoph.class) {
                        if (aoph.c == null) {
                            aoph.c = (ahbe)new agzb((agzi)aoph.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aoph.a;
            }
            case 4: {
                return new agza((agzi)aoph.a);
            }
            case 3: {
                return new aoph();
            }
            case 2: {
                return newMessageInfo((MessageLite)aoph.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "d", "b", aonj.j });
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
