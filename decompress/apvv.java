import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apvv extends ahcz implements aheo
{
    public static final apvv a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(apvv.class, a = new apvv());
    }
    
    private apvv() {
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
                if ((b = apvv.b) == null) {
                    synchronized (apvv.class) {
                        if (apvv.b == null) {
                            apvv.b = (ahev)new ahcs((ahcz)apvv.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apvv.a;
            }
            case 4: {
                return new ahcr((ahcz)apvv.a);
            }
            case 3: {
                return new apvv();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apvv.a, "\u0001\u0000", null);
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
