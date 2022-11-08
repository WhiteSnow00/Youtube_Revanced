import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akzb extends agzi implements ahax
{
    public static final akzb a;
    private static volatile ahbe d;
    public aorm b;
    public String c;
    private int e;
    private byte f;
    
    static {
        agzi.registerDefaultInstance((Class)akzb.class, (agzi)(a = new akzb()));
    }
    
    private akzb() {
        this.f = 2;
        this.c = "";
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
                if ((d = akzb.d) == null) {
                    synchronized (akzb.class) {
                        if (akzb.d == null) {
                            akzb.d = (ahbe)new agzb((agzi)akzb.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akzb.a;
            }
            case 4: {
                return new agza((agzi)akzb.a);
            }
            case 3: {
                return new akzb();
            }
            case 2: {
                return newMessageInfo((MessageLite)akzb.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u1008\u0001", new Object[] { "e", "b", "c" });
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
