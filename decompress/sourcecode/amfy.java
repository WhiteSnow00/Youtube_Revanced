import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amfy extends agzi implements ahax
{
    public static final amfy a;
    private static volatile ahbe c;
    public agzy b;
    private int d;
    private ahfw e;
    private byte f;
    
    static {
        agzi.registerDefaultInstance((Class)amfy.class, (agzi)(a = new amfy()));
    }
    
    private amfy() {
        this.f = 2;
        this.b = emptyProtobufList();
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
                final ahbe c;
                if ((c = amfy.c) == null) {
                    synchronized (amfy.class) {
                        if (amfy.c == null) {
                            amfy.c = (ahbe)new agzb((agzi)amfy.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return amfy.a;
            }
            case 4: {
                return new agza((agzi)amfy.a);
            }
            case 3: {
                return new amfy();
            }
            case 2: {
                return newMessageInfo((MessageLite)amfy.a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0002\u0001\u041b\u0003\u1409\u0001", new Object[] { "d", "b", anss.class, "e" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.f = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
