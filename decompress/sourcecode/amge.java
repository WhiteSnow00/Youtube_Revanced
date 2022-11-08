import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amge extends agzi implements ahax
{
    public static final amge a;
    private static volatile ahbe e;
    public ajsq b;
    public String c;
    public ajsq d;
    private int f;
    private ahfw g;
    private byte h;
    
    static {
        agzi.registerDefaultInstance((Class)amge.class, (agzi)(a = new amge()));
    }
    
    private amge() {
        this.h = 2;
        this.c = "";
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
                final ahbe e;
                if ((e = amge.e) == null) {
                    synchronized (amge.class) {
                        if (amge.e == null) {
                            amge.e = (ahbe)new agzb((agzi)amge.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return amge.a;
            }
            case 4: {
                return new agza((agzi)amge.a);
            }
            case 3: {
                return new amge();
            }
            case 2: {
                return newMessageInfo((MessageLite)amge.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1008\u0001\u0003\u1409\u0002\u0004\u1409\u0003", new Object[] { "f", "b", "c", "d", "g" });
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
