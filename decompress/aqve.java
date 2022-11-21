import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqve extends ahcz implements aheo
{
    public static final aqve a;
    private static volatile ahev e;
    public int b;
    public aqvg c;
    public ahdp d;
    
    static {
        ahcz.registerDefaultInstance(aqve.class, a = new aqve());
    }
    
    private aqve() {
        this.d = ahcz.emptyProtobufList();
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
                if ((e = aqve.e) == null) {
                    synchronized (aqve.class) {
                        if (aqve.e == null) {
                            aqve.e = (ahev)new ahcs((ahcz)aqve.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aqve.a;
            }
            case 4: {
                return new ahcr((ahcz)aqve.a);
            }
            case 3: {
                return new aqve();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqve.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u1009\u0000\u0002\u001b", new Object[] { "b", "c", "d", aqvf.class });
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
