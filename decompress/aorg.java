import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aorg extends ahcz implements aheo
{
    public static final aorg a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private aisc e;
    private ahjl f;
    private byte g;
    
    static {
        ahcz.registerDefaultInstance(aorg.class, a = new aorg());
    }
    
    private aorg() {
        this.g = 2;
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
                if ((b = aorg.b) == null) {
                    synchronized (aorg.class) {
                        if (aorg.b == null) {
                            aorg.b = (ahev)new ahcs((ahcz)aorg.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aorg.a;
            }
            case 4: {
                return new ahcr((ahcz)aorg.a);
            }
            case 3: {
                return new aorg();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aorg.a, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0003\u0001\u1409\u0000\u0004\u1409\u0001\u0005\u1409\u0002", new Object[] { "c", "d", "e", "f" });
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
