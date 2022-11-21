import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alpq extends ahcz implements aheo
{
    public static final alpq a;
    public static final ahcx b;
    private static volatile ahev h;
    public int c;
    public ajrl d;
    public aisc e;
    public String f;
    public aisc g;
    private byte i;
    
    static {
        final alpq a2 = new alpq();
        ahcz.registerDefaultInstance(alpq.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)anxa.a, a2, (MessageLite)a2, null, 267256503, ahgc.k, alpq.class);
    }
    
    private alpq() {
        this.i = 2;
        this.f = "";
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
                if ((h = alpq.h) == null) {
                    synchronized (alpq.class) {
                        if (alpq.h == null) {
                            alpq.h = (ahev)new ahcs((ahcz)alpq.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return alpq.a;
            }
            case 4: {
                return new ahcr((ahcz)alpq.a);
            }
            case 3: {
                return new alpq();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alpq.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1008\u0002\u0004\u1409\u0003", new Object[] { "c", "d", "e", "f", "g" });
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
