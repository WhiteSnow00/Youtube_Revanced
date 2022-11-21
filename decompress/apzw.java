import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apzw extends ahcz implements aheo
{
    public static final apzw a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private ajws e;
    private ajws f;
    private aisc g;
    private byte h;
    
    static {
        ahcz.registerDefaultInstance(apzw.class, a = new apzw());
    }
    
    private apzw() {
        this.h = 2;
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
                if ((b = apzw.b) == null) {
                    synchronized (apzw.class) {
                        if (apzw.b == null) {
                            apzw.b = (ahev)new ahcs((ahcz)apzw.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apzw.a;
            }
            case 4: {
                return new ahcr((ahcz)apzw.a);
            }
            case 3: {
                return new apzw();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apzw.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0004\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0003\u0004\u1409\u0002", new Object[] { "c", "d", "e", "g", "f" });
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
