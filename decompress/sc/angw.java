import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class angw extends ahbh implements ahcw
{
    public static final angw a;
    private static volatile ahdd g;
    public ahbx b;
    public anuv c;
    public ahbx d;
    public String e;
    public ahab f;
    private int h;
    private ahhu i;
    private byte j;
    
    static {
        ahbh.registerDefaultInstance((Class)angw.class, (ahbh)(a = new angw()));
    }
    
    private angw() {
        this.j = 2;
        this.b = emptyProtobufList();
        this.d = emptyProtobufList();
        this.e = "";
        this.f = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte j = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd g;
                if ((g = angw.g) == null) {
                    synchronized (angw.class) {
                        if (angw.g == null) {
                            angw.g = (ahdd)new ahba((ahbh)angw.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return angw.a;
            }
            case 4: {
                return new ahaz((ahbh)angw.a);
            }
            case 3: {
                return new angw();
            }
            case 2: {
                return newMessageInfo((MessageLite)angw.a, "\u0001\u0006\u0000\u0001\u0002\b\u0006\u0000\u0002\u0003\u0002\u001b\u0004\u1409\u0000\u0005\u100a\u0002\u0006\u1409\u0003\u0007\u1008\u0001\b\u041b", new Object[] { "h", "b", apmm.class, "c", "f", "i", "e", "d", anuv.class });
            }
            case 1: {
                if (o == null) {
                    j = 0;
                }
                this.j = j;
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}
