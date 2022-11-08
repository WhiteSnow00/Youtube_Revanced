import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajpe extends agzi implements ahax
{
    public static final ajpe a;
    private static volatile ahbe b;
    private int c;
    private ahfw d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)ajpe.class, (agzi)(a = new ajpe()));
    }
    
    private ajpe() {
        this.e = 2;
        final agyc b = agyc.b;
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
                if ((b2 = ajpe.b) == null) {
                    synchronized (ajpe.class) {
                        if (ajpe.b == null) {
                            ajpe.b = (ahbe)new agzb((agzi)ajpe.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return ajpe.a;
            }
            case 4: {
                return new agza((agzi)ajpe.a);
            }
            case 3: {
                return new ajpe();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajpe.a, "\u0001\u0001\u0000\u0001\u0005\u0005\u0001\u0000\u0000\u0001\u0005\u1409\u0004", new Object[] { "c", "d" });
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
