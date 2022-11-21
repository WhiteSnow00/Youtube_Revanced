import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amie extends ahcz implements aheo
{
    public static final amie a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private ajws e;
    private anxb f;
    private ahjl g;
    private byte h;
    
    static {
        ahcz.registerDefaultInstance(amie.class, a = new amie());
    }
    
    private amie() {
        this.h = 2;
        final ahbt b = ahbt.b;
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
                final ahev b;
                if ((b = amie.b) == null) {
                    synchronized (amie.class) {
                        if (amie.b == null) {
                            amie.b = (ahev)new ahcs((ahcz)amie.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return amie.a;
            }
            case 4: {
                return new ahcr((ahcz)amie.a);
            }
            case 3: {
                return new amie();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amie.a, "\u0001\u0004\u0000\u0001\u0002\u0006\u0004\u0000\u0000\u0004\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0004\u0006\u1409\u0003", new Object[] { "c", "d", "e", "g", "f" });
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
