import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqoq extends ahcz implements aheo
{
    public static final aqoq a;
    private static volatile ahev f;
    public int b;
    public ahdp c;
    public boolean d;
    public ahfq e;
    
    static {
        ahcz.registerDefaultInstance(aqoq.class, a = new aqoq());
    }
    
    private aqoq() {
        this.c = ahcz.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev f;
                if ((f = aqoq.f) == null) {
                    synchronized (aqoq.class) {
                        if (aqoq.f == null) {
                            aqoq.f = (ahev)new ahcs((ahcz)aqoq.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aqoq.a;
            }
            case 4: {
                return new ahcr((byte[][])null, (short[])null);
            }
            case 3: {
                return new aqoq();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqoq.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001\u001b\u0003\u1007\u0001\u0004\u1009\u0002", new Object[] { "b", "c", aqop.class, "d", "e" });
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
