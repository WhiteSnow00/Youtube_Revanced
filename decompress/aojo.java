import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aojo extends ahcz implements aheo
{
    public static final aojo a;
    private static volatile ahev c;
    public String b;
    private int d;
    
    static {
        ahcz.registerDefaultInstance(aojo.class, a = new aojo());
    }
    
    private aojo() {
        this.b = "";
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
                if ((c = aojo.c) == null) {
                    synchronized (aojo.class) {
                        if (aojo.c == null) {
                            aojo.c = (ahev)new ahcs((ahcz)aojo.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aojo.a;
            }
            case 4: {
                return new ahcr((ahcz)aojo.a);
            }
            case 3: {
                return new aojo();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aojo.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "d", "b" });
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
