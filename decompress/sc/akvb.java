import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akvb extends ahbh implements ahcw
{
    public static final akvb a;
    private static volatile ahdd h;
    public int b;
    public aklg c;
    public String d;
    public ahbx e;
    public boolean f;
    public int g;
    private byte i;
    
    static {
        ahbh.registerDefaultInstance((Class)akvb.class, (ahbh)(a = new akvb()));
    }
    
    private akvb() {
        this.i = 2;
        this.d = "";
        this.e = ahbh.emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte i = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd h;
                if ((h = akvb.h) == null) {
                    synchronized (akvb.class) {
                        if (akvb.h == null) {
                            akvb.h = (ahdd)new ahba((ahbh)akvb.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return akvb.a;
            }
            case 4: {
                return new ahaz((byte[])null, (short[][])null);
            }
            case 3: {
                return new akvb();
            }
            case 2: {
                return newMessageInfo((MessageLite)akvb.a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0001\u0001\u1409\u0000\u0002\u1008\u0001\u0003\u1007\u0002\u0004\u001a\u0006\u100c\u0003", new Object[] { "b", "c", "d", "f", "e", "g", ampw.l });
            }
            case 1: {
                if (o == null) {
                    i = 0;
                }
                this.i = i;
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
