import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aral extends ahcz implements aheo
{
    public static final aral a;
    private static volatile ahev c;
    public ahdp b;
    private byte d;
    
    static {
        ahcz.registerDefaultInstance(aral.class, a = new aral());
    }
    
    private aral() {
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
                if ((c = aral.c) == null) {
                    synchronized (aral.class) {
                        if (aral.c == null) {
                            aral.c = (ahev)new ahcs((ahcz)aral.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aral.a;
            }
            case 4: {
                return new ahcr((byte[][][])null, (char[][])null);
            }
            case 3: {
                return new aral();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aral.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u041b", new Object[] { "b", arak.class });
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
