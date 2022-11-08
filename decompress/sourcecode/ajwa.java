import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajwa extends agzi implements ahax
{
    public static final ajwa a;
    private static volatile ahbe p;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public String g;
    public int h;
    public int i;
    public ajsq j;
    public int k;
    public int l;
    public ajsq m;
    public int n;
    public ajsq o;
    private byte q;
    
    static {
        agzi.registerDefaultInstance(ajwa.class, a = new ajwa());
    }
    
    private ajwa() {
        this.q = 2;
        this.g = "";
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe p3;
                if ((p3 = ajwa.p) == null) {
                    synchronized (ajwa.class) {
                        if (ajwa.p == null) {
                            ajwa.p = (ahbe)new agzb((agzi)ajwa.a);
                        }
                    }
                }
                return p3;
            }
            case 5: {
                return ajwa.a;
            }
            case 4: {
                return new agza((agzi)ajwa.a);
            }
            case 3: {
                return new ajwa();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajwa.a, "\u0001\r\u0000\u0001\u0006\u0012\r\u0000\u0000\u0003\u0006\u1004\u0000\u0007\u1004\u0001\b\u1004\u0002\t\u1004\u0003\n\u1004\b\u000b\u1004\t\f\u1004\u000b\r\u1409\u0007\u000e\u1409\n\u000f\u1409\f\u0010\u1004\u0005\u0011\u1004\u0006\u0012\u1008\u0004", new Object[] { "b", "c", "d", "e", "f", "k", "l", "n", "j", "m", "o", "h", "i", "g" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.q = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.q;
            }
        }
    }
}
