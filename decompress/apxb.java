import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apxb extends ahcz implements aheo
{
    public static final apxb a;
    private static volatile ahev d;
    public int b;
    public String c;
    
    static {
        ahcz.registerDefaultInstance(apxb.class, a = new apxb());
    }
    
    private apxb() {
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
                if ((d = apxb.d) == null) {
                    synchronized (apxb.class) {
                        if (apxb.d == null) {
                            apxb.d = (ahev)new ahcs((ahcz)apxb.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apxb.a;
            }
            case 4: {
                return new ahcr((ahcz)apxb.a);
            }
            case 3: {
                return new apxb();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apxb.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "b", "c" });
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
