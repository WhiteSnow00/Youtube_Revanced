import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajuy extends ahbh implements ahcw
{
    public static final ajuy a;
    private static volatile ahdd l;
    public int b;
    public ajut c;
    public ahbx d;
    public ajut e;
    public ajut f;
    public aiqj g;
    public algl h;
    public String i;
    public String j;
    public ahab k;
    private ahhu m;
    private byte n;
    
    static {
        ahbh.registerDefaultInstance((Class)ajuy.class, (ahbh)(a = new ajuy()));
    }
    
    private ajuy() {
        this.n = 2;
        this.d = emptyProtobufList();
        this.i = "";
        this.j = "";
        this.k = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte n = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd l;
                if ((l = ajuy.l) == null) {
                    synchronized (ajuy.class) {
                        if (ajuy.l == null) {
                            ajuy.l = (ahdd)new ahba((ahbh)ajuy.a);
                        }
                    }
                }
                return l;
            }
            case 5: {
                return ajuy.a;
            }
            case 4: {
                return new ahaz((ahbh)ajuy.a);
            }
            case 3: {
                return new ajuy();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajuy.a, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0001\u0005\u0001\u1409\u0000\u0002\u001b\u0003\u1409\u0001\u0004\u1409\u0002\u0005\u1409\u0003\u0006\u1009\u0004\u0007\u1008\u0005\b\u1008\u0006\t\u1409\u0007\n\u100a\b", new Object[] { "b", "c", "d", ajux.class, "e", "f", "g", "h", "i", "j", "m", "k" });
            }
            case 1: {
                if (o == null) {
                    n = 0;
                }
                this.n = n;
                return null;
            }
            case 0: {
                return this.n;
            }
        }
    }
}
