import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lpg extends agzi implements ahax
{
    public static final lpg a;
    private static volatile ahbe d;
    public long b;
    public long c;
    private int e;
    
    static {
        agzi.registerDefaultInstance(lpg.class, a = new lpg());
    }
    
    private lpg() {
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
                if ((d = lpg.d) == null) {
                    synchronized (lpg.class) {
                        if (lpg.d == null) {
                            lpg.d = (ahbe)new agzb((agzi)lpg.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return lpg.a;
            }
            case 4: {
                return new agza((agzi)lpg.a);
            }
            case 3: {
                return new lpg();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)lpg.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1002\u0000\u0002\u1002\u0001", new Object[] { "e", "b", "c" });
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
