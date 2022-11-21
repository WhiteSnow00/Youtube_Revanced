import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apsw extends ahcz implements aheo
{
    public static final apsw a;
    private static volatile ahev i;
    public int b;
    public ajws c;
    public ajws d;
    public anxb e;
    public anxb f;
    public int g;
    public ahbt h;
    private ahjl j;
    private byte k;
    
    static {
        ahcz.registerDefaultInstance(apsw.class, a = new apsw());
    }
    
    private apsw() {
        this.k = 2;
        this.h = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte k = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev i;
                if ((i = apsw.i) == null) {
                    synchronized (apsw.class) {
                        if (apsw.i == null) {
                            apsw.i = (ahev)new ahcs((ahcz)apsw.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return apsw.a;
            }
            case 4: {
                return new ahcr((ahcz)apsw.a);
            }
            case 3: {
                return new apsw();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apsw.a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0005\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0005\u0006\u100a\u0006\u0007\u100c\u0004", new Object[] { "b", "c", "d", "e", "f", "j", "h", "g", aprh.o });
            }
            case 1: {
                if (o == null) {
                    k = 0;
                }
                this.k = k;
                return null;
            }
            case 0: {
                return this.k;
            }
        }
    }
}
