import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aloa extends ahcz implements aheo
{
    public static final aloa a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private aisc e;
    private alob f;
    private ahjl g;
    private byte h;
    
    static {
        ahcz.registerDefaultInstance(aloa.class, a = new aloa());
    }
    
    private aloa() {
        this.h = 2;
        final ahbt b = ahbt.b;
        emptyProtobufList();
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
                if ((b = aloa.b) == null) {
                    synchronized (aloa.class) {
                        if (aloa.b == null) {
                            aloa.b = (ahev)new ahcs((ahcz)aloa.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aloa.a;
            }
            case 4: {
                return new ahcr((ahcz)aloa.a);
            }
            case 3: {
                return new aloa();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aloa.a, "\u0001\u0004\u0000\u0001\u0002\u0006\u0004\u0000\u0000\u0004\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0006\u1409\u0005", new Object[] { "c", "d", "e", "f", "g" });
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
