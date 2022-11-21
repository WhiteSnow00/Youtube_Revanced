import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apwr extends ahcz implements aheo
{
    public static final apwr a;
    private static volatile ahev c;
    public String b;
    private int d;
    
    static {
        ahcz.registerDefaultInstance(apwr.class, a = new apwr());
    }
    
    private apwr() {
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
                if ((c = apwr.c) == null) {
                    synchronized (apwr.class) {
                        if (apwr.c == null) {
                            apwr.c = (ahev)new ahcs((ahcz)apwr.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return apwr.a;
            }
            case 4: {
                return new ahcr((ahcz)apwr.a);
            }
            case 3: {
                return new apwr();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apwr.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "d", "b" });
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
