import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class appw extends ahcz implements aheo
{
    public static final appw a;
    private static volatile ahev e;
    public int b;
    public aowb c;
    public ajws d;
    private aooy f;
    private aisc g;
    private ajws h;
    private ajws i;
    private appx j;
    private amif k;
    private anxb l;
    private anxb m;
    private ahjl n;
    private byte o;
    
    static {
        ahcz.registerDefaultInstance(appw.class, a = new appw());
    }
    
    private appw() {
        this.o = 2;
        emptyProtobufList();
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
                final ahev e;
                if ((e = appw.e) == null) {
                    synchronized (appw.class) {
                        if (appw.e == null) {
                            appw.e = (ahev)new ahcs((ahcz)appw.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return appw.a;
            }
            case 4: {
                return new ahcr((ahcz)appw.a);
            }
            case 3: {
                return new appw();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)appw.a, "\u0001\u000b\u0000\u0001\u0001\u0010\u000b\u0000\u0000\u000b\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0006\u0007\u1409\n\u000b\u1409\u0007\u000e\u1409\t\u000f\u1409\u0005\u0010\u1409\b", new Object[] { "b", "c", "d", "f", "g", "h", "j", "n", "k", "m", "i", "l" });
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
