import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akzp extends agzi implements ahax
{
    public static final akzp a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    
    static {
        agzi.registerDefaultInstance((Class)akzp.class, (agzi)(a = new akzp()));
    }
    
    private akzp() {
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
                if ((d = akzp.d) == null) {
                    synchronized (akzp.class) {
                        if (akzp.d == null) {
                            akzp.d = (ahbe)new agzb((agzi)akzp.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akzp.a;
            }
            case 4: {
                return new agza((agzi)akzp.a);
            }
            case 3: {
                return new akzp();
            }
            case 2: {
                return newMessageInfo((MessageLite)akzp.a, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u103b\u0000\u0002\u103c\u0000", new Object[] { "c", "b", akzo.class });
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
