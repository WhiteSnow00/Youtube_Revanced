import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apya extends ahcz implements aheo
{
    public static final apya a;
    private static volatile ahev c;
    public int b;
    private Object d;
    
    static {
        ahcz.registerDefaultInstance(apya.class, a = new apya());
    }
    
    private apya() {
        this.b = 0;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev c;
                if ((c = apya.c) == null) {
                    synchronized (apya.class) {
                        if (apya.c == null) {
                            apya.c = (ahev)new ahcs((ahcz)apya.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return apya.a;
            }
            case 4: {
                return new ahcr((ahcz)apya.a);
            }
            case 3: {
                return new apya();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apya.a, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u103c\u0000\u0002\u103c\u0000", new Object[] { "d", "b", apxz.class, apxm.class });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
