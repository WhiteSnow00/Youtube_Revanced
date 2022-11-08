import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amgt extends agzi implements ahax
{
    public static final amgt a;
    private static volatile ahbe d;
    public int b;
    public amgq c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)amgt.class, (agzi)(a = new amgt()));
    }
    
    private amgt() {
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
                if ((d = amgt.d) == null) {
                    synchronized (amgt.class) {
                        if (amgt.d == null) {
                            amgt.d = (ahbe)new agzb((agzi)amgt.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return amgt.a;
            }
            case 4: {
                return new agza((agzi)amgt.a);
            }
            case 3: {
                return new amgt();
            }
            case 2: {
                return newMessageInfo((MessageLite)amgt.a, "\u0001\u0001\u0000\u0001\ufa18\u3c15\ufa18\u3c15\u0001\u0000\u0000\u0001\ufa18\u3c15\u1409\u0000", new Object[] { "b", "c" });
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
