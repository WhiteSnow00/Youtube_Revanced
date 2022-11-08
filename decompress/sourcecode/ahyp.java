import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahyp extends agzi implements ahax
{
    public static final ahyp a;
    private static volatile ahbe d;
    public int b;
    public int c;
    
    static {
        agzi.registerDefaultInstance(ahyp.class, a = new ahyp());
    }
    
    private ahyp() {
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
                if ((d = ahyp.d) == null) {
                    synchronized (ahyp.class) {
                        if (ahyp.d == null) {
                            ahyp.d = (ahbe)new agzb((agzi)ahyp.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ahyp.a;
            }
            case 4: {
                return new agza((agzi)ahyp.a);
            }
            case 3: {
                return new ahyp();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahyp.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "b", "c", angs.l });
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
