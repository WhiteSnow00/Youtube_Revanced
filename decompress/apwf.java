import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apwf extends ahcz implements aheo
{
    public static final apwf a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(apwf.class, a = new apwf());
    }
    
    private apwf() {
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
                if ((b = apwf.b) == null) {
                    synchronized (apwf.class) {
                        if (apwf.b == null) {
                            apwf.b = (ahev)new ahcs((ahcz)apwf.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apwf.a;
            }
            case 4: {
                return new ahcr((ahcz)apwf.a);
            }
            case 3: {
                return new apwf();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apwf.a, "\u0001\u0000", null);
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
