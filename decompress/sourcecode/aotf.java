import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aotf extends agzi implements ahax
{
    public static final aotf a;
    private static volatile ahbe p;
    public int b;
    public anmc c;
    public String d;
    public ajsq e;
    public ajsq f;
    public anss g;
    public anss h;
    public float i;
    public aotd j;
    public aote k;
    public aotb l;
    public long m;
    public agyc n;
    public aioe o;
    private ahfw q;
    private byte r;
    
    static {
        agzi.registerDefaultInstance(aotf.class, a = new aotf());
    }
    
    private aotf() {
        this.r = 2;
        this.d = "";
        this.n = agyc.b;
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
                if ((p3 = aotf.p) == null) {
                    synchronized (aotf.class) {
                        if (aotf.p == null) {
                            aotf.p = (ahbe)new agzb((agzi)aotf.a);
                        }
                    }
                }
                return p3;
            }
            case 5: {
                return aotf.a;
            }
            case 4: {
                return new agza((agzi)aotf.a);
            }
            case 3: {
                return new aotf();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aotf.a, "\u0001\u000e\u0000\u0001\u0001\u000f\u000e\u0000\u0000\u0007\u0001\u1409\u0000\u0002\u1008\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005\u0007\u1001\u0006\b\u1009\u0007\t\u1009\b\n\u1009\t\u000b\u1002\n\f\u100a\f\r\u1409\r\u000f\u1409\u000e", new Object[] { "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "q", "o" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.r = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.r;
            }
        }
    }
}
