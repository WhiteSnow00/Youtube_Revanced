import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aorq extends ahcz implements aheo
{
    public static final aorq a;
    private static volatile ahev c;
    public ahdp b;
    private byte d;
    
    static {
        ahcz.registerDefaultInstance(aorq.class, a = new aorq());
    }
    
    private aorq() {
        this.d = 2;
        this.b = ahcz.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte d = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev c;
                if ((c = aorq.c) == null) {
                    synchronized (aorq.class) {
                        if (aorq.c == null) {
                            aorq.c = (ahev)new ahcs((ahcz)aorq.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aorq.a;
            }
            case 4: {
                return new ahcr((ahcz)aorq.a);
            }
            case 3: {
                return new aorq();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aorq.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u041b", new Object[] { "b", aisc.class });
            }
            case 1: {
                if (o == null) {
                    d = 0;
                }
                this.d = d;
                return null;
            }
            case 0: {
                return this.d;
            }
        }
    }
}
