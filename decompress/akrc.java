import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akrc extends ahcz implements aheo
{
    public static final akrc a;
    private static volatile ahev e;
    public aknj b;
    public akra c;
    public ahbt d;
    private int f;
    private ahjl g;
    private byte h;
    
    static {
        ahcz.registerDefaultInstance(akrc.class, a = new akrc());
    }
    
    private akrc() {
        this.h = 2;
        this.d = ahbt.b;
        emptyProtobufList();
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
                if ((e = akrc.e) == null) {
                    synchronized (akrc.class) {
                        if (akrc.e == null) {
                            akrc.e = (ahev)new ahcs((ahcz)akrc.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return akrc.a;
            }
            case 4: {
                return new ahcr((ahcz)akrc.a);
            }
            case 3: {
                return new akrc();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akrc.a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0003\u0001\u1409\u0000\u0003\u1409\u0001\u0004\u1409\u0002\u0005\u100a\u0003", new Object[] { "f", "b", "c", "g", "d" });
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
