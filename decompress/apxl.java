import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apxl extends ahcz implements aheo
{
    public static final apxl a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(apxl.class, a = new apxl());
    }
    
    private apxl() {
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
                if ((b = apxl.b) == null) {
                    synchronized (apxl.class) {
                        if (apxl.b == null) {
                            apxl.b = (ahev)new ahcs((ahcz)apxl.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apxl.a;
            }
            case 4: {
                return new ahcr((ahcz)apxl.a);
            }
            case 3: {
                return new apxl();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apxl.a, "\u0001\u0000", null);
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
