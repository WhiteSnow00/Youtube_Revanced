import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajbq extends ahbh implements ahcw
{
    public static final ajbq a;
    private static volatile ahdd h;
    public int b;
    public String c;
    public apns d;
    public ahan e;
    public boolean f;
    public ahbx g;
    private byte i;
    
    static {
        ahbh.registerDefaultInstance((Class)ajbq.class, (ahbh)(a = new ajbq()));
    }
    
    private ajbq() {
        this.i = 2;
        this.c = "";
        this.g = emptyProtobufList();
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
                if ((h = ajbq.h) == null) {
                    synchronized (ajbq.class) {
                        if (ajbq.h == null) {
                            ajbq.h = (ahdd)new ahba((ahbh)ajbq.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return ajbq.a;
            }
            case 4: {
                return new ahaz((ahbh)ajbq.a);
            }
            case 3: {
                return new ajbq();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajbq.a, "\u0001\u0005\u0000\u0001\u0002\b\u0005\u0000\u0001\u0001\u0002\u1009\u0003\u0005\u1007\u0005\u0006\u041b\u0007\u1008\u0000\b\u1009\u0002", new Object[] { "b", "e", "f", "g", ajbp.class, "c", "d" });
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
