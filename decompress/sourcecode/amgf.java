import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amgf extends agzi implements ahax
{
    public static final amgf a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private ajsq e;
    private ahfw f;
    private ajsq g;
    private byte h;
    
    static {
        agzi.registerDefaultInstance((Class)amgf.class, (agzi)(a = new amgf()));
    }
    
    private amgf() {
        this.h = 2;
        emptyProtobufList();
        final agyc b = agyc.b;
        emptyProtobufList();
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
                if ((b2 = amgf.b) == null) {
                    synchronized (amgf.class) {
                        if (amgf.b == null) {
                            amgf.b = (ahbe)new agzb((agzi)amgf.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return amgf.a;
            }
            case 4: {
                return new agza((agzi)amgf.a);
            }
            case 3: {
                return new amgf();
            }
            case 2: {
                return newMessageInfo((MessageLite)amgf.a, "\u0001\u0004\u0000\u0001\u0001\n\u0004\u0000\u0000\u0004\u0001\u1409\u0000\u0003\u1409\u0002\u0006\u1409\u0004\n\u1409\u0001", new Object[] { "c", "d", "f", "g", "e" });
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
