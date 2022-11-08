import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amwh extends agzi implements ahax
{
    public static final amwh a;
    private static volatile ahbe g;
    public int b;
    public anss c;
    public anss d;
    public anss e;
    public agzy f;
    private byte h;
    
    static {
        agzi.registerDefaultInstance(amwh.class, a = new amwh());
    }
    
    private amwh() {
        this.h = 2;
        this.f = agzi.emptyProtobufList();
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
                final ahbe g;
                if ((g = amwh.g) == null) {
                    synchronized (amwh.class) {
                        if (amwh.g == null) {
                            amwh.g = (ahbe)new agzb((agzi)amwh.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return amwh.a;
            }
            case 4: {
                return new agza((agzi)amwh.a);
            }
            case 3: {
                return new amwh();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)amwh.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0004\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u041b", new Object[] { "b", "c", "d", "e", "f", anss.class });
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
