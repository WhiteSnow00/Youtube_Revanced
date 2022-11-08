import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atxx extends agzi implements ahax
{
    public static final atxx a;
    private static volatile ahbe o;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public agzy j;
    public int k;
    public int l;
    public int m;
    public atya n;
    
    static {
        agzi.registerDefaultInstance(atxx.class, a = new atxx());
    }
    
    private atxx() {
        this.j = agzi.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe o3;
                if ((o3 = atxx.o) == null) {
                    synchronized (atxx.class) {
                        if (atxx.o == null) {
                            atxx.o = (ahbe)new agzb((agzi)atxx.a);
                        }
                    }
                }
                return o3;
            }
            case 5: {
                return atxx.a;
            }
            case 4: {
                return new agza((boolean[][][])null, (float[])null);
            }
            case 3: {
                return new atxx();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)atxx.a, "\u0001\f\u0000\u0001\u0001\r\f\u0000\u0001\u0000\u0001\u1004\u0000\u0002\u1004\u0001\u0003\u1004\u0003\u0004\u1004\u0006\u0005\u001b\u0006\u1004\b\u0007\u1004\u0002\b\u1004\u0004\t\u1004\u0005\u000b\u1004\t\f\u1004\n\r\u1009\u000b", new Object[] { "b", "c", "d", "f", "i", "j", atxw.class, "k", "e", "g", "h", "l", "m", "n" });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
