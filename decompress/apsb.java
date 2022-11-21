import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apsb extends ahcz implements aheo
{
    public static final apsb a;
    private static volatile ahev d;
    public String b;
    public String c;
    
    static {
        ahcz.registerDefaultInstance(apsb.class, a = new apsb());
    }
    
    private apsb() {
        this.b = "";
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
                if ((d = apsb.d) == null) {
                    synchronized (apsb.class) {
                        if (apsb.d == null) {
                            apsb.d = (ahev)new ahcs((ahcz)apsb.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apsb.a;
            }
            case 4: {
                return new ahcr((ahcz)apsb.a);
            }
            case 3: {
                return new apsb();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apsb.a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0208", new Object[] { "b", "c" });
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
