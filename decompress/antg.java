import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class antg extends ahcz implements aheo
{
    public static final antg a;
    private static volatile ahev c;
    public long b;
    private int d;
    
    static {
        ahcz.registerDefaultInstance(antg.class, a = new antg());
    }
    
    private antg() {
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
                if ((c = antg.c) == null) {
                    synchronized (antg.class) {
                        if (antg.c == null) {
                            antg.c = (ahev)new ahcs((ahcz)antg.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return antg.a;
            }
            case 4: {
                return new ahcr((ahcz)antg.a);
            }
            case 3: {
                return new antg();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)antg.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1002\u0000", new Object[] { "d", "b" });
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
