import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aogt extends ahcz implements aheo
{
    public static final aogt a;
    private static volatile ahev g;
    public int b;
    public String c;
    public String d;
    public aogq e;
    public aogs f;
    
    static {
        ahcz.registerDefaultInstance(aogt.class, a = new aogt());
    }
    
    private aogt() {
        this.c = "";
        this.d = "";
        emptyProtobufList();
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
                if ((g = aogt.g) == null) {
                    synchronized (aogt.class) {
                        if (aogt.g == null) {
                            aogt.g = (ahev)new ahcs((ahcz)aogt.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aogt.a;
            }
            case 4: {
                return new ahcr((ahcz)aogt.a);
            }
            case 3: {
                return new aogt();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aogt.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1009\u0002\u0004\u1009\u0003", new Object[] { "b", "c", "d", "e", "f" });
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
