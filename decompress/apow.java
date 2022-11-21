import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apow extends ahcz implements aheo
{
    public static final apow a;
    private static volatile ahev c;
    public int b;
    private int d;
    
    static {
        ahcz.registerDefaultInstance(apow.class, a = new apow());
    }
    
    private apow() {
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
                if ((c = apow.c) == null) {
                    synchronized (apow.class) {
                        if (apow.c == null) {
                            apow.c = (ahev)new ahcs((ahcz)apow.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return apow.a;
            }
            case 4: {
                return new ahcr((ahcz)apow.a);
            }
            case 3: {
                return new apow();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apow.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "d", "b", apnc.m });
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
