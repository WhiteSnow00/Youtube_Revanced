import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amki extends ahcz implements aheo
{
    public static final amki a;
    public static final ahcx b;
    private static volatile ahev e;
    public int c;
    public Object d;
    private byte f;
    
    static {
        final amki a2 = new amki();
        ahcz.registerDefaultInstance(amki.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)aisc.a, a2, (MessageLite)a2, null, 247401431, ahgc.k, amki.class);
    }
    
    private amki() {
        this.c = 0;
        this.f = 2;
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
                final ahev e;
                if ((e = amki.e) == null) {
                    synchronized (amki.class) {
                        if (amki.e == null) {
                            amki.e = (ahev)new ahcs((ahcz)amki.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return amki.a;
            }
            case 4: {
                return new ahcr((ahcz)amki.a);
            }
            case 3: {
                return new amki();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amki.a, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u143c\u0000", new Object[] { "d", "c", akwi.class });
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
