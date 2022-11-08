import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahkr extends agzi implements ahax
{
    public static final ahkr a;
    private static volatile ahbe d;
    public agzy b;
    public agzy c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)ahkr.class, (agzi)(a = new ahkr()));
    }
    
    private ahkr() {
        this.e = 2;
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
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
                if ((d = ahkr.d) == null) {
                    synchronized (ahkr.class) {
                        if (ahkr.d == null) {
                            ahkr.d = (ahbe)new agzb((agzi)ahkr.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ahkr.a;
            }
            case 4: {
                return new agza((agzi)ahkr.a);
            }
            case 3: {
                return new ahkr();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahkr.a, "\u0001\u0002\u0000\u0000\u0005\u0006\u0002\u0000\u0002\u0002\u0005\u041b\u0006\u041b", new Object[] { "b", aioe.class, "c", aioe.class });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.e = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
