import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apis extends agzi implements ahax
{
    public static final apis a;
    private static volatile ahbe d;
    public int b;
    public float c;
    
    static {
        agzi.registerDefaultInstance(apis.class, a = new apis());
    }
    
    private apis() {
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
                if ((d = apis.d) == null) {
                    synchronized (apis.class) {
                        if (apis.d == null) {
                            apis.d = (ahbe)new agzb((agzi)apis.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apis.a;
            }
            case 4: {
                return new agza((agzi)apis.a);
            }
            case 3: {
                return new apis();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apis.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1001\u0000", new Object[] { "b", "c" });
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
