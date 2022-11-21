import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agsm extends ahcz implements aheo
{
    public static final agsm a;
    private static volatile ahev c;
    public agst b;
    private int d;
    
    static {
        ahcz.registerDefaultInstance(agsm.class, a = new agsm());
    }
    
    private agsm() {
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
                if ((c = agsm.c) == null) {
                    synchronized (agsm.class) {
                        if (agsm.c == null) {
                            agsm.c = (ahev)new ahcs((ahcz)agsm.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return agsm.a;
            }
            case 4: {
                return new ahcr((ahcz)agsm.a);
            }
            case 3: {
                return new agsm();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)agsm.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", new Object[] { "d", "b" });
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
