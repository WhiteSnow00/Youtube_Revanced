import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anqc extends ahbh implements ahcw
{
    public static final anqc a;
    private static volatile ahdd i;
    public int b;
    public anqa c;
    public ahbx d;
    public anuv e;
    public ahmo f;
    public ahab g;
    public String h;
    private ahhu j;
    private anuv k;
    private byte l;
    
    static {
        ahbh.registerDefaultInstance((Class)anqc.class, (ahbh)(a = new anqc()));
    }
    
    private anqc() {
        this.l = 2;
        this.d = emptyProtobufList();
        this.g = ahab.b;
        this.h = "";
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
                final ahdd i;
                if ((i = anqc.i) == null) {
                    synchronized (anqc.class) {
                        if (anqc.i == null) {
                            anqc.i = (ahdd)new ahba((ahbh)anqc.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return anqc.a;
            }
            case 4: {
                return new ahaz((ahbh)anqc.a);
            }
            case 3: {
                return new anqc();
            }
            case 2: {
                return newMessageInfo((MessageLite)anqc.a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0005\u0001\u1409\u0000\u0002\u001b\u0003\u1409\u0001\u0004\u1409\u0003\u0005\u100a\u0004\u0006\u1409\u0002\u0007\u1409\u0005\b\u1008\u0006", new Object[] { "b", "c", "d", anpi.class, "e", "j", "g", "f", "k", "h" });
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
