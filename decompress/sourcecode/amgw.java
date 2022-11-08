import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amgw extends agzi implements ahax
{
    public static final amgw a;
    private static volatile ahbe g;
    public int b;
    public anss c;
    public ajsq d;
    public agzy e;
    public int f;
    private byte h;
    
    static {
        agzi.registerDefaultInstance((Class)amgw.class, (agzi)(a = new amgw()));
    }
    
    private amgw() {
        this.h = 2;
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
                final ahbe g;
                if ((g = amgw.g) == null) {
                    synchronized (amgw.class) {
                        if (amgw.g == null) {
                            amgw.g = (ahbe)new agzb((agzi)amgw.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return amgw.a;
            }
            case 4: {
                return new agza((agzi)amgw.a);
            }
            case 3: {
                return new amgw();
            }
            case 2: {
                return newMessageInfo((MessageLite)amgw.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0003\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u041b\u0004\u1004\u0002", new Object[] { "b", "c", "d", "e", anss.class, "f" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.h = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
