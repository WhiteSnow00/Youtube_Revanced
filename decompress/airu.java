import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class airu extends ahcz implements aheo
{
    public static final airu a;
    private static volatile ahev h;
    public int b;
    public anxb c;
    public ajws d;
    public ajws e;
    public int f;
    public int g;
    private byte i;
    
    static {
        ahcz.registerDefaultInstance(airu.class, a = new airu());
    }
    
    private airu() {
        this.i = 2;
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
                if ((h = airu.h) == null) {
                    synchronized (airu.class) {
                        if (airu.h == null) {
                            airu.h = (ahev)new ahcs((ahcz)airu.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return airu.a;
            }
            case 4: {
                return new ahcr((ahcz)airu.a);
            }
            case 3: {
                return new airu();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)airu.a, "\u0001\u0005\u0000\u0001\u0002\u0006\u0005\u0000\u0000\u0003\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u100b\u0003\u0005\u100c\u0004\u0006\u1409\u0000", new Object[] { "b", "d", "e", "f", "g", ahld.g, "c" });
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
