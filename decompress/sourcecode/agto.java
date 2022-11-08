import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agto extends agzi implements ahax
{
    public static final agto a;
    private static volatile ahbe d;
    public int b;
    public int c;
    
    static {
        agzi.registerDefaultInstance(agto.class, a = new agto());
    }
    
    private agto() {
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
                if ((d = agto.d) == null) {
                    synchronized (agto.class) {
                        if (agto.d == null) {
                            agto.d = (ahbe)new agzb((agzi)agto.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return agto.a;
            }
            case 4: {
                return new agza((agzi)agto.a);
            }
            case 3: {
                return new agto();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agto.a, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0000\u0004\u100c\u0003", new Object[] { "b", "c", agte.h });
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
