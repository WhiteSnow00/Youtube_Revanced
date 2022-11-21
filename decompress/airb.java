import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class airb extends ahcz implements aheo
{
    public static final airb a;
    private static volatile ahev e;
    public String b;
    public String c;
    public String d;
    private int f;
    
    static {
        ahcz.registerDefaultInstance(airb.class, a = new airb());
    }
    
    private airb() {
        this.b = "";
        this.c = "";
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
                if ((e = airb.e) == null) {
                    synchronized (airb.class) {
                        if (airb.e == null) {
                            airb.e = (ahev)new ahcs((ahcz)airb.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return airb.a;
            }
            case 4: {
                return new ahcr((ahcz)airb.a);
            }
            case 3: {
                return new airb();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)airb.a, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0004\u1008\u0003", new Object[] { "f", "b", "c", "d" });
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
