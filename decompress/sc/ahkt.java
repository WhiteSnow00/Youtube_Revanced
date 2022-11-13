import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahkt extends ahbh implements ahcw
{
    public static final ahkt a;
    private static volatile ahdd j;
    public int b;
    public int c;
    public ahbx d;
    public int e;
    public String f;
    public ahbx g;
    public ahbx h;
    public ahne i;
    private byte k;
    
    static {
        ahbh.registerDefaultInstance((Class)ahkt.class, (ahbh)(a = new ahkt()));
    }
    
    private ahkt() {
        this.k = 2;
        this.d = emptyProtobufList();
        this.f = "";
        this.g = emptyProtobufList();
        this.h = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte k = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd j;
                if ((j = ahkt.j) == null) {
                    synchronized (ahkt.class) {
                        if (ahkt.j == null) {
                            ahkt.j = (ahdd)new ahba((ahbh)ahkt.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return ahkt.a;
            }
            case 4: {
                return new ahaz((ahbh)ahkt.a);
            }
            case 3: {
                return new ahkt();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahkt.a, "\u0001\u0007\u0000\u0001\u0001\u000e\u0007\u0000\u0003\u0001\u0001\u100b\u0000\u0002\u041b\u0003\u100c\u0003\u0004\u1008\u0004\u0006\u001b\u0007\u001b\u000e\u1009\t", new Object[] { "b", "c", "d", ahku.class, "e", ahjm.f, "f", "g", ahmw.class, "h", ahmw.class, "i" });
            }
            case 1: {
                if (o == null) {
                    k = 0;
                }
                this.k = k;
                return null;
            }
            case 0: {
                return this.k;
            }
        }
    }
}
