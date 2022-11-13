import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anvt extends ahbh implements ahcw
{
    public static final anvt a;
    private static volatile ahdd o;
    public int b;
    public ahbx c;
    public ahbx d;
    public ahbx e;
    public int f;
    public int g;
    public boolean h;
    public boolean i;
    public boolean j;
    public int k;
    public boolean l;
    public boolean m;
    public boolean n;
    
    static {
        ahbh.registerDefaultInstance((Class)anvt.class, (ahbh)(a = new anvt()));
    }
    
    private anvt() {
        this.c = ahbh.emptyProtobufList();
        this.d = ahbh.emptyProtobufList();
        this.e = ahbh.emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd o3;
                if ((o3 = anvt.o) == null) {
                    synchronized (anvt.class) {
                        if (anvt.o == null) {
                            anvt.o = (ahdd)new ahba((ahbh)anvt.a);
                        }
                    }
                }
                return o3;
            }
            case 5: {
                return anvt.a;
            }
            case 4: {
                return new ahaz((ahbh)anvt.a);
            }
            case 3: {
                return new anvt();
            }
            case 2: {
                return newMessageInfo((MessageLite)anvt.a, "\u0001\f\u0000\u0001\u0001\u0013\f\u0000\u0003\u0000\u0001\u001a\u0002\u1004\u0000\u0003\u1004\u0001\u0004\u1007\u0003\u0006\u1007\u0006\u0007\u1007\u0007\u000b\u1007\r\r\u1004\t\u000f\u001a\u0011\u1007\n\u0012\u1007\u000f\u0013\u001a", new Object[] { "b", "c", "f", "g", "h", "i", "j", "m", "k", "d", "l", "n", "e" });
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
