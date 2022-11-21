import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahmm extends ahcz implements aheo
{
    public static final ahmm a;
    private static volatile ahev b;
    private int c;
    private anxb d;
    private anxb e;
    private byte f;
    
    static {
        ahcz.registerDefaultInstance(ahmm.class, a = new ahmm());
    }
    
    private ahmm() {
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
                if ((b = ahmm.b) == null) {
                    synchronized (ahmm.class) {
                        if (ahmm.b == null) {
                            ahmm.b = (ahev)new ahcs((ahcz)ahmm.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ahmm.a;
            }
            case 4: {
                return new ahcr((ahcz)ahmm.a);
            }
            case 3: {
                return new ahmm();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ahmm.a, "\u0001\u0002\u0000\u0001\u0004\u0005\u0002\u0000\u0000\u0002\u0004\u1409\u0003\u0005\u1409\u0004", new Object[] { "c", "d", "e" });
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
