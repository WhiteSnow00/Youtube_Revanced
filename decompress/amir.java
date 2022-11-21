import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amir extends ahcz implements aheo
{
    public static final amir a;
    private static volatile ahev c;
    public ahkb b;
    private int d;
    
    static {
        ahcz.registerDefaultInstance(amir.class, a = new amir());
    }
    
    private amir() {
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
                if ((c = amir.c) == null) {
                    synchronized (amir.class) {
                        if (amir.c == null) {
                            amir.c = (ahev)new ahcs((ahcz)amir.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return amir.a;
            }
            case 4: {
                return new ahcr((ahcz)amir.a);
            }
            case 3: {
                return new amir();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amir.a, "\u0001\u0001\u0000\u0001\uecfa\u241c\uecfa\u241c\u0001\u0000\u0000\u0000\uecfa\u241c\u1009\u0000", new Object[] { "d", "b" });
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
