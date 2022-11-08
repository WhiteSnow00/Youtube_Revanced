import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahmc extends agzi implements ahax
{
    public static final ahmc a;
    private static volatile ahbe e;
    public int b;
    public float c;
    public long d;
    private int f;
    
    static {
        agzi.registerDefaultInstance((Class)ahmc.class, (agzi)(a = new ahmc()));
    }
    
    private ahmc() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe e;
                if ((e = ahmc.e) == null) {
                    synchronized (ahmc.class) {
                        if (ahmc.e == null) {
                            ahmc.e = (ahbe)new agzb((agzi)ahmc.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ahmc.a;
            }
            case 4: {
                return new agza((agzi)ahmc.a);
            }
            case 3: {
                return new ahmc();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahmc.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1001\u0001\u0003\u1002\u0002", new Object[] { "f", "b", ahho.l, "c", "d" });
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
