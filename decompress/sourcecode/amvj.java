import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amvj extends agzi implements ahax
{
    public static final amvj a;
    private static volatile ahbe c;
    public ajov b;
    private int d;
    
    static {
        agzi.registerDefaultInstance(amvj.class, a = new amvj());
    }
    
    private amvj() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = amvj.c) == null) {
                    synchronized (amvj.class) {
                        if (amvj.c == null) {
                            amvj.c = (ahbe)new agzb((agzi)amvj.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return amvj.a;
            }
            case 4: {
                return new agza((agzi)amvj.a);
            }
            case 3: {
                return new amvj();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)amvj.a, "\u0001\u0001\u0000\u0001\uf6f3\u1b92\uf6f3\u1b92\u0001\u0000\u0000\u0000\uf6f3\u1b92\u1009\u0000", new Object[] { "d", "b" });
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
