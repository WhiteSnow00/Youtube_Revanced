import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aphi extends ahcz implements aheo
{
    public static final aphi a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private anxb e;
    private byte f;
    
    static {
        ahcz.registerDefaultInstance(aphi.class, a = new aphi());
    }
    
    private aphi() {
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
                if ((b = aphi.b) == null) {
                    synchronized (aphi.class) {
                        if (aphi.b == null) {
                            aphi.b = (ahev)new ahcs((ahcz)aphi.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aphi.a;
            }
            case 4: {
                return new ahcr((ahcz)aphi.a);
            }
            case 3: {
                return new aphi();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aphi.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0001", new Object[] { "c", "d", "e" });
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
