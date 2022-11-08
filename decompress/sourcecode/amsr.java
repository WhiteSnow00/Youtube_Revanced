import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amsr extends agzi implements ahax
{
    public static final amsr a;
    private static volatile ahbe d;
    public int b;
    public amqz c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(amsr.class, a = new amsr());
    }
    
    private amsr() {
        this.e = 2;
    }
    
    @Override
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
                if ((d = amsr.d) == null) {
                    synchronized (amsr.class) {
                        if (amsr.d == null) {
                            amsr.d = (ahbe)new agzb((agzi)amsr.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return amsr.a;
            }
            case 4: {
                return new agza((agzi)amsr.a);
            }
            case 3: {
                return new amsr();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)amsr.a, "\u0001\u0001\u0000\u0001\uebcd\u6a59\uebcd\u6a59\u0001\u0000\u0000\u0001\uebcd\u6a59\u1409\u0001", new Object[] { "b", "c" });
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
