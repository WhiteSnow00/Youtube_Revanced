import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqvd extends ahcz implements aheo
{
    public static final aqvd a;
    private static volatile ahev d;
    public int b;
    public aqul c;
    
    static {
        ahcz.registerDefaultInstance(aqvd.class, a = new aqvd());
    }
    
    private aqvd() {
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
                if ((d = aqvd.d) == null) {
                    synchronized (aqvd.class) {
                        if (aqvd.d == null) {
                            aqvd.d = (ahev)new ahcs((ahcz)aqvd.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aqvd.a;
            }
            case 4: {
                return new ahcr((ahcz)aqvd.a);
            }
            case 3: {
                return new aqvd();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqvd.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", new Object[] { "b", "c" });
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
