import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aphk extends ahcz implements aheo
{
    public static final aphk a;
    private static volatile ahev b;
    private int c;
    private aisc d;
    private ahjl e;
    private byte f;
    
    static {
        ahcz.registerDefaultInstance(aphk.class, a = new aphk());
    }
    
    private aphk() {
        this.f = 2;
        emptyProtobufList();
        final ahbt b = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte f = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = aphk.b) == null) {
                    synchronized (aphk.class) {
                        if (aphk.b == null) {
                            aphk.b = (ahev)new ahcs((ahcz)aphk.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aphk.a;
            }
            case 4: {
                return new ahcr((ahcz)aphk.a);
            }
            case 3: {
                return new aphk();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aphk.a, "\u0001\u0002\u0000\u0001\u0003\u0005\u0002\u0000\u0000\u0002\u0003\u1409\u0002\u0005\u1409\u0004", new Object[] { "c", "d", "e" });
            }
            case 1: {
                if (o == null) {
                    f = 0;
                }
                this.f = f;
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
