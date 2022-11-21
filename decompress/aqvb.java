import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqvb extends ahcz implements aheo
{
    public static final aqvb a;
    private static volatile ahev e;
    public int b;
    public aquu c;
    public ahcf d;
    
    static {
        ahcz.registerDefaultInstance(aqvb.class, a = new aqvb());
    }
    
    private aqvb() {
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
                if ((e = aqvb.e) == null) {
                    synchronized (aqvb.class) {
                        if (aqvb.e == null) {
                            aqvb.e = (ahev)new ahcs((ahcz)aqvb.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aqvb.a;
            }
            case 4: {
                return new ahcr((ahcz)aqvb.a);
            }
            case 3: {
                return new aqvb();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqvb.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001", new Object[] { "b", "c", "d" });
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
