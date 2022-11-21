import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apur extends ahcz implements aheo
{
    public static final apur a;
    private static volatile ahev b;
    private int c;
    private aisc d;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(apur.class, a = new apur());
    }
    
    private apur() {
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
                if ((b = apur.b) == null) {
                    synchronized (apur.class) {
                        if (apur.b == null) {
                            apur.b = (ahev)new ahcs((ahcz)apur.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apur.a;
            }
            case 4: {
                return new ahcr((ahcz)apur.a);
            }
            case 3: {
                return new apur();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apur.a, "\u0001\u0001\u0000\u0001\u0005\u0005\u0001\u0000\u0000\u0001\u0005\u1409\u0004", new Object[] { "c", "d" });
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
