import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atxc extends ahbh implements ahcw
{
    public static final atxc a;
    private static volatile ahdd l;
    public int b;
    public int c;
    public long d;
    public String e;
    public String f;
    public atxm g;
    public int h;
    public long i;
    public atxl j;
    public long k;
    private byte m;
    
    static {
        ahbh.registerDefaultInstance((Class)atxc.class, (ahbh)(a = new atxc()));
    }
    
    private atxc() {
        this.m = 2;
        this.e = "";
        this.f = "";
        emptyProtobufList();
        emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte m = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd l;
                if ((l = atxc.l) == null) {
                    synchronized (atxc.class) {
                        if (atxc.l == null) {
                            atxc.l = (ahdd)new ahba((ahbh)atxc.a);
                        }
                    }
                }
                return l;
            }
            case 5: {
                return atxc.a;
            }
            case 4: {
                return new ahaz((ahbh)atxc.a);
            }
            case 3: {
                return new atxc();
            }
            case 2: {
                return newMessageInfo((MessageLite)atxc.a, "\u0001\t\u0000\u0001\u0001\u000b\t\u0000\u0000\u0001\u0001\u100c\u0000\u0002\u100c\u0005\u0003\u1002\u0006\u0006\u1009\u0007\u0007\u1002\b\b\u1005\u0001\t\u1008\u0002\n\u1008\u0003\u000b\u1409\u0004", new Object[] { "b", "c", atxb.a(), "h", atxb.a(), "i", "j", "k", "d", "e", "f", "g" });
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
