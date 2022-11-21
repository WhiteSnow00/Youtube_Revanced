import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agui extends ahcz implements aheo
{
    public static final agui a;
    private static volatile ahev d;
    public int b;
    public aguj c;
    
    static {
        ahcz.registerDefaultInstance(agui.class, a = new agui());
    }
    
    private agui() {
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev d;
                if ((d = agui.d) == null) {
                    synchronized (agui.class) {
                        if (agui.d == null) {
                            agui.d = (ahev)new ahcs((ahcz)agui.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return agui.a;
            }
            case 4: {
                return new ahcr((ahcz)agui.a);
            }
            case 3: {
                return new agui();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)agui.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u1009\u0001", new Object[] { "b", "c" });
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
