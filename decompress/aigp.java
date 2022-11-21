import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aigp extends ahcz implements aheo
{
    public static final aigp a;
    private static volatile ahev b;
    private int c;
    private anxb d;
    private anxb e;
    private anxb f;
    private anxb g;
    private anxb h;
    private ahjl i;
    private byte j;
    
    static {
        ahcz.registerDefaultInstance(aigp.class, a = new aigp());
    }
    
    private aigp() {
        this.j = 2;
        final ahbt b = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte j = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = aigp.b) == null) {
                    synchronized (aigp.class) {
                        if (aigp.b == null) {
                            aigp.b = (ahev)new ahcs((ahcz)aigp.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aigp.a;
            }
            case 4: {
                return new ahcr((ahcz)aigp.a);
            }
            case 3: {
                return new aigp();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aigp.a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0006\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0007\u1409\u0006", new Object[] { "c", "d", "e", "f", "g", "h", "i" });
            }
            case 1: {
                if (o == null) {
                    j = 0;
                }
                this.j = j;
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}
