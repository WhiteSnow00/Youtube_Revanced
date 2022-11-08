import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akzf extends agzi implements ahax
{
    public static final akzf a;
    private static volatile ahbe e;
    public akjf b;
    public agzy c;
    public agyc d;
    private int f;
    private ahfw g;
    private ajtl h;
    private byte i;
    
    static {
        agzi.registerDefaultInstance((Class)akzf.class, (agzi)(a = new akzf()));
    }
    
    private akzf() {
        this.i = 2;
        this.c = emptyProtobufList();
        this.d = agyc.b;
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
                if ((e = akzf.e) == null) {
                    synchronized (akzf.class) {
                        if (akzf.e == null) {
                            akzf.e = (ahbe)new agzb((agzi)akzf.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return akzf.a;
            }
            case 4: {
                return new agza((agzi)akzf.a);
            }
            case 3: {
                return new akzf();
            }
            case 2: {
                return newMessageInfo((MessageLite)akzf.a, "\u0001\u0005\u0000\u0001\u0001\u0309\u0005\u0000\u0001\u0004\u0001\u1409\u0000\u0003\u041b\u0005\u1409\u0001\u0006\u100a\u0002\u0309\u1409\u0003", new Object[] { "f", "b", "c", aioe.class, "g", "d", "h" });
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
