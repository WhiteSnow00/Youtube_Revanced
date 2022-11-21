import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akck extends ahcz implements aheo
{
    public static final akck a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private ajws e;
    private ajws f;
    private byte g;
    
    static {
        ahcz.registerDefaultInstance(akck.class, a = new akck());
    }
    
    private akck() {
        this.g = 2;
        emptyProtobufList();
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
                final ahev b;
                if ((b = akck.b) == null) {
                    synchronized (akck.class) {
                        if (akck.b == null) {
                            akck.b = (ahev)new ahcs((ahcz)akck.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return akck.a;
            }
            case 4: {
                return new ahcr((ahcz)akck.a);
            }
            case 3: {
                return new akck();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akck.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002", new Object[] { "c", "d", "e", "f" });
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
