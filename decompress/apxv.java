import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apxv extends ahcz implements aheo
{
    public static final apxv a;
    private static volatile ahev c;
    public String b;
    private int d;
    
    static {
        ahcz.registerDefaultInstance(apxv.class, a = new apxv());
    }
    
    private apxv() {
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
                if ((c = apxv.c) == null) {
                    synchronized (apxv.class) {
                        if (apxv.c == null) {
                            apxv.c = (ahev)new ahcs((ahcz)apxv.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return apxv.a;
            }
            case 4: {
                return new ahcr((ahcz)apxv.a);
            }
            case 3: {
                return new apxv();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apxv.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "d", "b" });
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
