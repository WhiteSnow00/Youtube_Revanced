import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amwc extends agzi implements ahax
{
    public static final amwc a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private ajsq e;
    private ajsq f;
    private ajsq g;
    private byte h;
    
    static {
        agzi.registerDefaultInstance(amwc.class, a = new amwc());
    }
    
    private amwc() {
        this.h = 2;
        emptyProtobufList();
    }
    
    @Override
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
                if ((b2 = amwc.b) == null) {
                    synchronized (amwc.class) {
                        if (amwc.b == null) {
                            amwc.b = (ahbe)new agzb((agzi)amwc.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return amwc.a;
            }
            case 4: {
                return new agza((agzi)amwc.a);
            }
            case 3: {
                return new amwc();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)amwc.a, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0004\u0001\u1409\u0000\u0003\u1409\u0004\u0005\u1409\u0005\u0006\u1409\u0006", new Object[] { "c", "d", "e", "f", "g" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.h = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
