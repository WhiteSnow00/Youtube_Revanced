import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apop extends ahcz implements aheo
{
    public static final apop a;
    private static volatile ahev i;
    public int b;
    public ahdp c;
    public ahbt d;
    public ahdp e;
    public ahdp f;
    public apoo g;
    public ahdp h;
    private byte j;
    
    static {
        ahcz.registerDefaultInstance(apop.class, a = new apop());
    }
    
    private apop() {
        this.j = 2;
        this.c = ahcz.emptyProtobufList();
        this.d = ahbt.b;
        this.e = ahcz.emptyProtobufList();
        this.f = ahcz.emptyProtobufList();
        ahcz.emptyProtobufList();
        this.h = ahcz.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte j = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev i;
                if ((i = apop.i) == null) {
                    synchronized (apop.class) {
                        if (apop.i == null) {
                            apop.i = (ahev)new ahcs((ahcz)apop.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return apop.a;
            }
            case 4: {
                return new ahcr((ahcz)apop.a);
            }
            case 3: {
                return new apop();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apop.a, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0004\u0001\u0001\u041b\u0002\u100a\u0000\u0003\u001a\u0004\u001a\u0006\u1009\u0001\b\u001b", new Object[] { "b", "c", apon.class, "d", "e", "f", "g", "h", apom.class });
            }
            case 1: {
                if (o == null) {
                    j = 0;
                }
                this.j = j;
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}
