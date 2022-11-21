import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akzp extends ahcz implements aheo
{
    public static final akzp a;
    private static volatile ahev d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(akzp.class, a = new akzp());
    }
    
    private akzp() {
        this.b = 0;
        this.e = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte e = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev d;
                if ((d = akzp.d) == null) {
                    synchronized (akzp.class) {
                        if (akzp.d == null) {
                            akzp.d = (ahev)new ahcs((ahcz)akzp.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akzp.a;
            }
            case 4: {
                return new ahcr((ahcz)akzp.a);
            }
            case 3: {
                return new akzp();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akzp.a, "\u0001\u0001\u0001\u0000\ue830\u234f\ue830\u234f\u0001\u0000\u0000\u0001\ue830\u234f\u143c\u0000", new Object[] { "c", "b", apqk.class });
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
