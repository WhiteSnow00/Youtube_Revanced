import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqrp extends ahcz implements aheo
{
    public static final aqrp a;
    private static volatile ahev d;
    public int b;
    public String c;
    
    static {
        ahcz.registerDefaultInstance(aqrp.class, a = new aqrp());
    }
    
    private aqrp() {
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
                if ((d = aqrp.d) == null) {
                    synchronized (aqrp.class) {
                        if (aqrp.d == null) {
                            aqrp.d = (ahev)new ahcs((ahcz)aqrp.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aqrp.a;
            }
            case 4: {
                return new ahcr((ahcz)aqrp.a);
            }
            case 3: {
                return new aqrp();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqrp.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "b", "c" });
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
