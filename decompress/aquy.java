import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aquy extends ahcz implements aheo
{
    public static final aquy a;
    private static volatile ahev c;
    public long b;
    private int d;
    
    static {
        ahcz.registerDefaultInstance(aquy.class, a = new aquy());
    }
    
    private aquy() {
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev c;
                if ((c = aquy.c) == null) {
                    synchronized (aquy.class) {
                        if (aquy.c == null) {
                            aquy.c = (ahev)new ahcs((ahcz)aquy.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aquy.a;
            }
            case 4: {
                return new ahcr((ahcz)aquy.a);
            }
            case 3: {
                return new aquy();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aquy.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1002\u0000", new Object[] { "d", "b" });
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
