import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aevy extends agzi implements ahax
{
    private static final aevy a;
    private static volatile ahbe b;
    private int c;
    private int d;
    private long e;
    
    static {
        agzi.registerDefaultInstance(aevy.class, a = new aevy());
    }
    
    private aevy() {
    }
    
    public static aevw a() {
        return (aevw)aevy.a.createBuilder();
    }
    
    private void e(final long e) {
        this.c |= 0x2;
        this.e = e;
    }
    
    private void f(final aevx aevx) {
        this.d = aevx.p;
        this.c |= 0x1;
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
                if ((b = aevy.b) == null) {
                    synchronized (aevy.class) {
                        if (aevy.b == null) {
                            aevy.b = (ahbe)new agzb((agzi)aevy.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aevy.a;
            }
            case 4: {
                return new aevw();
            }
            case 3: {
                return new aevy();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aevy.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1002\u0001", new Object[] { "c", "d", aevx.b(), "e" });
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
