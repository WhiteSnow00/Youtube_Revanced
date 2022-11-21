import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aife extends ahcz implements aheo
{
    public static final aife a;
    private static volatile ahev e;
    public int b;
    public ahdp c;
    public ajws d;
    private ahjl f;
    private byte g;
    
    static {
        ahcz.registerDefaultInstance(aife.class, a = new aife());
    }
    
    private aife() {
        this.g = 2;
        this.c = ahcz.emptyProtobufList();
        final ahbt b = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev e;
                if ((e = aife.e) == null) {
                    synchronized (aife.class) {
                        if (aife.e == null) {
                            aife.e = (ahev)new ahcs((ahcz)aife.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aife.a;
            }
            case 4: {
                return new ahcr((ahcz)aife.a);
            }
            case 3: {
                return new aife();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aife.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0003\u0001\u041b\u0002\u1409\u0000\u0004\u1409\u0002", new Object[] { "b", "c", aifd.class, "d", "f" });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
