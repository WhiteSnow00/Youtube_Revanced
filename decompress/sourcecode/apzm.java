import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apzm extends agzi implements ahax
{
    public static final apzm a;
    private static volatile ahbe c;
    public float b;
    private int d;
    
    static {
        agzi.registerDefaultInstance(apzm.class, a = new apzm());
    }
    
    private apzm() {
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
                if ((c = apzm.c) == null) {
                    synchronized (apzm.class) {
                        if (apzm.c == null) {
                            apzm.c = (ahbe)new agzb((agzi)apzm.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return apzm.a;
            }
            case 4: {
                return new agza((agzi)apzm.a);
            }
            case 3: {
                return new apzm();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apzm.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1001\u0000", new Object[] { "d", "b" });
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
