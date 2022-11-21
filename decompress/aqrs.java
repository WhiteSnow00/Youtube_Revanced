import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqrs extends ahcz implements aheo
{
    public static final aqrs a;
    private static volatile ahev e;
    public int b;
    public ajsa c;
    public ahfq d;
    
    static {
        ahcz.registerDefaultInstance(aqrs.class, a = new aqrs());
    }
    
    private aqrs() {
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
                if ((e = aqrs.e) == null) {
                    synchronized (aqrs.class) {
                        if (aqrs.e == null) {
                            aqrs.e = (ahev)new ahcs((ahcz)aqrs.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aqrs.a;
            }
            case 4: {
                return new ahcr((ahcz)aqrs.a);
            }
            case 3: {
                return new aqrs();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqrs.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001", new Object[] { "b", "c", "d" });
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
