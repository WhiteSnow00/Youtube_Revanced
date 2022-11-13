import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqee extends ahbc implements ahbd
{
    public static final aqee a;
    private static volatile ahdd r;
    public int b;
    public int c;
    public Object d;
    public int e;
    public int f;
    public String g;
    public float h;
    public aqed i;
    public int j;
    public int k;
    public boolean m;
    public aqef n;
    public float o;
    public int p;
    public int q;
    private byte s;
    
    static {
        ahbh.registerDefaultInstance((Class)aqee.class, (ahbh)(a = new aqee()));
    }
    
    private aqee() {
        this.c = 0;
        this.s = 2;
        this.g = "";
    }
    
    public static void a(final aqee aqee) {
        aqee.b |= 0x800;
        aqee.m = true;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte s = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd r;
                if ((r = aqee.r) == null) {
                    synchronized (aqee.class) {
                        if (aqee.r == null) {
                            aqee.r = (ahdd)new ahba((ahbh)aqee.a);
                        }
                    }
                }
                return r;
            }
            case 5: {
                return aqee.a;
            }
            case 4: {
                return new ahbb((ahbc)aqee.a);
            }
            case 3: {
                return new aqee();
            }
            case 2: {
                final ahbn g = aqcl.g;
                return newMessageInfo((MessageLite)aqee.a, "\u0001\u000e\u0001\u0001\u0001\u0012\u000e\u0000\u0000\u0001\u0001\u100b\u0000\u0002\u100b\u0001\u0004\u1001\u0004\u0005\u100b\u0007\u0006\u100c\b\u0007\u103e\u0000\b\u103f\u0000\t\u1007\u000b\n\u1409\f\u000b\u1001\r\f\u100c\u000e\r\u100c\u000f\u000e\u1008\u0003\u0012\u1009\u0006", new Object[] { "d", "c", "b", "e", "f", "h", "j", "k", g, aqcl.e, "m", "n", "o", "p", g, "q", aqcl.d, "g", "i" });
            }
            case 1: {
                if (o == null) {
                    s = 0;
                }
                this.s = s;
                return null;
            }
            case 0: {
                return this.s;
            }
        }
    }
}
