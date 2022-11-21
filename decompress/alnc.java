import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alnc extends ahcz implements aheo
{
    public static final alnc a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private ajws e;
    private ajws f;
    private ahjl g;
    private byte h;
    
    static {
        ahcz.registerDefaultInstance(alnc.class, a = new alnc());
    }
    
    private alnc() {
        this.h = 2;
        final ahbt b = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte h = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = alnc.b) == null) {
                    synchronized (alnc.class) {
                        if (alnc.b == null) {
                            alnc.b = (ahev)new ahcs((ahcz)alnc.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return alnc.a;
            }
            case 4: {
                return new ahcr((ahcz)alnc.a);
            }
            case 3: {
                return new alnc();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alnc.a, "\u0001\u0004\u0000\u0001\u0001\u0007\u0004\u0000\u0000\u0004\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0003\u0007\u1409\u0007", new Object[] { "c", "d", "e", "f", "g" });
            }
            case 1: {
                if (o == null) {
                    h = 0;
                }
                this.h = h;
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
