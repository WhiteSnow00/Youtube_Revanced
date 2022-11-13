import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apau extends ahbh implements ahcw
{
    public static final apau a;
    private static volatile ahdd l;
    public int b;
    public aotp c;
    public aotp d;
    public apat e;
    public ajut f;
    public ahbx g;
    public apxd h;
    public aida i;
    public apaq j;
    public ahab k;
    private ajut m;
    private ajut n;
    private ajut o;
    private ajut p;
    private ahhu q;
    private byte r;
    
    static {
        ahbh.registerDefaultInstance((Class)apau.class, (ahbh)(a = new apau()));
    }
    
    private apau() {
        this.r = 2;
        this.g = emptyProtobufList();
        this.k = ahab.b;
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
                final ahdd l;
                if ((l = apau.l) == null) {
                    synchronized (apau.class) {
                        if (apau.l == null) {
                            apau.l = (ahdd)new ahba((ahbh)apau.a);
                        }
                    }
                }
                return l;
            }
            case 5: {
                return apau.a;
            }
            case 4: {
                return new ahaz((ahbh)apau.a);
            }
            case 3: {
                return new apau();
            }
            case 2: {
                return newMessageInfo((MessageLite)apau.a, "\u0001\u000e\u0000\u0001\u0001\u0013\u000e\u0000\u0001\f\u0001\u1409\u0000\u0002\u1409\u0003\u0003\u1409\u0004\u0004\u1409\b\u0005\u1409\u0010\u0006\u100a\u0011\u0007\u1409\u0001\b\u1409\u0005\t\u1409\t\u000b\u041b\f\u1409\u0007\u000e\u1009\u0002\u000f\u1409\f\u0013\u1409\u0006", new Object[] { "b", "c", "m", "f", "i", "q", "k", "d", "n", "p", "g", ajut.class, "h", "e", "j", "o" });
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
