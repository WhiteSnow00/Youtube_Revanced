import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akqo extends ahcz implements aheo
{
    public static final akqo a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(akqo.class, a = new akqo());
    }
    
    private akqo() {
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
                if ((b = akqo.b) == null) {
                    synchronized (akqo.class) {
                        if (akqo.b == null) {
                            akqo.b = (ahev)new ahcs((ahcz)akqo.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return akqo.a;
            }
            case 4: {
                return new ahcr((ahcz)akqo.a);
            }
            case 3: {
                return new akqo();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akqo.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "c", "d" });
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
