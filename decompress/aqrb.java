import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqrb extends ahcz implements aheo
{
    public static final aqrb a;
    private static volatile ahev c;
    public String b;
    private int d;
    
    static {
        ahcz.registerDefaultInstance(aqrb.class, a = new aqrb());
    }
    
    private aqrb() {
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
                if ((c = aqrb.c) == null) {
                    synchronized (aqrb.class) {
                        if (aqrb.c == null) {
                            aqrb.c = (ahev)new ahcs((ahcz)aqrb.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aqrb.a;
            }
            case 4: {
                return new ahcr((ahcz)aqrb.a);
            }
            case 3: {
                return new aqrb();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqrb.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u1008\u0001", new Object[] { "d", "b" });
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
