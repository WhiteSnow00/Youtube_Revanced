import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aorp extends ahcz implements aheo
{
    public static final aorp a;
    private static volatile ahev d;
    public ahdp b;
    public int c;
    private int e;
    private byte f;
    
    static {
        ahcz.registerDefaultInstance(aorp.class, a = new aorp());
    }
    
    private aorp() {
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
                final ahev d;
                if ((d = aorp.d) == null) {
                    synchronized (aorp.class) {
                        if (aorp.d == null) {
                            aorp.d = (ahev)new ahcs((ahcz)aorp.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aorp.a;
            }
            case 4: {
                return new ahcr((ahcz)aorp.a);
            }
            case 3: {
                return new aorp();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aorp.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001\u041b\u0002\u100c\u0000", new Object[] { "e", "b", aorv.class, "c", aonf.s });
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
