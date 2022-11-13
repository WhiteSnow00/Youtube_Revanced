import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajaz extends ahbh implements ahcw
{
    public static final ajaz a;
    private static volatile ahdd p;
    public int b;
    public aotp c;
    public ajax d;
    public String e;
    public ajay f;
    public boolean g;
    public boolean h;
    public aiqj i;
    public aiqj j;
    public ahil k;
    public ahil l;
    public ajut m;
    public int n;
    public aiqj o;
    private ajut q;
    private byte r;
    
    static {
        ahbh.registerDefaultInstance((Class)ajaz.class, (ahbh)(a = new ajaz()));
    }
    
    private ajaz() {
        this.r = 2;
        this.e = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte r = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd p3;
                if ((p3 = ajaz.p) == null) {
                    synchronized (ajaz.class) {
                        if (ajaz.p == null) {
                            ajaz.p = (ahdd)new ahba((ahbh)ajaz.a);
                        }
                    }
                }
                return p3;
            }
            case 5: {
                return ajaz.a;
            }
            case 4: {
                return new ahaz((ahbh)ajaz.a);
            }
            case 3: {
                return new ajaz();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajaz.a, "\u0001\u000e\u0000\u0001\u0001\u0011\u000e\u0000\u0000\u0007\u0001\u1409\u0000\u0003\u1009\u0002\u0004\u1008\u0004\u0005\u1007\u0007\u0006\u1007\b\u0007\u1409\t\b\u1409\n\t\u1009\u000b\n\u1009\f\f\u1409\u0006\u000e\u1409\r\u000f\u1409\u000e\u0010\u100c\u000f\u0011\u1409\u0010", new Object[] { "b", "c", "d", "e", "g", "h", "i", "j", "k", "l", "f", "m", "q", "n", aill.r, "o" });
            }
            case 1: {
                if (o == null) {
                    r = 0;
                }
                this.r = r;
                return null;
            }
            case 0: {
                return this.r;
            }
        }
    }
}
