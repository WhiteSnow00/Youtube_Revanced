import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahqb extends agzi implements ahax
{
    public static final ahqb a;
    private static volatile ahbe c;
    public boolean b;
    private int d;
    
    static {
        agzi.registerDefaultInstance(ahqb.class, a = new ahqb());
    }
    
    private ahqb() {
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
                if ((c = ahqb.c) == null) {
                    synchronized (ahqb.class) {
                        if (ahqb.c == null) {
                            ahqb.c = (ahbe)new agzb((agzi)ahqb.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ahqb.a;
            }
            case 4: {
                return new agza((agzi)ahqb.a);
            }
            case 3: {
                return new ahqb();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahqb.a, "\u0001\u0001\u0000\u0001\u0005\u0005\u0001\u0000\u0000\u0000\u0005\u1007\u0002", new Object[] { "d", "b" });
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
