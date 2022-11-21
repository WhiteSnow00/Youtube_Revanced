import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajnn extends ahcz implements aheo
{
    public static final ajnn a;
    private static volatile ahev e;
    public int b;
    public Object c;
    public ahdp d;
    
    static {
        ahcz.registerDefaultInstance(ajnn.class, a = new ajnn());
    }
    
    private ajnn() {
        this.b = 0;
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
                if ((e = ajnn.e) == null) {
                    synchronized (ajnn.class) {
                        if (ajnn.e == null) {
                            ajnn.e = (ahev)new ahcs((ahcz)ajnn.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ajnn.a;
            }
            case 4: {
                return new ahcr((char[][][])null, (boolean[][])null);
            }
            case 3: {
                return new ajnn();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ajnn.a, "\u0001\u0003\u0001\u0000\u0002\u0004\u0003\u0000\u0001\u0000\u0002\u001b\u0003\u103c\u0000\u0004\u103c\u0000", new Object[] { "c", "b", "d", ajno.class, ajnl.class, ajnm.class });
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
