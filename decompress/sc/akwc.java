import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akwc extends ahbh implements ahcw
{
    public static final akwc a;
    private static volatile ahdd k;
    public int b;
    public aklg c;
    public String d;
    public String e;
    public String f;
    public int g;
    public ahab h;
    public akwb i;
    public ahwb j;
    private byte l;
    
    static {
        ahbh.registerDefaultInstance((Class)akwc.class, (ahbh)(a = new akwc()));
    }
    
    private akwc() {
        this.l = 2;
        this.d = "";
        this.e = "";
        this.f = "";
        this.h = ahab.b;
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
                final ahdd k;
                if ((k = akwc.k) == null) {
                    synchronized (akwc.class) {
                        if (akwc.k == null) {
                            akwc.k = (ahdd)new ahba((ahbh)akwc.a);
                        }
                    }
                }
                return k;
            }
            case 5: {
                return akwc.a;
            }
            case 4: {
                return new ahaz((ahbh)akwc.a);
            }
            case 3: {
                return new akwc();
            }
            case 2: {
                return newMessageInfo((MessageLite)akwc.a, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0006\u1008\u0004\u0007\u1004\u0005\b\u100a\u0006\t\u1009\u0007\n\u1009\b", new Object[] { "b", "c", "d", "e", "f", "g", "h", "i", "j" });
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
