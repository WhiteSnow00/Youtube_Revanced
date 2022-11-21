import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alwo extends ahcz implements aheo
{
    public static final alwo a;
    private static volatile ahev i;
    public int b;
    public long c;
    public ajws d;
    public ajws e;
    public aowb f;
    public ahdp g;
    public alwn h;
    private boolean j;
    private anxb k;
    private alwp l;
    private byte m;
    
    static {
        ahcz.registerDefaultInstance(alwo.class, a = new alwo());
    }
    
    private alwo() {
        this.m = 2;
        this.g = ahcz.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte m = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev i;
                if ((i = alwo.i) == null) {
                    synchronized (alwo.class) {
                        if (alwo.i == null) {
                            alwo.i = (ahev)new ahcs((ahcz)alwo.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return alwo.a;
            }
            case 4: {
                return new ahcr((byte[][][])null, (boolean[])null);
            }
            case 3: {
                return new alwo();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alwo.a, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0001\u0007\u0001\u1002\u0000\u0002\u1007\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u041b\u0007\u1409\u0006\t\u1409\u0005\n\u1409\b", new Object[] { "b", "c", "j", "d", "e", "f", "g", aiet.class, "l", "k", "h" });
            }
            case 1: {
                if (o == null) {
                    m = 0;
                }
                this.m = m;
                return null;
            }
            case 0: {
                return this.m;
            }
        }
    }
}
