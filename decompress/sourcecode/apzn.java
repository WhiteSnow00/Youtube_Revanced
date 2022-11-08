import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apzn extends agzi implements ahax
{
    public static final apzn a;
    private static volatile ahbe d;
    public int b;
    public float c;
    
    static {
        agzi.registerDefaultInstance(apzn.class, a = new apzn());
    }
    
    private apzn() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = apzn.d) == null) {
                    synchronized (apzn.class) {
                        if (apzn.d == null) {
                            apzn.d = (ahbe)new agzb((agzi)apzn.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apzn.a;
            }
            case 4: {
                return new agza((agzi)apzn.a);
            }
            case 3: {
                return new apzn();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apzn.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1001\u0000", new Object[] { "b", "c" });
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
