import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoif extends ahbc implements ahbd
{
    public static final aoif a;
    private static volatile ahdd h;
    public int b;
    public boolean c;
    public boolean d;
    public aloh e;
    public String f;
    public aida g;
    private byte i;
    
    static {
        ahbh.registerDefaultInstance((Class)aoif.class, (ahbh)(a = new aoif()));
    }
    
    private aoif() {
        this.i = 2;
        this.f = "";
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
                if ((h = aoif.h) == null) {
                    synchronized (aoif.class) {
                        if (aoif.h == null) {
                            aoif.h = (ahdd)new ahba((ahbh)aoif.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return aoif.a;
            }
            case 4: {
                return new ahbb((ahbc)aoif.a);
            }
            case 3: {
                return new aoif();
            }
            case 2: {
                return newMessageInfo((MessageLite)aoif.a, "\u0001\u0005\u0000\u0001\u0011\u001b\u0005\u0000\u0000\u0001\u0011\u1009\u0002\u0014\u1007\u0000\u0015\u1007\u0001\u001a\u1409\u0005\u001b\u1008\u0004", new Object[] { "b", "e", "c", "d", "g", "f" });
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
