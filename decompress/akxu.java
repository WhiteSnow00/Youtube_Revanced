import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akxu extends ahcz implements aheo
{
    public static final akxu a;
    private static volatile ahev f;
    public int b;
    public Object c;
    public aknj d;
    public boolean e;
    private int g;
    private byte h;
    
    static {
        ahcz.registerDefaultInstance(akxu.class, a = new akxu());
    }
    
    private akxu() {
        this.b = 0;
        this.h = 2;
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
                final ahev f;
                if ((f = akxu.f) == null) {
                    synchronized (akxu.class) {
                        if (akxu.f == null) {
                            akxu.f = (ahev)new ahcs((ahcz)akxu.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return akxu.a;
            }
            case 4: {
                return new ahcr((ahcz)akxu.a);
            }
            case 3: {
                return new akxu();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akxu.a, "\u0001\u0004\u0001\u0001\u0001\u0005\u0004\u0000\u0000\u0003\u0001\u1409\u0000\u0003\u143c\u0000\u0004\u1007\u0003\u0005\u143c\u0000", new Object[] { "c", "b", "g", "d", anxb.class, "e", anxb.class });
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
