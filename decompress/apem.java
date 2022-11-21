import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apem extends ahcz implements aheo
{
    public static final apem a;
    private static volatile ahev b;
    private int c;
    private apeg d;
    private apgx e;
    private byte f;
    
    static {
        ahcz.registerDefaultInstance(apem.class, a = new apem());
    }
    
    private apem() {
        this.f = 2;
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
                if ((b = apem.b) == null) {
                    synchronized (apem.class) {
                        if (apem.b == null) {
                            apem.b = (ahev)new ahcs((ahcz)apem.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apem.a;
            }
            case 4: {
                return new ahcr((ahcz)apem.a);
            }
            case 3: {
                return new apem();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apem.a, "\u0001\u0002\u0000\u0001\ue82a\u389b\ue5f1\u38a9\u0002\u0000\u0000\u0002\ue82a\u389b\u1409\u0000\ue5f1\u38a9\u1409\u0001", new Object[] { "c", "d", "e" });
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
