import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amip extends agzi implements ahax
{
    public static final amip a;
    private static volatile ahbe f;
    public int b;
    public amio c;
    public boolean d;
    public int e;
    
    static {
        agzi.registerDefaultInstance((Class)amip.class, (agzi)(a = new amip()));
    }
    
    private amip() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe f;
                if ((f = amip.f) == null) {
                    synchronized (amip.class) {
                        if (amip.f == null) {
                            amip.f = (ahbe)new agzb((agzi)amip.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return amip.a;
            }
            case 4: {
                return new agza((agzi)amip.a);
            }
            case 3: {
                return new amip();
            }
            case 2: {
                return newMessageInfo((MessageLite)amip.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1007\u0001\u0003\u1004\u0002", new Object[] { "b", "c", "d", "e" });
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
