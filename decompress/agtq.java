import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agtq extends ahcz implements aheo
{
    public static final agtq a;
    private static volatile ahev c;
    public ahdp b;
    private byte d;
    
    static {
        ahcz.registerDefaultInstance(agtq.class, a = new agtq());
    }
    
    private agtq() {
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
                if ((c = agtq.c) == null) {
                    synchronized (agtq.class) {
                        if (agtq.c == null) {
                            agtq.c = (ahev)new ahcs((ahcz)agtq.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return agtq.a;
            }
            case 4: {
                return new ahcr((ahcz)agtq.a);
            }
            case 3: {
                return new agtq();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)agtq.a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u041b", new Object[] { "b", agtr.class });
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
