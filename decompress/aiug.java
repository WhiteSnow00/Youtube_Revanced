import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiug extends ahcz implements aheo
{
    public static final aiug a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private ajws e;
    private ajws f;
    private ajws g;
    private ajws h;
    private ajws i;
    private byte j;
    
    static {
        ahcz.registerDefaultInstance(aiug.class, a = new aiug());
    }
    
    private aiug() {
        this.j = 2;
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
                if ((b = aiug.b) == null) {
                    synchronized (aiug.class) {
                        if (aiug.b == null) {
                            aiug.b = (ahev)new ahcs((ahcz)aiug.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aiug.a;
            }
            case 4: {
                return new ahcr((ahcz)aiug.a);
            }
            case 3: {
                return new aiug();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aiug.a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0006\u0001\u1409\u0000\u0002\u1409\u0001\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005\u0007\u1409\u0006", new Object[] { "c", "d", "e", "f", "g", "h", "i" });
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
