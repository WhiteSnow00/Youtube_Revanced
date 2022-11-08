import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amif extends agzi implements ahax
{
    public static final amif a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)amif.class, (agzi)(a = new amif()));
    }
    
    private amif() {
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
                if ((d = amif.d) == null) {
                    synchronized (amif.class) {
                        if (amif.d == null) {
                            amif.d = (ahbe)new agzb((agzi)amif.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return amif.a;
            }
            case 4: {
                return new agza((agzi)amif.a);
            }
            case 3: {
                return new amif();
            }
            case 2: {
                return newMessageInfo((MessageLite)amif.a, "\u0001\u0005\u0001\u0000\ueb11\u1f11\ufc56\uab1f\u0005\u0000\u0000\u0004\ueb11\u1f11\u143c\u0000\ufd0c\u399c\u143c\u0000\uebde\u9991\u143c\u0000\ue123\u9dbf\u103c\u0000\ufc56\uab1f\u143c\u0000", new Object[] { "c", "b", aibb.class, amjl.class, aotg.class, aoth.class, akaz.class });
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
