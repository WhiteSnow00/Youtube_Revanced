import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ankx extends agzi implements ahax
{
    public static final ankx a;
    private static volatile ahbe e;
    public anss b;
    public agzy c;
    public agyc d;
    private int f;
    private ahfw g;
    private byte h;
    
    static {
        agzi.registerDefaultInstance(ankx.class, a = new ankx());
    }
    
    private ankx() {
        this.h = 2;
        this.c = agzi.emptyProtobufList();
        this.d = agyc.b;
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
                if ((e = ankx.e) == null) {
                    synchronized (ankx.class) {
                        if (ankx.e == null) {
                            ankx.e = (ahbe)new agzb((agzi)ankx.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ankx.a;
            }
            case 4: {
                return new agza((agzi)ankx.a);
            }
            case 3: {
                return new ankx();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ankx.a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0003\u0001\u1409\u0000\u0002\u041b\u0004\u100a\u0001\u0005\u1409\u0002", new Object[] { "f", "b", "c", anss.class, "d", "g" });
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
