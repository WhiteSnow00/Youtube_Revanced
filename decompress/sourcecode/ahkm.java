import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahkm extends agzi implements ahax
{
    public static final ahkm a;
    private static volatile ahbe d;
    public int b;
    public aorh c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)ahkm.class, (agzi)(a = new ahkm()));
    }
    
    private ahkm() {
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
                if ((d = ahkm.d) == null) {
                    synchronized (ahkm.class) {
                        if (ahkm.d == null) {
                            ahkm.d = (ahbe)new agzb((agzi)ahkm.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ahkm.a;
            }
            case 4: {
                return new agza((agzi)ahkm.a);
            }
            case 3: {
                return new ahkm();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahkm.a, "\u0001\u0001\u0000\u0001\uede7\u287b\uede7\u287b\u0001\u0000\u0000\u0001\uede7\u287b\u1409\u0000", new Object[] { "b", "c" });
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
