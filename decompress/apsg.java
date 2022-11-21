import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apsg extends ahcz implements aheo
{
    private static final apsg a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(apsg.class, a = new apsg());
    }
    
    private apsg() {
    }
    
    public static apsg a() {
        return apsg.a;
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
                if ((b = apsg.b) == null) {
                    synchronized (apsg.class) {
                        if (apsg.b == null) {
                            apsg.b = (ahev)new ahcs((ahcz)apsg.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apsg.a;
            }
            case 4: {
                return new ahcr((ahcz)a());
            }
            case 3: {
                return new apsg();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apsg.a, "\u0001\u0000", null);
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
