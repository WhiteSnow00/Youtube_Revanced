import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atxg extends ahbh implements ahcw
{
    public static final atxg a;
    private static volatile ahdd f;
    public int b;
    public ahbx c;
    public ahbx d;
    public atxf e;
    
    static {
        ahbh.registerDefaultInstance((Class)atxg.class, (ahbh)(a = new atxg()));
    }
    
    private atxg() {
        this.c = emptyProtobufList();
        this.d = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = atxg.f) == null) {
                    synchronized (atxg.class) {
                        if (atxg.f == null) {
                            atxg.f = (ahdd)new ahba((ahbh)atxg.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return atxg.a;
            }
            case 4: {
                return new ahaz((float[])null, (boolean[][])null);
            }
            case 3: {
                return new atxg();
            }
            case 2: {
                return newMessageInfo((MessageLite)atxg.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003\u1009\u0000", new Object[] { "b", "c", atxj.class, "d", atxe.class, "e" });
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
