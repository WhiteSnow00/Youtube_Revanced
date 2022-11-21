import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akry extends ahcz implements aheo
{
    public static final akry a;
    private static volatile ahev f;
    public aknj b;
    public akrw c;
    public apop d;
    public ahbt e;
    private int g;
    private ahjl h;
    private anxb i;
    private ajxn j;
    private byte k;
    
    static {
        ahcz.registerDefaultInstance(akry.class, a = new akry());
    }
    
    private akry() {
        this.k = 2;
        this.e = ahbt.b;
        emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte k = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev f;
                if ((f = akry.f) == null) {
                    synchronized (akry.class) {
                        if (akry.f == null) {
                            akry.f = (ahev)new ahcs((ahcz)akry.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return akry.a;
            }
            case 4: {
                return new ahcr((ahcz)akry.a);
            }
            case 3: {
                return new akry();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akry.a, "\u0001\u0007\u0000\u0001\u0001\u0309\u0007\u0000\u0000\u0006\u0001\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u100a\u0005\u0007\u1409\u0007\u0309\u1409\b", new Object[] { "g", "b", "c", "d", "h", "e", "i", "j" });
            }
            case 1: {
                if (o == null) {
                    k = 0;
                }
                this.k = k;
                return null;
            }
            case 0: {
                return this.k;
            }
        }
    }
}
