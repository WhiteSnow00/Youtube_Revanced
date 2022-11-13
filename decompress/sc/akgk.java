import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akgk extends ahbh implements ahcw
{
    public static final akgk a;
    private static volatile ahdd o;
    public int b;
    public akdi c;
    public akdi d;
    public aiqj e;
    public ajut f;
    public ajut g;
    public akgj h;
    public int i;
    public akgl j;
    public int k;
    public ahbx l;
    public ahab m;
    public int n;
    private ajut p;
    private ahhu q;
    private byte r;
    
    static {
        ahbh.registerDefaultInstance((Class)akgk.class, (ahbh)(a = new akgk()));
    }
    
    private akgk() {
        this.r = 2;
        this.l = emptyProtobufList();
        this.m = ahab.b;
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
                final ahdd o3;
                if ((o3 = akgk.o) == null) {
                    synchronized (akgk.class) {
                        if (akgk.o == null) {
                            akgk.o = (ahdd)new ahba((ahbh)akgk.a);
                        }
                    }
                }
                return o3;
            }
            case 5: {
                return akgk.a;
            }
            case 4: {
                return new ahaz((ahbh)akgk.a);
            }
            case 3: {
                return new akgk();
            }
            case 2: {
                return newMessageInfo((MessageLite)akgk.a, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0001\n\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0004\u0005\u1409\u0005\u0006\u1409\u0006\u0007\u1409\b\b\u1409\n\t\u100a\u000b\n\u100c\t\u000b\u1409\u0003\f\u100c\u0007\r\u041b\u000e\u100c\f", new Object[] { "b", "c", "d", "e", "f", "g", "h", "j", "q", "m", "k", aola.q, "p", "i", aola.p, "l", aiqj.class, "n", aola.g });
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
