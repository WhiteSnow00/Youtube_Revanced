import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqva extends ahcz implements aheo
{
    public static final aqva a;
    private static volatile ahev e;
    public int b;
    public aquu c;
    public ahcf d;
    
    static {
        ahcz.registerDefaultInstance(aqva.class, a = new aqva());
    }
    
    private aqva() {
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
                if ((e = aqva.e) == null) {
                    synchronized (aqva.class) {
                        if (aqva.e == null) {
                            aqva.e = (ahev)new ahcs((ahcz)aqva.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aqva.a;
            }
            case 4: {
                return new ahcr((ahcz)aqva.a);
            }
            case 3: {
                return new aqva();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqva.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001", new Object[] { "b", "c", "d" });
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
