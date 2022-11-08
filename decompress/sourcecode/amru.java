import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amru extends agzi implements ahax
{
    public static final amru a;
    private static volatile ahbe f;
    public int b;
    public boolean c;
    public boolean d;
    public long e;
    
    static {
        agzi.registerDefaultInstance(amru.class, a = new amru());
    }
    
    private amru() {
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
                if ((f = amru.f) == null) {
                    synchronized (amru.class) {
                        if (amru.f == null) {
                            amru.f = (ahbe)new agzb((agzi)amru.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return amru.a;
            }
            case 4: {
                return new agza((agzi)amru.a);
            }
            case 3: {
                return new amru();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)amru.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1007\u0001\u0004\u1002\u0003", new Object[] { "b", "c", "d", "e" });
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
