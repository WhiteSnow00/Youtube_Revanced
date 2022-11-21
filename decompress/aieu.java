import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aieu extends ahcz implements aheo
{
    public static final aieu a;
    private static volatile ahev b;
    private int c;
    private aisc d;
    private ahjl e;
    private byte f;
    
    static {
        ahcz.registerDefaultInstance(aieu.class, a = new aieu());
    }
    
    private aieu() {
        this.f = 2;
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
                if ((b = aieu.b) == null) {
                    synchronized (aieu.class) {
                        if (aieu.b == null) {
                            aieu.b = (ahev)new ahcs((ahcz)aieu.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aieu.a;
            }
            case 4: {
                return new ahcr((ahcz)aieu.a);
            }
            case 3: {
                return new aieu();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aieu.a, "\u0001\u0002\u0000\u0001\u0002\b\u0002\u0000\u0000\u0002\u0002\u1409\u0004\b\u1409\u0002", new Object[] { "c", "e", "d" });
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
