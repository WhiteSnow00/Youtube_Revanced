import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahlx extends ahcz implements aheo
{
    public static final ahdi a;
    public static final ahlx b;
    private static volatile ahev e;
    public boolean c;
    public ahdh d;
    private int f;
    private aisc g;
    private byte h;
    
    static {
        a = (ahdi)new pub(9);
        ahcz.registerDefaultInstance(ahlx.class, b = new ahlx());
    }
    
    private ahlx() {
        this.h = 2;
        this.d = ahcz.emptyIntList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte h = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev e;
                if ((e = ahlx.e) == null) {
                    synchronized (ahlx.class) {
                        if (ahlx.e == null) {
                            ahlx.e = (ahev)new ahcs((ahcz)ahlx.b);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ahlx.b;
            }
            case 4: {
                return new ahcr((ahcz)ahlx.b);
            }
            case 3: {
                return new ahlx();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ahlx.b, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0001\u0001\u0001\u1007\u0000\u0003\u1409\u0003\u0005\u001e", new Object[] { "f", "c", "g", "d", ahlw.a() });
            }
            case 1: {
                if (o == null) {
                    h = 0;
                }
                this.h = h;
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
