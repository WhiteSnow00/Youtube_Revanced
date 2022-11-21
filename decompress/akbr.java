import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akbr extends ahcz implements aheo
{
    public static final akbr a;
    private static volatile ahev c;
    public int b;
    private int d;
    
    static {
        ahcz.registerDefaultInstance(akbr.class, a = new akbr());
    }
    
    private akbr() {
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
                if ((c = akbr.c) == null) {
                    synchronized (akbr.class) {
                        if (akbr.c == null) {
                            akbr.c = (ahev)new ahcs((ahcz)akbr.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return akbr.a;
            }
            case 4: {
                return new ahcr((ahcz)akbr.a);
            }
            case 3: {
                return new akbr();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akbr.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "d", "b", akan.c });
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
