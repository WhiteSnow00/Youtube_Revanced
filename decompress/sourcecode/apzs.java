import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apzs extends agzi implements ahax
{
    public static final apzs a;
    private static volatile ahbe d;
    public int b;
    public apzt c;
    
    static {
        agzi.registerDefaultInstance(apzs.class, a = new apzs());
    }
    
    private apzs() {
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
                if ((d = apzs.d) == null) {
                    synchronized (apzs.class) {
                        if (apzs.d == null) {
                            apzs.d = (ahbe)new agzb((agzi)apzs.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apzs.a;
            }
            case 4: {
                return new agza((agzi)apzs.a);
            }
            case 3: {
                return new apzs();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apzs.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", new Object[] { "b", "c" });
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
