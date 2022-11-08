import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amry extends agzi implements ahax
{
    public static final amry a;
    private static volatile ahbe f;
    public int b;
    public long c;
    public int d;
    public amrx e;
    
    static {
        agzi.registerDefaultInstance(amry.class, a = new amry());
    }
    
    private amry() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe f;
                if ((f = amry.f) == null) {
                    synchronized (amry.class) {
                        if (amry.f == null) {
                            amry.f = (ahbe)new agzb((agzi)amry.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return amry.a;
            }
            case 4: {
                return new agza((agzi)amry.a);
            }
            case 3: {
                return new amry();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)amry.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001\u1003\u0000\u0002\u100c\u0001\u0004\u1009\u0002", new Object[] { "b", "c", "d", amsc.b, "e" });
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
