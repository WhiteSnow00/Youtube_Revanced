import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akpa extends ahcz implements aheo
{
    public static final akpa a;
    private static volatile ahev c;
    public long b;
    private int d;
    
    static {
        ahcz.registerDefaultInstance(akpa.class, a = new akpa());
    }
    
    private akpa() {
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
                if ((c = akpa.c) == null) {
                    synchronized (akpa.class) {
                        if (akpa.c == null) {
                            akpa.c = (ahev)new ahcs((ahcz)akpa.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return akpa.a;
            }
            case 4: {
                return new ahcr((ahcz)akpa.a);
            }
            case 3: {
                return new akpa();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akpa.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1003\u0000", new Object[] { "d", "b" });
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
