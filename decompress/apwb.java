import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apwb extends ahcz implements aheo
{
    public static final apwb a;
    private static volatile ahev c;
    public String b;
    private int d;
    
    static {
        ahcz.registerDefaultInstance(apwb.class, a = new apwb());
    }
    
    private apwb() {
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
                if ((c = apwb.c) == null) {
                    synchronized (apwb.class) {
                        if (apwb.c == null) {
                            apwb.c = (ahev)new ahcs((ahcz)apwb.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return apwb.a;
            }
            case 4: {
                return new ahcr((ahcz)apwb.a);
            }
            case 3: {
                return new apwb();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apwb.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "d", "b" });
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
