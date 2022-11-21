import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apoy extends ahcz implements aheo
{
    public static final apoy a;
    private static volatile ahev c;
    public ahdg b;
    
    static {
        ahcz.registerDefaultInstance(apoy.class, a = new apoy());
    }
    
    private apoy() {
        this.b = ahcz.emptyFloatList();
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
                if ((c = apoy.c) == null) {
                    synchronized (apoy.class) {
                        if (apoy.c == null) {
                            apoy.c = (ahev)new ahcs((ahcz)apoy.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return apoy.a;
            }
            case 4: {
                return new ahcr((boolean[][][])null, (int[])null);
            }
            case 3: {
                return new apoy();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apoy.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0013", new Object[] { "b" });
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
