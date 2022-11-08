import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amqk extends agzd implements agze
{
    public static final amqk a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)amqk.class, (agzi)(a = new amqk()));
    }
    
    private amqk() {
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
                final ahbe b2;
                if ((b2 = amqk.b) == null) {
                    synchronized (amqk.class) {
                        if (amqk.b == null) {
                            amqk.b = (ahbe)new agzb((agzi)amqk.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return amqk.a;
            }
            case 4: {
                return new agzc(amqk.a);
            }
            case 3: {
                return new amqk();
            }
            case 2: {
                return newMessageInfo((MessageLite)amqk.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "c", "d" });
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
