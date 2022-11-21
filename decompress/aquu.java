import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aquu extends ahcz implements aheo
{
    public static final aquu a;
    private static volatile ahev c;
    public ahbt b;
    
    static {
        ahcz.registerDefaultInstance(aquu.class, a = new aquu());
    }
    
    private aquu() {
        this.b = ahbt.b;
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
                if ((c = aquu.c) == null) {
                    synchronized (aquu.class) {
                        if (aquu.c == null) {
                            aquu.c = (ahev)new ahcs((ahcz)aquu.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aquu.a;
            }
            case 4: {
                return new ahcr((ahcz)aquu.a);
            }
            case 3: {
                return new aquu();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aquu.a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[] { "b" });
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
