import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amnl extends ahcz implements aheo
{
    public static final amnl a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private aisc e;
    private ahjl f;
    private byte g;
    
    static {
        ahcz.registerDefaultInstance(amnl.class, a = new amnl());
    }
    
    private amnl() {
        this.g = 2;
        emptyProtobufList();
        emptyProtobufList();
        final ahbt b = ahbt.b;
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
                if ((b = amnl.b) == null) {
                    synchronized (amnl.class) {
                        if (amnl.b == null) {
                            amnl.b = (ahev)new ahcs((ahcz)amnl.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return amnl.a;
            }
            case 4: {
                return new ahcr((ahcz)amnl.a);
            }
            case 3: {
                return new amnl();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amnl.a, "\u0001\u0003\u0000\u0001\u0002\u0006\u0003\u0000\u0000\u0003\u0002\u1409\u0002\u0005\u1409\u0001\u0006\u1409\u0000", new Object[] { "c", "f", "e", "d" });
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
