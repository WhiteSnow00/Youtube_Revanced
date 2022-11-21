import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqhu extends ahcz implements aheo
{
    public static final aqhu a;
    private static volatile ahev c;
    public int b;
    private int d;
    
    static {
        ahcz.registerDefaultInstance(aqhu.class, a = new aqhu());
    }
    
    private aqhu() {
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
                if ((c = aqhu.c) == null) {
                    synchronized (aqhu.class) {
                        if (aqhu.c == null) {
                            aqhu.c = (ahev)new ahcs((ahcz)aqhu.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aqhu.a;
            }
            case 4: {
                return new ahcr((ahcz)aqhu.a);
            }
            case 3: {
                return new aqhu();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqhu.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "d", "b", aqdx.l });
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
