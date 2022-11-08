import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amvx extends agzi implements ahax
{
    public static final amvx a;
    private static volatile ahbe e;
    public int b;
    public ajsq c;
    public aioe d;
    private ahfw f;
    private byte g;
    
    static {
        agzi.registerDefaultInstance(amvx.class, a = new amvx());
    }
    
    private amvx() {
        this.g = 2;
        emptyProtobufList();
        final agyc b = agyc.b;
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
                final ahbe e;
                if ((e = amvx.e) == null) {
                    synchronized (amvx.class) {
                        if (amvx.e == null) {
                            amvx.e = (ahbe)new agzb((agzi)amvx.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return amvx.a;
            }
            case 4: {
                return new agza((agzi)amvx.a);
            }
            case 3: {
                return new amvx();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)amvx.a, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0003\u0001\u1409\u0000\u0003\u1409\u0002\u0005\u1409\u0005", new Object[] { "b", "c", "d", "f" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.g = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
