import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apvy extends ahcz implements aheo
{
    public static final apvy a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(apvy.class, a = new apvy());
    }
    
    private apvy() {
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
                if ((b = apvy.b) == null) {
                    synchronized (apvy.class) {
                        if (apvy.b == null) {
                            apvy.b = (ahev)new ahcs((ahcz)apvy.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apvy.a;
            }
            case 4: {
                return new ahcr((ahcz)apvy.a);
            }
            case 3: {
                return new apvy();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apvy.a, "\u0001\u0000", null);
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
