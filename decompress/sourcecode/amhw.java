import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amhw extends agzi implements ahax
{
    public static final amhw a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)amhw.class, (agzi)(a = new amhw()));
    }
    
    private amhw() {
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
                if ((d = amhw.d) == null) {
                    synchronized (amhw.class) {
                        if (amhw.d == null) {
                            amhw.d = (ahbe)new agzb((agzi)amhw.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return amhw.a;
            }
            case 4: {
                return new agza((agzi)amhw.a);
            }
            case 3: {
                return new amhw();
            }
            case 2: {
                return newMessageInfo((MessageLite)amhw.a, "\u0001\u0002\u0001\u0000\ueb11\u1f11\ue5d8\u2622\u0002\u0000\u0000\u0002\ueb11\u1f11\u143c\u0000\ue5d8\u2622\u143c\u0000", new Object[] { "c", "b", aibb.class, aibk.class });
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
