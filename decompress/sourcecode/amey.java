import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amey extends agzi implements ahax
{
    public static final amey a;
    private static volatile ahbe b;
    private int c;
    private anss d;
    private aioe e;
    private anss f;
    private aioe g;
    private ahfw h;
    private byte i;
    
    static {
        agzi.registerDefaultInstance((Class)amey.class, (agzi)(a = new amey()));
    }
    
    private amey() {
        this.i = 2;
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
                if ((b2 = amey.b) == null) {
                    synchronized (amey.class) {
                        if (amey.b == null) {
                            amey.b = (ahbe)new agzb((agzi)amey.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return amey.a;
            }
            case 4: {
                return new agza((agzi)amey.a);
            }
            case 3: {
                return new amey();
            }
            case 2: {
                return newMessageInfo((MessageLite)amey.a, "\u0001\u0005\u0000\u0001\u0004\u0016\u0005\u0000\u0000\u0005\u0004\u1409\b\u0005\u1409\n\b\u1409\u0005\u0013\u1409\u0002\u0016\u1409\u0006", new Object[] { "c", "g", "h", "e", "d", "f" });
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
