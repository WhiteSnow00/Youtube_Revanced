import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajvm extends ahbh implements ahcw
{
    public static final ajvm a;
    private static volatile ahdd m;
    public int b;
    public ajut c;
    public String d;
    public ajut e;
    public String f;
    public ajut g;
    public aiqj h;
    public ajut i;
    public apjn j;
    public String k;
    public ahab l;
    private ahhu n;
    private byte o;
    
    static {
        ahbh.registerDefaultInstance((Class)ajvm.class, (ahbh)(a = new ajvm()));
    }
    
    private ajvm() {
        this.o = 2;
        this.d = "";
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
                if ((m = ajvm.m) == null) {
                    synchronized (ajvm.class) {
                        if (ajvm.m == null) {
                            ajvm.m = (ahdd)new ahba((ahbh)ajvm.a);
                        }
                    }
                }
                return m;
            }
            case 5: {
                return ajvm.a;
            }
            case 4: {
                return new ahaz((ahbh)ajvm.a);
            }
            case 3: {
                return new ajvm();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajvm.a, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0007\u0001\u1409\u0000\u0002\u1008\u0001\u0003\u1409\u0002\u0004\u1008\u0003\u0005\u1409\u0004\u0006\u1409\u0005\u0007\u1409\u0006\b\u1409\u0007\t\u1008\b\n\u1409\t\u000b\u100a\n", new Object[] { "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "n", "l" });
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
