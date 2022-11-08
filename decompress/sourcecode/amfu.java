import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amfu extends agzi implements ahax
{
    public static final amfu a;
    private static volatile ahbe f;
    public ajsq b;
    public agzy c;
    public boolean d;
    public agyc e;
    private int g;
    private ahfw h;
    private byte i;
    
    static {
        agzi.registerDefaultInstance((Class)amfu.class, (agzi)(a = new amfu()));
    }
    
    private amfu() {
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
                if ((f = amfu.f) == null) {
                    synchronized (amfu.class) {
                        if (amfu.f == null) {
                            amfu.f = (ahbe)new agzb((agzi)amfu.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return amfu.a;
            }
            case 4: {
                return new agza((agzi)amfu.a);
            }
            case 3: {
                return new amfu();
            }
            case 2: {
                return newMessageInfo((MessageLite)amfu.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0003\u0001\u1409\u0000\u0002\u041b\u0003\u1409\u0002\u0004\u100a\u0003\u0005\u1007\u0001", new Object[] { "g", "b", "c", ajsq.class, "h", "e", "d" });
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
