import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akcj extends ahcz implements aheo
{
    public static final akcj a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private ajws e;
    private ajws f;
    private ajws g;
    private akci h;
    private ajws i;
    private byte j;
    
    static {
        ahcz.registerDefaultInstance(akcj.class, a = new akcj());
    }
    
    private akcj() {
        this.j = 2;
        emptyProtobufList();
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
                if ((b = akcj.b) == null) {
                    synchronized (akcj.class) {
                        if (akcj.b == null) {
                            akcj.b = (ahev)new ahcs((ahcz)akcj.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return akcj.a;
            }
            case 4: {
                return new ahcr((ahcz)akcj.a);
            }
            case 3: {
                return new akcj();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akcj.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0006\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005", new Object[] { "c", "d", "e", "f", "g", "h", "i" });
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
