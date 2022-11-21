import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aexl extends ahcz implements aheo
{
    public static final aexl a;
    private static volatile ahev c;
    public ahbt b;
    
    static {
        ahcz.registerDefaultInstance(aexl.class, a = new aexl());
    }
    
    private aexl() {
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
                if ((c = aexl.c) == null) {
                    synchronized (aexl.class) {
                        if (aexl.c == null) {
                            aexl.c = (ahev)new ahcs((ahcz)aexl.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aexl.a;
            }
            case 4: {
                return new ahcr((ahcz)aexl.a);
            }
            case 3: {
                return new aexl();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aexl.a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[] { "b" });
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
