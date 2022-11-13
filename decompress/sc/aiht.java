import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiht extends ahbh implements ahcw
{
    public static final aiht a;
    private static volatile ahdd p;
    public int b;
    public int c;
    public Object d;
    public String e;
    public ajut f;
    public aotp g;
    public aiqj h;
    public ahab i;
    public aihs j;
    public aihr k;
    public ahbx l;
    public ahbx m;
    public ahbx n;
    public long o;
    private ahhu q;
    private byte r;
    
    static {
        ahbh.registerDefaultInstance((Class)aiht.class, (ahbh)(a = new aiht()));
    }
    
    private aiht() {
        this.c = 0;
        this.r = 2;
        this.e = "";
        this.i = ahab.b;
        this.l = emptyProtobufList();
        this.m = emptyProtobufList();
        this.n = emptyProtobufList();
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
                if ((p3 = aiht.p) == null) {
                    synchronized (aiht.class) {
                        if (aiht.p == null) {
                            aiht.p = (ahdd)new ahba((ahbh)aiht.a);
                        }
                    }
                }
                return p3;
            }
            case 5: {
                return aiht.a;
            }
            case 4: {
                return new ahaz((byte[][])null, (boolean[][])null);
            }
            case 3: {
                return new aiht();
            }
            case 2: {
                return newMessageInfo((MessageLite)aiht.a, "\u0001\u000e\u0001\u0001\u0001\u000e\u000e\u0000\u0003\t\u0001\u1409\u0001\u0002\u1409\u0002\u0003\u1409\u0003\u0004\u143c\u0000\u0005\u143c\u0000\u0006\u1409\u0006\u0007\u100a\u0007\b\u1009\b\t\u041b\n\u041b\u000b\u041b\f\u1008\u0000\r\u1002\n\u000e\u1009\t", new Object[] { "d", "c", "b", "f", "g", "h", ajut.class, ajut.class, "q", "i", "j", "l", aihx.class, "m", aihq.class, "n", aihw.class, "e", "o", "k" });
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
