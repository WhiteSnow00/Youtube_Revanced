import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahlu extends ahcz implements aheo
{
    public static final ahlu a;
    private static volatile ahev b;
    private int c;
    private ahpb d;
    private ahna e;
    private anxb f;
    private aisc g;
    private ahjl h;
    private byte i;
    
    static {
        ahcz.registerDefaultInstance(ahlu.class, a = new ahlu());
    }
    
    private ahlu() {
        this.i = 2;
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
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
                if ((b = ahlu.b) == null) {
                    synchronized (ahlu.class) {
                        if (ahlu.b == null) {
                            ahlu.b = (ahev)new ahcs((ahcz)ahlu.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ahlu.a;
            }
            case 4: {
                return new ahcr((ahcz)ahlu.a);
            }
            case 3: {
                return new ahlu();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ahlu.a, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0005\u0001\u1409\u0000\u0002\u1409\u0001\u0004\u1409\u0002\u0005\u1409\u0003\u0007\u1409\u0004", new Object[] { "c", "d", "e", "f", "g", "h" });
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
