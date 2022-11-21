import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apgt extends ahcz implements aheo
{
    public static final apgt a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private ahjl e;
    private byte f;
    
    static {
        ahcz.registerDefaultInstance(apgt.class, a = new apgt());
    }
    
    private apgt() {
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
                if ((b = apgt.b) == null) {
                    synchronized (apgt.class) {
                        if (apgt.b == null) {
                            apgt.b = (ahev)new ahcs((ahcz)apgt.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apgt.a;
            }
            case 4: {
                return new ahcr((ahcz)apgt.a);
            }
            case 3: {
                return new apgt();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apgt.a, "\u0001\u0002\u0000\u0001\u0002\u0005\u0002\u0000\u0000\u0002\u0002\u1409\u0001\u0005\u1409\u0004", new Object[] { "c", "d", "e" });
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
