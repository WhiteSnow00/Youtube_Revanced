import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahqh extends agzi implements ahax
{
    public static final ahqh a;
    private static volatile ahbe c;
    public boolean b;
    private int d;
    
    static {
        agzi.registerDefaultInstance(ahqh.class, a = new ahqh());
    }
    
    private ahqh() {
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
                if ((c = ahqh.c) == null) {
                    synchronized (ahqh.class) {
                        if (ahqh.c == null) {
                            ahqh.c = (ahbe)new agzb((agzi)ahqh.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ahqh.a;
            }
            case 4: {
                return new agza((agzi)ahqh.a);
            }
            case 3: {
                return new ahqh();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahqh.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "d", "b" });
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
