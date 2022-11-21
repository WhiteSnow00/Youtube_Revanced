import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apve extends ahcz implements aheo
{
    public static final apve a;
    private static volatile ahev c;
    public int b;
    private int d;
    
    static {
        ahcz.registerDefaultInstance(apve.class, a = new apve());
    }
    
    private apve() {
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
                if ((c = apve.c) == null) {
                    synchronized (apve.class) {
                        if (apve.c == null) {
                            apve.c = (ahev)new ahcs((ahcz)apve.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return apve.a;
            }
            case 4: {
                return new ahcr((ahcz)apve.a);
            }
            case 3: {
                return new apve();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apve.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "d", "b", aprh.u });
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
