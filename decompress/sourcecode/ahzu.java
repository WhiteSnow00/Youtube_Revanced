import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahzu extends agzi implements ahax
{
    public static final ahzu a;
    private static volatile ahbe d;
    public int b;
    public int c;
    
    static {
        agzi.registerDefaultInstance(ahzu.class, a = new ahzu());
    }
    
    private ahzu() {
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
                if ((d = ahzu.d) == null) {
                    synchronized (ahzu.class) {
                        if (ahzu.d == null) {
                            ahzu.d = (ahbe)new agzb((agzi)ahzu.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ahzu.a;
            }
            case 4: {
                return new agza((agzi)ahzu.a);
            }
            case 3: {
                return new ahzu();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahzu.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "b", "c", ahzk.f });
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
