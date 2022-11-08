import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lpb extends agzi implements ahax
{
    public static final lpb a;
    private static volatile ahbe f;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;
    
    static {
        agzi.registerDefaultInstance(lpb.class, a = new lpb());
    }
    
    private lpb() {
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
                if ((f = lpb.f) == null) {
                    synchronized (lpb.class) {
                        if (lpb.f == null) {
                            lpb.f = (ahbe)new agzb((agzi)lpb.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return lpb.a;
            }
            case 4: {
                return new agza((agzi)lpb.a);
            }
            case 3: {
                return new lpb();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)lpb.a, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1007\u0001\u0005\u1007\u0004", new Object[] { "b", "c", "d", "e" });
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
