import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoql extends ahcz implements aheo
{
    public static final aoql a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private ajws e;
    private anxb f;
    private aisc g;
    private aisc h;
    private ahjl i;
    private byte j;
    
    static {
        ahcz.registerDefaultInstance(aoql.class, a = new aoql());
    }
    
    private aoql() {
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
                if ((b = aoql.b) == null) {
                    synchronized (aoql.class) {
                        if (aoql.b == null) {
                            aoql.b = (ahev)new ahcs((ahcz)aoql.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aoql.a;
            }
            case 4: {
                return new ahcr((ahcz)aoql.a);
            }
            case 3: {
                return new aoql();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aoql.a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0006\u0001\u1409\u0000\u0002\u1409\u0001\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005\u0007\u1409\u0006", new Object[] { "c", "d", "e", "f", "g", "h", "i" });
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
