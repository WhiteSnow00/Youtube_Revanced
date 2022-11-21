import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akrq extends ahcz implements aheo
{
    public static final akrq a;
    private static volatile ahev d;
    public int b;
    public ahdp c;
    private int e;
    private byte f;
    
    static {
        ahcz.registerDefaultInstance(akrq.class, a = new akrq());
    }
    
    private akrq() {
        this.f = 2;
        this.c = ahcz.emptyProtobufList();
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
                if ((d = akrq.d) == null) {
                    synchronized (akrq.class) {
                        if (akrq.d == null) {
                            akrq.d = (ahev)new ahcs((ahcz)akrq.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akrq.a;
            }
            case 4: {
                return new ahcr((ahcz)akrq.a);
            }
            case 3: {
                return new akrq();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akrq.a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0001\u0001\u100c\u0000\u0003\u041b", new Object[] { "e", "b", aklp.p, "c", akro.class });
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
