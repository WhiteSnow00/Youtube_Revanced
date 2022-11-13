import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqmg extends ahbh implements ahcw
{
    private static final aqmg a;
    private static volatile ahdd b;
    private String c;
    private ahab d;
    
    static {
        ahbh.registerDefaultInstance((Class)aqmg.class, (ahbh)(a = new aqmg()));
    }
    
    private aqmg() {
        this.c = "";
        this.d = ahab.b;
    }
    
    public static aqmg a() {
        return aqmg.a;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aqmg.b) == null) {
                    synchronized (aqmg.class) {
                        if (aqmg.b == null) {
                            aqmg.b = (ahdd)new ahba((ahbh)aqmg.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqmg.a;
            }
            case 4: {
                return new ahaz((ahbh)a());
            }
            case 3: {
                return new aqmg();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqmg.a, "\u0001\u0000", (Object[])null);
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
