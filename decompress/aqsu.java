import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqsu extends ahcz implements aheo
{
    public static final aqsu a;
    private static volatile ahev d;
    public int b;
    public String c;
    
    static {
        ahcz.registerDefaultInstance(aqsu.class, a = new aqsu());
    }
    
    private aqsu() {
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
                if ((d = aqsu.d) == null) {
                    synchronized (aqsu.class) {
                        if (aqsu.d == null) {
                            aqsu.d = (ahev)new ahcs((ahcz)aqsu.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aqsu.a;
            }
            case 4: {
                return new ahcr((ahcz)aqsu.a);
            }
            case 3: {
                return new aqsu();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqsu.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "b", "c" });
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
