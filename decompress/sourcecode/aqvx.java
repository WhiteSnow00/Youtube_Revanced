import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqvx extends agzi implements ahax
{
    private static final aqvx a;
    private static volatile ahbe b;
    private int c;
    private long d;
    
    static {
        agzi.registerDefaultInstance(aqvx.class, a = new aqvx());
    }
    
    private aqvx() {
    }
    
    public static aqvw a() {
        return (aqvw)aqvx.a.createBuilder();
    }
    
    private void d(final long d) {
        this.c |= 0x1;
        this.d = d;
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
                if ((b = aqvx.b) == null) {
                    synchronized (aqvx.class) {
                        if (aqvx.b == null) {
                            aqvx.b = (ahbe)new agzb((agzi)aqvx.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqvx.a;
            }
            case 4: {
                return new aqvw();
            }
            case 3: {
                return new aqvx();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aqvx.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1002\u0000", new Object[] { "c", "d" });
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
