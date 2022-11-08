import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class amiy extends agzi implements ahax
{
    public static final amiy a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)amiy.class, (agzi)(a = new amiy()));
    }
    
    private amiy() {
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
                final ahbe b2;
                if ((b2 = amiy.b) == null) {
                    synchronized (amiy.class) {
                        if (amiy.b == null) {
                            amiy.b = (ahbe)new agzb((agzi)amiy.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return amiy.a;
            }
            case 4: {
                return new agza((agzi)amiy.a);
            }
            case 3: {
                return new amiy();
            }
            case 2: {
                return newMessageInfo((MessageLite)amiy.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002\u1409\u0001", new Object[] { "c", "d" });
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
