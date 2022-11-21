import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akcx extends ahcz implements aheo
{
    public static final akcx a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private ajws e;
    private anxb f;
    private ahjl g;
    private byte h;
    
    static {
        ahcz.registerDefaultInstance(akcx.class, a = new akcx());
    }
    
    private akcx() {
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
                if ((b = akcx.b) == null) {
                    synchronized (akcx.class) {
                        if (akcx.b == null) {
                            akcx.b = (ahev)new ahcs((ahcz)akcx.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return akcx.a;
            }
            case 4: {
                return new ahcr((ahcz)akcx.a);
            }
            case 3: {
                return new akcx();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akcx.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0004\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003", new Object[] { "c", "d", "e", "f", "g" });
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
