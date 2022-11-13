import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akhe extends ahbh implements ahcw
{
    public static final akhe a;
    private static volatile ahdd k;
    public int b;
    public aklg c;
    public String d;
    public boolean e;
    public apvy f;
    public int g;
    public float h;
    public akhc i;
    public akhd j;
    private byte l;
    
    static {
        ahbh.registerDefaultInstance((Class)akhe.class, (ahbh)(a = new akhe()));
    }
    
    private akhe() {
        this.l = 2;
        final ahab b = ahab.b;
        this.d = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte l = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd k;
                if ((k = akhe.k) == null) {
                    synchronized (akhe.class) {
                        if (akhe.k == null) {
                            akhe.k = (ahdd)new ahba((ahbh)akhe.a);
                        }
                    }
                }
                return k;
            }
            case 5: {
                return akhe.a;
            }
            case 4: {
                return new ahaz((ahbh)akhe.a);
            }
            case 3: {
                return new akhe();
            }
            case 2: {
                return newMessageInfo((MessageLite)akhe.a, "\u0001\b\u0000\u0001\u0001\u0018\b\u0000\u0000\u0001\u0001\u1409\u0000\u0003\u1008\u0004\u0004\u1007\u0006\n\u1009\f\u000b\u100c\r\r\u1001\u000e\u0013\u1009\u0012\u0018\u1009\u0015", new Object[] { "b", "c", "d", "e", "f", "g", akeh.s, "h", "i", "j" });
            }
            case 1: {
                if (o == null) {
                    l = 0;
                }
                this.l = l;
                return null;
            }
            case 0: {
                return this.l;
            }
        }
    }
}
