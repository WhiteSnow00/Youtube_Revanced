import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amig extends agzi implements ahax
{
    public static final amig a;
    private static volatile ahbe g;
    public int b;
    public agyc c;
    public agzy d;
    public boolean e;
    public ajbs f;
    private ajsq h;
    private ahfw i;
    private aioe j;
    private anss k;
    private byte l;
    
    static {
        agzi.registerDefaultInstance((Class)amig.class, (agzi)(a = new amig()));
    }
    
    private amig() {
        this.l = 2;
        this.c = agyc.b;
        this.d = emptyProtobufList();
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
                final ahbe g;
                if ((g = amig.g) == null) {
                    synchronized (amig.class) {
                        if (amig.g == null) {
                            amig.g = (ahbe)new agzb((agzi)amig.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return amig.a;
            }
            case 4: {
                return new agza((agzi)amig.a);
            }
            case 3: {
                return new amig();
            }
            case 2: {
                return newMessageInfo((MessageLite)amig.a, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0001\u0006\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u100a\u0002\u0004\u041b\u0006\u1007\u0005\u0007\u1409\u0003\b\u1409\u0007\t\u1409\u0006", new Object[] { "b", "h", "i", "c", "d", amif.class, "e", "j", "k", "f" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.l = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.l;
            }
        }
    }
}
