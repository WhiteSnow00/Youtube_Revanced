import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akqm extends ahcz implements aheo
{
    public static final akqm a;
    private static volatile ahev h;
    public int b;
    public aknj c;
    public ajws d;
    public akqk e;
    public akqp f;
    public ahdp g;
    private byte i;
    
    static {
        ahcz.registerDefaultInstance(akqm.class, a = new akqm());
    }
    
    private akqm() {
        this.i = 2;
        this.g = ahcz.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte i = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev h;
                if ((h = akqm.h) == null) {
                    synchronized (akqm.class) {
                        if (akqm.h == null) {
                            akqm.h = (ahev)new ahcs((ahcz)akqm.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return akqm.a;
            }
            case 4: {
                return new ahcr((ahcz)akqm.a);
            }
            case 3: {
                return new akqm();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akqm.a, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0001\u0005\u0001\u1409\u0000\u0003\u1409\u0001\u0005\u1409\u0002\u0006\u1409\u0003\u0007\u041b", new Object[] { "b", "c", "d", "e", "f", "g", aisc.class });
            }
            case 1: {
                if (o == null) {
                    i = 0;
                }
                this.i = i;
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
