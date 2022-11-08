import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahzo extends agzi implements ahax
{
    private static final ahzo a;
    private static volatile ahbe b;
    private int c;
    private int d;
    private int e;
    
    static {
        agzi.registerDefaultInstance(ahzo.class, a = new ahzo());
    }
    
    private ahzo() {
    }
    
    public static ahzn a() {
        return (ahzn)ahzo.a.createBuilder();
    }
    
    private void e(final ahzl ahzl) {
        this.d = ahzl.e;
        this.c |= 0x1;
    }
    
    private void f(final ahzm ahzm) {
        this.e = ahzm.d;
        this.c |= 0x2;
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = ahzo.b) == null) {
                    synchronized (ahzo.class) {
                        if (ahzo.b == null) {
                            ahzo.b = (ahbe)new agzb((agzi)ahzo.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ahzo.a;
            }
            case 4: {
                return new ahzn();
            }
            case 3: {
                return new ahzo();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahzo.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u100c\u0001", new Object[] { "c", "d", ahzl.a(), "e", ahzm.a() });
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
