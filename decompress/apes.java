import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apes extends ahcz implements aheo
{
    public static final apes a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private ajws e;
    private anxb f;
    private anxb g;
    private ahjl h;
    private byte i;
    
    static {
        ahcz.registerDefaultInstance(apes.class, a = new apes());
    }
    
    private apes() {
        this.i = 2;
        final ahbt b = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte i = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = apes.b) == null) {
                    synchronized (apes.class) {
                        if (apes.b == null) {
                            apes.b = (ahev)new ahcs((ahcz)apes.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apes.a;
            }
            case 4: {
                return new ahcr((ahcz)apes.a);
            }
            case 3: {
                return new apes();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apes.a, "\u0001\u0005\u0000\u0001\u0003\f\u0005\u0000\u0000\u0005\u0003\u1409\u0004\u0004\u1409\u0005\u0006\u1409\u000b\u000b\u1409\b\f\u1409\t", new Object[] { "c", "d", "e", "h", "f", "g" });
            }
            case 1: {
                if (o == null) {
                    i = 0;
                }
                this.i = i;
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
