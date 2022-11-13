import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ancg extends ahbh implements ahcw
{
    public static final ancg a;
    private static volatile ahdd l;
    public int b;
    public int c;
    public Object d;
    public ahab e;
    public String f;
    public aiqj g;
    public aiqj h;
    public aiqj i;
    public aiqj j;
    public aiqj k;
    private ahhu m;
    private byte n;
    
    static {
        ahbh.registerDefaultInstance((Class)ancg.class, (ahbh)(a = new ancg()));
    }
    
    private ancg() {
        this.c = 0;
        this.n = 2;
        this.e = ahab.b;
        this.f = "";
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
                if ((l = ancg.l) == null) {
                    synchronized (ancg.class) {
                        if (ancg.l == null) {
                            ancg.l = (ahdd)new ahba((ahbh)ancg.a);
                        }
                    }
                }
                return l;
            }
            case 5: {
                return ancg.a;
            }
            case 4: {
                return new ahaz((ahbh)ancg.a);
            }
            case 3: {
                return new ancg();
            }
            case 2: {
                return newMessageInfo((MessageLite)ancg.a, "\u0001\n\u0001\u0001\u0001\n\n\u0000\u0000\u0006\u0001\u1409\u0000\u0002\u100a\u0001\u0003\u1008\u0002\u0004\u103c\u0000\u0005\u103a\u0000\u0006\u1409\u0005\u0007\u1409\u0006\b\u1409\u0007\t\u1409\b\n\u1409\t", new Object[] { "d", "c", "b", "m", "e", "f", ancf.class, "g", "h", "i", "j", "k" });
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
