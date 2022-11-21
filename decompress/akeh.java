import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akeh extends ahcz implements aheo
{
    public static final akeh a;
    private static volatile ahev c;
    public int b;
    private int d;
    
    static {
        ahcz.registerDefaultInstance(akeh.class, a = new akeh());
    }
    
    private akeh() {
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
                if ((c = akeh.c) == null) {
                    synchronized (akeh.class) {
                        if (akeh.c == null) {
                            akeh.c = (ahev)new ahcs((ahcz)akeh.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return akeh.a;
            }
            case 4: {
                return new ahcr((ahcz)akeh.a);
            }
            case 3: {
                return new akeh();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akeh.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "d", "b", akan.q });
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
