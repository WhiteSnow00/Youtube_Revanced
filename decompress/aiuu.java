import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiuu extends ahcz implements aheo
{
    public static final aiuu a;
    private static volatile ahev b;
    private int c;
    private aivc d;
    private aiut e;
    private aiuv f;
    private ahjl g;
    private byte h;
    
    static {
        ahcz.registerDefaultInstance(aiuu.class, a = new aiuu());
    }
    
    private aiuu() {
        this.h = 2;
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        final ahbt b = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte h = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = aiuu.b) == null) {
                    synchronized (aiuu.class) {
                        if (aiuu.b == null) {
                            aiuu.b = (ahev)new ahcs((ahcz)aiuu.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aiuu.a;
            }
            case 4: {
                return new ahcr((ahcz)aiuu.a);
            }
            case 3: {
                return new aiuu();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aiuu.a, "\u0001\u0004\u0000\u0001\u0003\u0007\u0004\u0000\u0000\u0004\u0003\u1409\u0000\u0004\u1409\u0001\u0005\u1409\u0002\u0007\u1409\u0004", new Object[] { "c", "d", "e", "f", "g" });
            }
            case 1: {
                if (o == null) {
                    h = 0;
                }
                this.h = h;
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
