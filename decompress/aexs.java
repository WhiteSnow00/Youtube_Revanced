import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aexs extends ahcz implements aheo
{
    public static final aexs a;
    private static volatile ahev c;
    public ahbt b;
    
    static {
        ahcz.registerDefaultInstance(aexs.class, a = new aexs());
    }
    
    private aexs() {
        final ahbt b = ahbt.b;
        this.b = ahbt.b;
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
                if ((c = aexs.c) == null) {
                    synchronized (aexs.class) {
                        if (aexs.c == null) {
                            aexs.c = (ahev)new ahcs((ahcz)aexs.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aexs.a;
            }
            case 4: {
                return new ahcr((ahcz)aexs.a);
            }
            case 3: {
                return new aexs();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aexs.a, "\u0000\u0001\u0000\u0000\t\t\u0001\u0000\u0000\u0000\t\n", new Object[] { "b" });
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
