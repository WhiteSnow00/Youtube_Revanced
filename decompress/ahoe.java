import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahoe extends ahcz implements aheo
{
    public static final ahoe a;
    private static volatile ahev c;
    public ahmr b;
    private int d;
    
    static {
        ahcz.registerDefaultInstance(ahoe.class, a = new ahoe());
    }
    
    private ahoe() {
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
                if ((c = ahoe.c) == null) {
                    synchronized (ahoe.class) {
                        if (ahoe.c == null) {
                            ahoe.c = (ahev)new ahcs((ahcz)ahoe.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ahoe.a;
            }
            case 4: {
                return new ahcr((ahcz)ahoe.a);
            }
            case 3: {
                return new ahoe();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ahoe.a, "\u0001\u0001\u0000\u0001\uea6f\u32ff\uea6f\u32ff\u0001\u0000\u0000\u0000\uea6f\u32ff\u1009\u0000", new Object[] { "d", "b" });
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
