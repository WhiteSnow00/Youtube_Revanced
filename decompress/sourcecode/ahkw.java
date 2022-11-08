import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahkw extends agzi implements ahax
{
    public static final ahkw a;
    private static volatile ahbe d;
    public int b;
    public amqy c;
    
    static {
        agzi.registerDefaultInstance((Class)ahkw.class, (agzi)(a = new ahkw()));
    }
    
    private ahkw() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = ahkw.d) == null) {
                    synchronized (ahkw.class) {
                        if (ahkw.d == null) {
                            ahkw.d = (ahbe)new agzb((agzi)ahkw.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ahkw.a;
            }
            case 4: {
                return new agza((agzi)ahkw.a);
            }
            case 3: {
                return new ahkw();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahkw.a, "\u0001\u0001\u0000\u0001\uf2d9\u20b0\uf2d9\u20b0\u0001\u0000\u0000\u0000\uf2d9\u20b0\u1009\u0000", new Object[] { "b", "c" });
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
