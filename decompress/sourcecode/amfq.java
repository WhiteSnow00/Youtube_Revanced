import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amfq extends agzd implements agze
{
    public static final amfq a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)amfq.class, (agzi)(a = new amfq()));
    }
    
    private amfq() {
        this.b = 0;
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
                if ((d = amfq.d) == null) {
                    synchronized (amfq.class) {
                        if (amfq.d == null) {
                            amfq.d = (ahbe)new agzb((agzi)amfq.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return amfq.a;
            }
            case 4: {
                return new agzc(amfq.a);
            }
            case 3: {
                return new amfq();
            }
            case 2: {
                return newMessageInfo((MessageLite)amfq.a, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u103c\u0000", new Object[] { "c", "b", amfp.class });
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
