import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alqk extends ahbh implements ahcw
{
    public static final alqk a;
    private static volatile ahdd h;
    public int b;
    public String c;
    public akdi d;
    public ajut e;
    public ajut f;
    public ahbx g;
    private ajut i;
    private byte j;
    
    static {
        ahbh.registerDefaultInstance((Class)alqk.class, (ahbh)(a = new alqk()));
    }
    
    private alqk() {
        this.j = 2;
        this.c = "";
        this.g = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte j = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd h;
                if ((h = alqk.h) == null) {
                    synchronized (alqk.class) {
                        if (alqk.h == null) {
                            alqk.h = (ahdd)new ahba((ahbh)alqk.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return alqk.a;
            }
            case 4: {
                return new ahaz((ahbh)alqk.a);
            }
            case 3: {
                return new alqk();
            }
            case 2: {
                return newMessageInfo((MessageLite)alqk.a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0001\u0005\u0001\u1008\u0000\u0003\u1409\u0003\u0004\u1409\u0004\u0005\u1409\u0005\u0006\u041b\u0007\u1409\u0002", new Object[] { "b", "c", "d", "e", "f", "g", aida.class, "i" });
            }
            case 1: {
                if (o == null) {
                    j = 0;
                }
                this.j = j;
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}
