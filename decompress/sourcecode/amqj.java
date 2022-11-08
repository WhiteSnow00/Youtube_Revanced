import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amqj extends agzd implements agze
{
    public static final amqj a;
    private static volatile ahbe h;
    public int b;
    public ajsq c;
    public ajsq d;
    public aioe e;
    public agyc f;
    public int g;
    private ahfw i;
    private byte j;
    
    static {
        agzi.registerDefaultInstance((Class)amqj.class, (agzi)(a = new amqj()));
    }
    
    private amqj() {
        this.j = 2;
        this.f = agyc.b;
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
                final ahbe h;
                if ((h = amqj.h) == null) {
                    synchronized (amqj.class) {
                        if (amqj.h == null) {
                            amqj.h = (ahbe)new agzb((agzi)amqj.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return amqj.a;
            }
            case 4: {
                return new agzc(amqj.a);
            }
            case 3: {
                return new amqj();
            }
            case 2: {
                return newMessageInfo((MessageLite)amqj.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0004\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u100a\u0004\u0006\u100c\u0005", new Object[] { "b", "c", "d", "e", "i", "f", "g", ajcg.d });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.j = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}
