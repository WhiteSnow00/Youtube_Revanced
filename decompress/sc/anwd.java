import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anwd extends ahbh implements ahcw
{
    public static final anwd a;
    private static volatile ahdd k;
    public int b;
    public int c;
    public Object d;
    public String e;
    public String f;
    public int g;
    public int h;
    public aiqj i;
    public aiqj j;
    private byte l;
    
    static {
        ahbh.registerDefaultInstance((Class)anwd.class, (ahbh)(a = new anwd()));
    }
    
    private anwd() {
        this.c = 0;
        this.l = 2;
        this.e = "";
        this.f = "";
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
                if ((k = anwd.k) == null) {
                    synchronized (anwd.class) {
                        if (anwd.k == null) {
                            anwd.k = (ahdd)new ahba((ahbh)anwd.a);
                        }
                    }
                }
                return k;
            }
            case 5: {
                return anwd.a;
            }
            case 4: {
                return new ahaz((ahbh)anwd.a);
            }
            case 3: {
                return new anwd();
            }
            case 2: {
                return newMessageInfo((MessageLite)anwd.a, "\u0001\b\u0001\u0001\u0001\b\b\u0000\u0000\u0002\u0001\u103b\u0000\u0002\u1008\u0002\u0003\u1008\u0003\u0004\u100c\u0004\u0005\u1004\u0005\u0006\u1409\u0006\u0007\u1409\u0007\b\u103d\u0000", new Object[] { "d", "c", "b", "e", "f", "g", ansm.t, "h", "i", "j" });
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
