import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amhz extends agzi implements ahax
{
    public static final amhz a;
    private static volatile ahbe f;
    public int b;
    public amhw c;
    public amhx d;
    public agzy e;
    private byte g;
    
    static {
        agzi.registerDefaultInstance((Class)amhz.class, (agzi)(a = new amhz()));
    }
    
    private amhz() {
        this.g = 2;
        this.e = emptyProtobufList();
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
                if ((f = amhz.f) == null) {
                    synchronized (amhz.class) {
                        if (amhz.f == null) {
                            amhz.f = (ahbe)new agzb((agzi)amhz.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return amhz.a;
            }
            case 4: {
                return new agza((agzi)amhz.a);
            }
            case 3: {
                return new amhz();
            }
            case 2: {
                return newMessageInfo((MessageLite)amhz.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0002\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u001b", new Object[] { "b", "c", "d", "e", amie.class });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.g = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
