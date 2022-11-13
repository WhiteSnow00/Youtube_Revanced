import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqmu extends ahbh implements ahcw
{
    public static final aqmu a;
    private static volatile ahdd f;
    public int b;
    public String c;
    public String d;
    public ahbx e;
    
    static {
        ahbh.registerDefaultInstance((Class)aqmu.class, (ahbh)(a = new aqmu()));
    }
    
    private aqmu() {
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
                if ((f = aqmu.f) == null) {
                    synchronized (aqmu.class) {
                        if (aqmu.f == null) {
                            aqmu.f = (ahdd)new ahba((ahbh)aqmu.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aqmu.a;
            }
            case 4: {
                return new ahaz((ahbh)aqmu.a);
            }
            case 3: {
                return new aqmu();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqmu.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u001b", new Object[] { "b", "c", "d", "e", aqmw.class });
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
