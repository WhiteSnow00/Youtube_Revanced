import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akdk extends ahcz implements aheo
{
    public static final akdk a;
    private static volatile ahev c;
    public int b;
    private int d;
    
    static {
        ahcz.registerDefaultInstance(akdk.class, a = new akdk());
    }
    
    private akdk() {
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
                if ((c = akdk.c) == null) {
                    synchronized (akdk.class) {
                        if (akdk.c == null) {
                            akdk.c = (ahev)new ahcs((ahcz)akdk.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return akdk.a;
            }
            case 4: {
                return new ahcr((ahcz)akdk.a);
            }
            case 3: {
                return new akdk();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akdk.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "d", "b", akan.j });
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
