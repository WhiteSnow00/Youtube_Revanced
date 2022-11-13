import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqmt extends ahbh implements ahcw
{
    public static final aqmt a;
    private static volatile ahdd f;
    public int b;
    public ahbx c;
    public aqng d;
    public aqmv e;
    
    static {
        ahbh.registerDefaultInstance((Class)aqmt.class, (ahbh)(a = new aqmt()));
    }
    
    private aqmt() {
        this.c = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = aqmt.f) == null) {
                    synchronized (aqmt.class) {
                        if (aqmt.f == null) {
                            aqmt.f = (ahdd)new ahba((ahbh)aqmt.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aqmt.a;
            }
            case 4: {
                return new ahaz((ahbh)aqmt.a);
            }
            case 3: {
                return new aqmt();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqmt.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001\u001b\u0002\u1009\u0000\u0004\u1009\u0001", new Object[] { "b", "c", aqmu.class, "d", "e" });
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
