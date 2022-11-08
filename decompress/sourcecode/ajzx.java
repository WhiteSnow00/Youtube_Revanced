import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajzx extends agzd implements agze
{
    public static final ajzx a;
    private static volatile ahbe f;
    public int b;
    public agzy c;
    public ajzw d;
    public agyc e;
    private ajsq g;
    private ahfw h;
    private byte i;
    
    static {
        agzi.registerDefaultInstance((Class)ajzx.class, (agzi)(a = new ajzx()));
    }
    
    private ajzx() {
        this.i = 2;
        this.c = emptyProtobufList();
        this.e = agyc.b;
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
                final ahbe f;
                if ((f = ajzx.f) == null) {
                    synchronized (ajzx.class) {
                        if (ajzx.f == null) {
                            ajzx.f = (ahbe)new agzb((agzi)ajzx.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ajzx.a;
            }
            case 4: {
                return new agzc(ajzx.a);
            }
            case 3: {
                return new ajzx();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajzx.a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0003\u0001\u041b\u0002\u1009\u0000\u0003\u1409\u0003\u0004\u100a\u0004\u0006\u1409\u0002", new Object[] { "b", "c", aibc.class, "d", "h", "e", "g" });
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
