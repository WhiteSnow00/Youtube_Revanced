import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apxh extends ahcz implements aheo
{
    public static final apxh a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(apxh.class, a = new apxh());
    }
    
    private apxh() {
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
                if ((b = apxh.b) == null) {
                    synchronized (apxh.class) {
                        if (apxh.b == null) {
                            apxh.b = (ahev)new ahcs((ahcz)apxh.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apxh.a;
            }
            case 4: {
                return new ahcr((ahcz)apxh.a);
            }
            case 3: {
                return new apxh();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apxh.a, "\u0001\u0000", null);
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
