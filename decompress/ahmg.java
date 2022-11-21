import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahmg extends ahcz implements aheo
{
    public static final ahmg a;
    private static volatile ahev c;
    public boolean b;
    private int d;
    
    static {
        ahcz.registerDefaultInstance(ahmg.class, a = new ahmg());
    }
    
    private ahmg() {
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
                if ((c = ahmg.c) == null) {
                    synchronized (ahmg.class) {
                        if (ahmg.c == null) {
                            ahmg.c = (ahev)new ahcs((ahcz)ahmg.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ahmg.a;
            }
            case 4: {
                return new ahcr((ahcz)ahmg.a);
            }
            case 3: {
                return new ahmg();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ahmg.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "d", "b" });
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
