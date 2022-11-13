import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoyt extends ahbh implements ahcw
{
    private static final aoyt a;
    private static volatile ahdd b;
    private String c;
    private String d;
    
    static {
        ahbh.registerDefaultInstance((Class)aoyt.class, (ahbh)(a = new aoyt()));
    }
    
    private aoyt() {
        this.c = "";
        this.d = "";
    }
    
    public static aoyt a() {
        return aoyt.a;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aoyt.b) == null) {
                    synchronized (aoyt.class) {
                        if (aoyt.b == null) {
                            aoyt.b = (ahdd)new ahba((ahbh)aoyt.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aoyt.a;
            }
            case 4: {
                return new ahaz((ahbh)a());
            }
            case 3: {
                return new aoyt();
            }
            case 2: {
                return newMessageInfo((MessageLite)aoyt.a, "\u0001\u0000", (Object[])null);
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
