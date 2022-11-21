import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aicr extends ahcz implements aheo
{
    public static final aicr a;
    private static volatile ahev b;
    private int c;
    private aicq d;
    private ajws e;
    private ahjl f;
    private byte g;
    
    static {
        ahcz.registerDefaultInstance(aicr.class, a = new aicr());
    }
    
    private aicr() {
        this.g = 2;
        final ahbt b = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = aicr.b) == null) {
                    synchronized (aicr.class) {
                        if (aicr.b == null) {
                            aicr.b = (ahev)new ahcs((ahcz)aicr.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aicr.a;
            }
            case 4: {
                return new ahcr((ahcz)aicr.a);
            }
            case 3: {
                return new aicr();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aicr.a, "\u0001\u0003\u0000\u0001\u0003\u0005\u0003\u0000\u0000\u0003\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004", new Object[] { "c", "d", "e", "f" });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
