import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akek extends ahcz implements aheo
{
    public static final akek a;
    private static volatile ahev c;
    public int b;
    private int d;
    
    static {
        ahcz.registerDefaultInstance(akek.class, a = new akek());
    }
    
    private akek() {
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
                if ((c = akek.c) == null) {
                    synchronized (akek.class) {
                        if (akek.c == null) {
                            akek.c = (ahev)new ahcs((ahcz)akek.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return akek.a;
            }
            case 4: {
                return new ahcr((ahcz)akek.a);
            }
            case 3: {
                return new akek();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akek.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "d", "b", akan.r });
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
