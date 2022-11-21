import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alwz extends ahcz implements aheo
{
    public static final alwz a;
    public static final ahcx b;
    private static volatile ahev h;
    public int c;
    public int d;
    public Object e;
    public String f;
    public String g;
    
    static {
        final alwz a2 = new alwz();
        ahcz.registerDefaultInstance(alwz.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)amwo.b, a2, (MessageLite)a2, null, 318835310, ahgc.k, alwz.class);
    }
    
    private alwz() {
        this.d = 0;
        this.f = "";
        this.g = "";
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev h;
                if ((h = alwz.h) == null) {
                    synchronized (alwz.class) {
                        if (alwz.h == null) {
                            alwz.h = (ahev)new ahcs((ahcz)alwz.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return alwz.a;
            }
            case 4: {
                return new ahcr((ahcz)alwz.a);
            }
            case 3: {
                return new alwz();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alwz.a, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u103b\u0000\u0002\u1008\u0002\u0003\u1008\u0003\u0004\u103b\u0000", new Object[] { "e", "d", "c", "f", "g" });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
