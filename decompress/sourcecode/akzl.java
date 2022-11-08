import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akzl extends agzi implements ahax
{
    public static final akzl a;
    private static volatile ahbe f;
    public int b;
    public akjf c;
    public agzy d;
    public anss e;
    private aioe g;
    private ajtl h;
    private byte i;
    
    static {
        agzi.registerDefaultInstance((Class)akzl.class, (agzi)(a = new akzl()));
    }
    
    private akzl() {
        this.i = 2;
        this.d = emptyProtobufList();
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
                if ((f = akzl.f) == null) {
                    synchronized (akzl.class) {
                        if (akzl.f == null) {
                            akzl.f = (ahbe)new agzb((agzi)akzl.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return akzl.a;
            }
            case 4: {
                return new agza((agzi)akzl.a);
            }
            case 3: {
                return new akzl();
            }
            case 2: {
                return newMessageInfo((MessageLite)akzl.a, "\u0001\u0005\u0000\u0001\u0001\u0309\u0005\u0000\u0001\u0005\u0001\u1409\u0000\u0003\u041b\u0004\u1409\u0001\u0005\u1409\u0002\u0309\u1409\u0003", new Object[] { "b", "c", "d", anss.class, "g", "e", "h" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.i = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
