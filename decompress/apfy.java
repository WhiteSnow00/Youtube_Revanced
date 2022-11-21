import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apfy extends ahcz implements aheo
{
    public static final apfy a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private ajws e;
    private byte f;
    
    static {
        ahcz.registerDefaultInstance(apfy.class, a = new apfy());
    }
    
    private apfy() {
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
                if ((b = apfy.b) == null) {
                    synchronized (apfy.class) {
                        if (apfy.b == null) {
                            apfy.b = (ahev)new ahcs((ahcz)apfy.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apfy.a;
            }
            case 4: {
                return new ahcr((ahcz)apfy.a);
            }
            case 3: {
                return new apfy();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apfy.a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0003\u1409\u0002", new Object[] { "c", "d", "e" });
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
