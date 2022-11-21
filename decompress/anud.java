import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anud extends ahcz implements aheo
{
    public static final anud a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private ajws e;
    private aisc f;
    private ahjl g;
    private anuc h;
    private amiy i;
    private byte j;
    
    static {
        ahcz.registerDefaultInstance(anud.class, a = new anud());
    }
    
    private anud() {
        this.j = 2;
        emptyProtobufList();
        final ahbt b = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte j = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = anud.b) == null) {
                    synchronized (anud.class) {
                        if (anud.b == null) {
                            anud.b = (ahev)new ahcs((ahcz)anud.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return anud.a;
            }
            case 4: {
                return new ahcr((ahcz)anud.a);
            }
            case 3: {
                return new anud();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)anud.a, "\u0001\u0006\u0000\u0001\u0002\n\u0006\u0000\u0000\u0006\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0006\u1409\u0004\b\u1409\u0006\n\u1409\b", new Object[] { "c", "d", "e", "f", "g", "h", "i" });
            }
            case 1: {
                if (o == null) {
                    j = 0;
                }
                this.j = j;
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}
