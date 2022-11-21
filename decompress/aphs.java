import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aphs extends ahcz implements aheo
{
    public static final aphs a;
    private static volatile ahev b;
    private int c;
    private anxb d;
    private ahjl e;
    private byte f;
    
    static {
        ahcz.registerDefaultInstance(aphs.class, a = new aphs());
    }
    
    private aphs() {
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
                if ((b = aphs.b) == null) {
                    synchronized (aphs.class) {
                        if (aphs.b == null) {
                            aphs.b = (ahev)new ahcs((ahcz)aphs.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aphs.a;
            }
            case 4: {
                return new ahcr((ahcz)aphs.a);
            }
            case 3: {
                return new aphs();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aphs.a, "\u0001\u0002\u0000\u0001\u0007\t\u0002\u0000\u0000\u0002\u0007\u1409\u0001\t\u1409\u0003", new Object[] { "c", "d", "e" });
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
