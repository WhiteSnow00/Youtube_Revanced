import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agrr extends ahbh implements ahcw
{
    public static final agrr a;
    private static volatile ahdd e;
    public int b;
    public ahbx c;
    public agrs d;
    private byte f;
    
    static {
        ahbh.registerDefaultInstance((Class)agrr.class, (ahbh)(a = new agrr()));
    }
    
    private agrr() {
        this.f = 2;
        this.c = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte f = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = agrr.e) == null) {
                    synchronized (agrr.class) {
                        if (agrr.e == null) {
                            agrr.e = (ahdd)new ahba((ahbh)agrr.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return agrr.a;
            }
            case 4: {
                return new ahaz((ahbh)agrr.a);
            }
            case 3: {
                return new agrr();
            }
            case 2: {
                return newMessageInfo((MessageLite)agrr.a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0001\u0002\u0002\u041b\u0003\u1409\u0001", new Object[] { "b", "c", agrq.class, "d" });
            }
            case 1: {
                if (o == null) {
                    f = 0;
                }
                this.f = f;
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
