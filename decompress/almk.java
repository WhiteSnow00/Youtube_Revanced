import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class almk extends ahcz implements aheo
{
    public static final almk a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private ahjl e;
    private byte f;
    
    static {
        ahcz.registerDefaultInstance(almk.class, a = new almk());
    }
    
    private almk() {
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
                if ((b = almk.b) == null) {
                    synchronized (almk.class) {
                        if (almk.b == null) {
                            almk.b = (ahev)new ahcs((ahcz)almk.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return almk.a;
            }
            case 4: {
                return new ahcr((ahcz)almk.a);
            }
            case 3: {
                return new almk();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)almk.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0001", new Object[] { "c", "d", "e" });
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
