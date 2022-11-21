import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apwe extends ahcz implements aheo
{
    public static final apwe a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(apwe.class, a = new apwe());
    }
    
    private apwe() {
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
                if ((b = apwe.b) == null) {
                    synchronized (apwe.class) {
                        if (apwe.b == null) {
                            apwe.b = (ahev)new ahcs((ahcz)apwe.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apwe.a;
            }
            case 4: {
                return new ahcr((ahcz)apwe.a);
            }
            case 3: {
                return new apwe();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apwe.a, "\u0001\u0000", null);
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
