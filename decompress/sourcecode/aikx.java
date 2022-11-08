import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aikx extends agzi implements ahax
{
    public static final aikx a;
    private static volatile ahbe d;
    public int b;
    public int c;
    
    static {
        agzi.registerDefaultInstance(aikx.class, a = new aikx());
    }
    
    private aikx() {
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
                if ((d = aikx.d) == null) {
                    synchronized (aikx.class) {
                        if (aikx.d == null) {
                            aikx.d = (ahbe)new agzb((agzi)aikx.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aikx.a;
            }
            case 4: {
                return new agza((agzi)aikx.a);
            }
            case 3: {
                return new aikx();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aikx.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "b", "c", aijn.h });
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
