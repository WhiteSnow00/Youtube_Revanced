import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anje extends agzi implements ahax
{
    public static final anje a;
    private static volatile ahbe c;
    public int b;
    private int d;
    
    static {
        agzi.registerDefaultInstance(anje.class, a = new anje());
    }
    
    private anje() {
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
                if ((c = anje.c) == null) {
                    synchronized (anje.class) {
                        if (anje.c == null) {
                            anje.c = (ahbe)new agzb((agzi)anje.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return anje.a;
            }
            case 4: {
                return new agza((agzi)anje.a);
            }
            case 3: {
                return new anje();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)anje.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100b\u0000", new Object[] { "d", "b" });
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
