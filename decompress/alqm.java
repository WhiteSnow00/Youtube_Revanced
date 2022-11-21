import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alqm extends ahcz implements aheo
{
    public static final alqm a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(alqm.class, a = new alqm());
    }
    
    private alqm() {
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
                if ((b = alqm.b) == null) {
                    synchronized (alqm.class) {
                        if (alqm.b == null) {
                            alqm.b = (ahev)new ahcs((ahcz)alqm.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return alqm.a;
            }
            case 4: {
                return new ahcr((ahcz)alqm.a);
            }
            case 3: {
                return new alqm();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alqm.a, "\u0001\u0000", null);
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
