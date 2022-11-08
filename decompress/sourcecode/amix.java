import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amix extends agzi implements ahax
{
    public static final amix a;
    private static volatile ahbe b;
    private int c;
    private aioe d;
    private aioe e;
    private aioe f;
    private ajsq g;
    private anss h;
    private anss i;
    private amer j;
    private anss k;
    private ahfw l;
    private byte m;
    
    static {
        agzi.registerDefaultInstance((Class)amix.class, (agzi)(a = new amix()));
    }
    
    private amix() {
        this.m = 2;
        emptyProtobufList();
        emptyProtobufList();
        final agyc b = agyc.b;
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
                if ((b2 = amix.b) == null) {
                    synchronized (amix.class) {
                        if (amix.b == null) {
                            amix.b = (ahbe)new agzb((agzi)amix.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return amix.a;
            }
            case 4: {
                return new agza((agzi)amix.a);
            }
            case 3: {
                return new amix();
            }
            case 2: {
                return newMessageInfo((MessageLite)amix.a, "\u0001\t\u0000\u0001\u0002\u0011\t\u0000\u0000\t\u0002\u1409\u0000\u0004\u1409\u0003\u0006\u1409\n\u0007\u1409\r\t\u1409\u0005\f\u1409\t\u000f\u1409\u0001\u0010\u1409\u0006\u0011\u1409\u0002", new Object[] { "c", "d", "g", "k", "l", "h", "j", "e", "i", "f" });
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
