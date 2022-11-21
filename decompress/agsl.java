import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agsl extends ahcz implements aheo
{
    public static final agsl a;
    private static volatile ahev e;
    public int b;
    public agsi c;
    public String d;
    
    static {
        ahcz.registerDefaultInstance(agsl.class, a = new agsl());
    }
    
    private agsl() {
        this.d = "";
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev e;
                if ((e = agsl.e) == null) {
                    synchronized (agsl.class) {
                        if (agsl.e == null) {
                            agsl.e = (ahev)new ahcs((ahcz)agsl.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return agsl.a;
            }
            case 4: {
                return new ahcr((ahcz)agsl.a);
            }
            case 3: {
                return new agsl();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)agsl.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1008\u0001", new Object[] { "b", "c", "d" });
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
