import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apsi extends ahcz implements aheo
{
    public static final apsi a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(apsi.class, a = new apsi());
    }
    
    private apsi() {
        final ahbt b = ahbt.b;
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
                if ((b = apsi.b) == null) {
                    synchronized (apsi.class) {
                        if (apsi.b == null) {
                            apsi.b = (ahev)new ahcs((ahcz)apsi.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apsi.a;
            }
            case 4: {
                return new ahcr((ahcz)apsi.a);
            }
            case 3: {
                return new apsi();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apsi.a, "\u0001\u0000", null);
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
