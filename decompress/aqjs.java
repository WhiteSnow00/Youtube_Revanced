import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqjs extends ahcz implements aheo
{
    public static final aqjs a;
    private static volatile ahev g;
    public int b;
    public boolean c;
    public ahdp d;
    public boolean e;
    public ahfq f;
    
    static {
        ahcz.registerDefaultInstance(aqjs.class, a = new aqjs());
    }
    
    private aqjs() {
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
                final ahev g;
                if ((g = aqjs.g) == null) {
                    synchronized (aqjs.class) {
                        if (aqjs.g == null) {
                            aqjs.g = (ahev)new ahcs((ahcz)aqjs.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aqjs.a;
            }
            case 4: {
                return new ahcr((ahcz)aqjs.a);
            }
            case 3: {
                return new aqjs();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqjs.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u1007\u0000\u0002\u001b\u0003\u1007\u0001\u0004\u1009\u0002", new Object[] { "b", "c", "d", aqjr.class, "e", "f" });
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
