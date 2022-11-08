import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apzz extends agzi implements ahax
{
    public static final apzz a;
    private static volatile ahbe d;
    public int b;
    public int c;
    private int e;
    
    static {
        agzi.registerDefaultInstance(apzz.class, a = new apzz());
    }
    
    private apzz() {
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
                if ((d = apzz.d) == null) {
                    synchronized (apzz.class) {
                        if (apzz.d == null) {
                            apzz.d = (ahbe)new agzb((agzi)apzz.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apzz.a;
            }
            case 4: {
                return new agza((agzi)apzz.a);
            }
            case 3: {
                return new apzz();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apzz.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1004\u0001", new Object[] { "e", "b", "c" });
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
