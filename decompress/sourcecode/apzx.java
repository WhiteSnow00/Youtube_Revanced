import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apzx extends agzi implements ahax
{
    public static final apzx a;
    private static volatile ahbe c;
    public long b;
    private int d;
    
    static {
        agzi.registerDefaultInstance(apzx.class, a = new apzx());
    }
    
    private apzx() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = apzx.c) == null) {
                    synchronized (apzx.class) {
                        if (apzx.c == null) {
                            apzx.c = (ahbe)new agzb((agzi)apzx.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return apzx.a;
            }
            case 4: {
                return new agza((agzi)apzx.a);
            }
            case 3: {
                return new apzx();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apzx.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1002\u0000", new Object[] { "d", "b" });
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
