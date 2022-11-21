import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apgs extends ahcz implements aheo
{
    public static final apgs a;
    private static volatile ahev b;
    private int c;
    private aisc d;
    private ajws e;
    private ajws f;
    private ajws g;
    private ajws h;
    private ahjl i;
    private byte j;
    
    static {
        ahcz.registerDefaultInstance(apgs.class, a = new apgs());
    }
    
    private apgs() {
        this.j = 2;
        emptyProtobufList();
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
                if ((b = apgs.b) == null) {
                    synchronized (apgs.class) {
                        if (apgs.b == null) {
                            apgs.b = (ahev)new ahcs((ahcz)apgs.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apgs.a;
            }
            case 4: {
                return new ahcr((ahcz)apgs.a);
            }
            case 3: {
                return new apgs();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apgs.a, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0000\u0006\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0007\u1409\u0006\b\u1409\u0004", new Object[] { "c", "d", "e", "f", "g", "i", "h" });
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
