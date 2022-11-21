import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aidi extends ahcz implements aheo
{
    public static final aidi a;
    private static volatile ahev d;
    public ahni b;
    public anxb c;
    private int e;
    private byte f;
    
    static {
        ahcz.registerDefaultInstance(aidi.class, a = new aidi());
    }
    
    private aidi() {
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
                final ahev d;
                if ((d = aidi.d) == null) {
                    synchronized (aidi.class) {
                        if (aidi.d == null) {
                            aidi.d = (ahev)new ahcs((ahcz)aidi.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aidi.a;
            }
            case 4: {
                return new ahcr((ahcz)aidi.a);
            }
            case 3: {
                return new aidi();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aidi.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\u1009\u0000\u0002\u1409\u0001", new Object[] { "e", "b", "c" });
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
