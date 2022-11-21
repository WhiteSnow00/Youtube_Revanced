import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apsh extends ahcz implements aheo
{
    private static final apsh a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(apsh.class, a = new apsh());
    }
    
    private apsh() {
    }
    
    public static apsh a() {
        return apsh.a;
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
                if ((b = apsh.b) == null) {
                    synchronized (apsh.class) {
                        if (apsh.b == null) {
                            apsh.b = (ahev)new ahcs((ahcz)apsh.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apsh.a;
            }
            case 4: {
                return new ahcr((ahcz)a());
            }
            case 3: {
                return new apsh();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apsh.a, "\u0001\u0000", null);
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
