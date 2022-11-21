import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agta extends ahcz implements aheo
{
    public static final agta a;
    private static volatile ahev c;
    public String b;
    private int d;
    
    static {
        ahcz.registerDefaultInstance(agta.class, a = new agta());
    }
    
    private agta() {
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
                if ((c = agta.c) == null) {
                    synchronized (agta.class) {
                        if (agta.c == null) {
                            agta.c = (ahev)new ahcs((ahcz)agta.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return agta.a;
            }
            case 4: {
                return new ahcr((ahcz)agta.a);
            }
            case 3: {
                return new agta();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)agta.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u1008\u0001", new Object[] { "d", "b" });
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
