import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apdi extends ahcz implements aheo
{
    public static final apdi a;
    private static volatile ahev b;
    private int c;
    private apdh d;
    private ahjl e;
    private byte f;
    
    static {
        ahcz.registerDefaultInstance(apdi.class, a = new apdi());
    }
    
    private apdi() {
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
                if ((b = apdi.b) == null) {
                    synchronized (apdi.class) {
                        if (apdi.b == null) {
                            apdi.b = (ahev)new ahcs((ahcz)apdi.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apdi.a;
            }
            case 4: {
                return new ahcr((ahcz)apdi.a);
            }
            case 3: {
                return new apdi();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apdi.a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0003\u1409\u0001", new Object[] { "c", "d", "e" });
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
