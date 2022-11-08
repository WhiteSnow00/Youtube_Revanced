import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amfh extends agzi implements ahax
{
    public static final amfh a;
    private static volatile ahbe d;
    public int b;
    public amfg c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)amfh.class, (agzi)(a = new amfh()));
    }
    
    private amfh() {
        this.e = 2;
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
                if ((d = amfh.d) == null) {
                    synchronized (amfh.class) {
                        if (amfh.d == null) {
                            amfh.d = (ahbe)new agzb((agzi)amfh.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return amfh.a;
            }
            case 4: {
                return new agza((agzi)amfh.a);
            }
            case 3: {
                return new amfh();
            }
            case 2: {
                return newMessageInfo((MessageLite)amfh.a, "\u0001\u0001\u0000\u0001\ue2dd\u305d\ue2dd\u305d\u0001\u0000\u0000\u0001\ue2dd\u305d\u1409\u0000", new Object[] { "b", "c" });
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
