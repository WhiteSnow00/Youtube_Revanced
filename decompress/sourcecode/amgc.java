import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amgc extends agzi implements ahax
{
    public static final amgc a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private ajsq e;
    private ajsq f;
    private ally g;
    private aioe h;
    private byte i;
    
    static {
        agzi.registerDefaultInstance((Class)amgc.class, (agzi)(a = new amgc()));
    }
    
    private amgc() {
        this.i = 2;
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
                if ((b2 = amgc.b) == null) {
                    synchronized (amgc.class) {
                        if (amgc.b == null) {
                            amgc.b = (ahbe)new agzb((agzi)amgc.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return amgc.a;
            }
            case 4: {
                return new agza((agzi)amgc.a);
            }
            case 3: {
                return new amgc();
            }
            case 2: {
                return newMessageInfo((MessageLite)amgc.a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0005\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0006\u1409\u0005", new Object[] { "c", "d", "e", "f", "g", "h" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.i = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
