import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahwn extends agzi implements ahax
{
    public static final ahwn a;
    private static volatile ahbe d;
    public int b;
    public int c;
    
    static {
        agzi.registerDefaultInstance(ahwn.class, a = new ahwn());
    }
    
    private ahwn() {
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
                if ((d = ahwn.d) == null) {
                    synchronized (ahwn.class) {
                        if (ahwn.d == null) {
                            ahwn.d = (ahbe)new agzb((agzi)ahwn.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ahwn.a;
            }
            case 4: {
                return new agza((agzi)ahwn.a);
            }
            case 3: {
                return new ahwn();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahwn.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "b", "c", ahwk.a() });
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
