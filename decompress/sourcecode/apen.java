import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apen extends agzi implements ahax
{
    public static final apen a;
    private static volatile ahbe d;
    public int b;
    public String c;
    
    static {
        agzi.registerDefaultInstance(apen.class, a = new apen());
    }
    
    private apen() {
        this.c = "";
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
                if ((d = apen.d) == null) {
                    synchronized (apen.class) {
                        if (apen.d == null) {
                            apen.d = (ahbe)new agzb((agzi)apen.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apen.a;
            }
            case 4: {
                return new agza((agzi)apen.a);
            }
            case 3: {
                return new apen();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apen.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u1008\u0001", new Object[] { "b", "c" });
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
