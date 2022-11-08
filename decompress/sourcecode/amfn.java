import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amfn extends agzi implements ahax
{
    public static final amfn a;
    private static volatile ahbe c;
    public agzy b;
    private int d;
    private ajsq e;
    private byte f;
    
    static {
        agzi.registerDefaultInstance((Class)amfn.class, (agzi)(a = new amfn()));
    }
    
    private amfn() {
        this.f = 2;
        this.b = emptyProtobufList();
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
                if ((c = amfn.c) == null) {
                    synchronized (amfn.class) {
                        if (amfn.c == null) {
                            amfn.c = (ahbe)new agzb((agzi)amfn.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return amfn.a;
            }
            case 4: {
                return new agza((agzi)amfn.a);
            }
            case 3: {
                return new amfn();
            }
            case 2: {
                return newMessageInfo((MessageLite)amfn.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0002\u0001\u1409\u0000\u0002\u041b", new Object[] { "d", "e", "b", amfo.class });
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
