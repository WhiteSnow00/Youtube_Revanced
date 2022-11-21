import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anua extends ahcz implements aheo
{
    public static final anua a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private ajws e;
    private anxb f;
    private ahjl g;
    private byte h;
    
    static {
        ahcz.registerDefaultInstance(anua.class, a = new anua());
    }
    
    private anua() {
        this.h = 2;
        emptyProtobufList();
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
                if ((b = anua.b) == null) {
                    synchronized (anua.class) {
                        if (anua.b == null) {
                            anua.b = (ahev)new ahcs((ahcz)anua.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return anua.a;
            }
            case 4: {
                return new ahcr((ahcz)anua.a);
            }
            case 3: {
                return new anua();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)anua.a, "\u0001\u0004\u0000\u0001\u0001\u0007\u0004\u0000\u0000\u0004\u0001\u1409\u0000\u0002\u1409\u0001\u0004\u1409\u0004\u0007\u1409\u0002", new Object[] { "c", "d", "e", "g", "f" });
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
