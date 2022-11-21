import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apsk extends ahcz implements aheo
{
    public static final apsk a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(apsk.class, a = new apsk());
    }
    
    private apsk() {
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
                if ((b = apsk.b) == null) {
                    synchronized (apsk.class) {
                        if (apsk.b == null) {
                            apsk.b = (ahev)new ahcs((ahcz)apsk.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apsk.a;
            }
            case 4: {
                return new ahcr((ahcz)apsk.a);
            }
            case 3: {
                return new apsk();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apsk.a, "\u0001\u0000", null);
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
