import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apha extends ahcz implements aheo
{
    public static final apha a;
    private static volatile ahev b;
    private int c;
    private anxb d;
    private anxb e;
    private anxb f;
    private aisc g;
    private ahjl h;
    private byte i;
    
    static {
        ahcz.registerDefaultInstance(apha.class, a = new apha());
    }
    
    private apha() {
        this.i = 2;
        emptyProtobufList();
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
                if ((b = apha.b) == null) {
                    synchronized (apha.class) {
                        if (apha.b == null) {
                            apha.b = (ahev)new ahcs((ahcz)apha.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apha.a;
            }
            case 4: {
                return new ahcr((ahcz)apha.a);
            }
            case 3: {
                return new apha();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apha.a, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0005\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0004\u0007\u1409\u0003", new Object[] { "c", "d", "e", "f", "h", "g" });
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
