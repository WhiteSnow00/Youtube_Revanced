import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amva extends agzi implements ahax
{
    public static final amva a;
    private static volatile ahbe j;
    public int b;
    public boolean c;
    public amuy d;
    public agzy e;
    public agzy f;
    public amux g;
    public agzy h;
    public agyc i;
    private amuz k;
    private ahfw l;
    private byte m;
    
    static {
        agzi.registerDefaultInstance(amva.class, a = new amva());
    }
    
    private amva() {
        this.m = 2;
        this.e = agzi.emptyProtobufList();
        this.f = agzi.emptyProtobufList();
        this.h = agzi.emptyProtobufList();
        this.i = agyc.b;
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
                final ahbe j;
                if ((j = amva.j) == null) {
                    synchronized (amva.class) {
                        if (amva.j == null) {
                            amva.j = (ahbe)new agzb((agzi)amva.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return amva.a;
            }
            case 4: {
                return new agza((agzi)amva.a);
            }
            case 3: {
                return new amva();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)amva.a, "\u0001\t\u0000\u0001\u0001\u000b\t\u0000\u0003\u0007\u0001\u1007\u0000\u0002\u1409\u0003\u0003\u041b\u0004\u100a\u0007\u0005\u1409\u0004\b\u1409\u0006\t\u041b\n\u1409\u0005\u000b\u041b", new Object[] { "b", "c", "d", "e", amuu.class, "i", "g", "l", "h", aioe.class, "k", "f", amuw.class });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.m = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.m;
            }
        }
    }
}
