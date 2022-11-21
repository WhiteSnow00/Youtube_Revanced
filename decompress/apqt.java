import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apqt extends ahcz implements aheo
{
    public static final apqt a;
    private static volatile ahev c;
    public int b;
    private int d;
    
    static {
        ahcz.registerDefaultInstance(apqt.class, a = new apqt());
    }
    
    private apqt() {
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
                if ((c = apqt.c) == null) {
                    synchronized (apqt.class) {
                        if (apqt.c == null) {
                            apqt.c = (ahev)new ahcs((ahcz)apqt.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return apqt.a;
            }
            case 4: {
                return new ahcr((ahcz)apqt.a);
            }
            case 3: {
                return new apqt();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apqt.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "d", "b", apnc.q });
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
