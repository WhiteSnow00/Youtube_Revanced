import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afpn extends agzi implements ahax
{
    public static final afpn a;
    private static volatile ahbe d;
    public int b;
    public boolean c;
    
    static {
        agzi.registerDefaultInstance(afpn.class, a = new afpn());
    }
    
    private afpn() {
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
                if ((d = afpn.d) == null) {
                    synchronized (afpn.class) {
                        if (afpn.d == null) {
                            afpn.d = (ahbe)new agzb((agzi)afpn.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return afpn.a;
            }
            case 4: {
                return new agza((agzi)afpn.a);
            }
            case 3: {
                return new afpn();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)afpn.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "b", "c" });
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
