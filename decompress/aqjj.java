import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqjj extends ahcz implements aheo
{
    public static final aqjj a;
    private static volatile ahev c;
    public int b;
    private int d;
    
    static {
        ahcz.registerDefaultInstance(aqjj.class, a = new aqjj());
    }
    
    private aqjj() {
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
                if ((c = aqjj.c) == null) {
                    synchronized (aqjj.class) {
                        if (aqjj.c == null) {
                            aqjj.c = (ahev)new ahcs((ahcz)aqjj.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aqjj.a;
            }
            case 4: {
                return new ahcr((ahcz)aqjj.a);
            }
            case 3: {
                return new aqjj();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqjj.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "d", "b", aqnr.b });
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
