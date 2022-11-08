import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahqd extends agzi implements ahax
{
    public static final ahqd a;
    private static volatile ahbe c;
    public boolean b;
    private int d;
    
    static {
        agzi.registerDefaultInstance(ahqd.class, a = new ahqd());
    }
    
    private ahqd() {
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
                if ((c = ahqd.c) == null) {
                    synchronized (ahqd.class) {
                        if (ahqd.c == null) {
                            ahqd.c = (ahbe)new agzb((agzi)ahqd.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ahqd.a;
            }
            case 4: {
                return new agza((agzi)ahqd.a);
            }
            case 3: {
                return new ahqd();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahqd.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "d", "b" });
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
