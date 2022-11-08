import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoog extends agzi implements ahax
{
    public static final aoog a;
    private static volatile ahbe d;
    public int b;
    public aooh c;
    
    static {
        agzi.registerDefaultInstance((Class)aoog.class, (agzi)(a = new aoog()));
    }
    
    private aoog() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = aoog.d) == null) {
                    synchronized (aoog.class) {
                        if (aoog.d == null) {
                            aoog.d = (ahbe)new agzb((agzi)aoog.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aoog.a;
            }
            case 4: {
                return new agza((agzi)aoog.a);
            }
            case 3: {
                return new aoog();
            }
            case 2: {
                return newMessageInfo((MessageLite)aoog.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", new Object[] { "b", "c" });
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
