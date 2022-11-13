import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apnk extends ahbh implements ahcw
{
    public static final apnk a;
    private static volatile ahdd e;
    public int b;
    public aotp c;
    public ajut d;
    private aomo f;
    private aiqj g;
    private ajut h;
    private ajut i;
    private apnl j;
    private amgd k;
    private anuv l;
    private anuv m;
    private ahhu n;
    private byte o;
    
    static {
        ahbh.registerDefaultInstance((Class)apnk.class, (ahbh)(a = new apnk()));
    }
    
    private apnk() {
        this.o = 2;
        emptyProtobufList();
        final ahab b = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte o3 = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = apnk.e) == null) {
                    synchronized (apnk.class) {
                        if (apnk.e == null) {
                            apnk.e = (ahdd)new ahba((ahbh)apnk.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return apnk.a;
            }
            case 4: {
                return new ahaz((ahbh)apnk.a);
            }
            case 3: {
                return new apnk();
            }
            case 2: {
                return newMessageInfo((MessageLite)apnk.a, "\u0001\u000b\u0000\u0001\u0001\u0010\u000b\u0000\u0000\u000b\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0006\u0007\u1409\n\u000b\u1409\u0007\u000e\u1409\t\u000f\u1409\u0005\u0010\u1409\b", new Object[] { "b", "c", "d", "f", "g", "h", "j", "n", "k", "m", "i", "l" });
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
