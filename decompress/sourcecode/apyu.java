import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apyu extends agzi implements ahax
{
    public static final apyu a;
    private static volatile ahbe d;
    public int b;
    public ahca c;
    
    static {
        agzi.registerDefaultInstance(apyu.class, a = new apyu());
    }
    
    private apyu() {
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
                if ((d = apyu.d) == null) {
                    synchronized (apyu.class) {
                        if (apyu.d == null) {
                            apyu.d = (ahbe)new agzb((agzi)apyu.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apyu.a;
            }
            case 4: {
                return new agza((agzi)apyu.a);
            }
            case 3: {
                return new apyu();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apyu.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", new Object[] { "b", "c" });
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
