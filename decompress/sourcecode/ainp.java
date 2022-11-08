import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ainp extends agzi implements ahax
{
    public static final ainp a;
    private static volatile ahbe d;
    public int b;
    public int c;
    
    static {
        agzi.registerDefaultInstance(ainp.class, a = new ainp());
    }
    
    private ainp() {
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
                if ((d = ainp.d) == null) {
                    synchronized (ainp.class) {
                        if (ainp.d == null) {
                            ainp.d = (ahbe)new agzb((agzi)ainp.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ainp.a;
            }
            case 4: {
                return new agza((agzi)ainp.a);
            }
            case 3: {
                return new ainp();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ainp.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "b", "c", aijn.k });
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
