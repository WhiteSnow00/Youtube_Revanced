import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akdc extends ahbh implements ahcw
{
    public static final akdc a;
    private static volatile ahdd m;
    public int b;
    public String c;
    public aiqj d;
    public akdi e;
    public String f;
    public boolean g;
    public int h;
    public aiqj i;
    public ahik j;
    public String k;
    public ahab l;
    private ahhu n;
    private byte o;
    
    static {
        ahbh.registerDefaultInstance((Class)akdc.class, (ahbh)(a = new akdc()));
    }
    
    private akdc() {
        this.o = 2;
        this.c = "";
        this.f = "";
        this.k = "";
        this.l = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte o3 = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd m;
                if ((m = akdc.m) == null) {
                    synchronized (akdc.class) {
                        if (akdc.m == null) {
                            akdc.m = (ahdd)new ahba((ahbh)akdc.a);
                        }
                    }
                }
                return m;
            }
            case 5: {
                return akdc.a;
            }
            case 4: {
                return new ahaz((ahbh)akdc.a);
            }
            case 3: {
                return new akdc();
            }
            case 2: {
                return newMessageInfo((MessageLite)akdc.a, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0004\u0001\u1008\u0000\u0002\u1409\u0002\u0003\u100c\u0005\u0004\u1409\u0006\u0005\u1409\t\u0006\u100a\n\u0007\u1008\u0003\b\u1007\u0004\t\u1008\b\n\u1009\u0007\u000b\u1409\u0001", new Object[] { "b", "c", "e", "h", ajym.t, "i", "n", "l", "f", "g", "k", "j", "d" });
            }
            case 1: {
                if (o == null) {
                    o3 = 0;
                }
                this.o = o3;
                return null;
            }
            case 0: {
                return this.o;
            }
        }
    }
}
