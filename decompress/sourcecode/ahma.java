import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahma extends agzi implements ahax
{
    public static final ahma a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    
    static {
        agzi.registerDefaultInstance((Class)ahma.class, (agzi)(a = new ahma()));
    }
    
    private ahma() {
        this.b = 0;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = ahma.d) == null) {
                    synchronized (ahma.class) {
                        if (ahma.d == null) {
                            ahma.d = (ahbe)new agzb((agzi)ahma.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ahma.a;
            }
            case 4: {
                return new agza((agzi)ahma.a);
            }
            case 3: {
                return new ahma();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahma.a, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u103c\u0000", new Object[] { "c", "b", aovd.class });
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
