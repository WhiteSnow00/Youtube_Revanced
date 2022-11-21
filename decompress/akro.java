import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akro extends ahcz implements aheo
{
    public static final akro a;
    private static volatile ahev e;
    public int b;
    public ajws c;
    public ajws d;
    private int f;
    private byte g;
    
    static {
        ahcz.registerDefaultInstance(akro.class, a = new akro());
    }
    
    private akro() {
        this.g = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev e;
                if ((e = akro.e) == null) {
                    synchronized (akro.class) {
                        if (akro.e == null) {
                            akro.e = (ahev)new ahcs((ahcz)akro.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return akro.a;
            }
            case 4: {
                return new ahcr((ahcz)akro.a);
            }
            case 3: {
                return new akro();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akro.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0002\u0001\u100c\u0000\u0003\u1409\u0002\u0004\u1409\u0003", new Object[] { "f", "b", aklp.o, "c", "d" });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
