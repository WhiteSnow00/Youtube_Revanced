import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akfb extends ahbh implements ahcw
{
    public static final akfb a;
    private static volatile ahdd l;
    public int b;
    public ajut c;
    public ahbx d;
    public ahbx e;
    public ahbx f;
    public ahbx g;
    public ahab h;
    public aiqj i;
    public aotp j;
    public ahik k;
    private ahhu m;
    private byte n;
    
    static {
        ahbh.registerDefaultInstance((Class)akfb.class, (ahbh)(a = new akfb()));
    }
    
    private akfb() {
        this.n = 2;
        this.d = emptyProtobufList();
        this.e = emptyProtobufList();
        this.f = emptyProtobufList();
        this.g = emptyProtobufList();
        this.h = ahab.b;
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
                if ((l = akfb.l) == null) {
                    synchronized (akfb.class) {
                        if (akfb.l == null) {
                            akfb.l = (ahdd)new ahba((ahbh)akfb.a);
                        }
                    }
                }
                return l;
            }
            case 5: {
                return akfb.a;
            }
            case 4: {
                return new ahaz((ahbh)akfb.a);
            }
            case 3: {
                return new akfb();
            }
            case 2: {
                return newMessageInfo((MessageLite)akfb.a, "\u0001\n\u0000\u0001\u0002\u0012\n\u0000\u0004\u0004\u0002\u1409\u0000\u0004\u1409\u0002\u0005\u100a\u0003\t\u001b\n\u001b\u000b\u001b\u000e\u001b\u0010\u1409\u0006\u0011\u1409\u0007\u0012\u1009\b", new Object[] { "b", "c", "m", "h", "d", alwh.class, "e", alwh.class, "f", alwh.class, "g", alwh.class, "i", "j", "k" });
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
