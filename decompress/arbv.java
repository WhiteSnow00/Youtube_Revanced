import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arbv extends ahcz implements aheo
{
    public static final arbv a;
    private static volatile ahev d;
    public int b;
    public String c;
    
    static {
        ahcz.registerDefaultInstance(arbv.class, a = new arbv());
    }
    
    private arbv() {
        this.c = "";
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
                if ((d = arbv.d) == null) {
                    synchronized (arbv.class) {
                        if (arbv.d == null) {
                            arbv.d = (ahev)new ahcs((ahcz)arbv.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return arbv.a;
            }
            case 4: {
                return new ahcr((ahcz)arbv.a);
            }
            case 3: {
                return new arbv();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)arbv.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "b", "c" });
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
