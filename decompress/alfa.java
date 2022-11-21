import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alfa extends ahcz implements aheo
{
    public static final alfa a;
    private static volatile ahev d;
    public int b;
    public int c;
    
    static {
        ahcz.registerDefaultInstance(alfa.class, a = new alfa());
    }
    
    private alfa() {
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev d;
                if ((d = alfa.d) == null) {
                    synchronized (alfa.class) {
                        if (alfa.d == null) {
                            alfa.d = (ahev)new ahcs((ahcz)alfa.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return alfa.a;
            }
            case 4: {
                return new ahcr((ahcz)alfa.a);
            }
            case 3: {
                return new alfa();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alfa.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "b", "c", akyi.r });
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
