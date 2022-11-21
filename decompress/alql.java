import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alql extends ahcz implements aheo
{
    public static final alql a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(alql.class, a = new alql());
    }
    
    private alql() {
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
                if ((b = alql.b) == null) {
                    synchronized (alql.class) {
                        if (alql.b == null) {
                            alql.b = (ahev)new ahcs((ahcz)alql.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return alql.a;
            }
            case 4: {
                return new ahcr((ahcz)alql.a);
            }
            case 3: {
                return new alql();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alql.a, "\u0001\u0000", null);
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
