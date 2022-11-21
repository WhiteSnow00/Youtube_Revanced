import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqus extends ahcz implements aheo
{
    public static final aqus a;
    private static volatile ahev c;
    public int b;
    private int d;
    
    static {
        ahcz.registerDefaultInstance(aqus.class, a = new aqus());
    }
    
    private aqus() {
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
                if ((c = aqus.c) == null) {
                    synchronized (aqus.class) {
                        if (aqus.c == null) {
                            aqus.c = (ahev)new ahcs((ahcz)aqus.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aqus.a;
            }
            case 4: {
                return new ahcr((ahcz)aqus.a);
            }
            case 3: {
                return new aqus();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqus.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1004\u0000", new Object[] { "d", "b" });
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
