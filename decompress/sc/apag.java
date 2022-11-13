import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apag extends ahbh implements ahcw
{
    public static final apag a;
    private static volatile ahdd i;
    public int b;
    public aozu c;
    public ahbx d;
    public aozo e;
    public aozj f;
    public ahbx g;
    public aozw h;
    private ajut j;
    private aibz k;
    private ahhu l;
    private aiyq m;
    private ajut n;
    private anuv o;
    private byte p;
    
    static {
        ahbh.registerDefaultInstance((Class)apag.class, (ahbh)(a = new apag()));
    }
    
    private apag() {
        this.p = 2;
        this.d = emptyProtobufList();
        final ahab b = ahab.b;
        this.g = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte p3 = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd i;
                if ((i = apag.i) == null) {
                    synchronized (apag.class) {
                        if (apag.i == null) {
                            apag.i = (ahdd)new ahba((ahbh)apag.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return apag.a;
            }
            case 4: {
                return new ahaz((ahbh)apag.a);
            }
            case 3: {
                return new apag();
            }
            case 2: {
                return newMessageInfo((MessageLite)apag.a, "\u0001\f\u0000\u0001\u0001\u000e\f\u0000\u0002\f\u0001\u1409\u0002\u0002\u041b\u0003\u1409\u0003\u0004\u1409\u0000\u0005\u1409\u0004\u0007\u1409\u0006\b\u1409\b\t\u1409\u0007\n\u041b\u000b\u1409\u0001\f\u1409\t\u000e\u1409\n", new Object[] { "b", "j", "d", aozx.class, "k", "c", "l", "m", "n", "f", "g", aiqj.class, "e", "h", "o" });
            }
            case 1: {
                if (o == null) {
                    p3 = 0;
                }
                this.p = p3;
                return null;
            }
            case 0: {
                return this.p;
            }
        }
    }
}
