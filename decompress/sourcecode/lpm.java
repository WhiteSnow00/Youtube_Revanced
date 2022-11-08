import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lpm extends agzi implements ahax
{
    public static final lpm a;
    private static volatile ahbe e;
    public long b;
    public int c;
    public int d;
    private int f;
    
    static {
        agzi.registerDefaultInstance(lpm.class, a = new lpm());
    }
    
    private lpm() {
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
                if ((e = lpm.e) == null) {
                    synchronized (lpm.class) {
                        if (lpm.e == null) {
                            lpm.e = (ahbe)new agzb((agzi)lpm.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return lpm.a;
            }
            case 4: {
                return new agza((agzi)lpm.a);
            }
            case 3: {
                return new lpm();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)lpm.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1002\u0000\u0002\u1004\u0001\u0003\u100c\u0002", new Object[] { "f", "b", "c", "d", anwx.a() });
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
