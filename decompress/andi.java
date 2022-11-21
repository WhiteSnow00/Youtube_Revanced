import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class andi extends ahcz implements aheo
{
    public static final andi a;
    private static volatile ahev b;
    private int c;
    private aiet d;
    private andf e;
    private ajws f;
    private aisc g;
    private anxb h;
    private byte i;
    
    static {
        ahcz.registerDefaultInstance(andi.class, a = new andi());
    }
    
    private andi() {
        this.i = 2;
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
                if ((b = andi.b) == null) {
                    synchronized (andi.class) {
                        if (andi.b == null) {
                            andi.b = (ahev)new ahcs((ahcz)andi.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return andi.a;
            }
            case 4: {
                return new ahcr((ahcz)andi.a);
            }
            case 3: {
                return new andi();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)andi.a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0005\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0005\u1409\u0005\u0006\u1409\u0004", new Object[] { "c", "d", "e", "f", "h", "g" });
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
