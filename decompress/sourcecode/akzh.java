import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akzh extends agzi implements ahax
{
    public static final akzh a;
    private static volatile ahbe e;
    public akjf b;
    public agzy c;
    public String d;
    private int f;
    private byte g;
    
    static {
        agzi.registerDefaultInstance((Class)akzh.class, (agzi)(a = new akzh()));
    }
    
    private akzh() {
        this.g = 2;
        this.c = emptyProtobufList();
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
                if ((e = akzh.e) == null) {
                    synchronized (akzh.class) {
                        if (akzh.e == null) {
                            akzh.e = (ahbe)new agzb((agzi)akzh.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return akzh.a;
            }
            case 4: {
                return new agza((agzi)akzh.a);
            }
            case 3: {
                return new akzh();
            }
            case 2: {
                return newMessageInfo((MessageLite)akzh.a, "\u0001\u0003\u0000\u0001\u0001\u0006\u0003\u0000\u0001\u0002\u0001\u1409\u0000\u0005\u041b\u0006\u1008\u0004", new Object[] { "f", "b", "c", aioe.class, "d" });
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
