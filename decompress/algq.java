import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class algq extends ahcz implements aheo
{
    public static final algq a;
    private static volatile ahev c;
    public ahdp b;
    private int d;
    private anxb e;
    private byte f;
    
    static {
        ahcz.registerDefaultInstance(algq.class, a = new algq());
    }
    
    private algq() {
        this.f = 2;
        this.b = ahcz.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte f = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev c;
                if ((c = algq.c) == null) {
                    synchronized (algq.class) {
                        if (algq.c == null) {
                            algq.c = (ahev)new ahcs((ahcz)algq.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return algq.a;
            }
            case 4: {
                return new ahcr((ahcz)algq.a);
            }
            case 3: {
                return new algq();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)algq.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0002\u0001\u041b\u0002\u1409\u0000", new Object[] { "d", "b", algp.class, "e" });
            }
            case 1: {
                if (o == null) {
                    f = 0;
                }
                this.f = f;
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
