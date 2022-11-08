import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amik extends agzi implements ahax
{
    public static final amik a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)amik.class, (agzi)(a = new amik()));
    }
    
    private amik() {
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
                if ((d = amik.d) == null) {
                    synchronized (amik.class) {
                        if (amik.d == null) {
                            amik.d = (ahbe)new agzb((agzi)amik.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return amik.a;
            }
            case 4: {
                return new agza((agzi)amik.a);
            }
            case 3: {
                return new amik();
            }
            case 2: {
                return newMessageInfo((MessageLite)amik.a, "\u0001\u0001\u0001\u0000\ueb08\u32d6\ueb08\u32d6\u0001\u0000\u0000\u0001\ueb08\u32d6\u143c\u0000", new Object[] { "c", "b", amil.class });
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
