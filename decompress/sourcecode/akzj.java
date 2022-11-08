import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akzj extends agzi implements ahax
{
    public static final akzj a;
    private static volatile ahbe e;
    public int b;
    public akjf c;
    public String d;
    private anss f;
    private ajtl g;
    private byte h;
    
    static {
        agzi.registerDefaultInstance((Class)akzj.class, (agzi)(a = new akzj()));
    }
    
    private akzj() {
        this.h = 2;
        this.d = "";
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
                if ((e = akzj.e) == null) {
                    synchronized (akzj.class) {
                        if (akzj.e == null) {
                            akzj.e = (ahbe)new agzb((agzi)akzj.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return akzj.a;
            }
            case 4: {
                return new agza((agzi)akzj.a);
            }
            case 3: {
                return new akzj();
            }
            case 2: {
                return newMessageInfo((MessageLite)akzj.a, "\u0001\u0004\u0000\u0001\u0001\u0309\u0004\u0000\u0000\u0003\u0001\u1409\u0000\u0003\u1008\u0002\u0005\u1409\u0003\u0309\u1409\u0004", new Object[] { "b", "c", "d", "f", "g" });
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
