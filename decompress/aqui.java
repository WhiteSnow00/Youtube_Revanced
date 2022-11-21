import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqui extends ahcz implements aheo
{
    public static final aqui a;
    private static volatile ahev c;
    public int b;
    private int d;
    
    static {
        ahcz.registerDefaultInstance(aqui.class, a = new aqui());
    }
    
    private aqui() {
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
                if ((c = aqui.c) == null) {
                    synchronized (aqui.class) {
                        if (aqui.c == null) {
                            aqui.c = (ahev)new ahcs((ahcz)aqui.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aqui.a;
            }
            case 4: {
                return new ahcr((ahcz)aqui.a);
            }
            case 3: {
                return new aqui();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqui.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "d", "b", amgu.a() });
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
