import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anin extends ahbh implements ahcw
{
    public static final anin a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)anin.class, (ahbh)(a = new anin()));
    }
    
    private anin() {
        this.b = 0;
        this.e = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte e = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = anin.d) == null) {
                    synchronized (anin.class) {
                        if (anin.d == null) {
                            anin.d = (ahdd)new ahba((ahbh)anin.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return anin.a;
            }
            case 4: {
                return new ahaz((ahbh)anin.a);
            }
            case 3: {
                return new anin();
            }
            case 2: {
                return newMessageInfo((MessageLite)anin.a, "\u0001\u0004\u0001\u0000\ue528\u1ce2\ue110\ua215\u0004\u0000\u0000\u0004\ue528\u1ce2\u143c\u0000\ueb11\u1f11\u143c\u0000\ue18f\u3ee5\u143c\u0000\ue110\ua215\u143c\u0000", new Object[] { "c", "b", amxe.class, aicz.class, amva.class, aidb.class });
            }
            case 1: {
                if (o == null) {
                    e = 0;
                }
                this.e = e;
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
