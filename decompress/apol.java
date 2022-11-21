import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apol extends ahcz implements aheo
{
    public static final apol a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(apol.class, a = new apol());
    }
    
    private apol() {
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
                if ((b = apol.b) == null) {
                    synchronized (apol.class) {
                        if (apol.b == null) {
                            apol.b = (ahev)new ahcs((ahcz)apol.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apol.a;
            }
            case 4: {
                return new ahcr((ahcz)apol.a);
            }
            case 3: {
                return new apol();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apol.a, "\u0001\u0000", null);
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
