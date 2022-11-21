import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akpe extends ahcz implements aheo
{
    public static final akpe a;
    private static volatile ahev c;
    public String b;
    private int d;
    
    static {
        ahcz.registerDefaultInstance(akpe.class, a = new akpe());
    }
    
    private akpe() {
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
                if ((c = akpe.c) == null) {
                    synchronized (akpe.class) {
                        if (akpe.c == null) {
                            akpe.c = (ahev)new ahcs((ahcz)akpe.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return akpe.a;
            }
            case 4: {
                return new ahcr((ahcz)akpe.a);
            }
            case 3: {
                return new akpe();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akpe.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u1008\u0001", new Object[] { "d", "b" });
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
