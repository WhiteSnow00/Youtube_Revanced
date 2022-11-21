import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqcu extends ahcz implements aheo
{
    public static final aqcu a;
    private static volatile ahev d;
    public int b;
    public long c;
    private int e;
    private ahej f;
    
    static {
        ahcz.registerDefaultInstance(aqcu.class, a = new aqcu());
    }
    
    private aqcu() {
        this.f = ahej.a;
        emptyProtobufList();
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
                final ahev d;
                if ((d = aqcu.d) == null) {
                    synchronized (aqcu.class) {
                        if (aqcu.d == null) {
                            aqcu.d = (ahev)new ahcs((ahcz)aqcu.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aqcu.a;
            }
            case 4: {
                return new ahcr((ahcz)aqcu.a);
            }
            case 3: {
                return new aqcu();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqcu.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0001\u0000\u0000\u0001\u100b\u0000\u0002\u1003\u0001\u00042", new Object[] { "e", "b", "c", "f", aqct.a });
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
