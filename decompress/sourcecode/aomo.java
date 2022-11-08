import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aomo extends agzi implements ahax
{
    public static final aomo a;
    private static volatile ahbe c;
    public int b;
    private int d;
    
    static {
        agzi.registerDefaultInstance((Class)aomo.class, (agzi)(a = new aomo()));
    }
    
    private aomo() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = aomo.c) == null) {
                    synchronized (aomo.class) {
                        if (aomo.c == null) {
                            aomo.c = (ahbe)new agzb((agzi)aomo.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aomo.a;
            }
            case 4: {
                return new agza((agzi)aomo.a);
            }
            case 3: {
                return new aomo();
            }
            case 2: {
                return newMessageInfo((MessageLite)aomo.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "d", "b", aomr.a() });
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
