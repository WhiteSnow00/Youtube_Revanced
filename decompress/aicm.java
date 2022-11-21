import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aicm extends ahcz implements aheo
{
    public static final aicm a;
    private static volatile ahev c;
    public int b;
    private int d;
    
    static {
        ahcz.registerDefaultInstance(aicm.class, a = new aicm());
    }
    
    private aicm() {
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
                if ((c = aicm.c) == null) {
                    synchronized (aicm.class) {
                        if (aicm.c == null) {
                            aicm.c = (ahev)new ahcs((ahcz)aicm.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aicm.a;
            }
            case 4: {
                return new ahcr((ahcz)aicm.a);
            }
            case 3: {
                return new aicm();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aicm.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "d", "b", aidb.b });
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
