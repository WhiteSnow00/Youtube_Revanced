import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apwj extends ahcz implements aheo
{
    public static final apwj a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(apwj.class, a = new apwj());
    }
    
    private apwj() {
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
                if ((b = apwj.b) == null) {
                    synchronized (apwj.class) {
                        if (apwj.b == null) {
                            apwj.b = (ahev)new ahcs((ahcz)apwj.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apwj.a;
            }
            case 4: {
                return new ahcr((ahcz)apwj.a);
            }
            case 3: {
                return new apwj();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apwj.a, "\u0001\u0000", null);
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
