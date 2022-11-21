import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alqq extends ahcz implements aheo
{
    public static final alqq a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(alqq.class, a = new alqq());
    }
    
    private alqq() {
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = alqq.b) == null) {
                    synchronized (alqq.class) {
                        if (alqq.b == null) {
                            alqq.b = (ahev)new ahcs((ahcz)alqq.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return alqq.a;
            }
            case 4: {
                return new ahcr((ahcz)alqq.a);
            }
            case 3: {
                return new alqq();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alqq.a, "\u0001\u0000", null);
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
