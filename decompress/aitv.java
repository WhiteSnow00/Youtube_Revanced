import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aitv extends ahcz implements aheo
{
    public static final aitv a;
    private static volatile ahev c;
    public int b;
    private int d;
    
    static {
        ahcz.registerDefaultInstance(aitv.class, a = new aitv());
    }
    
    private aitv() {
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
                if ((c = aitv.c) == null) {
                    synchronized (aitv.class) {
                        if (aitv.c == null) {
                            aitv.c = (ahev)new ahcs((ahcz)aitv.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aitv.a;
            }
            case 4: {
                return new ahcr((ahcz)aitv.a);
            }
            case 3: {
                return new aitv();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aitv.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "d", "b", aine.u });
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
