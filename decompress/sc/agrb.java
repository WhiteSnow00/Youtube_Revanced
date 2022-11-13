import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agrb extends ahbh implements ahcw
{
    public static final agrb a;
    private static volatile ahdd f;
    public int b;
    public String c;
    public String d;
    public ahbx e;
    
    static {
        ahbh.registerDefaultInstance((Class)agrb.class, (ahbh)(a = new agrb()));
    }
    
    private agrb() {
        this.c = "";
        this.d = "";
        this.e = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = agrb.f) == null) {
                    synchronized (agrb.class) {
                        if (agrb.f == null) {
                            agrb.f = (ahdd)new ahba((ahbh)agrb.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return agrb.a;
            }
            case 4: {
                return new ahaz((ahbh)agrb.a);
            }
            case 3: {
                return new agrb();
            }
            case 2: {
                return newMessageInfo((MessageLite)agrb.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u001b", new Object[] { "b", "c", "d", "e", agqz.class });
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
