import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amwg extends agzi implements ahax
{
    public static final amwg a;
    private static volatile ahbe f;
    public int b;
    public int c;
    public Object d;
    public long e;
    
    static {
        agzi.registerDefaultInstance(amwg.class, a = new amwg());
    }
    
    private amwg() {
        this.c = 0;
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
                if ((f = amwg.f) == null) {
                    synchronized (amwg.class) {
                        if (amwg.f == null) {
                            amwg.f = (ahbe)new agzb((agzi)amwg.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return amwg.a;
            }
            case 4: {
                return new agza((agzi)amwg.a);
            }
            case 3: {
                return new amwg();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)amwg.a, "\u0001\u0004\u0001\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001\u1003\u0000\u0002\u103b\u0000\u0003\u103c\u0000\u0005\u103b\u0000", new Object[] { "d", "c", "b", "e", alqg.class });
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
