import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apsn extends agzi implements ahax
{
    public static final apsn a;
    private static volatile ahbe c;
    public int b;
    private Object d;
    
    static {
        agzi.registerDefaultInstance((Class)apsn.class, (agzi)(a = new apsn()));
    }
    
    private apsn() {
        this.b = 0;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = apsn.c) == null) {
                    synchronized (apsn.class) {
                        if (apsn.c == null) {
                            apsn.c = (ahbe)new agzb((agzi)apsn.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return apsn.a;
            }
            case 4: {
                return new agza((agzi)apsn.a);
            }
            case 3: {
                return new apsn();
            }
            case 2: {
                return newMessageInfo((MessageLite)apsn.a, "\u0001\u0002\u0001\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u103c\u0000\u0003\u103c\u0000", new Object[] { "d", "b", apsp.class, apsq.class });
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
