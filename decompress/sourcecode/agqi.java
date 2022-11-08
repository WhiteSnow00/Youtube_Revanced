import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agqi extends agzi implements ahax
{
    public static final agqi a;
    private static volatile ahbe e;
    public int b;
    public agqp c;
    public agqj d;
    
    static {
        agzi.registerDefaultInstance(agqi.class, a = new agqi());
    }
    
    private agqi() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe e;
                if ((e = agqi.e) == null) {
                    synchronized (agqi.class) {
                        if (agqi.e == null) {
                            agqi.e = (ahbe)new agzb((agzi)agqi.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return agqi.a;
            }
            case 4: {
                return new agza((agzi)agqi.a);
            }
            case 3: {
                return new agqi();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agqi.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001", new Object[] { "b", "c", "d" });
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
