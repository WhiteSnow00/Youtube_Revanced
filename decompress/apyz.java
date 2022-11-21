import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apyz extends ahcz implements aheo
{
    public static final apyz a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(apyz.class, a = new apyz());
    }
    
    private apyz() {
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
                if ((b = apyz.b) == null) {
                    synchronized (apyz.class) {
                        if (apyz.b == null) {
                            apyz.b = (ahev)new ahcs((ahcz)apyz.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apyz.a;
            }
            case 4: {
                return new ahcr((ahcz)apyz.a);
            }
            case 3: {
                return new apyz();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apyz.a, "\u0001\u0000", null);
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
