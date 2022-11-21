import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apvz extends ahcz implements aheo
{
    public static final apvz a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(apvz.class, a = new apvz());
    }
    
    private apvz() {
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
                if ((b = apvz.b) == null) {
                    synchronized (apvz.class) {
                        if (apvz.b == null) {
                            apvz.b = (ahev)new ahcs((ahcz)apvz.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apvz.a;
            }
            case 4: {
                return new ahcr((ahcz)apvz.a);
            }
            case 3: {
                return new apvz();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apvz.a, "\u0001\u0000", null);
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
