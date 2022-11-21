import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amop extends ahcz implements aheo
{
    public static final amop a;
    private static volatile ahev b;
    private int c;
    private anxb d;
    private anxb e;
    private anxb f;
    private anxb g;
    private anxb h;
    private anxb i;
    private anxb j;
    private anxb k;
    private byte l;
    
    static {
        ahcz.registerDefaultInstance(amop.class, a = new amop());
    }
    
    private amop() {
        this.l = 2;
        emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte l = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = amop.b) == null) {
                    synchronized (amop.class) {
                        if (amop.b == null) {
                            amop.b = (ahev)new ahcs((ahcz)amop.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return amop.a;
            }
            case 4: {
                return new ahcr((ahcz)amop.a);
            }
            case 3: {
                return new amop();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amop.a, "\u0001\b\u0000\u0001\u0002\u000b\b\u0000\u0000\b\u0002\u1409\u0002\u0005\u1409\u0004\u0006\u1409\u0006\u0007\u1409\u0007\b\u1409\b\t\u1409\t\n\u1409\u0005\u000b\u1409\u0001", new Object[] { "c", "e", "f", "h", "i", "j", "k", "g", "d" });
            }
            case 1: {
                if (o == null) {
                    l = 0;
                }
                this.l = l;
                return null;
            }
            case 0: {
                return this.l;
            }
        }
    }
}
