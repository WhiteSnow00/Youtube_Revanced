import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alnv extends ahcz implements aheo
{
    public static final alnv a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private ajws e;
    private aisc f;
    private ahjl g;
    private byte h;
    
    static {
        ahcz.registerDefaultInstance(alnv.class, a = new alnv());
    }
    
    private alnv() {
        this.h = 2;
        emptyProtobufList();
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
                if ((b = alnv.b) == null) {
                    synchronized (alnv.class) {
                        if (alnv.b == null) {
                            alnv.b = (ahev)new ahcs((ahcz)alnv.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return alnv.a;
            }
            case 4: {
                return new ahcr((ahcz)alnv.a);
            }
            case 3: {
                return new alnv();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alnv.a, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0004\u0001\u1409\u0000\u0002\u1409\u0001\u0004\u1409\u0002\u0006\u1409\u0004", new Object[] { "c", "d", "e", "f", "g" });
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
