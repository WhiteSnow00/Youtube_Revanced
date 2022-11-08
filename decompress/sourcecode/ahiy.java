import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahiy extends agzi implements ahax
{
    public static final ahiy a;
    private static volatile ahbe d;
    public int b;
    public ajpr c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)ahiy.class, (agzi)(a = new ahiy()));
    }
    
    private ahiy() {
        this.e = 2;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = ahiy.d) == null) {
                    synchronized (ahiy.class) {
                        if (ahiy.d == null) {
                            ahiy.d = (ahbe)new agzb((agzi)ahiy.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ahiy.a;
            }
            case 4: {
                return new agza((agzi)ahiy.a);
            }
            case 3: {
                return new ahiy();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahiy.a, "\u0001\u0001\u0000\u0001\uf486\u28b5\uf486\u28b5\u0001\u0000\u0000\u0001\uf486\u28b5\u1409\u0000", new Object[] { "b", "c" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.e = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
