import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqvc extends ahcz implements aheo
{
    public static final aqvc a;
    private static volatile ahev e;
    public int b;
    public aquu c;
    public float d;
    
    static {
        ahcz.registerDefaultInstance(aqvc.class, a = new aqvc());
    }
    
    private aqvc() {
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
                if ((e = aqvc.e) == null) {
                    synchronized (aqvc.class) {
                        if (aqvc.e == null) {
                            aqvc.e = (ahev)new ahcs((ahcz)aqvc.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aqvc.a;
            }
            case 4: {
                return new ahcr((ahcz)aqvc.a);
            }
            case 3: {
                return new aqvc();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqvc.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1001\u0001", new Object[] { "b", "c", "d" });
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
