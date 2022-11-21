import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aexf extends ahcz implements aheo
{
    public static final aexf a;
    private static volatile ahev c;
    public int b;
    
    static {
        ahcz.registerDefaultInstance(aexf.class, a = new aexf());
    }
    
    private aexf() {
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
                if ((c = aexf.c) == null) {
                    synchronized (aexf.class) {
                        if (aexf.c == null) {
                            aexf.c = (ahev)new ahcs((ahcz)aexf.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aexf.a;
            }
            case 4: {
                return new ahcr((ahcz)aexf.a);
            }
            case 3: {
                return new aexf();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aexf.a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[] { "b" });
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
