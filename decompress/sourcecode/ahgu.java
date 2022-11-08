import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahgu extends agzi implements ahax
{
    public static final ahgu a;
    private static volatile ahbe c;
    public boolean b;
    private int d;
    
    static {
        agzi.registerDefaultInstance(ahgu.class, a = new ahgu());
    }
    
    private ahgu() {
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
                if ((c = ahgu.c) == null) {
                    synchronized (ahgu.class) {
                        if (ahgu.c == null) {
                            ahgu.c = (ahbe)new agzb((agzi)ahgu.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ahgu.a;
            }
            case 4: {
                return new agza((agzi)ahgu.a);
            }
            case 3: {
                return new ahgu();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahgu.a, "\u0001\u0001\u0000\u0001\u0011\u0011\u0001\u0000\u0000\u0000\u0011\u1007\u0006", new Object[] { "d", "b" });
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
