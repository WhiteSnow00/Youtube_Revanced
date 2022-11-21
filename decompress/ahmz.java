import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahmz extends ahcz implements aheo
{
    public static final ahmz a;
    private static volatile ahev j;
    public int b;
    public ajws c;
    public ajws d;
    public ajws e;
    public aisc f;
    public ahdp g;
    public ajws h;
    public aisc i;
    private ajws k;
    private anxb l;
    private anxb m;
    private ahjl n;
    private byte o;
    
    static {
        ahcz.registerDefaultInstance(ahmz.class, a = new ahmz());
    }
    
    private ahmz() {
        this.o = 2;
        this.g = ahcz.emptyProtobufList();
        final ahbt b = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte o3 = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev j;
                if ((j = ahmz.j) == null) {
                    synchronized (ahmz.class) {
                        if (ahmz.j == null) {
                            ahmz.j = (ahev)new ahcs((ahcz)ahmz.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return ahmz.a;
            }
            case 4: {
                return new ahcr((ahcz)ahmz.a);
            }
            case 3: {
                return new ahmz();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ahmz.a, "\u0001\u000b\u0000\u0001\u0001\r\u000b\u0000\u0001\u000b\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u041b\u0005\u1409\u0005\u0007\u1409\u0003\b\u1409\u0006\n\u1409\b\u000b\u1409\t\f\u1409\u0007\r\u1409\u0004", new Object[] { "b", "c", "d", "e", "g", ahmy.class, "h", "f", "i", "m", "n", "l", "k" });
            }
            case 1: {
                if (o == null) {
                    o3 = 0;
                }
                this.o = o3;
                return null;
            }
            case 0: {
                return this.o;
            }
        }
    }
}
