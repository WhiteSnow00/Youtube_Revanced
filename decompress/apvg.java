import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apvg extends ahcz implements aheo
{
    public static final apvg a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(apvg.class, a = new apvg());
    }
    
    private apvg() {
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
                if ((b = apvg.b) == null) {
                    synchronized (apvg.class) {
                        if (apvg.b == null) {
                            apvg.b = (ahev)new ahcs((ahcz)apvg.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apvg.a;
            }
            case 4: {
                return new ahcr((ahcz)apvg.a);
            }
            case 3: {
                return new apvg();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apvg.a, "\u0001\u0000", null);
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
