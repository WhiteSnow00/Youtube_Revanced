import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aify extends ahcz implements aheo
{
    public static final aify a;
    public static final ahcx b;
    private static volatile ahev d;
    public String c;
    private int e;
    private byte f;
    
    static {
        final aify a2 = new aify();
        ahcz.registerDefaultInstance(aify.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)aisc.a, a2, (MessageLite)a2, null, 471068491, ahgc.k, aify.class);
    }
    
    private aify() {
        this.f = 2;
        this.c = "";
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
                if ((d = aify.d) == null) {
                    synchronized (aify.class) {
                        if (aify.d == null) {
                            aify.d = (ahev)new ahcs((ahcz)aify.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aify.a;
            }
            case 4: {
                return new ahcr((ahcz)aify.a);
            }
            case 3: {
                return new aify();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aify.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "e", "c" });
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
