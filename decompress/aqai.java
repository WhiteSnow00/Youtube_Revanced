import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqai extends ahcu implements ahcv
{
    public static final aqai a;
    private static volatile ahev m;
    public int b;
    public ajws c;
    public aowb d;
    public aowb e;
    public akfj f;
    public aowb g;
    public aqah h;
    public ajws i;
    public aqad j;
    public String k;
    private aqae n;
    private ajws o;
    private aiet p;
    private aiet q;
    private ahjl r;
    private byte s;
    
    static {
        ahcz.registerDefaultInstance(aqai.class, (ahcz)(a = new aqai()));
    }
    
    private aqai() {
        this.s = 2;
        this.k = "";
        emptyProtobufList();
        final ahbt b = ahbt.b;
    }
    
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte s = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev m;
                if ((m = aqai.m) == null) {
                    synchronized (aqai.class) {
                        if (aqai.m == null) {
                            aqai.m = (ahev)new ahcs((ahcz)aqai.a);
                        }
                    }
                }
                return m;
            }
            case 5: {
                return aqai.a;
            }
            case 4: {
                return new ahct((ahcu)aqai.a);
            }
            case 3: {
                return new aqai();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqai.a, "\u0001\u000e\u0000\u0001\u0001\u0010\u000e\u0000\u0000\f\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0004\u0005\u1009\u0005\u0006\u1409\u0006\u0007\u1409\u0007\b\u1409\b\t\u1008\t\n\u1409\r\r\u1409\u000b\u000e\u1409\f\u000f\u1409\n\u0010\u1409\u0003", new Object[] { "b", "c", "d", "e", "g", "h", "i", "j", "n", "k", "r", "p", "q", "o", "f" });
            }
            case 1: {
                if (o == null) {
                    s = 0;
                }
                this.s = s;
                return null;
            }
            case 0: {
                return this.s;
            }
        }
    }
}
