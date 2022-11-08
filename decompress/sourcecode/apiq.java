import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apiq extends agzi implements ahax
{
    public static final apiq a;
    private static volatile ahbe d;
    public int b;
    public agyo c;
    
    static {
        agzi.registerDefaultInstance(apiq.class, a = new apiq());
    }
    
    private apiq() {
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
                if ((d = apiq.d) == null) {
                    synchronized (apiq.class) {
                        if (apiq.d == null) {
                            apiq.d = (ahbe)new agzb((agzi)apiq.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apiq.a;
            }
            case 4: {
                return new agza((agzi)apiq.a);
            }
            case 3: {
                return new apiq();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apiq.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", new Object[] { "b", "c" });
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
