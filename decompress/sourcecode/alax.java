import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alax extends agzi implements ahax
{
    public static final alax a;
    private static volatile ahbe d;
    public int b;
    public int c;
    
    static {
        agzi.registerDefaultInstance((Class)alax.class, (agzi)(a = new alax()));
    }
    
    private alax() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = alax.d) == null) {
                    synchronized (alax.class) {
                        if (alax.d == null) {
                            alax.d = (ahbe)new agzb((agzi)alax.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return alax.a;
            }
            case 4: {
                return new agza((agzi)alax.a);
            }
            case 3: {
                return new alax();
            }
            case 2: {
                return newMessageInfo((MessageLite)alax.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "b", "c", akwf.q });
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
