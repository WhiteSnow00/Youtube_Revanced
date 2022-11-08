import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahwo extends agzi implements ahax
{
    public static final ahwo a;
    private static volatile ahbe d;
    public int b;
    public int c;
    
    static {
        agzi.registerDefaultInstance(ahwo.class, a = new ahwo());
    }
    
    private ahwo() {
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
                if ((d = ahwo.d) == null) {
                    synchronized (ahwo.class) {
                        if (ahwo.d == null) {
                            ahwo.d = (ahbe)new agzb((agzi)ahwo.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ahwo.a;
            }
            case 4: {
                return new agza((agzi)ahwo.a);
            }
            case 3: {
                return new ahwo();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahwo.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "b", "c", akbe.a() });
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
