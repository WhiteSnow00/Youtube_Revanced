import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class apsz extends ahcz implements aheo
{
    public static final apsz a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private aisc e;
    private aptp f;
    private aptz g;
    private ajws h;
    private ahjl i;
    private byte j;
    
    static {
        ahcz.registerDefaultInstance(apsz.class, a = new apsz());
    }
    
    private apsz() {
        this.j = 2;
        emptyProtobufList();
        emptyProtobufList();
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
                if ((b = apsz.b) == null) {
                    synchronized (apsz.class) {
                        if (apsz.b == null) {
                            apsz.b = (ahev)new ahcs((ahcz)apsz.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apsz.a;
            }
            case 4: {
                return new ahcr((ahcz)apsz.a);
            }
            case 3: {
                return new apsz();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apsz.a, "\u0001\u0006\u0000\u0001\u0001\n\u0006\u0000\u0000\u0006\u0001\u1409\u0000\u0002\u1409\u0001\u0005\u1409\u0002\u0006\u1409\u0003\t\u1409\u0005\n\u1409\u0006", new Object[] { "c", "d", "e", "f", "g", "h", "i" });
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
