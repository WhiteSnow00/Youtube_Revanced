import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atyu extends ahbh implements ahcw
{
    public static final atyu a;
    private static volatile ahdd o;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public ahbx j;
    public int k;
    public int l;
    public int m;
    public atyx n;
    
    static {
        ahbh.registerDefaultInstance((Class)atyu.class, (ahbh)(a = new atyu()));
    }
    
    private atyu() {
        this.j = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd o3;
                if ((o3 = atyu.o) == null) {
                    synchronized (atyu.class) {
                        if (atyu.o == null) {
                            atyu.o = (ahdd)new ahba((ahbh)atyu.a);
                        }
                    }
                }
                return o3;
            }
            case 5: {
                return atyu.a;
            }
            case 4: {
                return new ahaz((float[])null, (int[])null);
            }
            case 3: {
                return new atyu();
            }
            case 2: {
                return newMessageInfo((MessageLite)atyu.a, "\u0001\f\u0000\u0001\u0001\r\f\u0000\u0001\u0000\u0001\u1004\u0000\u0002\u1004\u0001\u0003\u1004\u0003\u0004\u1004\u0006\u0005\u001b\u0006\u1004\b\u0007\u1004\u0002\b\u1004\u0004\t\u1004\u0005\u000b\u1004\t\f\u1004\n\r\u1009\u000b", new Object[] { "b", "c", "d", "f", "i", "j", atyt.class, "k", "e", "g", "h", "l", "m", "n" });
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
