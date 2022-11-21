import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqom extends ahcz implements aheo
{
    public static final aqom a;
    private static volatile ahev c;
    public ahdp b;
    
    static {
        ahcz.registerDefaultInstance(aqom.class, a = new aqom());
    }
    
    private aqom() {
        this.b = ahcz.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev c;
                if ((c = aqom.c) == null) {
                    synchronized (aqom.class) {
                        if (aqom.c == null) {
                            aqom.c = (ahev)new ahcs((ahcz)aqom.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aqom.a;
            }
            case 4: {
                return new ahcr((boolean[])null, (int[])null);
            }
            case 3: {
                return new aqom();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqom.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[] { "b", aqoj.class });
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
