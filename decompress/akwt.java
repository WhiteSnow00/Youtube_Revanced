import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akwt extends ahcz implements aheo
{
    public static final akwt a;
    private static volatile ahev c;
    public aknj b;
    private int d;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(akwt.class, a = new akwt());
    }
    
    private akwt() {
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
                final ahev c;
                if ((c = akwt.c) == null) {
                    synchronized (akwt.class) {
                        if (akwt.c == null) {
                            akwt.c = (ahev)new ahcs((ahcz)akwt.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return akwt.a;
            }
            case 4: {
                return new ahcr((ahcz)akwt.a);
            }
            case 3: {
                return new akwt();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akwt.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "d", "b" });
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
