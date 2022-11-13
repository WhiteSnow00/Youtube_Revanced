import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arbg extends ahbh implements ahcw
{
    public static final arbg a;
    private static volatile ahdd k;
    public int b;
    public String c;
    public ahbx d;
    public String e;
    public String f;
    public float g;
    public ahbx h;
    public float i;
    public String j;
    private byte l;
    
    static {
        ahbh.registerDefaultInstance((Class)arbg.class, (ahbh)(a = new arbg()));
    }
    
    private arbg() {
        this.l = 2;
        this.c = "";
        this.d = emptyProtobufList();
        this.e = "";
        this.f = "";
        this.h = emptyProtobufList();
        this.j = "";
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
                if ((k = arbg.k) == null) {
                    synchronized (arbg.class) {
                        if (arbg.k == null) {
                            arbg.k = (ahdd)new ahba((ahbh)arbg.a);
                        }
                    }
                }
                return k;
            }
            case 5: {
                return arbg.a;
            }
            case 4: {
                return new ahaz((float[][])null, (char[][])null);
            }
            case 3: {
                return new arbg();
            }
            case 2: {
                return newMessageInfo((MessageLite)arbg.a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0002\u0001\u0001\u1008\u0000\u0002\u041b\u0003\u1008\u0001\u0004\u1008\u0002\u0005\u1001\u0003\u0006\u001b\u0007\u1001\u0004\b\u1008\u0005", new Object[] { "b", "c", "d", arbc.class, "e", "f", "g", "h", arbo.class, "i", "j" });
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
