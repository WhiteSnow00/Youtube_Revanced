import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqay extends ahcz implements aheo
{
    public static final aqay a;
    public static final ahcx b;
    private static volatile ahev h;
    public int c;
    public String d;
    public String e;
    public String f;
    public aowb g;
    private byte i;
    
    static {
        final aqay a2 = new aqay();
        ahcz.registerDefaultInstance(aqay.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)ajsd.a, a2, (MessageLite)a2, null, 152, ahgc.k, aqay.class);
    }
    
    private aqay() {
        this.i = 2;
        this.d = "";
        final ahbt b = ahbt.b;
        this.e = "";
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
                if ((h = aqay.h) == null) {
                    synchronized (aqay.class) {
                        if (aqay.h == null) {
                            aqay.h = (ahev)new ahcs((ahcz)aqay.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return aqay.a;
            }
            case 4: {
                return new ahcr((ahcz)aqay.a);
            }
            case 3: {
                return new aqay();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqay.a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0001\u0001\u1008\u0000\u0003\u1008\u0002\u0004\u1008\u0003\u0005\u1409\u0004", new Object[] { "c", "d", "e", "f", "g" });
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
