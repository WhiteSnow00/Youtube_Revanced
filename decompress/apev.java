import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apev extends ahcz implements aheo
{
    public static final apev a;
    private static volatile ahev b;
    private int c;
    private anxb d;
    private anxb e;
    private byte f;
    
    static {
        ahcz.registerDefaultInstance(apev.class, a = new apev());
    }
    
    private apev() {
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
                if ((b = apev.b) == null) {
                    synchronized (apev.class) {
                        if (apev.b == null) {
                            apev.b = (ahev)new ahcs((ahcz)apev.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apev.a;
            }
            case 4: {
                return new ahcr((ahcz)apev.a);
            }
            case 3: {
                return new apev();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apev.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0001", new Object[] { "c", "d", "e" });
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
