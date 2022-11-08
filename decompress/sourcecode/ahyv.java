import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahyv extends agzi implements ahax
{
    public static final ahyv a;
    private static volatile ahbe c;
    public int b;
    private int d;
    
    static {
        agzi.registerDefaultInstance(ahyv.class, a = new ahyv());
    }
    
    private ahyv() {
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
                if ((c = ahyv.c) == null) {
                    synchronized (ahyv.class) {
                        if (ahyv.c == null) {
                            ahyv.c = (ahbe)new agzb((agzi)ahyv.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ahyv.a;
            }
            case 4: {
                return new agza((agzi)ahyv.a);
            }
            case 3: {
                return new ahyv();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahyv.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "d", "b", ahzk.b });
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
