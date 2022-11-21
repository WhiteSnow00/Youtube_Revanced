import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akqv extends ahcz implements aheo
{
    public static final akqv a;
    private static volatile ahev c;
    public int b;
    private int d;
    
    static {
        ahcz.registerDefaultInstance(akqv.class, a = new akqv());
    }
    
    private akqv() {
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
                if ((c = akqv.c) == null) {
                    synchronized (akqv.class) {
                        if (akqv.c == null) {
                            akqv.c = (ahev)new ahcs((ahcz)akqv.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return akqv.a;
            }
            case 4: {
                return new ahcr((ahcz)akqv.a);
            }
            case 3: {
                return new akqv();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akqv.a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003\u100c\u0002", new Object[] { "d", "b", amxz.h });
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
