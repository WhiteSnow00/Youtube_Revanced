import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ampg extends ahcz implements aheo
{
    public static final ampg a;
    private static volatile ahev b;
    private int c;
    private ahjl d;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(ampg.class, a = new ampg());
    }
    
    private ampg() {
        this.e = 2;
        final ahbt b = ahbt.b;
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
                if ((b = ampg.b) == null) {
                    synchronized (ampg.class) {
                        if (ampg.b == null) {
                            ampg.b = (ahev)new ahcs((ahcz)ampg.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ampg.a;
            }
            case 4: {
                return new ahcr((ahcz)ampg.a);
            }
            case 3: {
                return new ampg();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ampg.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "c", "d" });
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
