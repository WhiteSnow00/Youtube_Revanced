import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajuz extends ahbh implements ahcw
{
    public static final ajuz a;
    private static volatile ahdd v;
    public int b;
    public aotp c;
    public ajut d;
    public ajut e;
    public ajut f;
    public ajut g;
    public ajut h;
    public ajut i;
    public ajut j;
    public boolean k;
    public boolean l;
    public aotp m;
    public ahbx n;
    public anuv o;
    public anuv p;
    public ahab q;
    public String r;
    public ajut s;
    public ajut t;
    public int u;
    private ahhu w;
    private byte x;
    
    static {
        ahbh.registerDefaultInstance((Class)ajuz.class, (ahbh)(a = new ajuz()));
    }
    
    private ajuz() {
        this.x = 2;
        this.n = emptyProtobufList();
        this.q = ahab.b;
        this.r = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte x = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd v;
                if ((v = ajuz.v) == null) {
                    synchronized (ajuz.class) {
                        if (ajuz.v == null) {
                            ajuz.v = (ahdd)new ahba((ahbh)ajuz.a);
                        }
                    }
                }
                return v;
            }
            case 5: {
                return ajuz.a;
            }
            case 4: {
                return new ahaz((ahbh)ajuz.a);
            }
            case 3: {
                return new ajuz();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajuz.a, "\u0001\u0014\u0000\u0001\u0001\u0014\u0014\u0000\u0001\u000f\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005\u0007\u1409\u0006\b\u1409\u0007\t\u1007\b\n\u1409\n\u000b\u041b\f\u1409\u000b\r\u1409\f\u000e\u1409\r\u000f\u100a\u000e\u0010\u1008\u000f\u0011\u1007\t\u0012\u1409\u0010\u0013\u1409\u0011\u0014\u100c\u0012", new Object[] { "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "m", "n", ajva.class, "o", "p", "w", "q", "r", "l", "s", "t", "u", ajty.n });
            }
            case 1: {
                if (o == null) {
                    x = 0;
                }
                this.x = x;
                return null;
            }
            case 0: {
                return this.x;
            }
        }
    }
}
