import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqet extends agzi implements ahax
{
    public static final aqet a;
    private static volatile ahbe e;
    public int b;
    public float c;
    public float d;
    
    static {
        agzi.registerDefaultInstance((Class)aqet.class, (agzi)(a = new aqet()));
    }
    
    private aqet() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe e;
                if ((e = aqet.e) == null) {
                    synchronized (aqet.class) {
                        if (aqet.e == null) {
                            aqet.e = (ahbe)new agzb((agzi)aqet.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aqet.a;
            }
            case 4: {
                return new agza((agzi)aqet.a);
            }
            case 3: {
                return new aqet();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqet.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1001\u0000\u0002\u1001\u0001", new Object[] { "b", "c", "d" });
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
