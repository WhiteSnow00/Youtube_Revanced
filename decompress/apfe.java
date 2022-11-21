import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apfe extends ahcz implements aheo
{
    public static final apfe a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(apfe.class, a = new apfe());
    }
    
    private apfe() {
        this.e = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte e = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = apfe.b) == null) {
                    synchronized (apfe.class) {
                        if (apfe.b == null) {
                            apfe.b = (ahev)new ahcs((ahcz)apfe.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apfe.a;
            }
            case 4: {
                return new ahcr((ahcz)apfe.a);
            }
            case 3: {
                return new apfe();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apfe.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002\u1409\u0001", new Object[] { "c", "d" });
            }
            case 1: {
                if (o == null) {
                    e = 0;
                }
                this.e = e;
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
