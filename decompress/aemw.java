import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aemw extends ahcz implements aheo
{
    public static final aemw a;
    private static volatile ahev c;
    public ahej b;
    
    static {
        ahcz.registerDefaultInstance(aemw.class, a = new aemw());
    }
    
    private aemw() {
        this.b = ahej.a;
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
                if ((c = aemw.c) == null) {
                    synchronized (aemw.class) {
                        if (aemw.c == null) {
                            aemw.c = (ahev)new ahcs((ahcz)aemw.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aemw.a;
            }
            case 4: {
                return new ahcr((ahcz)aemw.a);
            }
            case 3: {
                return new aemw();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aemw.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[] { "b", aemv.a });
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
