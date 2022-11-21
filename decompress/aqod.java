import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqod extends ahcz implements aheo
{
    public static final aqod a;
    private static volatile ahev g;
    public int b;
    public String c;
    public aqia d;
    public aqiq e;
    public aqhw f;
    private byte h;
    
    static {
        ahcz.registerDefaultInstance(aqod.class, a = new aqod());
    }
    
    private aqod() {
        this.h = 2;
        this.c = "";
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte h = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev g;
                if ((g = aqod.g) == null) {
                    synchronized (aqod.class) {
                        if (aqod.g == null) {
                            aqod.g = (ahev)new ahcs((ahcz)aqod.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aqod.a;
            }
            case 4: {
                return new ahcr((ahcz)aqod.a);
            }
            case 3: {
                return new aqod();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqod.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0003\u0001\u1008\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003", new Object[] { "b", "c", "d", "e", "f" });
            }
            case 1: {
                if (o == null) {
                    h = 0;
                }
                this.h = h;
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
