import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apei extends ahcz implements aheo
{
    public static final apei a;
    private static volatile ahev b;
    private int c;
    private apej d;
    private apek e;
    private byte f;
    
    static {
        ahcz.registerDefaultInstance(apei.class, a = new apei());
    }
    
    private apei() {
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
                if ((b = apei.b) == null) {
                    synchronized (apei.class) {
                        if (apei.b == null) {
                            apei.b = (ahev)new ahcs((ahcz)apei.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apei.a;
            }
            case 4: {
                return new ahcr((ahcz)apei.a);
            }
            case 3: {
                return new apei();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apei.a, "\u0001\u0002\u0000\u0001\uf4b7\u385e\ufd04\u3899\u0002\u0000\u0000\u0002\uf4b7\u385e\u1409\u0000\ufd04\u3899\u1409\u0001", new Object[] { "c", "d", "e" });
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
