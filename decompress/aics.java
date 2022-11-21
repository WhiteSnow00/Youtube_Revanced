import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aics extends ahcz implements aheo
{
    public static final aics a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(aics.class, a = new aics());
    }
    
    private aics() {
        this.e = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte e = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = aics.b) == null) {
                    synchronized (aics.class) {
                        if (aics.b == null) {
                            aics.b = (ahev)new ahcs((ahcz)aics.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aics.a;
            }
            case 4: {
                return new ahcr((ahcz)aics.a);
            }
            case 3: {
                return new aics();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aics.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "c", "d" });
            }
            case 1: {
                if (o == null) {
                    e = 0;
                }
                this.e = e;
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
