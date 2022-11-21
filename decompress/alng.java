import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alng extends ahcz implements aheo
{
    private static final alng a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(alng.class, a = new alng());
    }
    
    private alng() {
    }
    
    public static alng a() {
        return alng.a;
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
                if ((b = alng.b) == null) {
                    synchronized (alng.class) {
                        if (alng.b == null) {
                            alng.b = (ahev)new ahcs((ahcz)alng.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return alng.a;
            }
            case 4: {
                return new ahcr((ahcz)a());
            }
            case 3: {
                return new alng();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alng.a, "\u0001\u0000", null);
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
