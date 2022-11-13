import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akmi extends ahbh implements ahcw
{
    public static final akmi a;
    private static volatile ahdd i;
    public int b;
    public aklg c;
    public ahbx d;
    public akml e;
    public String f;
    public String g;
    public akmk h;
    private byte j;
    
    static {
        ahbh.registerDefaultInstance((Class)akmi.class, (ahbh)(a = new akmi()));
    }
    
    private akmi() {
        this.j = 2;
        this.d = emptyProtobufList();
        this.f = "";
        this.g = "";
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
                final ahdd i;
                if ((i = akmi.i) == null) {
                    synchronized (akmi.class) {
                        if (akmi.i == null) {
                            akmi.i = (ahdd)new ahba((ahbh)akmi.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return akmi.a;
            }
            case 4: {
                return new ahaz((byte[][])null, (byte[][])null);
            }
            case 3: {
                return new akmi();
            }
            case 2: {
                return newMessageInfo((MessageLite)akmi.a, "\u0001\u0006\u0000\u0001\u0001\u000b\u0006\u0000\u0001\u0001\u0001\u1409\u0000\u0007\u1008\u0003\b\u1008\u0004\t\u1009\u0002\n\u1009\u0005\u000b\u001b", new Object[] { "b", "c", "f", "g", "e", "h", "d", akmo.class });
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
