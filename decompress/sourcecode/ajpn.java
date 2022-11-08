import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajpn extends agzi implements ahax
{
    public static final ajpn a;
    private static volatile ahbe h;
    public int b;
    public long c;
    public long d;
    public long e;
    public int f;
    public double g;
    
    static {
        agzi.registerDefaultInstance((Class)ajpn.class, (agzi)(a = new ajpn()));
    }
    
    private ajpn() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe h;
                if ((h = ajpn.h) == null) {
                    synchronized (ajpn.class) {
                        if (ajpn.h == null) {
                            ajpn.h = (ahbe)new agzb((agzi)ajpn.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return ajpn.a;
            }
            case 4: {
                return new agza((agzi)ajpn.a);
            }
            case 3: {
                return new ajpn();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajpn.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u1002\u0000\u0002\u1002\u0001\u0003\u1002\u0002\u0004\u1004\u0003\u0005\u1000\u0004", new Object[] { "b", "c", "d", "e", "f", "g" });
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
