import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akza extends agzi implements ahax
{
    public static final akza a;
    private static volatile ahbe c;
    public long b;
    private int d;
    
    static {
        agzi.registerDefaultInstance((Class)akza.class, (agzi)(a = new akza()));
    }
    
    private akza() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = akza.c) == null) {
                    synchronized (akza.class) {
                        if (akza.c == null) {
                            akza.c = (ahbe)new agzb((agzi)akza.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return akza.a;
            }
            case 4: {
                return new agza((agzi)akza.a);
            }
            case 3: {
                return new akza();
            }
            case 2: {
                return newMessageInfo((MessageLite)akza.a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003\u1003\u0002", new Object[] { "d", "b" });
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
