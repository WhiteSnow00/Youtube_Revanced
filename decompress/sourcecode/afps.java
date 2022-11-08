import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afps extends agzi implements ahax
{
    public static final afps a;
    private static volatile ahbe e;
    public int b;
    public int c;
    public int d;
    
    static {
        agzi.registerDefaultInstance(afps.class, a = new afps());
    }
    
    private afps() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe e;
                if ((e = afps.e) == null) {
                    synchronized (afps.class) {
                        if (afps.e == null) {
                            afps.e = (ahbe)new agzb((agzi)afps.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return afps.a;
            }
            case 4: {
                return new agza((agzi)afps.a);
            }
            case 3: {
                return new afps();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)afps.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1004\u0001", new Object[] { "b", "c", aeih.q, "d" });
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
