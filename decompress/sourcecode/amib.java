import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amib extends agzi implements ahax
{
    public static final amib a;
    private static volatile ahbe e;
    public int b;
    public agzy c;
    public int d;
    private byte f;
    
    static {
        agzi.registerDefaultInstance((Class)amib.class, (agzi)(a = new amib()));
    }
    
    private amib() {
        this.f = 2;
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
                final ahbe e;
                if ((e = amib.e) == null) {
                    synchronized (amib.class) {
                        if (amib.e == null) {
                            amib.e = (ahbe)new agzb((agzi)amib.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return amib.a;
            }
            case 4: {
                return new agza((agzi)amib.a);
            }
            case 3: {
                return new amib();
            }
            case 2: {
                return newMessageInfo((MessageLite)amib.a, "\u0001\u0002\u0000\u0001\u0001\ufb21\u43ad\u0002\u0000\u0001\u0001\u0001\u100c\u0000\ufb21\u43ad\u041b", new Object[] { "b", "d", amcq.r, "c", amia.class });
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
