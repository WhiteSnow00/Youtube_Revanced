import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akcc extends ahcz implements aheo
{
    public static final akcc a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private ajws e;
    private anxb f;
    private byte g;
    
    static {
        ahcz.registerDefaultInstance(akcc.class, a = new akcc());
    }
    
    private akcc() {
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
                final ahev b;
                if ((b = akcc.b) == null) {
                    synchronized (akcc.class) {
                        if (akcc.b == null) {
                            akcc.b = (ahev)new ahcs((ahcz)akcc.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return akcc.a;
            }
            case 4: {
                return new ahcr((ahcz)akcc.a);
            }
            case 3: {
                return new akcc();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akcc.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002", new Object[] { "c", "d", "e", "f" });
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
