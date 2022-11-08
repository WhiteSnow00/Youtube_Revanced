import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akzn extends agzi implements ahax
{
    public static final akzn a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    
    static {
        agzi.registerDefaultInstance((Class)akzn.class, (agzi)(a = new akzn()));
    }
    
    private akzn() {
        this.b = 0;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = akzn.d) == null) {
                    synchronized (akzn.class) {
                        if (akzn.d == null) {
                            akzn.d = (ahbe)new agzb((agzi)akzn.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akzn.a;
            }
            case 4: {
                return new agza((agzi)akzn.a);
            }
            case 3: {
                return new akzn();
            }
            case 2: {
                return newMessageInfo((MessageLite)akzn.a, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u103b\u0000\u0002\u103c\u0000", new Object[] { "c", "b", akzm.class });
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
