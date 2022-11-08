import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahmx extends agzi implements ahax
{
    public static final ahmx a;
    private static volatile ahbe d;
    public agzy b;
    public agzy c;
    private int e;
    private ajsq f;
    private ajsq g;
    private anss h;
    private ajsq i;
    private byte j;
    
    static {
        agzi.registerDefaultInstance((Class)ahmx.class, (agzi)(a = new ahmx()));
    }
    
    private ahmx() {
        this.j = 2;
        emptyProtobufList();
        this.b = emptyProtobufList();
        this.c = emptyProtobufList();
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
                if ((d = ahmx.d) == null) {
                    synchronized (ahmx.class) {
                        if (ahmx.d == null) {
                            ahmx.d = (ahbe)new agzb((agzi)ahmx.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ahmx.a;
            }
            case 4: {
                return new agza((agzi)ahmx.a);
            }
            case 3: {
                return new ahmx();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahmx.a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0002\u0006\u0001\u041b\u0002\u041b\u0004\u1409\u0002\u0005\u1409\u0000\u0006\u1409\u0001\u0007\u1409\u0003", new Object[] { "e", "b", ahmw.class, "c", ahmv.class, "h", "f", "g", "i" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.j = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}
