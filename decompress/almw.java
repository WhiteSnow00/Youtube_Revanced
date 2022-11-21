import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class almw extends ahcz implements aheo
{
    public static final almw a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(almw.class, a = new almw());
    }
    
    private almw() {
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
                if ((b = almw.b) == null) {
                    synchronized (almw.class) {
                        if (almw.b == null) {
                            almw.b = (ahev)new ahcs((ahcz)almw.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return almw.a;
            }
            case 4: {
                return new ahcr((ahcz)almw.a);
            }
            case 3: {
                return new almw();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)almw.a, "\u0001\u0000", null);
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
