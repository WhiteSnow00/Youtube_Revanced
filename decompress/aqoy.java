import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqoy extends ahcz implements aheo
{
    public static final aqoy a;
    private static volatile ahev e;
    public int b;
    public aqob c;
    public String d;
    
    static {
        ahcz.registerDefaultInstance(aqoy.class, a = new aqoy());
    }
    
    private aqoy() {
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
                if ((e = aqoy.e) == null) {
                    synchronized (aqoy.class) {
                        if (aqoy.e == null) {
                            aqoy.e = (ahev)new ahcs((ahcz)aqoy.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aqoy.a;
            }
            case 4: {
                return new ahcr((ahcz)aqoy.a);
            }
            case 3: {
                return new aqoy();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqoy.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1008\u0001", new Object[] { "b", "c", "d" });
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
