import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akhi extends ahbh implements ahcw
{
    public static final akhi a;
    private static volatile ahdd f;
    public int b;
    public aklg c;
    public int d;
    public ahbx e;
    private byte g;
    
    static {
        ahbh.registerDefaultInstance((Class)akhi.class, (ahbh)(a = new akhi()));
    }
    
    private akhi() {
        this.g = 2;
        this.e = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = akhi.f) == null) {
                    synchronized (akhi.class) {
                        if (akhi.f == null) {
                            akhi.f = (ahdd)new ahba((ahbh)akhi.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return akhi.a;
            }
            case 4: {
                return new ahaz((short[])null, (short[][][])null);
            }
            case 3: {
                return new akhi();
            }
            case 2: {
                return newMessageInfo((MessageLite)akhi.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0001\u0001\u1409\u0000\u0002\u001b\u0004\u100c\u0001", new Object[] { "b", "c", "e", ahwa.class, "d", ahuc.g });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
